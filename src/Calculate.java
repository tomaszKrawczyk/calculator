import java.util.Scanner;

/**
 * Created by Tomek Krawczyk on 14.09.2017.
 */
public class Calculate {


    public static void main(String[] args) {

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xx     Calculator 1.0                              xx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xx    Witaj w programie caluculator.               xx");
        System.out.println("xx    Aby wykonać obliczenia, wybierz 2 liczby.    xx");
        System.out.println("xx    A następnie wybierz odpowiedni numer:        xx");
        System.out.println("xx    1- Dodawanie                                 xx");
        System.out.println("xx    2- Odejmowanie                               xx");
        System.out.println("xx    3- Mnożenie                                  xx");
        System.out.println("xx    4- Dzielenie                                 xx");
        System.out.println("xx    5- Modulo                                    xx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xx    6-Wyjdź z programu                           xx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");




        int [] dzialania = new int[]{1,2,3,4,5,6};



        Scanner sc = new Scanner(System.in);

    do {
        System.out.println("Podaj 2 liczy");


        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Podaj nr operacji, który chcesz wykonać");

        int operation = sc.nextInt();

        switch (operation) {
            case 1:

                System.out.println("Wynikiem jest " + (a + b));
                break;

            case 2:

                System.out.println("Wynikiem jest " + (a + b));
                break;

            case 3:

                System.out.println("Wynikiem jest " + a * b);
                break;

            case 4:

                System.out.println("Wynikiem jest " + (double) (a / b));
                break;

            case 5:

                System.out.println("Wynikiem jest " + a % b);
                break;

            case 6:

                System.out.println("Dziękujemy za skorzystanie z kalkulatora");
                System.exit(0);

            default:
                System.out.println("Nie rozpoznano operacji");
                break;
        }


    } while (true);

    }
}
