package com.kgawa.springsample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public void sayHi() {
        // By default, the view name will be the same as the request mapping
        // spring-servlet.xml defines the prefix/suffix in the InternalResourceViewResolver
        return;
    }
}