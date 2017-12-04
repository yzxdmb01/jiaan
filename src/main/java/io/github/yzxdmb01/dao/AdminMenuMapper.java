package io.github.yzxdmb01.dao;

import io.github.yzxdmb01.bean.admin.AdminMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminMenu record);

    int insertSelective(AdminMenu record);

    AdminMenu selectByPrimaryKey(Long id);

    List<AdminMenu> selectByParentId(String parentId);

    int updateByPrimaryKeySelective(AdminMenu record);

    int updateByPrimaryKey(AdminMenu record);
}