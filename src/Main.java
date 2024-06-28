public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float hight_in_meter = 1.87F;
        int body_weight_kg = 98;

        int bmi = (int) service.calculate(hight_in_meter, body_weight_kg);

        System.out.println(bmi);


    }
}