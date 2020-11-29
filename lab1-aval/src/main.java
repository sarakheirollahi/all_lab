import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2 , gcd = 1;
        System.out.println("number1:");
        num1=s.nextInt();
        System.out.println("number2:");
        num2=s.nextInt();

        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }

        if(gcd==1){
            System.out.println("avaland");
        }
        else
            System.out.println("Bakhshpazirnd");
    }

}