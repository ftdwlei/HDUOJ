package Day2;

import java.util.Scanner;

/**
 * Ҫ��Lowest Common Multiple Plus
Problem Description
��n��������С��������
Input
��������������ʵ����ÿ������ʵ���Ŀ�ʼ��һ��������n��Ȼ����n����������
Output
Ϊÿ���������������ǵ���С��������ÿ������ʵ�������ռһ�С�����Լ������������һ��32λ��������
 * @author Administrator
 *  ˼·����1������n�����ĳ˻��������ڳ����κ���������Ϊ0��ֹ
 *  OJ�����Ͳ�ͨ�����ѳ˻���long���漴��
 */
public class Exp2028 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			int arr[]=new int[n];
			//¼��n��������
			long numProduct=1; 
			for(int i=0;i<n;i++){
				arr[i]=input.nextInt();
				numProduct*=arr[i];     //n���������˻���Ϊѭ�����ֵ
			}
			//�����С������
			for(long j=1;j<=numProduct;j++){   //��1��n���������˻�����
				boolean flag=true;
				for(int k=0;k<n;k++){         //���ζ�¼�������Ԫ�ؽ���ȡ�����
					if(j%arr[k]==0)
						continue;
					else{
						flag=false;
						break;
					}
				}
				if(flag){                     //���j������������Ԫ��ȡ��Ϊ0�������ѭ���������С������j
					System.out.println(j);
					break;
				}
			}
		}
	}
}
