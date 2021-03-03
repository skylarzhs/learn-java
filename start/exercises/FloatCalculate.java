public class FloatCalculate{
    public static void main(String[] args){
        /*
        * 浮点数的不精确
        */
        // double x = 1.0 / 10;
        // double y = 1 - 9.0 / 10;
        // System.out.println(x);// 0.1
        // System.out.println(y);// 0.09999999999999998

        // double r = Math.abs(x - y);

        // if(r < 0.00001){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("not equal");
        // }
        
        /*
        * 类型提升
        */
        // double d = 1.2 + 23/3;
        // System.out.println(d);// 8.2

        // int n = 5;
        // d = 1.2 + 24.0 / n; // 6.0
        // System.out.println(d);

        /*
        * 溢出
        */

        // double d1 = 0.0 / 0; // NaN
        // double d2 = 1.0 / 0; // Infinity
        // double d3 = -1.0 / 0; // -Infinity
        // System.out.println(d1);
        // System.out.println(d2);
        // System.out.println(d3);

        /*
         * exercise
         */
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;

        double r1 = (Math.sqrt(b * b - 4 * a * c) - b) / (2.0 * a);
        double r2 = (-Math.sqrt(b * b - 4 * a * c) - b) / (2.0 * a);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    } 
}