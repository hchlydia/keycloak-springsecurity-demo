package com.example.microservices_with_spring_security.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order")
    public String order(@AuthenticationPrincipal Jwt jwt) {
        System.out.println("創建時間(iat): " + jwt.getIssuedAt());
        System.out.println("發行人(iss): " + jwt.getIssuer());
        System.out.println("使用者(sub): " + jwt.getSubject());
        System.out.println("收件人(aud): " + jwt.getAudience());
        System.out.println("過期失效時間(exp): " + jwt.getExpiresAt());
        System.out.println("在某時間以前jwt為不可用(nbf): " + jwt.getNotBefore());
        System.out.println("JWT ID: " + jwt.getId()); //一次性token用

        return "返回訂單數據";
    }
}
