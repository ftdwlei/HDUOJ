package Day2;

import java.util.Scanner;

/**
 * Ҫ��Palindromes _easy version
Problem Description
�����Ĵ�����һ�������ͷ�����һ�����ַ��������硰level�����ߡ�noon���ȵȾ��ǻ��Ĵ�����дһ�������ж϶�����ַ����Ƿ��ǡ����ġ���
Input
��������������ʵ�����������ݵĵ�һ����һ��������n,��ʾ����ʵ���ĸ����������������n���ַ�����
Output
���һ���ַ����ǻ��Ĵ��������"yes",�������"no".
 * @author Administrator
 *
 */
public class Exp2029 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=Integer.parseInt(input.nextLine());
			String str[]=new String[n];
			//�洢n���ַ���
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
	//��ת�ַ���
	public static String reverseStr(String str){
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
			str2+=str.charAt(i);
		return str2;
	}
	//�Ƚ��ַ���
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
