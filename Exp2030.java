package Day2;

import java.util.Scanner;

/**
 * Ҫ��:����ͳ��
Problem Description
ͳ�Ƹ����ı��ļ��к��ֵĸ�����
Input
�����ļ����Ȱ���һ������n����ʾ����ʵ���ĸ�����Ȼ����n���ı���
Output
����ÿһ���ı���������еĺ��ֵĸ�����ÿ������ʵ�������ռһ�С�
[Hint:]�Ӻ��ֻ�������ص㿼��~
 * @author Administrator
 *
 */
public class Exp2030 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=Integer.parseInt(input.nextLine());
			String str[]=new String[n];
			//�洢n���ַ���
			for(int i=0;i<n;i++){
				str[i]=input.nextLine();
			}
			//���ÿ���ַ���������
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
	//�ж��Ƿ�Ϊ����
	public static boolean isChinese(char ch){
		if((ch>=0x4e00)&&(ch<=0x9fbb))
			return true;
		else
			return false;
	}
}


/*
JAVA���ж�char�Ƿ������ĵļ��ַ���
1������һ
   char c = 'a';  
    if((c >= 0x4e00)&&(c <= 0x9fbb)) {  
        System.out.println("������");  
    }  
	����ķ����ܼ򵥣���ֻ���ж��Ƿ������ģ��������ж��Ƿ������ı�㡣
	����ķ�����ȫ�棬�����ַ���㶼�����ж�
2��������
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