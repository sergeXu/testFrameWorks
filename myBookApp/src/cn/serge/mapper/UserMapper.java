package cn.serge.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.serge.domain.User;

public interface UserMapper {
	@Select("select * from tb_user where loginname = #{loginname} and password = #{password}")
	User findWithLoginNameAndPassword(@Param("loginname")String loginname,@Param("password")String password);
}
