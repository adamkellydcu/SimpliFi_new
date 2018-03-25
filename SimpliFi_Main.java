package dcu.simplifi;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Conor on 26/01/2018.
 */

public class SimpliFi_Main extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplifi_main_layout);

        Button gotoSettings = (Button) findViewById(R.id.BT_Main_page);

        gotoSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoSettings = new Intent(SimpliFi_Main.this, SimpliFi_Settings.class);
                startActivity(gotoSettings);

            }
        });
    }
}
