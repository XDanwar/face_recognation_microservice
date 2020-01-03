package com.anwar.facedemo.service.impl;

import com.anwar.facedemo.domain.UserFaceInfo;
import com.anwar.facedemo.mapper.MybatisUserFaceInfoMapper;
import com.anwar.facedemo.service.UserFaceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserFaceInfoServiceImpl implements UserFaceInfoService {


    @Autowired
    private MybatisUserFaceInfoMapper userFaceInfoMapper;

    @Override
    public void insertSelective(UserFaceInfo userFaceInfo) {
        userFaceInfoMapper.insertUserFaceInfo(userFaceInfo);
    }
}
