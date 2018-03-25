package dcu.simplifi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton = (Button) findViewById(R.id.bt_login_page);
        Button ButtonLogin=(Button) findViewById(R.id.Button_Login);

//test new



        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoLogin = new Intent(MainActivity.this, SimpliFi_Login.class);
            startActivity(gotoLogin);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent gotoSettingspage = new Intent(MainActivity.this, SimpliFi_Settings.class);
//                startActivity(gotoSettingspage);

                Intent gotoWiFISwitch = new Intent(MainActivity.this, WiFISwitch.class);
              startActivity(gotoWiFISwitch);


            }
        });

 

    }








/*public void getSimplificontgent(){
    URL url = new URL("http://www.android.com/");
    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
    try {
        InputStream in = new BufferedInputStream(urlConnection.getInputStream());
        readStream(in);
    } finally {
        urlConnection.disconnect();
    }
}

    private void readStream(InputStream in) {
    }*/


}
