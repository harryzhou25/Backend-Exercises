package com.web.db_exp_back.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.web.db_exp_back.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    @Select("select * from orders where uid = #{id}")
    List<Order> selectByUid(int id);

    @Select("select * from orders where orderid = #{id}")
    List<Order> selectByOrderid(int id);
}
