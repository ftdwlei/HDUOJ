package Day1;

import java.util.Scanner;
/**
Ҫ�� �����ֵ
Problem Description
��ʵ���ľ���ֵ��
Input
���������ж��飬ÿ��ռһ�У�ÿ�а���һ��ʵ����
Output
����ÿ���������ݣ�������ľ���ֵ��Ҫ��ÿ���������һ�У����������λС����
 * @author Administrator
 *
 */
public class Exp2003 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String s=input.nextLine();
			double num=Double.parseDouble(s);
			System.out.printf("%.2f",Math.abs(num));
			System.out.println();
		}
	}
}
