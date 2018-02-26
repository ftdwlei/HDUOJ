package Day1;

import java.util.Scanner;

/**
 * 要求：绝对值排序 
Problem Description
输入n(n<=100)个整数，按照绝对值从大到小排序后输出。题目保证对于每一个测试实例，所有的数的绝对值都不相等。
Input
输入数据有多组，每组占一行，每行的第一个数字为n,接着是n个整数，n=0表示输入数据的结束，不做处理。
Output
对于每个测试实例，输出排序后的结果，两个数之间用一个空格隔开。每个测试实例占一行。
 * @author Administrator
 *
 */
public class Exp2020 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			if(n==0){
				break;
			}
			int arr[]=new int[n];
			//输入数纳入数组中
			for(int i=0;i<n;i++){
				arr[i]=input.nextInt();
			}
			int sortedArr[]=absSelectSort(arr);
			printArray(sortedArr);
		}
	}
	//带绝对值比较的选择排序
	public static int[] absSelectSort(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(Math.abs(arr[i])<Math.abs(arr[j])){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	//打印数组
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println(arr[arr.length-1]);
	}
}
