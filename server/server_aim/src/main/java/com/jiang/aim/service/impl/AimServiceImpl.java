package com.jiang.aim.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiang.aim.common.result.StringUtil;
import com.jiang.aim.entity.Aim;
import com.jiang.aim.entity.AimUser;
import com.jiang.aim.entity.result.AimResult;
import com.jiang.aim.mapper.AimMapper;
import com.jiang.aim.mapper.AimUserMapper;
import com.jiang.aim.service.AimService;
import com.jiang.aim.service.AimUserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AimServiceImpl extends ServiceImpl<AimMapper, Aim> implements AimService {

    @Override
    public Aim readAim(String userId, String id) {
        return null;
    }

    @Override
    public AimResult readAimList(String usrId) {
        return null;
    }

    @Override
    public void updateAim(Aim aim) {
        if (StringUtils.isEmpty(aim.getId())) {
            aim.setId(StringUtil.newId());
            baseMapper.insert(aim);
        } else {
            baseMapper.updateById(aim);
        }
    }
}
