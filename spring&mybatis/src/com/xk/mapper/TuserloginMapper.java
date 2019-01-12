package com.xk.mapper;

import com.xk.model.Tuserlogin;
import com.xk.model.TuserloginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TuserloginMapper {
    long countByExample(TuserloginExample example);

    int deleteByExample(TuserloginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tuserlogin record);

    int insertSelective(Tuserlogin record);

    List<Tuserlogin> selectByExample(TuserloginExample example);

    Tuserlogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tuserlogin record, @Param("example") TuserloginExample example);

    int updateByExample(@Param("record") Tuserlogin record, @Param("example") TuserloginExample example);

    int updateByPrimaryKeySelective(Tuserlogin record);

    int updateByPrimaryKey(Tuserlogin record);
}