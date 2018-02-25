package Day1;

import java.util.Scanner;

/**
 * Ҫ��������ִ���_��ί����
Problem Description
������ִ����У���ί�������ѡ�ִ�֡�ѡ�ֵ÷ֹ���Ϊȥ��һ����߷ֺ�һ����ͷ֣�Ȼ�����ƽ���÷֣��������ĳѡ�ֵĵ÷֡�
Input
���������ж��飬ÿ��ռһ�У�ÿ�еĵ�һ������n(2<n<=100)����ʾ��ί��������Ȼ����n����ί�Ĵ�֡�
Output
����ÿ���������ݣ����ѡ�ֵĵ÷֣��������2λС����ÿ�����ռһ�С�
 * @author Administrator
 *
 */
public class Exp2014 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			double scores[]=new double[n];
			for(int i=0;i<n;i++){
				double temp=input.nextDouble();
				scores[i]=temp;
			}
			double avgScores=(getTotalScores(scores)-getMaxScores(scores)-getMinScores(scores))/(scores.length-2);
			System.out.printf("%.2f",avgScores);
			System.out.println();
		}
	}
	//ȡ�����������ֵ
	public static double getMaxScores(double scores[]){
		double max=scores[0];
		for(int j=0;j<scores.length;j++){
			if(max<scores[j])
				max=scores[j];
		}
		return max;
	}
	//ȡ����������Сֵ
	public static double getMinScores(double scores[]){
		double min=scores[0];
		for(int j=0;j<scores.length;j++){
			if(min>scores[j])
				min=scores[j];
		}
		return min;
	}
	//����������ܺ�
	public static double getTotalScores(double scores[]){
		double sum=0;
		for(int j=0;j<scores.length;j++){
			sum+=scores[j];
		}
		return sum;
	}
}
