package com.lw.spring;

public class Test {

	public static void main(String[] args) throws Exception {
		BeanFactory f = new ClassPathXmlApplicationContext("com/lw/spring/applicationContext.xml");
		Object o = f.getBean("v");
		Moveable m = (Moveable)o;
		m.run();
	}

}
