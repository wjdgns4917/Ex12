package com.one;

import java.util.StringTokenizer;

public class TokenTest2 {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����",
											   "/"); //�����ڷ� '/' ���
		while (st.hasMoreTokens()) //��ū�� �ִ� ����
			System.out.println(st.nextToken());
		
	}
}
