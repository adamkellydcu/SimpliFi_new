package dcu.simplifi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by adamkelly on 26/03/2018.
 */


public class registered_devices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registered_devices);


        Button Device1manage=(Button) findViewById(R.id.Device1);

        Device1manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToWifiControl = new Intent(registered_devices.this, WiFISwitch.class);
                startActivity(GoToWifiControl);
            }
        });

    }
}