package com.example.googlemapsuteq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class InfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private static final String TAG = "InfoWindowAdapter";
    private LayoutInflater inflater;

    public InfoWindowAdapter(LayoutInflater inflater){
        this.inflater = inflater;
    }


    @Override
    public View getInfoContents(final Marker m) {
        //Carga layout personalizado.
        View v = inflater.inflate(R.layout.info_wa, null);
        String[] info = m.getTitle().split("&");
        String url = m.getSnippet();
        //((ImageView)v.findViewById(R.id.info_window_imagen)).setImageResource(R.drawable.ic_launcher_background);
        //((TextView)v.findViewById(R.id.info_window_nombre)).setText("Lina Cortés");
        //((TextView)v.findViewById(R.id.info_window_placas)).setText("Placas: SRX32");
        //((TextView)v.findViewById(R.id.info_window_estado)).setText("Estado: Activo");
        return v;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }


}
