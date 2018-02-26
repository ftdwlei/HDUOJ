package Day2;

import java.util.Scanner;
/**
 * 要求：求平均成绩
Problem Description
假设一个班有n(n<=50)个学生，每人考m(m<=5)门课，求每个学生的平均成绩和每门课的平均成绩，并输出各科成绩均大于等于平均成绩的学生数量。
Input
输入数据有多个测试实例，每个测试实例的第一行包括两个整数n和m，分别表示学生数和课程数。然后是n行数据，每行包括m个整数（即：考试分数）。
Output
对于每个测试实例，输出3行数据，第一行包含n个数据，表示n个学生的平均成绩，结果保留两位小数；第二行包含m个数据，表示m门课的平均成绩，结果保留两位小数；第三行是一个整数，表示该班级中各科成绩均大于等于平均成绩的学生数量。
每个测试实例后面跟一个空行。
 * @author Administrator
 *  bug调试 1、求avg时sum2[m-1]/n 除n还是m搞错 2、最后一行输出空行问题
 */  

public class Exp2023 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			int m=input.nextInt();
			double arr[][]=new double[n][m];
			//输入数纳入数组中
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++)
					arr[i][j]=input.nextInt();
			}
			//每个学生各门总分数 （n个学生）
			double sum1[]=new double[n];
			//一门课程所有学生总分 （m门课程）
			double sum2[]=new double[m];
			
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					sum1[i]+=arr[i][j]; //每个学生各门总分数 （n个学生）
					sum2[j]+=arr[i][j]; //一门课程所有学生总分 （m门课程）
				}
			}
//			//求平均分
//			double avg1[]=new double[n];
//			for(int i=0;i<n;i++){
//				avg1[i]=sum1[i]/n;
//			}
			
			
//			//求平均分
//			double avg2[]=new double[m];
//			for(int i=0;i<m;i++){
//				avg2[i]=sum2[i]/n;
//			}
			
			//求各科成绩均大于等于平均成绩的学生数量
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
			
			//输出第一行
			for(int i=0;i<n-1;i++)
				System.out.printf("%.2f ",sum1[i]/m);
			System.out.printf("%.2f",sum1[n-1]/m);
			System.out.println();
			//输出第二行
			for(int i=0;i<m-1;i++)
				System.out.printf("%.2f ",sum2[i]/n);
			System.out.printf("%.2f",sum2[m-1]/n);
			System.out.println();
			//输出第三行
			System.out.println(count);
			System.out.println();
		}
	}
}
