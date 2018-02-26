package Day2;

import java.util.Scanner;

/**
 * 要求：C语言合法标识符
Problem Description
输入一个字符串，判断其是否是C的合法标识符。
Input
输入数据包含多个测试实例，数据的第一行是一个整数n,表示测试实例的个数，然后是n行输入数据，每行是一个长度不超过50的字符串。
Output
对于每组输入数据，输出一行。如果输入数据是C的合法标识符，则输出"yes"，否则，输出“no”。
 * @author Administrator
 *
 */
public class Exp2024 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=Integer.parseInt(input.nextLine());
		String str[]=new String[n];
		for(int i=0;i<n;i++){
			str[i]=input.nextLine();
		}
		for(int i=0;i<n;i++){
			boolean flag=true;
			//判断首字符是否符合标识符规范
			if(isLetter(str[i].charAt(0))||isUnderLine(str[i].charAt(0))){
				for(int j=1;j<str[i].length();j++){
					if(isLetter(str[i].charAt(j))){
						continue;
					}else if(isUnderLine(str[i].charAt(j))){
						continue;
					}else if(isNumber(str[i].charAt(j))){
						continue;
					}else{
						flag=false;
						break;
					}
				}
			}else{
				flag=false;
			}
			
			if(flag){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}
	//判断是否为字母
	public static boolean isLetter(char ch){
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
			return true;
		else
			return false;
	}
	//判断是否为数字
	public static boolean isNumber(char ch){
		if(ch>='0'&&ch<='9')
			return true;
		else
			return false;
	}
	//判断是否为空格
	public static boolean isUnderLine(char ch){
		if(ch=='_')
			return true;
		else
			return false;
	}
}
