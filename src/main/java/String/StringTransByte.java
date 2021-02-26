package String;

import java.io.UnsupportedEncodingException;

public class StringTransByte {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String j="你好12";
        byte[] bytes1 = j.getBytes();
        byte[] bytes2={11,2,4,65,6,3,5};
        String s1=new String(bytes1);
        String s2=new String(bytes2);
        System.out.println(s1);
        System.out.println(s2);

        char[] chars={'1','2','3'};
        String s3=new String(chars,0,3);////123,指定位开始的n个字符
        char[] chars2=s3.toCharArray();
        System.out.println(s3);
        for (char c:chars2){
            System.out.print(c);
        }
    }
}
