package com.eva.cn.web.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Create By ZhangSenWei on 2018/11/15
 **/
@Controller
@RequestMapping("/user")
@Api(value = "userApi", description = "用户接口类", position = 1, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {




    @RequestMapping("addUser")
    @ResponseBody
    @ApiOperation(value = "新增用户", httpMethod = "POST", notes = "")
    public String addUser(){
        return "添加成功";
    }




}
