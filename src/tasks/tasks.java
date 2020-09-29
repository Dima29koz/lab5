package tasks;
import java.lang.*;

public class tasks {
    public static void sequence(int n){
        if (n>1)
            sequence(n-1);

        for (int i=0;i<n; i++){
            System.out.print(n + " ");
        }
    }

    public static void numbers_1_n(int n) {
        if (n>1)
            numbers_1_n(n-1);
        System.out.print(n + " ");
    }

    public static void numbers_A_B(int n, int m) {
        if (n>m)
            numbers_A_B(n-1, m);
        System.out.print(n + " ");
    }

    public static int Amount_of_numbers(int k, int s) {
        int a = 0;
        if (k==1)
            if (s>0 && s<10)
                return 1;
            else
                return 0;

        for (int i=0;i<10;i++){
            a += Amount_of_numbers(k-1, s-i);
        }
        return a;
    }
    public static int Summ_of_numbers(int n){
        return n<10 ? n : Summ_of_numbers(n/10)+n%10;
    }
    public static void main(String[] args){
        int n = 5, m = 3;
        int k=2, s=3;
        int number = 987654321;
        System.out.println("Треугольная последовательность");
        sequence(n);
        System.out.println("\nОт 1 до n");
        numbers_1_n(n);
        System.out.println("\nОт A до B");
        numbers_A_B(n, m);
        System.out.println("\nЗаданная сумма цифр");
        System.out.print(Amount_of_numbers(k, s));
        System.out.println("\nСумма цифр числа");
        System.out.print(Summ_of_numbers(number));
    }
}
