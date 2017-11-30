package io.github.yzxdmb01.dao;

import io.github.yzxdmb01.bean.admin.AdminUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserMapper {
	int deleteByPrimaryKey(Long id);

	int insert(AdminUser record);

	int insertSelective(AdminUser record);

	AdminUser selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(AdminUser record);

	int updateByPrimaryKey(AdminUser record);

	AdminUser login(@Param("username") String username, @Param("password") String password);
}