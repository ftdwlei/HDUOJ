package Day1;

import java.util.Scanner;

/**
 * 要求：字符串统计
Problem Description
对于给定的一个字符串，统计其中数字字符出现的次数。
Input
输入数据有多行，第一行是一个整数n，表示测试实例的个数，后面跟着n行，每行包括一个由字母和数字组成的字符串。
Output
对于每个测试实例，输出该串中数值的个数，每个输出占一行。
 * @author Administrator
 *
 */

public class Exp2017 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=Integer.parseInt(input.nextLine());
		while(n>0){
			n--;
			String str=input.nextLine();
			int count=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)<='9'&&str.charAt(i)>='0')
					count++;
			}
			System.out.println(count);
		}
	}
}
