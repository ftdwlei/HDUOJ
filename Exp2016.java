package Day1;

import java.util.Scanner;

/**
 * Ҫ�����ݵĽ������
Problem Description
����n(n<100)�������ҳ�������С��������������ǰ����������������Щ����
Input
���������ж��飬ÿ��ռһ�У�ÿ�еĿ�ʼ��һ������n����ʾ�������ʵ������ֵ�ĸ��������ž���n��������n=0��ʾ����Ľ�������������
Output
����ÿ���������ݣ��������������У�ÿ�����ռһ�С�
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
//				//����  ��ͬ�������Ϊ0����bug
//				arr[0]=arr[0]^arr[min];
//				arr[min]=arr[0]^arr[min];
//				arr[0]=arr[0]^arr[min];
				
				//����
				int temp=arr[0];
				arr[0]=arr[min];
				arr[min]=temp;
				//��ӡ
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
