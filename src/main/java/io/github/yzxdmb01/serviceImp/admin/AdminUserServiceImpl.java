package io.github.yzxdmb01.serviceImp.admin;

import io.github.yzxdmb01.bean.admin.AdminUser;
import io.github.yzxdmb01.common.Constant;
import io.github.yzxdmb01.dao.AdminUserMapper;
import io.github.yzxdmb01.service.admin.AdminUserService;
import io.github.yzxdmb01.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yinzhixing
 * @Description:
 * @Date: 2017/11/30 15:37
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
	@Autowired
	AdminUserMapper adminUserMapper;

	@Override
	public Map login(String username, String pwd) {
		Map<String, Object> map = new HashMap<>();
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(pwd)) {
			map.put(Constant.CODE, Constant.SUCCESS);
			map.put(Constant.MSG, "用户名或密码不能为空");
			return map;
		}
		pwd = MD5.encode(pwd);
		AdminUser au = adminUserMapper.login(username, pwd);
		if (au == null) {
			map.put(Constant.CODE, Constant.ERROR);
			map.put(Constant.MSG, "用户名或密码错误");
		} else {
			map.put(Constant.CODE, Constant.SUCCESS);
			map.put(Constant.MSG, "成功");
			map.put("user", au);
		}
		return map;
	}
}
