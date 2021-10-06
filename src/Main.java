public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int result = service.calculate(74, 1.72);
        System.out.println(result);

        int result1 = service.calculate(63, 1.66);
        System.out.println(result1);
    }
}
