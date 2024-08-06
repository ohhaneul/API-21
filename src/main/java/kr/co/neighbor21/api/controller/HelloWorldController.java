package kr.co.neighbor21.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 컨 알 o  쓸데없는거 지우기
@RestController
public class HelloWorldController {
    @RequestMapping("/hello-world")
    public String helloWorld() {
        // 클린코드 자동정리 컨 알트 l
        return "Hello World";
    }
}
