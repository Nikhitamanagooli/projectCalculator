import java.util.Scanner;
class calculator extends GeoArea{
    public static  int add(int num1,int num2){
        return num1+num2;
    }
    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static int pro(int num1,int num2){
        return num1*num2;
    }
    public static float div(float num1,float num2){
        return num1/num2;
    }
    public static void main(String[] args) {
    
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1= in.nextInt();
        System.out.println("Enter the num2: ");
        int num2= in.nextInt();
        System.out.println("Enter the operation to be performed");
        System.out.println("1.Addition\n2.Subtraction\n3.Product\n4.Division\n5.areaTriangle\n6.areasquare");
        int ch= in.nextInt();
        calculator geoarea= new calculator();
        switch (ch){
            case 1:
                System.out.println("The sum of the "+num1+" and "+num2+" is: "+add(num1,num2));
                break;
            case 2:
                System.out.println("The difference of the "+num1+" and "+num2+" is: "+sub(num1,num2));
                break;
            case 3:
                System.out.println("The Product of the "+num1+" and "+num2+" is: "+pro(num1,num2));
                break;
            case 4:
                System.out.println("The Product of the "+num1+" and "+num2+" is: "+div(num1,num2));
                break;
            case 5:    
                System.out.println("Area of rectangle"+calculator.area_of_triangle(10,5));
                break;
            case 6:
                System.out.println("Area of trianle"+calculator.area_of_rectangle(10,5));
                break;
                    
        }
    }
}