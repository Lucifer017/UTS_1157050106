package lucifer017.uts_1157050106.activity;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.ConnectivityManager;
import lucifer017.uts_1157050106.R;
import lucifer017.uts_1157050106.utils.DialogUtils;


public class SplashScreenActivity extends AppCompatActivity {

    final int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isNetworkAvailable()) {
                    startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                    overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                    finish();
                }
                else {
                    DialogUtils.showAlertDialog(SplashScreenActivity.this, "No Internet Connection", "You're internet is disconnected");
                }
            }
        }, SPLASH_TIME_OUT);
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

}
