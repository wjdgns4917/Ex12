package com.one;

public class CharAtTest {

	public static void main(String[] args) {
		String a="abcdefg";
		char c=a.charAt(5);
		System.out.println("idx 5:"+c);
		
		int count=0;
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
			//Ư������ �ݺ�Ƚ��
			if (a.charAt(i)=='s') {
				count++;
			}
			}
		System.out.println("�ݺ�:"+count);
	}

}
