package com.example.covid19new;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class statesAdapter extends ArrayAdapter<states> {
    private Context mContext;
    private int mResource;

    public statesAdapter(@NonNull Context context, int resource, @NonNull ArrayList<states> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource,parent,false);

        TextView textView = convertView.findViewById(R.id.states);

        TextView textView1 = convertView.findViewById(R.id.cases);
        TextView textView2 = convertView.findViewById(R.id.active);
        TextView textView3 = convertView.findViewById(R.id.recover);
        TextView textView4 = convertView.findViewById(R.id.dead);

        textView.setText(getItem(position).getStates());

        textView1.setText(getItem(position).getStates());
        textView2.setText(getItem(position).getCases());
        textView3.setText(getItem(position).getRecover());
        textView4.setText(getItem(position).getDead());



        return convertView;
    }
}
