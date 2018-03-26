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
        Button DeviceDisplay = (Button) findViewById(R.id.bt_Device_Display);
        Button ButtonRegister=(Button) findViewById(R.id.Button_Register);
        Button LoginButton = (Button)findViewById(R.id.Button_Login);
        Button testbutton = (Button)findViewById(R.id.bt_test);

//test new dfghjk




        ButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToWifiControl = new Intent(MainActivity.this, SimpliFi_Login.class);
            startActivity(GoToWifiControl);
            }
        });

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoWiFISwitch = new Intent(MainActivity.this, WiFISwitch.class);
                startActivity(gotoWiFISwitch);
            }
        });



        DeviceDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent gotoSettingspage = new Intent(MainActivity.this, SimpliFi_Settings.class);
//                startActivity(gotoSettingspage);

                Intent gotoDeviceDisplay = new Intent(MainActivity.this, Simplifi_Main_Page.class);
              startActivity(gotoDeviceDisplay);


            }
        });

        testbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoWiFISwitch = new Intent(MainActivity.this, WiFISwitch.class);
                startActivity(gotoWiFISwitch);
            }
        });
/**
        loginOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginOK = new Intent(MainActivity.this, Simplifi_Main_Page.class);
                startActivity(loginOK);
            }
        }); **/

 

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
