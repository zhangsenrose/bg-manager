package com.eva.cn.web.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By ZhangSenWei on 2018/11/22
 **/

@Controller
public class BaseController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
}
