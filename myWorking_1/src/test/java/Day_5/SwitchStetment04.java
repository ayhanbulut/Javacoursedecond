package Day_5;

import java.util.Scanner;

public class SwitchStetment04 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number");

        double firstNum=input.nextDouble();

        System.out.println("Enter one more number");

        double secondNum=input.nextDouble();

        System.out.println("Enter the operation among +,-,+,/,%");
        char operator=input.next().charAt(0);


        switch(operator){
            case '-':
                System.out.println(firstNum-secondNum);
                break;
            case '+':
                System.out.println(firstNum+secondNum);
                break;
            case '*':
                System.out.println(firstNum*secondNum);
                break;
            case '/':
                System.out.println(firstNum/secondNum);
                break;
            case '%':
                System.out.println(firstNum*secondNum/100);
                break;
                default:
                    System.out.println("please choose the correct operator");
        }


    }
}
