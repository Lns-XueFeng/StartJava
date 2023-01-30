public class Method {

    public Method() {
        //
    }

    public int getMaxInArray(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public float getMaxInArray(float[] array) {
        float max = 0f;
        for (float j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public double getMaxInArray(double[] array) {
        double max = 0;
        for (double j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}
