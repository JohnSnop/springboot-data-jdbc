package com.wf.springboot.controller;

import com.wf.springboot.dao.PaymentMapper;
import com.wf.springboot.domain.CommonResult;
import com.wf.springboot.domain.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wf
 * @create 2020-08-22 11:59
 * @desc
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentMapper paymentMapper;

    @GetMapping("/getById/{id}")
    @ResponseBody
    public CommonResult<Payment> getById(@PathVariable Long id) {
        Payment payment = paymentMapper.selectByPrimaryKey(id);

        return new CommonResult(200, "success", payment);
    }
}
