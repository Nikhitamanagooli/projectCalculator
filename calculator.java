
class calculator {
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
        System.out.println("Enter the operation to be performed");
        System.out.println("1.Addition\n2.Subtraction\n3.Product\n4.Division\n");
        int ch= 1;
        switch (ch){
            case 1:
                System.out.println("The sum of the "+num1+" and "+num2+" is: "+add(2,6));
                break;
            case 2:
                System.out.println("The difference of the "+num1+" and "+num2+" is: "+sub(5,3));
                break;
            case 3:
                System.out.println("The Product of the "+num1+" and "+num2+" is: "+pro(3,2));
                break;
            case 4:
                System.out.println("The Product of the "+num1+" and "+num2+" is: "+div(5,5));
                break;
        }
    }
}
