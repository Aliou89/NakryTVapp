package net.nakrytv.nakrytv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Mamadou on 7/2/2016.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent startMaiScreen = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startMaiScreen);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }

}
