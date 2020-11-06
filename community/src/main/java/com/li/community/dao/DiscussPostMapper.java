package com.li.community.dao;

import com.li.community.entity.Comment;
import com.li.community.entity.DiscussPost;
import com.li.community.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit, int orderMode);

    List<DiscussPost> selectMyDiscussPosts(int userId,int offset, int limit);

    List<Comment> selectMyReply(int userId);
    //我的回复
    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    int selectDiscussPostRows(@Param("userId") int userId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id, int commentCount);

    int updateType(int id, int type);

    int updateStatus(int id, int status);

    int updateScore(int id, double score);

    int selectMyDiscussPostId(@Param("userId") int userId);
    //通过id查帖子
    List<DiscussPost> selectFindDiscussPost(int entityId);

    int selectConversationCount(int userId);

    List<DiscussPost> selectConversations(int userId, int offset, int limit);

}
