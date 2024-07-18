public class BmiService {

    public float calculate(float hieghtInMeters, int bodyWeightKg) {
        float result;

        result = bodyWeightKg / (hieghtInMeters * hieghtInMeters);

        return result;

    }
}