package com.atgugu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return " ---- PaymentFallBackService fall back-paymentInfo_OK  /(ㄒoㄒ)/~~ ";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---- PaymentFalllBackService fall back-paymentInfo_YimeOut  /(ㄒoㄒ)/~~ ";
    }
}
