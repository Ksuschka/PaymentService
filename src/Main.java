public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();;
        int payment = (int)service.calculate(12, 1000000);
        System.out.println(payment);
        payment = (int)service.calculate(24, 1000000);
        System.out.println(payment);
        payment = (int)service.calculate(36, 1000000);
        System.out.println(payment);
    }
}