public class CreditPaymentService {
    public double calculate(int term, double amount) {
        double rate = 9.99;
        double monthlyRate = rate / 100 / 12;
        return amount * (monthlyRate + (monthlyRate / (Math.pow(monthlyRate + 1, term) - 1)));
    };
}
