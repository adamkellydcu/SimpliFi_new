package dcu.simplifi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Simplifi_Main_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplifi_custom_listview_layour);


        String[] deviceNames = new String[]{

                "Adam's iphone", "Mark's HTC", "Conor's iPhone",
                "Adam's MacBook", "Conor's Laptop", "Tony's Nexus 5",
                "Lorraine's Samsung", "Tony's Laptop", "Xbox 360", "PS4"
        };
        String[] macAddresses = new String[]{

        "4C:80:93:7E:17:9C", "6C:AD:F8:93:3B:EE","74:04:2B:A6:51:AA","9C:E0:63:75:2F:D6",
        "A0:D7:95:7B:EC:7C","A2:2B:B0:C2:98:EA", "AC:37:43:3A:25:A1","C4:B3:01:D9:25:B3",
        "CC:FA:00:F3:AF:2D"
        };


        ListAdapter clientnames = new Custom_Adapter(this, deviceNames);

        ListView devicenames2 = findViewById(R.id.custom_listview);

        devicenames2.setAdapter(clientnames);

        devicenames2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String devicename = String.valueOf(adapterView.getItemAtPosition(i));

                Toast.makeText(Simplifi_Main_Page.this, devicename, Toast.LENGTH_SHORT).show();
            }
        });
    }


}