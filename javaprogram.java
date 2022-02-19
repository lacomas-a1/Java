import java.util.Scanner;
public class javaprogram {
    private static Scanner sc;
    public static void main(String[]args){
        int a,b,c,d;

        sc =new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write something: ");
        String message=scanner.nextLine();

        System.out.println("Enter Num1:");
        a=sc.nextInt();
        System.out.println("Enter Num2: ");
        b=sc.nextInt();

        //computation
        c=a+b;
        d=a-b;

        System.out.println("Sum:"+ c);
        System.out.println("Subtraction:"+ d);
        
        System.out.println("You wrote: "+ message);

    }
}
