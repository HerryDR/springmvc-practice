package com.jsf.usermgt.dao;

import com.jsf.usermgt.bean.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @FileName UserDao
 * @Author JSF
 * @date 2024-07-28
 **/
@Repository
public class UserDao {
    private static List<User> users = new ArrayList<>();
    public static Long generateId(){
        Long maxId=users.stream().map(user->user.getId()).reduce((id1,id2)->id1>id2?id1:id2).get();
        return maxId+1;
    }
    static {
        User user1 = new User(10001L, "张三", "zhangsan@powernode.com", 1);
        User user2 = new User(10002L, "李四", "lisi@powernode.com", 1);
        User user3 = new User(10003L, "王五", "wangwu@powernode.com", 1);
        User user4 = new User(10004L, "赵六", "zhaoliu@powernode.com", 0);
        User user5 = new User(10005L, "钱七", "qianqi@powernode.com", 0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }
    public List<User> selectAll() {
        return users;
    }
    public void save(User user) {
        user.setId(generateId());
        users.add(user);
    }
    public User selectById(Long id) {
        return users.stream().filter(user->user.getId().equals(id)).findFirst().get();
    }
    public void update(User user) {
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getId().equals(user.getId())){
                users.set(i,user);
                return;
            }
        }
    }
    public void deleteById(Long id) {
        for(int i=0; i<users.size(); i++){
            if(id.equals(users.get(i).getId())){
                users.remove(i);
                return;
            }
        }    }
}
