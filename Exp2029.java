package Day2;

import java.util.Scanner;

/**
 * 要求：Palindromes _easy version
Problem Description
“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。请写一个程序判断读入的字符串是否是“回文”。
Input
输入包含多个测试实例，输入数据的第一行是一个正整数n,表示测试实例的个数，后面紧跟着是n个字符串。
Output
如果一个字符串是回文串，则输出"yes",否则输出"no".
 * @author Administrator
 *
 */
public class Exp2029 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=Integer.parseInt(input.nextLine());
			String str[]=new String[n];
			//存储n个字符串
			for(int i=0;i<n;i++){
				str[i]=input.nextLine();
			}
			for(int i=0;i<n;i++){
				String reverseStr=reverseStr(str[i]);
				if(equalsStr(reverseStr, str[i]))
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}
	}
	//反转字符串
	public static String reverseStr(String str){
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
			str2+=str.charAt(i);
		return str2;
	}
	//比较字符串
	public static boolean equalsStr(String str1,String str2){
		if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i)==str2.charAt(i))
					continue;
				else{
					return false;
				}
			}
			return true;
		}else
			return false;
	}
}
