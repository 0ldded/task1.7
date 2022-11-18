import java.util.Scanner;

public class Main
{
    public static int fact(int n)
    {
        int resultat = 1;
        for (int i = 1; i < n; i++)
        {
            resultat = resultat * i;
        }
        return resultat;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер факториала: ");
        int n = sc.nextInt();
        System.out.println("Ваш факториал: " + fact(n));
    }
}