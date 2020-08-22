package com.wf.springboot.dao;

import com.wf.springboot.domain.Payment;
import com.wf.springboot.domain.PaymentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

// @Mapper 注解 @MapperScan("com.wf.springboot.dao")
public interface PaymentMapper {
    long countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(Long id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Payment record);

    int insertSelective(Payment record);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}