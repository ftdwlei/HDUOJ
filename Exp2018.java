package Day1;

import java.util.Scanner;

/**
 * Ҫ��ĸţ�Ĺ���
Problem Description
��һͷĸţ����ÿ�������һͷСĸţ��ÿͷСĸţ�ӵ��ĸ���ͷ��ʼ��ÿ�����Ҳ��һͷСĸţ������ʵ���ڵ�n���ʱ�򣬹��ж���ͷĸţ��
Input
���������ɶ������ʵ����ɣ�ÿ������ʵ��ռһ�У�����һ������n(0<n<55)��n�ĺ�������Ŀ��������
n=0��ʾ�������ݵĽ�������������
Output
����ÿ������ʵ��������ڵ�n���ʱ��ĸţ��������
ÿ�����ռһ�С�
 * @author Administrator
 *  ˼·���ݹ�  f(1)=1 f(2)=2 f(3)=3 f(4)=4 f(5)=f(4)+f(2)
 */
public class Exp2018 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			if(n==0){
				break;
			}
			System.out.println(f(n));
		}
	}
	public static int f(int n){
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else if(n==3)
			return 3;
		else
			return f(n-1)+f(n-3);
	}
}
