package Day2;

import java.util.Scanner;

/**
 * Ҫ������ĸ���д
Problem Description
����һ��Ӣ�ľ��ӣ���ÿ�����ʵĵ�һ����ĸ�ĳɴ�д��ĸ��
Input
�������ݰ����������ʵ����ÿ������ʵ����һ�����Ȳ�����100��Ӣ�ľ��ӣ�ռһ�С�
Output
���������Ҫ���д���Ӣ�ľ��ӡ�
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
	//�ж��Ƿ�ΪСд��ĸ
	public static boolean isLowLetter(char ch){
		if(ch>='a'&&ch<='z')
			return true;
		else
			return false;
	}
	//ת����д��ĸ
	public static char toUpperetter(char ch){
		if(isLowLetter(ch)){
			ch=(char) (ch-('a'-'A'));
		}
		return ch;
	}
}
