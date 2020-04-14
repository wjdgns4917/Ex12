package com.one;

public class SubStringTest {
	public static void main(String[] args) {
		String str="012345678";
		String subStr=str.substring(5);
		System.out.println(subStr); //startIdx이상
		
		String sub2Str=str.substring(3, 6);
		System.out.println(sub2Str); //startIdx 이상 endIdx 미만
		
		System.out.println("length : "+sub2Str.length());
	}
}
