package com.jiang.aim.service;


import com.jiang.aim.entity.Aim;
import com.jiang.aim.entity.result.AimResult;

public interface AimService {


    Aim readAim(String userId,String id);

    AimResult readAimList(String usrId);

    void updateAim(Aim aim);
}
