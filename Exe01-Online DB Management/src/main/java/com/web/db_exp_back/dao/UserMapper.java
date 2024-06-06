package com.web.db_exp_back.dao;

import com.web.db_exp_back.entity.User;
import org.apache.ibatis.annotations.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user")
    @Results(
            {
                    @Result(column = "id",property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "id", property = "orders",javaType = List.class,
                            many=@Many(select="com.web.db_exp_back.dao.OrderMapper.selectByUid"))
            }
    )
    List<User> selectAllWithOrder();

    @Select("select * from user where id = #{id}")
    @Results(
            {
                    @Result(column = "id",property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "id", property = "orders",javaType = List.class,
                            many=@Many(select="com.web.db_exp_back.dao.OrderMapper.selectByUid"))
            }
    )
    List<User> selectWithOrder(int id);
}