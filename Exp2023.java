package Day2;

import java.util.Scanner;
/**
 * Ҫ����ƽ���ɼ�
Problem Description
����һ������n(n<=50)��ѧ����ÿ�˿�m(m<=5)�ſΣ���ÿ��ѧ����ƽ���ɼ���ÿ�ſε�ƽ���ɼ�����������Ƴɼ������ڵ���ƽ���ɼ���ѧ��������
Input
���������ж������ʵ����ÿ������ʵ���ĵ�һ�а�����������n��m���ֱ��ʾѧ�����Ϳγ�����Ȼ����n�����ݣ�ÿ�а���m���������������Է�������
Output
����ÿ������ʵ�������3�����ݣ���һ�а���n�����ݣ���ʾn��ѧ����ƽ���ɼ������������λС�����ڶ��а���m�����ݣ���ʾm�ſε�ƽ���ɼ������������λС������������һ����������ʾ�ð༶�и��Ƴɼ������ڵ���ƽ���ɼ���ѧ��������
ÿ������ʵ�������һ�����С�
 * @author Administrator
 *  bug���� 1����avgʱsum2[m-1]/n ��n����m��� 2�����һ�������������
 */  

public class Exp2023 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			int m=input.nextInt();
			double arr[][]=new double[n][m];
			//����������������
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++)
					arr[i][j]=input.nextInt();
			}
			//ÿ��ѧ�������ܷ��� ��n��ѧ����
			double sum1[]=new double[n];
			//һ�ſγ�����ѧ���ܷ� ��m�ſγ̣�
			double sum2[]=new double[m];
			
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					sum1[i]+=arr[i][j]; //ÿ��ѧ�������ܷ��� ��n��ѧ����
					sum2[j]+=arr[i][j]; //һ�ſγ�����ѧ���ܷ� ��m�ſγ̣�
				}
			}
//			//��ƽ����
//			double avg1[]=new double[n];
//			for(int i=0;i<n;i++){
//				avg1[i]=sum1[i]/n;
//			}
			
			
//			//��ƽ����
//			double avg2[]=new double[m];
//			for(int i=0;i<m;i++){
//				avg2[i]=sum2[i]/n;
//			}
			
			//����Ƴɼ������ڵ���ƽ���ɼ���ѧ������
			int count=0;
			for(int i=0;i<n;i++){
				boolean flag=true;
				for(int j=0;j<m;j++){
					if(arr[i][j]>=sum2[j]/n){
						continue;
					}else{
						flag=false;
						break;
					}
				}
				if(flag){
					count++;
				}
			}
			
			//�����һ��
			for(int i=0;i<n-1;i++)
				System.out.printf("%.2f ",sum1[i]/m);
			System.out.printf("%.2f",sum1[n-1]/m);
			System.out.println();
			//����ڶ���
			for(int i=0;i<m-1;i++)
				System.out.printf("%.2f ",sum2[i]/n);
			System.out.printf("%.2f",sum2[m-1]/n);
			System.out.println();
			//���������
			System.out.println(count);
			System.out.println();
		}
	}
}
