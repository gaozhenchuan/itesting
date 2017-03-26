package com.fujias.itesting.base.bean;

import java.io.Serializable;

public class BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private void show() {
		System.out.println("This is BaseInfo");
	}
	
	private void show2(int a,String b) {
		System.out.println("This is BaseInfo" + a +":"+b);
	}
}
