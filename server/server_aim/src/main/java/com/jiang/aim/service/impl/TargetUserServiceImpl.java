package com.jiang.aim.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiang.aim.entity.AimUser;
import com.jiang.aim.mapper.AimUserMapper;
import com.jiang.aim.service.AimUserService;
import org.springframework.stereotype.Service;

@Service
public class TargetUserServiceImpl extends ServiceImpl<AimUserMapper, AimUser> implements AimUserService {

    @Override
    public AimUser readUser(String id) {

        AimUser baseInfo = baseMapper.selectById(id);
        return baseInfo;
    }
}
