 package dcu.simplifi;
 import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;

/**
 * Created by adamkelly on 26/03/2018.
 */


public class PostActivity extends AppCompatActivity{

    String urlAddress = "http://student.computing.dcu.ie/~kella256/phpcode.php";
    EditText nameTxt, posTxt, teamTxt, macTxt;
    Button saveBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postinfo);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

        //INITIALIZE UI FIELDS
        nameTxt = (EditText) findViewById(R.id.nameEditTxt);
        posTxt = (EditText) findViewById(R.id.posEditTxt);
        teamTxt = (EditText) findViewById(R.id.teamEditTxt);
        saveBtn = (Button) findViewById(R.id.saveBtn);
        macTxt= (EditText)findViewById(R.id.macEditTxt);



        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //START ASYNC TASK
               dcu.simplifi.Sender s = new dcu.simplifi.Sender(PostActivity.this, urlAddress, nameTxt, posTxt, teamTxt, macTxt);
                s.execute();
            }
        });

        String macAddFromPhone=getMacAddr();
        String res2=macAddFromPhone.toString();
        Log.i("macaddress",res2);


    }


    public static String getMacAddr() {
        try {
            List<NetworkInterface> all = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface nif : all) {
                if (!nif.getName().equalsIgnoreCase("wlan0")) continue;

                byte[] macBytes = nif.getHardwareAddress();
                if (macBytes == null) {
                    return "";
                }

                StringBuilder res1 = new StringBuilder();
                for (byte b : macBytes) {
                    // res1.append(Integer.toHexString(b & 0xFF) + ":");
                    res1.append(String.format("%02X:",b));
                }

                if (res1.length() > 0) {
                    res1.deleteCharAt(res1.length() - 1);
                }
                String res2=res1.toString();
                Log.i("macaddress",res2);
                return res1.toString();



            }
        } catch (Exception ex) {
            //handle exception
        }
        return "";
    }


    //INITIALIZE UI FIELDS
    ////EditText nameTxt= (EditText) findViewById(R.id.nameEditTxt);

    //
    // nameTxt.setText(macAddFromPhone);
}



































