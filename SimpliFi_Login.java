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

public class SimpliFi_Login extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplifi_login);
        Button loginOK = (Button)findViewById(R.id.Login_OK);

        loginOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginOK = new Intent(SimpliFi_Login.this, Simplifi_Main_Page.class);
           startActivity(loginOK);
            }
        });

    }
}
