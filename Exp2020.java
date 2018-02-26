package Day1;

import java.util.Scanner;

/**
 * Ҫ�󣺾���ֵ���� 
Problem Description
����n(n<=100)�����������վ���ֵ�Ӵ�С������������Ŀ��֤����ÿһ������ʵ�������е����ľ���ֵ������ȡ�
Input
���������ж��飬ÿ��ռһ�У�ÿ�еĵ�һ������Ϊn,������n��������n=0��ʾ�������ݵĽ�������������
Output
����ÿ������ʵ������������Ľ����������֮����һ���ո������ÿ������ʵ��ռһ�С�
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
			//����������������
			for(int i=0;i<n;i++){
				arr[i]=input.nextInt();
			}
			int sortedArr[]=absSelectSort(arr);
			printArray(sortedArr);
		}
	}
	//������ֵ�Ƚϵ�ѡ������
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
	//��ӡ����
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println(arr[arr.length-1]);
	}
}
