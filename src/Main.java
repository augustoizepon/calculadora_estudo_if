import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("qual o primeiro valor do calculo?");
       int num1 = scanner.nextInt();
       System.out.println("agora, digite a operacao (+, -, *, /)");
       String op = scanner.next();
       System.out.println("qual o segundo valor do calculo?");
       int num2 = scanner.nextInt();
       switch (op){
           case "+":
               int sum = num1 + num2;
               System.out.println(sum);
               break;
           case "-":
               int sub = num1 - num2;
               System.out.println(sub);
               break;
           case "*":
               int mult = num1 * num2;
               System.out.println(mult);
               break;
           case "/":
               double div = (double) num1 / num2;
               System.out.println(div);
               break;
           default:
               System.out.println("operacao invalida");
       }



    }



}