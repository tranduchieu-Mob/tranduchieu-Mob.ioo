public class Main{
    int globalVal;
    public static void main(String[] args) {
        float temp;
        double dNumber;
        boolean yesno;

        int globalVal =2;
        System.out.println(globalVal);
        
        System.out.println("Hello world");
        System.out.println("Hello Java");
        System.out.print("Hello java again");
        System.out.print("Hello moi nguoi");
        System.out.println("");
        int intNumber =6;
        long longNumber=150L;
        System.out.println(intNumber);
        System.out.println(longNumber);

        float floatNumber = 12.3f;
        System.out.println(floatNumber);

        double doubleNumber = 6.3;
        System.out.println(doubleNumber);

        boolean booleanValue = true;
        System.out.println(booleanValue);

        temp=15f;

        float temp1;
        temp1=16.5f;

        dNumber=10.5;
        yesno=false;

        int a = 2;
        int b = 4;
        int studenCount = 12 ;
        
        System.out.println(temp);

        byte byteNumber = 5;
        short shortNumber =byteNumber;

        System.out.println(shortNumber);

        longNumber = byteNumber;
        System.out.println(longNumber);

        double height =1.7;
        int heightInt = (int)height;
        System.out.println(heightInt);
        long weight = 100;
        int weightInt =(int)weight;
        System.out.println(weightInt);

        final float piNumber = 3.14f;
        
        boolean result = height == heightInt;
        System.out.println(result);

        System.out.println(height >= heightInt);

        weight++;
        System.out.println(weight);
        weight--;
        System.out.println(weight);

        boolean andResult = 100 > 40 && 30 > 10;
        System.out.println(andResult);

        double randomNum = Math.random();
        System.out.println(randomNum);
        
    }

}