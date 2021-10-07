public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(74, 1.72);
        System.out.println(bmi);

        double bmi1 = service.calculate(63, 1.66);
        System.out.println(bmi1);
    }
}
