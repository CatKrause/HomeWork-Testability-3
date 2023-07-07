public class CreditPaymentService {
    public double calculate(double k, double p, int m) {
        //  А=К*(П/(1+П)-М-1)
        double sumСredit = k; // сумма кредита
        double percent = p; // процентная ставка
        int month = m; // количество месяцев
        double everyMothPercent = p / 12 / 100; // ежемесячная проц.ставка на основе годовой
        int quantity = m * 12; // количество платежей всего
        double A = (k * everyMothPercent * Math.pow(1 + everyMothPercent, quantity)) / (Math.pow(1 + everyMothPercent, quantity) - 1); // формула расчета кредита
        return A;
    }
}
