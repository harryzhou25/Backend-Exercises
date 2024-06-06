package com.web.db_exp_back.controller;


import com.web.db_exp_back.entity.User;
import com.web.db_exp_back.dao.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class usercontroller {
    @Autowired
    private UserMapper usermapper;

    @GetMapping("/user/all")
    public List<User> queryAll() {
        return usermapper.selectList(null);
    }

    @GetMapping("/user/order/all")
    public List<User> queryAllWithOrder() {
        return usermapper.selectAllWithOrder();
    }
    @GetMapping("/user/order/{id}")
    public List<User> queryWithOrder(@PathVariable Integer id) {
        return usermapper.selectWithOrder(id);
    }

    @PostMapping("/user/insert")
    public int insert(User user) {
        return usermapper.insert(user);
    }

    @GetMapping("/user/queryId/{id}")
    public List<User> queryById(@PathVariable Integer id) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        return usermapper.selectList(queryWrapper);
    }

    @GetMapping("/user/queryName/{name}")
    public List<User> queryByName(@PathVariable Integer name) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        return usermapper.selectList(queryWrapper);
    }
}
