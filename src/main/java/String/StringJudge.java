package String;

/**
 * @Auther:http://www.bjsxt.com
 * @Date:2019/9/12
 * @Description:String
 * @version:1.0
 */
public class StringJudge {
    public static void main(String[] args) {
        String s1="456江你来猜猜看4";
        boolean b1 = s1.contains("123");//是否包含指定字符串
        boolean b2 = s1.startsWith("46");//字符串开始时是否是指定字符串
        boolean b3 = s1.endsWith("看");//字符串结束时是否是指定字符串
        int i = s1.indexOf("江");//第一次出现指定字符串的位置
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(i);

        int i1 = s1.lastIndexOf("4");//最后一次出现指定字符串的位置
        System.out.println(i1);

        String s2="abc";
        String s3="ABC";
        boolean equals1 = s2.equals(s3);//false,大小写不同
        boolean equals2 = s2.equalsIgnoreCase(s3);//true，忽略大小写
        System.out.println(equals1);
        System.out.println(equals2);

        boolean empty = s2.isEmpty();
        System.out.println(empty);


    }
}
