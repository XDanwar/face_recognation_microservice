package com.anwar.facedemo.mapper;
import com.anwar.facedemo.domain.UserFaceInfo;
import com.anwar.facedemo.dto.FaceUserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MybatisUserFaceInfoMapper {

    List<UserFaceInfo> findUserFaceInfoList();

    void insertUserFaceInfo(UserFaceInfo userFaceInfo);

    List<FaceUserInfo> getUserFaceInfoByGroupId(Integer groupId);

}
