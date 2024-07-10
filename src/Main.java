public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float hightInMeter = 1.87F;
        int bodyWeightKg = 98;

        int bmi = (int) service.calculate(hightInMeter, bodyWeightKg);

        System.out.println(bmi);


    }
}