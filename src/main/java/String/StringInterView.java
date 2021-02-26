package String;
//获取www.baidu.com最后一个点的内容”com”
public class StringInterView {
    public static void main(String[] args) {
//        byte[] bytes={1,5,3,74,8};
//        String s="1,87,1,1,13,";
//        byte[] bytes = stingTransByte(s);
//        for (byte b:bytes) {
//            System.out.println(b);
//        }
//        System.out.println();
//        System.out.println(byteTransString(bytes));

        try {
            Class.forName("String.i");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void getPoint(){
        String test="www.baidu.com";
        int index=test.lastIndexOf(".");
        String newSting=test.substring(index+1);
        System.out.println(newSting);
    }
    public static String byteTransString(byte[] bytes){
        String s=new String(bytes);
        return s;
    }
    public static byte[] stingTransByte(String s){
        byte[] bytes = s.getBytes();
        return bytes;
    }
}
