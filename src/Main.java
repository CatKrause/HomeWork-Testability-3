// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double result1 = service.calculate(100_000_000, 9.99, 12);
        double result2 = service.calculate(100000, 7, 24);
        double result3 = service.calculate(24500, 9.5, 11);

        int roundResult1 = (int) (result1 + 0.5);
        int roundResult2 = (int) (result2 + 0.5);
        int roundResult3 = (int) (result3 + 0.5);

        System.out.println("Ежемесячный платеж 1 округленный: " + roundResult1);
        System.out.println("Ежемесячный платеж 1 : " + result1);
        System.out.println("Ежемесячный платеж 2 округленный: " + roundResult2);
        System.out.println("Ежемесячный платеж 2 : " + result2);
        System.out.println("Ежемесячный платеж 3 округленный: " + roundResult3);
        System.out.println("Ежемесячный платеж 1 : " + result3);

    }
}