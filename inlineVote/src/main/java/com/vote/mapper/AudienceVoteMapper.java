package com.vote.mapper;

import com.vote.bean.AudienceVote;
import com.vote.bean.AudienceVoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AudienceVoteMapper {
    long countByExample(AudienceVoteExample example);

    int deleteByExample(AudienceVoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AudienceVote record);

    int insertSelective(AudienceVote record);

    List<AudienceVote> selectByExample(AudienceVoteExample example);

    AudienceVote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AudienceVote record, @Param("example") AudienceVoteExample example);

    int updateByExample(@Param("record") AudienceVote record, @Param("example") AudienceVoteExample example);

    int updateByPrimaryKeySelective(AudienceVote record);

    int updateByPrimaryKey(AudienceVote record);
}