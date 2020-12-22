//package com.atgugu.springcloud.filter;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//import java.util.Date;
//
//@Slf4j
//@Component
//public class MyLogGateWayFilter implements GlobalFilter, Ordered {
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        log.info("******************* come in MyLogGateWayFilter :"+ new Date());
//        String unaeme = exchange.getRequest().getQueryParams().getFirst("uname");
//        if (StringUtils.isEmpty(unaeme)){
//            log.info("*************** uname is null ,非法用户，/(ㄒoㄒ)/~~");
//            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//            return exchange.getResponse().setComplete();
//        }
//        return chain.filter(exchange);
//    }
//
//    /**
//     * 加载过滤器的顺序
//     * @return
//     */
//    @Override
//    public int getOrder() {
//        return 0;
//    }
//}
