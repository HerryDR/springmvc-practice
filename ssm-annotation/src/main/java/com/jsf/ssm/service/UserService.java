package com.jsf.ssm.service;

import com.jsf.ssm.bean.User;

/**
 * @Description
 * @FileName UserService
 * @Author JSF
 * @date 2024-11-12
 **/
public interface UserService {
    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    User getById(Long id);
}
