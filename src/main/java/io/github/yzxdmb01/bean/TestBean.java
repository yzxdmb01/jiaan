package io.github.yzxdmb01.bean;

/**
 * @Author: yinzhixing
 * @Description: 测试2
 * @Date: 2017/11/28 16:46
 */
public class TestBean {
	private String name;
	private int age;

	public TestBean(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "TestBean{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
