package Day1;

import java.util.Scanner;

/**
 * Ҫ����������!
Problem Description
��n(n<=100)���������Ѿ����մ�С����˳�����кã����������һ������x���뽫�������뵽�����У���ʹ�µ�������Ȼ����
Input
�������ݰ����������ʵ����ÿ��������������ɣ���һ����n��m���ڶ������Ѿ������n���������С�n��mͬʱΪ0��ʾ�������ݵĽ��������в�������
Output
����ÿ������ʵ������������µ�Ԫ�غ�����С�
 * @author Administrator
 *  ���Բ�ͨ�������˶��ֲ��Һ��޸�arr[min]��arr[max]ֵ��midδ�ı�Ĵ���
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
			//����arr[]�����������飬����mֵ����
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
	//���Ҳ����  
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
	//��ӡ����
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println(arr[arr.length-1]);
	}
}
