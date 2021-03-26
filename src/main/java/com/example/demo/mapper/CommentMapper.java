package com.example.demo.mapper;

import com.example.demo.domain.Comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {
    //查询数据操作：
    @Select("SELECT * FROM t_comment WHERE id =#{id}")
    public Comment findById(Integer id);
    //插入数据操作：
    @Insert("INSERT INTO t_comment(content,author,a_id) " +
            "values (#{content},#{author},#{aId})")
    public int insertComment(Comment comment);
    //更新数据操作：
    @Update("UPDATE t_comment SET content=#{content} WHERE id=#{id}")
    public int updateComment(Comment comment);

    //删除数据操作：
    @Delete("DELETE FROM t_comment WHERE id=#{id}")
    public int deleteComment(Integer id);
}
