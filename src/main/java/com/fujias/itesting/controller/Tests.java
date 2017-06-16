package com.fujias.itesting.controller;

import com.fujias.itesting.common.Encrypt;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Use MD5:" + Encrypt.encodeMD5String("asdfsdfgjsdfghkj"));
		System.out.println("Use SHA:" + Encrypt.encodeSHAString("asdfsdfgjsdfghkj"));
		System.out.println("Use MD5:" + Encrypt.encodeMD5String("0e9060c75409f0aa08e0a8260fe77660d90da0ff3d"));

		System.out.println("Use SHA:" + Encrypt.encodeSHAString("0b011460f256373d0bc0c90be0d609623170cb710950f0940af"));
//		System.out.println("Use SHA:" + te.Encrypt(strSrc, "SHA-1"));
//		System.out.println("Use SHA-256:" + te.Encrypt(strSrc, "SHA-256")); 
//			        File file = new File("C:\\Documents and Settings\\Administrator\\" +  
//			                ".m2\\repository\\javax\\servlet\\com.springsource.javax.servlet.jsp.jstl\\1.1.2\\" +  
//			                "com.springsource.javax.servlet.jsp.jstl-1.1.2.jar");  
//			        System.out.println("加密文件:"+file.getName());  
//			        System.out.println("Use MD5:" + te.Encrypt(file, "MD5"));  
//			        System.out.println("Use SHA:" + te.Encrypt(file, "SHA-1"));  
		System.out.println("Use MD5:" + Encrypt.AESEncode("123456", "0e9060c75409f0aa08e0a8260fe77660d90da0ff3d"));
		System.out.println("Use MD5:" + Encrypt.AESDncode("33BFF656BCE098AEA2A3F928F5081A4F","0e9060c75409f0aa08e0a8260fe77660d90da0ff3d"));
	}

}
