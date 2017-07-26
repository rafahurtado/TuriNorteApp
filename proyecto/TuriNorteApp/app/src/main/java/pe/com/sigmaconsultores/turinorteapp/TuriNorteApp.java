package pe.com.sigmaconsultores.turinorteapp;

/**
 * Created by rhurtado on 26/07/2017.
 */

public class TuriNorteApp {

    static final String TAG = "TuriNorteApp";

    private static TuriNorteApp instance;

    private TuriNorteApp() {
    }

    public static TuriNorteApp getInstance(){
        if(instance == null){
            instance = new TuriNorteApp();



        }

        return  instance;
    }
}
