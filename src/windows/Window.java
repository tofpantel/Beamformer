package windows;

public abstract class Window {
    private int length;
    public Window(int length) {
        if (length <= 0) throw  new IllegalArgumentException("Error!Window should be greater than 0.");
        this.length = length;
    }
    public abstract double[] getWindow();

    public double[] applyWIndow(double[] input){
        double[] window = getWindow();
        if (input.length != window.length){
            throw new IllegalArgumentException("Error! Window and data dimensions should match.");
        }

        double[] output = new double[input.length];

        for (int i = 0; i < input.length; i++){
            output[i] = input[i] * window[i];
        }
        return output;
    }
}
