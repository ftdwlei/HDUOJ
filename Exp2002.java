package Day1;

import java.util.Scanner;

/**
Ҫ�󣺼��������
Problem Description
��������İ뾶ֵ��������������
Input
���������ж��飬ÿ��ռһ�У�ÿ�а���һ��ʵ������ʾ��İ뾶��
Output
�����Ӧ��������������ÿ���������ݣ����һ�У�������������λС����
 * @author Administrator
 *
 */
public class Exp2002 {
	public static void main(String[] args) {
		final double PI=3.1415927;
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String s=input.nextLine();
			double r=Double.parseDouble(s);
			double v=4*PI*r*r*r/3;
			System.out.printf("%.3f",v);
			System.out.println();
		}
	}
}
