package io.github.yzxdmb01.serviceImp.admin;

import io.github.yzxdmb01.SpringBaseTest;
import io.github.yzxdmb01.bean.admin.AdminMenu;
import io.github.yzxdmb01.dao.AdminMenuMapper;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: yinzhixing
 * @Description:
 * @Date: 2017/12/4 11:44
 */
public class AdminMenuDaoTest extends SpringBaseTest {

	@Autowired
	AdminMenuMapper adminMenuDao;

	@Test
	public void testMenu() {
		AdminMenu adminMenu = adminMenuDao.selectByPrimaryKey(8l);
		JSONObject jsonObject = new JSONObject(adminMenu);
		System.out.println("adminMenu:" + jsonObject.toString());
	}
}
