package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//spring이  특정 annotation 이 붙어있는 claass files들을 new 해서(ioC) spring container에 관리해준다,
public class BlogControllerTest {
    @GetMapping("test/hello")
    public String hello(){return "<h1> hello world</h1>";}
}
