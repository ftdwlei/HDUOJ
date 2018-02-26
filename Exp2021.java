package Day2;

import java.util.Scanner;

/**
 * Ҫ�󣺷����ʿ�����
Problem Description
��Ϊ�������ʦ�������������Ӿ���ÿ�µ�8���ˣ���Ϊ��һ���Ƿ����ʵ����ӣ����Һ��ھͿ����ˣ��Ǻ�
���Ƕ���ѧУ���񴦵Ĺ�����Ա��˵����һ�����Ǻ�æµ��һ�죬���񴦵�С����ʦ������ڿ���һ�����⣺���ÿ����ʦ�Ĺ��ʶ֪����������Ҫ׼������������ң������ڸ�ÿλ��ʦ�����ʵ�ʱ�򶼲�����ʦ�����أ�
���������ʦ�Ĺ��ʶ�������������λԪ�������һ����100Ԫ��50Ԫ��10Ԫ��5Ԫ��2Ԫ��1Ԫ���֡�
Input
�������ݰ����������ʵ����ÿ������ʵ���ĵ�һ����һ������n��n<100������ʾ��ʦ��������Ȼ����n����ʦ�Ĺ��ʡ�
n=0��ʾ����Ľ�������������
Output
����ÿ������ʵ�����һ������x,��ʾ������Ҫ׼���������������ÿ�����ռһ�С�
 * @author Administrator
 *
 */
public class Exp2021 {
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
			int sum=0;
			//��������
			for(int j=0;j<n;j++){
				sum+=rmbCount(arr[j]);
			}
			System.out.println(sum);
		}
	}
	//����ÿ�ݹ��ʶ�Ӧ������Ҫ����ҵ�����
	public static int rmbCount(int x){
//		int count=x/100+(x%100)/50+(x%50)/10+(x%10)/5+(x%5)/2+x%2; ����д���x%2���ظ����ϲ������� ��55��5
		int count=x/100;
		x%=100;
		count+=x/50;
		x%=50;
		count+=x/10;
		x%=10;
		count+=x/5;
		x%=5;
		count+=x/2;
		x%=2;
		count+=x;
		return count;
	}
}
