package com.cicd.jenkinscicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test1() {
        return "test String print";
    }

    @GetMapping("/test/{id}")
    public Long test2(@PathVariable Long id) {
        Long myid = id;
        return myid;
    }
}
