public class CreditPaymentService {
    public double calculate(double amountCredit, double interestRate, int loanTerm) {
        //  А=К*(П/(1+П)-М-1)
        double everyMothPercent = interestRate / 12 / 100; // ежемесячная проц.ставка на основе годовой
        int quantity = loanTerm * 12; // количество платежей всего
        double monthlyPayment = (amountCredit * everyMothPercent * Math.pow(1 + everyMothPercent, quantity)) / (Math.pow(1 + everyMothPercent, quantity) - 1); // формула расчета кредита
        return monthlyPayment;
    }
}
