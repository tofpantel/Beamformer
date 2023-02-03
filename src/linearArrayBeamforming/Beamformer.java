package linearArrayBeamforming;

public class Beamformer {
    //constants
    final int N_TRANSMIT_BEAMS = 96;
    final int N_TRANSMIT_CHANNELS = 32;
    final double TRANSMIT_FREQ = 1.5e6;
    final double TRANSMIT_FOCAL_DEPTH = 20e-3;
    final int SOUND_SPEED = 1540;
    final double TRANSDUCER_PITCH = 2*1.8519e-4;
    final double SAMPLE_RATE = 27.72e6;
    // time at which middle of the transmission pulse occurs
    final double TIME_OFFSET = 1.33e-6;

    public static void main(String[] args) {

    }

    public double timeGainCompensation(double alpha0, double propagationDistance){
        double n = 1;
        double timeGainComp = 0;
        double alpha;

        alpha = alpha0 * Math.pow(TRANSMIT_FREQ*1e-6, n);
        timeGainComp = Math.pow(10,alpha*propagationDistance*100/20);
        return timeGainComp;
    }
}
