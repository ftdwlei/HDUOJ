package Day1;

import java.util.Scanner;

/**
 * Ҫ���ַ���ͳ��
Problem Description
���ڸ�����һ���ַ�����ͳ�����������ַ����ֵĴ�����
Input
���������ж��У���һ����һ������n����ʾ����ʵ���ĸ������������n�У�ÿ�а���һ������ĸ��������ɵ��ַ�����
Output
����ÿ������ʵ��������ô�����ֵ�ĸ�����ÿ�����ռһ�С�
 * @author Administrator
 *
 */

public class Exp2017 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=Integer.parseInt(input.nextLine());
		while(n>0){
			n--;
			String str=input.nextLine();
			int count=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)<='9'&&str.charAt(i)>='0')
					count++;
			}
			System.out.println(count);
		}
	}
}
