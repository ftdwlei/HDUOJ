package Day1;

import java.util.Scanner;

/**
Ҫ�������еĺ�
Problem Description
���еĶ������£�
���еĵ�һ��Ϊn���Ժ����Ϊǰһ���ƽ�����������е�ǰm��ĺ͡�
Input
���������ж��飬ÿ��ռһ�У�����������n��n<10000����m(m<1000)��ɣ�n��m�ĺ�����ǰ������
Output
����ÿ���������ݣ���������еĺͣ�ÿ������ʵ��ռһ�У�Ҫ�󾫶ȱ���2λС����
 * @author Administrator
 *
 */
public class Exp2009 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			double sum=0;
			int n=input.nextInt();
			int m=input.nextInt();
			double temp=n;
			for(int i=0;i<m;i++){
				sum+=temp;
				temp=Math.sqrt(temp);
			}
			System.out.printf("%.2f",sum);  //��\n OJ�ϲ�ͨ������Ϊprintln����
			System.out.println();
		}
	}
}
