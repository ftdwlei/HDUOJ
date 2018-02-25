package Day1;

import java.util.Scanner;

/**
 * 要求：青年歌手大奖赛_评委会打分
Problem Description
青年歌手大奖赛中，评委会给参赛选手打分。选手得分规则为去掉一个最高分和一个最低分，然后计算平均得分，请编程输出某选手的得分。
Input
输入数据有多组，每组占一行，每行的第一个数是n(2<n<=100)，表示评委的人数，然后是n个评委的打分。
Output
对于每组输入数据，输出选手的得分，结果保留2位小数，每组输出占一行。
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
	//取分数数组最大值
	public static double getMaxScores(double scores[]){
		double max=scores[0];
		for(int j=0;j<scores.length;j++){
			if(max<scores[j])
				max=scores[j];
		}
		return max;
	}
	//取分数数组最小值
	public static double getMinScores(double scores[]){
		double min=scores[0];
		for(int j=0;j<scores.length;j++){
			if(min>scores[j])
				min=scores[j];
		}
		return min;
	}
	//求分数数组总和
	public static double getTotalScores(double scores[]){
		double sum=0;
		for(int j=0;j<scores.length;j++){
			sum+=scores[j];
		}
		return sum;
	}
}
