package com.jiang.aim.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jiang.aim.common.fieldname.Fields;
import com.jiang.aim.common.result.R;
import com.jiang.aim.entity.AimUser;
import com.jiang.aim.service.AimUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aim")
@CrossOrigin
public class UserController {

    @Autowired
    public AimUserService userService;

    @PostMapping("/readUser")
    public R readUser(@RequestBody String id){
        JSONObject object = JSON.parseObject(id);
        String userId = object.getString(Fields.ID);
        AimUser baseInfo = userService.readUser(userId);
        return R.ok().data("item",baseInfo);
    }
}
