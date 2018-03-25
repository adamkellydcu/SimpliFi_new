package dcu.simplifi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Conor on 26/01/2018.
 */

public class SimpliFi_Settings extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplifi_setup_layout);
        Button gotoAccountPage = (Button) findViewById(R.id.BT_Settings_Page);

        gotoAccountPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoAccountPage = new Intent(SimpliFi_Settings.this, SimpliFi_Account.class);
           startActivity(gotoAccountPage);
            }
        });
    }
}
