package Day1;

import java.util.Scanner;

/**
要求：计算球体积
Problem Description
根据输入的半径值，计算球的体积。
Input
输入数据有多组，每组占一行，每行包括一个实数，表示球的半径。
Output
输出对应的球的体积，对于每组输入数据，输出一行，计算结果保留三位小数。
 * @author Administrator
 *
 */
public class Exp2002 {
	public static void main(String[] args) {
		final double PI=3.1415927;
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String s=input.nextLine();
			double r=Double.parseDouble(s);
			double v=4*PI*r*r*r/3;
			System.out.printf("%.3f",v);
			System.out.println();
		}
	}
}
