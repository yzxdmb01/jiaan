package io.github.yzxdmb01.controller;

import io.github.yzxdmb01.bean.TestBean;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yinzhixing
 * @Description:
 * @Date: 2017/11/28 16:37
 */
@Controller
public class ProductController {

	@ResponseBody
	@RequestMapping(value = "testStr", method = RequestMethod.GET)
	public String testRequestMapping() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("cn", "中文");
		jsonObject.put("en", "english");
		jsonObject.put("number", "123");
		return jsonObject.toString();
	}

	@ResponseBody
	@RequestMapping(value = "testObj", method = RequestMethod.GET)
	public Object testObj() {
		TestBean testBean = new TestBean("名字", 16);
		Map<String, Object> result = new HashMap<>();
		result.put("cn", "中文");
		result.put("bean", testBean);
		return result;
	}
}
