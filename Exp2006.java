package Day1;

import java.util.Scanner;

/**
Ҫ���������ĳ˻�
Problem Description
����n�������������������������ĳ˻���
Input
�������ݰ����������ʵ����ÿ������ʵ��ռһ�У�ÿ�еĵ�һ����Ϊn����ʾ��������һ����n����������n������������Լ���ÿ�����ݱض����ٴ���һ��������
Output
���ÿ�����е����������ĳ˻������ڲ���ʵ�������һ�С�
 * @author Administrator
 *
 */
public class Exp2006 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int result=1;
			int num=input.nextInt();
			for(int i=0;i<num;i++){
				int x=input.nextInt();
				if(x%2!=0){
					result*=x;
				}
			}
			System.out.println(result);
		}
	}
}
