public class BooleanCalculate{
    public static void main(String[] args){
        int age = 92;

        boolean isAdult = age >= 18;

        if(isAdult){
            System.out.println("adult");
        }else{
            System.out.println("teenager");
        }

        // boolean result = isAdult && (5/0 > 0);
        // System.out.println(result);
    }
}