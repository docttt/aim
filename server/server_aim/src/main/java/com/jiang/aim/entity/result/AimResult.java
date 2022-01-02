package com.jiang.aim.entity.result;

import com.jiang.aim.entity.Aim;
import lombok.Data;

import java.util.List;

@Data
public class AimResult {
    private List<Aim> items;
    private int total;

}
