package io.github.yzxdmb01;

import io.github.yzxdmb01.utils.MD5;
import org.junit.Test;

/**
 * @Author: yinzhixing
 * @Description:
 * @Date: 2017/11/30 18:25
 */
public class SimpleBaseTest {

	@Test
	public void testMD5() {
		String pwd = "root";
		System.out.println("MD5:" + MD5.encode(pwd));
	}
}
