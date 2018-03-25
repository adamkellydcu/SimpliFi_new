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

public class SimpliFi_Account extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplifi_account_layout);
        Button gotoLoginPage = (Button) findViewById(R.id.BT_Account_page);

        gotoLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoLoginPage = new Intent(SimpliFi_Account.this, MainActivity.class);
                startActivity(gotoLoginPage);

            }
        });
    }
}
