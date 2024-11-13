package com.jsf.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;

/**
 * @Description
 * @FileName FileController
 * @Author JSF
 * @date 2024-07-29
 **/
@Controller
public class FileController {
    @RequestMapping(value = "/fileup",method = RequestMethod.POST)
    public String fileUp(@RequestParam("filename")MultipartFile multipartFile, HttpServletRequest request) throws IOException {
        String name=multipartFile.getName();
        System.out.println(name);
        String originalFilename=multipartFile.getOriginalFilename();
        System.out.println(originalFilename);

        InputStream in=multipartFile.getInputStream();
        File file=new File(request.getServletContext().getRealPath("/upload"));
        if(!file.exists()){
            file.mkdirs();
        }

        BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(file.getAbsolutePath()+"/"+originalFilename));
        byte[] buffer=new byte[1024*100];
        int readCount=0;
        while ((readCount=in.read(buffer))!=-1){
            out.write(buffer,0,readCount);
        }
        out.flush();
        in.close();
        out.close();
        return "ok";
    }
    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadFile(HttpServletResponse response, HttpServletRequest request) throws IOException {
        File file = new File(request.getServletContext().getRealPath("/upload") + "/ALBERT精读报告-敬书梵.docx");
        // 创建响应头对象
        HttpHeaders headers = new HttpHeaders();
        // 设置响应内容类型
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        // 设置下载文件的名称
        headers.setContentDispositionFormData("attachment", file.getName());

        // 下载文件
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(Files.readAllBytes(file.toPath()), headers, HttpStatus.OK);
        return entity;
    }
}
