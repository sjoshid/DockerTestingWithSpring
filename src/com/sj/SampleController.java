package com.sj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/hello.do")
    @ResponseBody
    public String showHelloWorld() {
        return "Hello, world";
    }
}
