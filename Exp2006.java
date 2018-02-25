package Day1;

import java.util.Scanner;

/**
要求：求奇数的乘积
Problem Description
给你n个整数，求他们中所有奇数的乘积。
Input
输入数据包含多个测试实例，每个测试实例占一行，每行的第一个数为n，表示本组数据一共有n个，接着是n个整数，你可以假设每组数据必定至少存在一个奇数。
Output
输出每组数中的所有奇数的乘积，对于测试实例，输出一行。
 * @author Administrator
 *
 */
public class Exp2006 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int result=1;
			int num=input.nextInt();
			for(int i=0;i<num;i++){
				int x=input.nextInt();
				if(x%2!=0){
					result*=x;
				}
			}
			System.out.println(result);
		}
	}
}
