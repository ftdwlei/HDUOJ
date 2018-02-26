package Day2;

import java.util.Scanner;

/**
 * Ҫ��C���ԺϷ���ʶ��
Problem Description
����һ���ַ������ж����Ƿ���C�ĺϷ���ʶ����
Input
�������ݰ����������ʵ�������ݵĵ�һ����һ������n,��ʾ����ʵ���ĸ�����Ȼ����n���������ݣ�ÿ����һ�����Ȳ�����50���ַ�����
Output
����ÿ���������ݣ����һ�С��������������C�ĺϷ���ʶ���������"yes"�����������no����
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
			//�ж����ַ��Ƿ���ϱ�ʶ���淶
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
	//�ж��Ƿ�Ϊ��ĸ
	public static boolean isLetter(char ch){
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
			return true;
		else
			return false;
	}
	//�ж��Ƿ�Ϊ����
	public static boolean isNumber(char ch){
		if(ch>='0'&&ch<='9')
			return true;
		else
			return false;
	}
	//�ж��Ƿ�Ϊ�ո�
	public static boolean isUnderLine(char ch){
		if(ch=='_')
			return true;
		else
			return false;
	}
}
