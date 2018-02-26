package Day2;

import java.util.Scanner;

/**
 * Ҫ�󣺲������Ԫ��
Problem Description
���������ÿ���ַ������������е������ĸ���ڸ���ĸ��������ַ�����(max)����
Input
�������ݰ����������ʵ����ÿ��ʵ����һ�г��Ȳ�����100���ַ�����ɣ��ַ������ɴ�Сд��ĸ���ɡ�
Output
����ÿ������ʵ�����һ���ַ���������Ľ���ǲ����ַ�����(max)����Ľ����������ڶ��������ĸ������ÿһ�������ĸ���涼����"(max)"��
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
	//ȡ�ַ�������ַ�
	public static char getStringMaxCharacter(String str){
		int index=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(index)<str.charAt(i)){
				index=i;
			}
		}
		return str.charAt(index);
	}
	
	//�����ַ�����(max)��  ͨ�����ַ����������������ԭ�ַ���������ɣ�1����maxԪ�أ�����max+"(max)" 2������ԭ��Ԫ��
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
