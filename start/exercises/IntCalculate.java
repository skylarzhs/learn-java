public class IntCalculate {
    public static void main(String[] args) {
        int i = (100 + 200) * 23;
        System.out.println("i = " + i);

        int i1 = 100 / 3;
        System.out.println("i1 = " + i1);

        int i2 = 100 % 3;
        System.out.println("i2 = " + i2);

        // int i3 = 100 % 0;
        // System.out.println("i3 = " + i3);

        // 溢出
        int x1 = 2147483647;
        int y1 = 1;

        int sum1 = x1 + y1;
        System.out.println("sum1 = " + sum1);

        int x2 = -2147483648;
        int y2 = 1;

        int sum2 = x2 - y2;
        System.out.println("sum2 = " + sum2);

        // 自增、自减
        int p = 1;
        int r = p++;

        System.out.println("p = " + p);
        System.out.println("r = " + r);

        // 移位
        int m = 7;
        // int a = m << 1;
        // int b = m << 2;
        // int c = m << 28;
        // int d = m << 29;
        int a = m >> 1;
        int b = m >> 2;
        int c = m >> 28;
        int d = m >> 29;
        
        System.out.println("m = " + m);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // 位运算
        int bt = 0 & 0;
        System.out.println("bt = " + bt);
        bt = 1 & 0;
        System.out.println("bt = " + bt);
        bt = 1 & 1;
        System.out.println("bt = " + bt);
        bt = 1 | 0;
        System.out.println("bt = " + bt);
        bt = ~1;
        System.out.println("bt = " + bt);

        bt = 1 ^ 9;
        System.out.println("bt = " + bt);

        // 类型转换
        int aa = 123;
        short bb = 12;

        int cc = aa + bb;
        // short dd = aa + bb;//ntCalculate.java:72: 错误: 不兼容的类型: 从int转换到short可能会有损失
        
    }
}