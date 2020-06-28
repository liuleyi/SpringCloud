package com.atgugu.springcloud.controller;

import com.atgugu.springcloud.entities.CommonResult;
import com.atgugu.springcloud.entities.Payment;
import com.atgugu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("------插入结果：" + result + "😂");
        return result > 0
                ?
                new CommonResult(200, "插入数据库成功,serverPort:"+serverPort, result)
                :
                new CommonResult(444, "插入数据库失败", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("------查询结果：" + payment);
        if (ObjectUtils.isEmpty(payment)) {
            return new CommonResult(444, "没有对应记录，查询id:" + id, null);
        } else {
            return new CommonResult(200, "查询成功,serverPort："+serverPort, payment);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentBL(){
        return serverPort;
    }
}

