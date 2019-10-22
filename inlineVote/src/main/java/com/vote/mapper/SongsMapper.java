package com.vote.mapper;

import com.vote.bean.Songs;
import com.vote.bean.SongsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongsMapper {
    long countByExample(SongsExample example);

    int deleteByExample(SongsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Songs record);

    int insertSelective(Songs record);

    List<Songs> selectByExample(SongsExample example);

    Songs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Songs record, @Param("example") SongsExample example);

    int updateByExample(@Param("record") Songs record, @Param("example") SongsExample example);

    int updateByPrimaryKeySelective(Songs record);

    int updateByPrimaryKey(Songs record);
}