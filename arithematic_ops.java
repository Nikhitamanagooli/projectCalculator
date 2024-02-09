class arithematic_ops {
    int cube(int a){
       return a*a*a;
    }
    int square(int a){
         return a*a;
    }
    int modulus(int a, int b){
        return a%b;
    }
    int power(int a,int b){
        return (int) Math.pow(a,b);
    }
    public static void main(String[]args)
    {
        arithematic_ops ao = new arithematic_ops();
        System.out.println("Cube of the number = "+ao.cube(5));
        System.out.println("Square of the number = "+ao.square(5));
        System.out.println("modules of the number = "+ao.modulus(5,3));
        System.out.println("Power of the number = "+ao.power(5,3)); 
    }
}
