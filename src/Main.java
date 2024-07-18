public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float hieghtInMeters = 1.87F;
        int bodyWeightKg = 98;

        int bmi = (int) service.calculate(hieghtInMeters, bodyWeightKg);

        System.out.println(bmi);


    }
}