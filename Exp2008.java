package Day1;

import java.util.Scanner;

/**
Ҫ�� ��ֵͳ��
Problem Description
ͳ�Ƹ�����n�����У���������������ĸ�����
Input
���������ж��飬ÿ��ռһ�У�ÿ�еĵ�һ����������n��n<100������ʾ��Ҫͳ�Ƶ���ֵ�ĸ�����Ȼ����n��ʵ�������n=0�����ʾ������������в�������
Output
����ÿ���������ݣ����һ��a,b��c���ֱ��ʾ�����������и�������������ĸ�����
 * @author Administrator
 *
 */
public class Exp2008 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int negativeNum=0,zeroNum=0,positiveNum=0;
			int n=input.nextInt();
			if(n==0)  //���n=0�����ʾ������������в�������
				break;
			for(int i=0;i<n;i++){
				double x=input.nextDouble();
				if(x<0)
					negativeNum++;
				else if(x==0)
					zeroNum++;
				else
					positiveNum++;
			}
			System.out.println(negativeNum+" "+zeroNum+" "+positiveNum);
		}
	}
}
