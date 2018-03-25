package dcu.simplifi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Conor on 29/01/2018.
 */

public class Custom_Adapter extends ArrayAdapter<String>{


    public Custom_Adapter(@NonNull Context context, String[] devices) {
        super(context,R.layout.custom_row,devices);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater deviceinflator = LayoutInflater.from(getContext());

        View customview = deviceinflator.inflate(R.layout.custom_row, parent, false);

        String deviceItem = getItem(position);
        String macItem= getItem(position);


        TextView devicenames = (TextView) customview.findViewById(R.id.devicesItems);
        TextView macAddress = (TextView) customview.findViewById(R.id.mac_address);

        ImageView simplifi_image =(ImageView)customview.findViewById(R.id.simplifi_image);

        devicenames.setText(deviceItem);
        //macAddress.setText(macItem);
        simplifi_image.setImageResource(R.drawable.simplifi);
        return customview;
    }
}
