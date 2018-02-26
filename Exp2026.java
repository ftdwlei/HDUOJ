package Day2;

import java.util.Scanner;

/**
 * 要求：首字母变大写
Problem Description
输入一个英文句子，将每个单词的第一个字母改成大写字母。
Input
输入数据包含多个测试实例，每个测试实例是一个长度不超过100的英文句子，占一行。
Output
请输出按照要求改写后的英文句子。
 * @author Administrator
 *
 */
public class Exp2026 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String str=input.nextLine();
			String str2="";
			str2+=toUpperetter(str.charAt(0));
			for(int i=1;i<str.length();i++){
				if(isLowLetter(str.charAt(i))&&str.charAt(i-1)==' ')
					str2+=toUpperetter(str.charAt(i));
				else
					str2+=str.charAt(i);
			}
			System.out.println(str2);
		}
	}
	//判断是否为小写字母
	public static boolean isLowLetter(char ch){
		if(ch>='a'&&ch<='z')
			return true;
		else
			return false;
	}
	//转换大写字母
	public static char toUpperetter(char ch){
		if(isLowLetter(ch)){
			ch=(char) (ch-('a'-'A'));
		}
		return ch;
	}
}
