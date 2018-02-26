package Day2;

import java.util.Scanner;

/**
 * 要求：发工资咯：）
Problem Description
作为杭电的老师，最盼望的日子就是每月的8号了，因为这一天是发工资的日子，养家糊口就靠它了，呵呵
但是对于学校财务处的工作人员来说，这一天则是很忙碌的一天，财务处的小胡老师最近就在考虑一个问题：如果每个老师的工资额都知道，最少需要准备多少张人民币，才能在给每位老师发工资的时候都不用老师找零呢？
这里假设老师的工资都是正整数，单位元，人民币一共有100元、50元、10元、5元、2元和1元六种。
Input
输入数据包含多个测试实例，每个测试实例的第一行是一个整数n（n<100），表示老师的人数，然后是n个老师的工资。
n=0表示输入的结束，不做处理。
Output
对于每个测试实例输出一个整数x,表示至少需要准备的人民币张数。每个输出占一行。
 * @author Administrator
 *
 */
public class Exp2021 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			if(n==0){
				break;
			}
			int arr[]=new int[n];
			//输入数纳入数组中
			for(int i=0;i<n;i++){
				arr[i]=input.nextInt();
			}
			int sum=0;
			//求总张数
			for(int j=0;j<n;j++){
				sum+=rmbCount(arr[j]);
			}
			System.out.println(sum);
		}
	}
	//计算每份工资对应至少需要人民币的张数
	public static int rmbCount(int x){
//		int count=x/100+(x%100)/50+(x%50)/10+(x%10)/5+(x%5)/2+x%2; 这样写最后x%2会重复算上部分数据 如55的5
		int count=x/100;
		x%=100;
		count+=x/50;
		x%=50;
		count+=x/10;
		x%=10;
		count+=x/5;
		x%=5;
		count+=x/2;
		x%=2;
		count+=x;
		return count;
	}
}
