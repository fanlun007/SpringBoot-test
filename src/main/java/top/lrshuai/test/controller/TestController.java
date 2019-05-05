package top.lrshuai.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Object test(){
        return "success";
    }

    @GetMapping("/test2")
    public Object test2(){
        return "failed";
    }
}
