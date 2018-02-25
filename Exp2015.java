package Day1;

import java.util.Scanner;

/**
 * 要求：偶数求和
Problem Description
有一个长度为n(n<=100)的数列，该数列定义为从2开始的递增有序偶数，现在要求你按照顺序每m个数求出一个平均值，如果最后不足m个，则以实际数量求平均值。编程输出该平均值序列。
Input
输入数据有多组，每组占一行，包含两个正整数n和m，n和m的含义如上所述。
Output
对于每组输入数据，输出一个平均值序列，每组输出占一行。
 * @author Administrator
 *
 */
public class Exp2015 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			int m=input.nextInt();
			int arr[]=createArray(n); //生成 从2开始的递增有序偶数 长度n
			
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
