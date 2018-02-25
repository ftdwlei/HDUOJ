package Day1;

import java.util.Scanner;

/**
 * 要求：数据的交换输出
Problem Description
输入n(n<100)个数，找出其中最小的数，将它与最前面的数交换后输出这些数。
Input
输入数据有多组，每组占一行，每行的开始是一个整数n，表示这个测试实例的数值的个数，跟着就是n个整数。n=0表示输入的结束，不做处理。
Output
对于每组输入数据，输出交换后的数列，每组输出占一行。
 * @author Administrator
 *
 */
public class Exp2016 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			if(n==0){
				break;
			}else{
				int arr[]=new int[n];
				for(int i=0;i<n;i++){
					arr[i]=input.nextInt();
				}
				int min=0;
				for(int j=0;j<n;j++){
					if(arr[min]>arr[j]){
						min=j;
					}
				}
//				//交换  相同的数异或为0产生bug
//				arr[0]=arr[0]^arr[min];
//				arr[min]=arr[0]^arr[min];
//				arr[0]=arr[0]^arr[min];
				
				//交换
				int temp=arr[0];
				arr[0]=arr[min];
				arr[min]=temp;
				//打印
				for(int k=0;k<arr.length;k++){
					if(k!=arr.length-1)
						System.out.print(arr[k]+" ");
					else
						System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
			
	}
}
