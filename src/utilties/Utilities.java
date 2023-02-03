package utilties;

public class Utilities {
    /**
     * This function returns evenly spaced number over a specified interval such that there are specified number of samples.
     * This is equivalent of the numpy <a href="https://docs.scipy.org/doc/numpy/reference/generated/numpy.linspace.html">linspace()</a> function.
     * @param start Start value of the sequence
     * @param stop Stop value of the sequence
     * @param samples Number of samples to be generated
     * @return double[] Generated sequence
     */
    public static double[] linspace(int start, int stop, int samples){
        double[] pointArray = new double[samples];

        double range = 0.0;
        double stopValue = 0.0;
        double t = 0.0;
        double tmp = start;

        range = stop - start;

        t = range/samples;
        stopValue = stopValue - t;

        pointArray[0] = start;
        for (int i = 1; i < pointArray.length; i++) {
            tmp += t;
            pointArray[i] = tmp;
        }

        pointArray[pointArray.length-1] = stop;

        return pointArray;
    }


    public static double[] linspace(double start, double stop, int samples){
        double[] pointArray = new double[samples];

        double range = 0.0;
        double stopValue = 0.0;
        double t = 0.0;
        double tmp = start;

        range = stop - start;

        t = range/samples;
        stopValue = stopValue - t;

        pointArray[0] = start;
        for (int i = 1; i < pointArray.length; i++) {
            tmp += t;
            pointArray[i] = tmp;
        }

        pointArray[pointArray.length-1] = stop;

        return pointArray;
    }

    /**
     * This function returns evenly spaced number over a specified
     * interval with a specific step in between each element.
     * This is equivalent of the numpy <a href="https://docs.scipy.org/doc/numpy/reference/generated/numpy.linspace.html">linspace()</a> function.
     * @param start Start value of the sequence
     * @param stop Stop value of the sequence
     * @param step Spacing between elements
     * @throws java.lang.IllegalArgumentException If start value is greater than stop value
     * @return double[] Generated sequence
     */
    public static double[] arrange(double start, double stop, double step)  {
        if (start > stop) {
            throw new IllegalArgumentException("start is greater than stop");
        }
        //type cast to properly divide the range
        int size = (int)((stop-start)/step);
        double[] arr = new double[size];

        double tmp = start;
        for (int i=0; i < size; i++){
            arr[i] = tmp;
            tmp = tmp + step;
        }
        return arr;
    }


    public static int[] arrange(int start, int stop, int step) {
        if (start > stop) {
            throw new IllegalArgumentException("start is greater than stop");
        }
        int size = (stop - start)/step;
        int[] arr = new int[size];

        int tmp = start;
        for (int i=0; i < size; i++){
            arr[i] = tmp;
            tmp = tmp + step;
        }
        return arr;
    }


    // Concatenate 2 arrays
    /**
     * This function returns the concatenation of  2 arrays.
     * @param arr1 Array to add first
     * @param arr2 Array to add second
     * @return double[] Concatenated array
     */
    public static double[] concatenation(double[] arr1, double[] arr2) {
        double[] out = new double[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    /**
     * This method implements the Python version of the modulo operation
     * @param dividend The numerator
     * @param divisor The denominator
     * @return double Result of the modulo operation
     */
    public static double modulo(double dividend, double divisor) {
        return (((dividend % divisor) + divisor) % divisor);
    }

    /**
     * This method implements the Python version of the modulo operation
     * @param dividend The numerator
     * @param divisor The denominator
     * @return double Result of the modulo operation
     */

    public static int modulo(int dividend, int divisor) {
        return (((dividend % divisor) + divisor) % divisor);
    }

    // Slice an array
    /**
     * Slices an array
     * @param arr Input array
     * @param start Start index for slice
     * @param end Stop index for slice
     * @return double[] Sub-array to be returned
     */
    public static double[] sliceArray(double[] arr, int start, int end) {
        double[] out = new double[end-start];
        System.arraycopy(arr, start, out, 0, out.length);
        return out;
    }
}
