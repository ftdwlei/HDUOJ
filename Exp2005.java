package Day1;

import java.util.Scanner;

/**
要求： 第几天？
Problem Description
给定一个日期，输出这个日期是该年的第几天。
Input
输入数据有多组，每组占一行，数据格式为YYYY/MM/DD组成，具体参见sample input ,另外，可以向你确保所有的输入数据是合法的。
Output
对于每组输入数据，输出一行，表示该日期是该年的第几天。
 * @author Administrator
 *
 *思路：1、分为闰年非闰年两种，  2、用String.split()函数对日期格式进行拆分成字符串数组
 */
public class Exp2005 {
	public static void main(String[] args) {
		int []days={31,28,31,30,31,30,31,31,30,31,30,31}; //非闰年所有月份用数组容器存储
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String s=input.nextLine();
			String []ss=s.split("/");  //对1985/1/20格式的字符串进行拆分
			int year=Integer.parseInt(ss[0]); //取年份
			int month=Integer.parseInt(ss[1]);//取月份
			int day=Integer.parseInt(ss[2]);  //取天数
			int totalDays=0;
			for(int i=0;i<month-1;i++){
				totalDays+=days[i];
			}
			if((month>2)&&(year%400==0||(year%4==0&&year%100!=0))) //判断是否闰年并且月份大于二月
				totalDays=totalDays+day+1;
			else
				totalDays=totalDays+day;
			System.out.println(totalDays);
		}
	}
}
