package io.github.yzxdmb01.interceptor;

import io.github.yzxdmb01.utils.L;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: yinzhixing
 * @Description:
 * @Date: 2017/11/30 14:58
 */
public class AdminInterceptor extends HandlerInterceptorAdapter {
	private String mappingUrl;

	public List<String> getExceptUrls() {
		return exceptUrls;
	}

	public void setExceptUrls(List<String> exceptUrls) {
		this.exceptUrls = exceptUrls;
	}

	private List<String> exceptUrls;

	public AdminInterceptor() {
		super();
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String requestUri = request.getRequestURI();
		//放行exceptUrls中配置的url
		for (String url : exceptUrls) {
			if (url.endsWith("/**")) {
				if (requestUri.startsWith(url.substring(0, url.length() - 3))) {
					return true;
				}
			} else if (requestUri.startsWith(url)) {
				return true;
			}
		}
		String username = (String) request.getSession().getAttribute("user");
		if (username == null) {
			L.i("未登录，跳转到登录页");
			request.getRequestDispatcher("/admin/login").forward(request, response);
		} else {
			return true;
		}
		return super.preHandle(request, response, handler);
	}
}
