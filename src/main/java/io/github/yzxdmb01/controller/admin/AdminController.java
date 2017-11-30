package io.github.yzxdmb01.controller.admin;

import io.github.yzxdmb01.bean.admin.AdminUser;
import io.github.yzxdmb01.common.Constant;
import io.github.yzxdmb01.service.admin.AdminUserService;
import io.github.yzxdmb01.utils.L;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author: yinzhixing
 * @Description:
 * @Date: 2017/11/28 16:36
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminUserService adminUserService;

	@RequestMapping
	public String toIndex() {
		L.i("访问首页");
		return "admin/index";
	}

	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String toMain() {
		return "admin/main";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String toLogin() {
		return "admin/login";
	}

	@ResponseBody
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public Object login(String username, String password, HttpServletRequest request) {
		Map<String, Object> map = adminUserService.login(username, password);
		if ((int) map.get(Constant.CODE) == Constant.SUCCESS) {
			HttpSession session = request.getSession();
			session.setAttribute("username", ((AdminUser) map.get("user")).getUsername());
		}
		return map;
	}

}
