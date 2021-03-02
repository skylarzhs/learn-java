public class Main {
    // public static void main(String[] args) {
    //     int i = 100;
    //     System.out.println("i = " + i);
    //     i = 1000;
    //     System.out.println("i = " + i);
    // }

    
    public static void main(String[] args){
        // int
        // int i = 2147483647;
        // int i2 = -2147483648;
        // int i3 = 2_000_000_000; // 加下划线更容易识别
        // int i4 = 0xff0000; // 十六进制表示的16711680
        // int i5 = 0b1000000000; // 二进制表示的512
        // long l = 9000000000000000000L; // long型的结尾需要加L

        // System.out.println("i = " + i);
        // System.out.println("i2 = " + i2);
        // System.out.println("i3 = " + i3);
        // System.out.println("i4 = " + i4);
        // System.out.println("i5 = " + i5);
        // System.out.println("l = " + l);

        // /**
        //  *i = 2147483647
        //   i2 = -2147483648
        //   i3 = 2000000000
        //   i4 = 16711680
        //   i5 = 512
        //   l = 9000000000000000000
        //  */

        // float
        float f1 = 3.14f;
        float f2 = 3.14e38f;
        double d1 = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324;

        System.out.println("f1 = " + f1);//f1 = 3.14
        System.out.println("f2 = " + f2);//f2 = 3.14E38
        System.out.println("d1 = " + d1);//d1 = 1.79E308
        System.out.println("d2 = " + d2);//d2 = -1.79E308
        System.out.println("d3 = " + d3);//d3 = 4.9E-324

        // boolean
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 = " + b1);//b1 = true
        System.out.println("b2 = " + b2);//b2 = false

        // char
        char c1 = 'A';
        char c2 = '嗨';
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

    }
}