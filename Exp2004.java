package Day1;

import java.util.Scanner;

/**
要求： 成绩转换
Problem Description
输入一个百分制的成绩t，将其转换成对应的等级，具体转换规则如下：
90~100为A;
80~89为B;
70~79为C;
60~69为D;
0~59为E;
Input
输入数据有多组，每组占一行，由一个整数组成。
Output
对于每组输入数据，输出一行。如果输入数据不在0~100范围内，请输出一行：“Score is error!”。
 * @author Administrator
 *
 */
public class Exp2004 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int num=input.nextInt();
			if(num<0||num>100){
				System.out.println("Score is error!");
			}else if(num>=90){
				System.out.println("A");;
			}else if(num>=80){
				System.out.println("B");
			}else if(num>=70){
				System.out.println("C");
			}else if(num>=60){
				System.out.println("D");
			}else{
				System.out.println("E");
			}
		}
	}
}
