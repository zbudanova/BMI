public class BmiService {
    public int calculate (int weight, double height) {
        double bmi = weight / (height * height);
        int result = (int) bmi;
        return result;
    }
}
