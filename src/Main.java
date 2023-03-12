import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Bitte gebe einen Betrag ein: ");
        Double money = scanner.nextDouble();

        convertToDollar(money);
        convertToYen(money);
        convertToRubel(money);
        convertToDong(money);
        convertToApfund(money);
    }

    public static void convertToDollar(Double eur) {
        System.out.println("Der Wechselkurs ist Tagesaktuell vom 12.03.2023");
        System.out.println("Der Betrag von 13,37 Euro wurde umgerechnet: ");
        System.out.println("Der Betrag in Dollar ist: "+ eur * 1.06);
    }
    public static void convertToYen(Double eur) {
        System.out.println("Der Betrag in Yen ist: "+ eur * 143.87);
    }
    public static void convertToRubel(Double eur) {
        System.out.println("Der Betrag in Rubel ist: "+ eur * 81.13);
    }
    public static void convertToDong(Double eur) {
        System.out.println("Der Betrag in vietnamesische Dong ist: "+ eur * 25205.59);
    }    public static void convertToApfund(Double eur) {
        System.out.println("Der Betrag in ägyptische Pfund ist: "+ eur * 32.74);
    }
}