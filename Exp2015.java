package Day1;

import java.util.Scanner;

/**
 * Ҫ��ż�����
Problem Description
��һ������Ϊn(n<=100)�����У������ж���Ϊ��2��ʼ�ĵ�������ż��������Ҫ���㰴��˳��ÿm�������һ��ƽ��ֵ����������m��������ʵ��������ƽ��ֵ����������ƽ��ֵ���С�
Input
���������ж��飬ÿ��ռһ�У���������������n��m��n��m�ĺ�������������
Output
����ÿ���������ݣ����һ��ƽ��ֵ���У�ÿ�����ռһ�С�
 * @author Administrator
 *
 */
public class Exp2015 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			int m=input.nextInt();
			int arr[]=createArray(n); //���� ��2��ʼ�ĵ�������ż�� ����n
			
			int t;
			if(n%m==0)
				t=n/m;
			else
				t=n/m+1;
			for(int i=0;i<t;i++){
				int sum=0;
				int avg;
				for(int j=0;j<m;j++){
					if(i*m+j>=n){
						break;
					}
					sum+=arr[i*m+j];
				}
//				if(n%m==0){
//					if(i==t-1){
//						avg=sum/m;
//						System.out.print(avg);
//					}
//					else{
//						avg=sum/m;
//						System.out.print(avg+" ");
//					}
//				}else{
//					if(i==n/m){
//						avg=sum/(n%m);
//						System.out.print(avg);
//					}
//					else{
//						avg=sum/m;
//						System.out.print(avg+" ");
//					}
//				}
				if(i==(t-1)){
					if(n%m==0){
						avg=sum/m;
					}else{
						avg=sum/(n%m);
					}
					System.out.print(avg);
				}else{
					avg=sum/m;
					System.out.print(avg+" ");
				}
				
			}
			System.out.println();
		}
	}
	public static int[] createArray(int num){
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=2*(i+1);
		}
		return arr;
	}
}
