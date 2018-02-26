package Day2;

import java.util.Scanner;

/**
 * 要求：查找最大元素
Problem Description
对于输入的每个字符串，查找其中的最大字母，在该字母后面插入字符串“(max)”。
Input
输入数据包括多个测试实例，每个实例由一行长度不超过100的字符串组成，字符串仅由大小写字母构成。
Output
对于每个测试实例输出一行字符串，输出的结果是插入字符串“(max)”后的结果，如果存在多个最大的字母，就在每一个最大字母后面都插入"(max)"。
 * @author Administrator
 *
 */
public class Exp2025 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String str=input.nextLine();
			char max=getStringMaxCharacter(str);
			System.out.println(insertString(str, max));
		}
	}
	//取字符串最大字符
	public static char getStringMaxCharacter(String str){
		int index=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(index)<str.charAt(i)){
				index=i;
			}
		}
		return str.charAt(index);
	}
	
	//插入字符串“(max)”  通过新字符串分两种情况复制原字符串数据完成：1、有max元素，复制max+"(max)" 2、复制原有元素
	public static String insertString(String str,char max){
		String str2="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==max){
				str2+=str.charAt(i)+"(max)";
			}else{
				str2+=str.charAt(i);
			}
		}
		return str2;
	}
}
