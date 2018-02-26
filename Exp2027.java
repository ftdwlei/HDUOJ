package Day2;

import java.util.Scanner;

/**
 * 要求：统计元音
Problem Description
统计每个元音字母在字符串中出现的次数。
Input
输入数据首先包括一个整数n，表示测试实例的个数，然后是n行长度不超过100的字符串。
Output
对于每个测试实例输出5行，格式如下：
a:num1
e:num2
i:num3
o:num4
u:num5
多个测试实例之间由一个空行隔开。

请特别注意：最后一块输出后面没有空行：）
 * @author Administrator
 *
 */
public class Exp2027 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=Integer.parseInt(input.nextLine());
		String str[]=new String[n];
		//存储n个字符串
		for(int i=0;i<n;i++){
			str[i]=input.nextLine();
		}
		//累加各元音的个数
		for(int i=0;i<n;i++){
			int countA=0,countE=0,countI=0,countO=0,countU=0;
			for(int j=0;j<str[i].length();j++){
				if(str[i].charAt(j)=='a')
					countA++;
				else if(str[i].charAt(j)=='e')
					countE++;
				else if(str[i].charAt(j)=='i')
					countI++;
				else if(str[i].charAt(j)=='o')
					countO++;
				else if(str[i].charAt(j)=='u')
					countU++;
				else
					continue;
			}
			System.out.println("a:"+countA);
			System.out.println("e:"+countE);
			System.out.println("i:"+countI);
			System.out.println("o:"+countO);
			System.out.println("u:"+countU);
			if(i!=n-1)
				System.out.println();
		}
	}
}
