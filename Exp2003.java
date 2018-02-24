package Day1;

import java.util.Scanner;
/**
要求： 求绝对值
Problem Description
求实数的绝对值。
Input
输入数据有多组，每组占一行，每行包含一个实数。
Output
对于每组输入数据，输出它的绝对值，要求每组数据输出一行，结果保留两位小数。
 * @author Administrator
 *
 */
public class Exp2003 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String s=input.nextLine();
			double num=Double.parseDouble(s);
			System.out.printf("%.2f",Math.abs(num));
			System.out.println();
		}
	}
}
