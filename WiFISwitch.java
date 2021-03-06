package dcu.simplifi;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;



public class WiFISwitch extends AppCompatActivity implements OnClickListener {

    String serverCommand = "ON";
    Button TurnWifion, TurnWifioff, getTheURL, SendMessage;
    TextView wifistatus, URL_textview;
    WifiManager wifi;
    //String server_URL = "http://www.dialfx.com/simplifi/simplifi.php";
    //String server_URL = "http://student.computing.dcu.ie/~kella256/adamphp.php?variable=adam";
    //Button location_btn=(Button) findViewById(R.id.Device1);
    int instructionTxt = 1;

    // WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    //WifiInfo wInfo = wifiManager.getConnectionInfo();
    //String macAddress = wInfo.getMacAddress();
Integer sendInstruction=9;
String sendChildMac="empty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wi_fi_switch_layout);

        TextView mac = (TextView) findViewById(R.id.macaddresstext);

        TurnWifion = (Button) findViewById(R.id.WiFi_ON_Button);
        TurnWifioff = (Button) findViewById(R.id.WiFi_OFF_Button);
        getTheURL = (Button) findViewById(R.id.gettheURL);
        wifistatus = (TextView) findViewById(R.id.wifistatus_textview);
        URL_textview = (TextView) findViewById(R.id.URL_textview);
        SendMessage = (Button) findViewById(R.id.message_btn);


        // Getting the WiFi Services
        wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        //TurnWifioff.setEnabled(true);
        //TurnWifion.setEnabled(false);

       // mac.setText(macAddress);

        //Checking whether  Wifi is on or off
      /*  if (wifi.isWifiEnabled()) {
            wifistatus.setText("Connected");//If WiFi is on, enable "Turn WiFi off" button.
            TurnWifioff.setEnabled(true);
            TurnWifion.setEnabled(false);

        } else {
            wifistatus.setText("Disconnected");//If WiFi is off, enable "Turn WiFi on" button.
            TurnWifion.setEnabled(true);
            TurnWifioff.setEnabled(false);
        }*/
        TurnWifion.setOnClickListener(this);
        TurnWifioff.setOnClickListener(this);
        //getTheURL.setOnClickListener(this);

        getTheURL.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String server_URL = "http://student.computing.dcu.ie/~kella256/childform.php?Mac="+sendChildMac+"&Instruction="+sendInstruction;

                final RequestQueue requestQueue = Volley.newRequestQueue(WiFISwitch.this);
                StringRequest stringRequest = new StringRequest(Request.Method.GET, server_URL, new Response.Listener<String>() {
                    /**
                     * Called when a response is received.
                     *
                     * @param response
                     */
                    @Override
                    public void onResponse(String response) {
                        URL_textview.setText(response);

                        requestQueue.stop();
                        serverCommand = response.toString();
                        switchCommand(response);


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        URL_textview.setText(error.toString());
                        requestQueue.stop();
                        serverCommand = "ON";
                        switchCommand("ON"); }
                });
                requestQueue.add(stringRequest);
            }
        });
/**
        location_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToLocation = new Intent(WiFISwitch.this, location.class);
                startActivity(GoToLocation);
            }
        }); **/

    }

    public void switchCommand(String response) {
        Log.i("switchCommand ", response);
        /*if (serverCommand == response) {

            Log.i("switchCommand ", "servercommand= " + serverCommand);
            wifi.setWifiEnabled(true);// Enabling WiFi
            TurnWifioff.setEnabled(true);
            TurnWifion.setEnabled(false);
            wifistatus.setText("Connected");

        }
        if (serverCommand == response) {
            Log.i("switchCommand ", "servercommand= " + serverCommand);
            wifi.setWifiEnabled(false); //Disabling WiFi
            TurnWifion.setEnabled(true);
            TurnWifioff.setEnabled(false);
            wifistatus.setText("Disconnected");

        }*/
    }


    @Override
    public void onClick(View view) {

        if (TurnWifion.isPressed())    //If "Turn WiFi on" button is Pressed
        {


sendInstruction=1;
sendChildMac="02:00:00:44:55:66";
            /*wifi.setWifiEnabled(true);// Enabling WiFi
            TurnWifioff.setEnabled(true);
            TurnWifion.setEnabled(false);
            wifistatus.setText("Connected");*/
        }
        if (TurnWifioff.isPressed())   //If "Turn WiFi off" button is Pressed
        {

          sendInstruction=0;
          sendChildMac="02:00:00:44:55:66";

           /* wifi.setWifiEnabled(false); //Disabling WiFi
            TurnWifion.setEnabled(true);
            TurnWifioff.setEnabled(false);
            wifistatus.setText("Disconnected");*/
        }
        if (SendMessage.isPressed())   //If "Turn WiFi off" button is Pressed
        {

            //START ASYNC TASK
            ////dcu.simplifi.Sender s = new dcu.simplifi.Sender(WiFISwitch.this, instructionTxt);
           // s.execute();



        }



    }




}



