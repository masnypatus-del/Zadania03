import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Zadanie 1
        System.out.println("Zadanie 1");
        System.out.print("Podaj liczbe calkowita dodatnia: ");
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Zadanie 2
        System.out.println("Zadanie 2");
        System.out.print("Podaj liczbe calkowita dodatnia: ");
        int n2 = sc.nextInt();
        int potega = 1;
        while (potega <= n2) {
            System.out.println(potega);
            potega = potega * 2;
        }

        // Zadanie 3
        System.out.println("Zadanie 3");
        int suma3 = 0;
        int liczba3;
        do {
            System.out.print("Podaj liczbe (0 konczy): ");
            liczba3 = sc.nextInt();
            suma3 = suma3 + liczba3;
        } while (liczba3 != 0);
        System.out.println("Suma: " + suma3);

        // Zadanie 4
        System.out.println("Zadanie 4");
        System.out.print("Podaj liczbe (0 konczy): ");
        int liczba4 = sc.nextInt();
        if (liczba4 == 0) {
            System.out.println("Nie podano zadnych liczb.");
        } else {
            int max = liczba4;
            int min = liczba4;
            while (liczba4 != 0) {
                if (liczba4 > max) {
                    max = liczba4;
                }
                if (liczba4 < min) {
                    min = liczba4;
                }
                System.out.print("Podaj liczbe (0 konczy): ");
                liczba4 = sc.nextInt();
            }
            System.out.println("Najwieksza: " + max);
            System.out.println("Najmniejsza: " + min);
            System.out.println("Suma: " + (max + min));
            System.out.println("Srednia: " + ((max + min) / 2.0));
        }

        // Zadanie 5
        System.out.println("Zadanie 5");
        Random random = new Random();
        int wylosowana = random.nextInt(100) + 1; // 1...100
        int strzal = 0;
        while (strzal != wylosowana) {
            System.out.print("Zgadnij liczbe (1-100): ");
            strzal = sc.nextInt();
            if (strzal > wylosowana) {
                System.out.println("Podales za duza wartosc");
            } else if (strzal < wylosowana) {
                System.out.println("Podales za mala wartosc");
            } else {
                System.out.println("Gratulacje");
            }
        }

        // Zadanie 6
        // a - szerokosc (ile znakow w wierszu), b - wysokosc (ile wierszy)
        System.out.println("Zadanie 6");
        System.out.print("Podaj znak wypelnienia: ");
        char znak = sc.next().charAt(0);
        System.out.print("Podaj x: ");
        int x = sc.nextInt();
        System.out.print("Podaj y: ");
        int y = sc.nextInt();
        System.out.print("Podaj a: ");
        int a = sc.nextInt();
        System.out.print("Podaj b: ");
        int b = sc.nextInt();

        // puste wiersze nad prostokatem
        for (int i = 1; i < y; i++) {
            System.out.println();
        }
        // wiersze prostokata
        for (int i = 0; i < b; i++) {
            // spacje z lewej strony
            for (int j = 1; j < x; j++) {
                System.out.print(" ");
            }
            // znaki prostokata
            for (int j = 0; j < a; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }

        // Zadanie 7
        System.out.println("Zadanie 7");
        System.out.print("Podaj wysokosc choinki: ");
        int n7 = sc.nextInt();
        for (int i = 1; i <= n7; i++) {
            // spacje przed gwiazdkami
            for (int j = 0; j < n7 - i; j++) {
                System.out.print(" ");
            }
            // gwiazdki: 1, 3, 5, ...
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Zadanie 8
        System.out.println("Zadanie 8");
        System.out.print("Podaj liczbe: ");
        int n8 = sc.nextInt();
        long silnia = 1;
        for (int i = 1; i <= n8; i++) {
            silnia = silnia * i;
        }
        System.out.println("Silnia z " + n8 + " = " + silnia);

        // Zadanie 9
        System.out.println("Zadanie 9");
        System.out.print("Podaj slowo: ");
        String slowo = sc.next();
        boolean palindrom = true;
        for (int i = 0; i < slowo.length() / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i)) {
                palindrom = false;
                break;
            }
        }
        if (palindrom) {
            System.out.println("Slowo " + slowo + " jest palindromem.");
        } else {
            System.out.println("Slowo " + slowo + " nie jest palindromem.");
        }

        // Zadanie 10
        System.out.println("Zadanie 10");
        petlaGlowna:
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // pomijamy nieparzyste
            }
            System.out.println("Petla glowna: i = " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println("  j = " + j);
                if (j > i) {
                    continue petlaGlowna; // nastepna iteracja petli glownej
                }
            }
        }

        sc.close();
    }
}