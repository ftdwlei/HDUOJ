package Day1;

import java.util.Scanner;

/**
Ҫ�� ����ʽ���
Problem Description
����ʽ���������£�
1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ...
������������ö���ʽ��ǰn��ĺ͡�
Input
����������2����ɣ�������һ��������m��m<100������ʾ����ʵ���ĸ������ڶ��а���m��������������ÿһ������(������Ϊn,n<1000������ö���ʽ��ǰn��ĺ͡�
Output
����ÿ������ʵ��n��Ҫ���������ʽǰn��ĺ͡�ÿ������ʵ�������ռһ�У��������2λС����
 * @author Administrator
 *
 */
public class Exp2011 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		for(int i=0;i<m;i++){
			int n=input.nextInt();
			int flag=-1;
			double sum=0;
			for(int j=1;j<=n;j++){
				flag=-flag;
				sum+=flag*1.0/j;
			}
			System.out.printf("%.2f",sum);
			System.out.println();
		}
	}
}
