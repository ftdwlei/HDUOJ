package Day1;

import java.util.Scanner;

/**
 * 要求：数列有序!
Problem Description
有n(n<=100)个整数，已经按照从小到大顺序排列好，现在另外给一个整数x，请将该数插入到序列中，并使新的序列仍然有序。
Input
输入数据包含多个测试实例，每组数据由两行组成，第一行是n和m，第二行是已经有序的n个数的数列。n和m同时为0标示输入数据的结束，本行不做处理。
Output
对于每个测试实例，输出插入新的元素后的数列。
 * @author Administrator
 *  调试不通过：犯了二分查找后修改arr[min]和arr[max]值，mid未改变的错误
 */
public class Exp2019 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			int m=input.nextInt();
			if(n==0&&m==0){
				break;
			}
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=input.nextInt();
			}
			int index=insertLoc(arr, m);
			int arr2[]=new int[n+1];
			//复制arr[]数组至新数组，并把m值代入
			for(int j=0;j<n+1;j++){
				if(j<index){
					arr2[j]=arr[j];
				}else if(j==index){
					arr2[j]=m;
				}else{
					arr2[j]=arr[j-1];
				}
			}
			printArray(arr2);
		}
	}
	//查找插入点  
	public static int insertLoc(int arr[],int num){
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		while(min<=max){
			if(num>arr[mid]){
				min=mid+1;
				mid=(min+max)/2;
			}else if(num<arr[mid]){
				max=mid-1;
				mid=(min+max)/2;      
			}else{
				return mid;
			}
		}
		return min;
	}
	//打印数组
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println(arr[arr.length-1]);
	}
}
