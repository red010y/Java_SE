package String;

/**
 * @Auther:http://www.bjsxt.com
 * @Date:2019/9/12
 * @Description:String
 * @version:1.0
 */
public class SubstringDemo {
    public static void main(String[] args) {
        String s="江超级牛逼";
        String s1 = s.substring(1);//超级牛逼,返回指定位置开始，到字符串末尾的字符
        String s2 = s.substring(0,1);//江，返回指定位置开始，到指定位置结束的字符（包含头，不包含尾巴）
        System.out.println(s1);
        System.out.println(s2);
    }
}
