package io.github.yzxdmb01.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Author: yinzhixing
 * @Description: 日志类
 * @Date: 2017/11/29 9:58
 */
public class L {
	private static final Logger log = LogManager.getLogger();

	public static void i(String msg) {
		log.info(msg);
	}

	public static void e(String msg) {
		log.error(msg);
	}

	public static void d(String msg) {
		log.debug(msg);
	}
}
