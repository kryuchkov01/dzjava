
import java.util.ArrayList;
import java.util.Scanner;

public class dz1 {

    
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = newScan.nextInt();
        newScan.close();
        triangleNum(numb);
        plainNumber2();
        calculator();
    }
    // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void triangleNum(int number) {
        int theNumb;
        theNumb = number*(number+1)/2;
        int multiply = 1;
        for (int i = 1; i <= number; i++){
            multiply *= i;
        }
        System.out.println(theNumb);
        System.out.println(multiply);
    }


    // Вывести все простые числа от 1 до 1000

    public static void plainNumber2() {
        ArrayList<Integer> plain = new ArrayList<Integer>();
        plain.add(1);
        plain.add(2);
        for (int i = 1; i <= 100; i = i+2){
            for (int j = 2; j < i; j++){
              if (i%j != 0){
                    plain.add(i);
                    break;     
                }      
            }}
        for (int i = 3; i <= plain.size(); i++){
            if(plain.get(i)%3==0 ||plain.get(i)%5==0||plain.get(i)%7==0){
                plain.remove(i);
            }
        }
        System.out.println(plain);
    }

    // +-*/

    public static void calculator() {
        Scanner forNumb = new Scanner(System.in);
        Scanner operation = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = forNumb.nextInt();
        System.out.println("Введите число b: ");
        int b = forNumb.nextInt();
        System.out.println("Введите код операции: ");
        char opt = operation.next().charAt(0);

        if (opt == '+') System.out.println(a+b);
        else if (opt == '-') System.out.println(a-b);   
        else if (opt == '*') System.out.println(a*b);
        else if (opt == '/') System.out.println(a/b);
        else System.out.println("Error.");
        forNumb.close();
        operation.close();
        
        
    }


}
