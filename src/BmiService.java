public class BmiService {

    public float calculate(float hightInMeter, int bodyWeightKg){
        float result;

        result = bodyWeightKg / (hightInMeter * hightInMeter);

        return result;

    }
}
