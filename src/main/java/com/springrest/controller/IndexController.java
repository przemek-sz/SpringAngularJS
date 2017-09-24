package com.springrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Przemek on 25.07.2017.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){

        return "/static/index.html";
    }


}
