package Day2;

import java.util.Scanner;

/**
 * 要求:汉字统计
Problem Description
统计给定文本文件中汉字的个数。
Input
输入文件首先包含一个整数n，表示测试实例的个数，然后是n段文本。
Output
对于每一段文本，输出其中的汉字的个数，每个测试实例的输出占一行。
[Hint:]从汉字机内码的特点考虑~
 * @author Administrator
 *
 */
public class Exp2030 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=Integer.parseInt(input.nextLine());
			String str[]=new String[n];
			//存储n个字符串
			for(int i=0;i<n;i++){
				str[i]=input.nextLine();
			}
			//输出每个字符串汉字数
			for(int i=0;i<n;i++){
				int count=0;
				for(int j=0;j<str[i].length();j++){
					if(isChinese(str[i].charAt(j)))
						count++;
				}
				System.out.println(count);
			}
		}
	}
	//判断是否为汉字
	public static boolean isChinese(char ch){
		if((ch>=0x4e00)&&(ch<=0x9fbb))
			return true;
		else
			return false;
	}
}


/*
JAVA中判断char是否是中文的几种方法
1、方法一
   char c = 'a';  
    if((c >= 0x4e00)&&(c <= 0x9fbb)) {  
        System.out.println("是中文");  
    }  
	上面的方法很简单，但只能判断是否是中文，但不能判断是否是中文标点。
	下面的方法很全面，中文字符标点都可以判断
2、方法二
    private static final boolean isChinese(char c) {   
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);  
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS  
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS  
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A  
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION  
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION  
                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {  
            return true;  
        }  
        return false;  
    }  */