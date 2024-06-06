package com.web.db_exp_back.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.web.db_exp_back.entity.Order;
import com.web.db_exp_back.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.web.db_exp_back.dao.OrderMapper;
import java.util.List;

@RestController
@CrossOrigin
public class ordercontroller {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/order/all")
    public List<Order> queryAll() {
        return orderMapper.selectList(null);
    }

    @GetMapping("/order/orderid/{id}")
    public List<Order> queryById(@PathVariable Integer id) {
        return orderMapper.selectByOrderid(id);
    }

    @GetMapping("/order/userid/{id}")
    public List<Order> querybyUid(@PathVariable int id) {
        return orderMapper.selectByUid(id);
    }

    @PostMapping("/order/insert")
    public int insert(Order order) {
        return orderMapper.insert(order);
    }
}
