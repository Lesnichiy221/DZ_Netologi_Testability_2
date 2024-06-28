public class BmiService {

    public float calculate(float hight_in_meter, int body_weight_kg){
        float result;

        result = body_weight_kg / (hight_in_meter * hight_in_meter);

        return result;

    }
}
