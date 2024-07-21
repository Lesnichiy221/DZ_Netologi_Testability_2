public class BmiService {

    public float calculate(float hieghtInMeters, int bodyWeightKg) {
        int result;

        result = (int) (bodyWeightKg / (hieghtInMeters * hieghtInMeters));

        return result;

    }
}