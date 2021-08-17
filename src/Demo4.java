public class Demo4 {
    public static void main(String[] args) {
        int i =128;
        double b=i;
         //内存溢出

        //强制转换（类型）变量名  高---低
        //自动转换             低---高


        System.out.println(i);
        System.out.println(b);

        /*注意点：
        1.不能对不布尔值进行转换
        2.不能吧对象类型转换为不相干的类型
        3.在把高容量转换到低容量的时候，强制转换
        4.转换的时候可能存在内存溢出，或者精度问题！
        */

        System.out.println("=============================================");
        System.out.println((int) 23.7);
        System.out.println((int) -45.89f);  //45

        System.out.println("=============================================");
        char c ='a';
        int  d =c+1;
        System.out.println(d);
        System.out.println((char)d);


    }
}
