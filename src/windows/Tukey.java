package windows;

import utilties.Utilities;

public class Tukey extends Window {
    private double[] window;
    private final double alpha;
    private final boolean symmetric;
    private final int length;


    public Tukey(int length, double alpha, boolean symmetric) throws IllegalArgumentException {
        super(length);
        this.length = length;


        if (alpha > 1 || alpha < 0){
            throw new IllegalArgumentException("Alpha must be between 0 and 1");
        }

        this.alpha = alpha;
        this.symmetric = symmetric;

        generateTukey();
    }

    private void generateTukey(){
        double[] n, n1, n2, n3;
        this.window = new double[this.length];
        n = Utilities.arrange(0.0, length, 1.0);
        int width = (int) Math.floor(this.alpha*(length -1) / 2.0);
        n1 = Utilities.sliceArray(n, 0 , width +1);
//        n2 = Utilities. slack

    }

    @Override
    public double[] getWindow() {
        return this.window;
    }
}
