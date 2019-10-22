package com.vote.mapper;

import com.vote.bean.JudgeScore;
import com.vote.bean.JudgeScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JudgeScoreMapper {
    long countByExample(JudgeScoreExample example);

    int deleteByExample(JudgeScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JudgeScore record);

    int insertSelective(JudgeScore record);

    List<JudgeScore> selectByExample(JudgeScoreExample example);

    JudgeScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JudgeScore record, @Param("example") JudgeScoreExample example);

    int updateByExample(@Param("record") JudgeScore record, @Param("example") JudgeScoreExample example);

    int updateByPrimaryKeySelective(JudgeScore record);

    int updateByPrimaryKey(JudgeScore record);
}