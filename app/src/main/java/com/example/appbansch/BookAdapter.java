package com.example.appbansch;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Phone> {
    Activity context = null;
    int layout;
    ArrayList<Phone> arrayPhone = null;

    public BookAdapter(Activity context, int layout, ArrayList<Phone> arrayPhone) {
        super (context,layout, arrayPhone);
        this.context=context;
        this.layout=layout;
        this.arrayPhone = arrayPhone;
    }
    private class ViewHolder{
        ImageView imgSach;
        RelativeLayout bookdetail;
        TextView tvTenSach,tvTacGia,tvGia;
    }
    @Override
    public View getView(int postion, View convertView, ViewGroup parent){
        ViewHolder holder;
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) context.getLayoutInflater();
            convertView = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.imgSach = (ImageView) convertView.findViewById(R.id.imgSach);
            holder.tvTenSach = (TextView) convertView.findViewById(R.id.tvTenSach);
            holder.tvTacGia = (TextView) convertView.findViewById(R.id.tvTacGia);
            holder.tvGia = (TextView) convertView.findViewById(R.id.tvGia);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        Phone phone = arrayPhone.get(postion);
        holder.imgSach.setImageResource(phone.getAnhDT());
        holder.tvTenSach.setText(phone.getTenDT());
        holder.tvTacGia.setText(phone.getHang());
        holder.tvGia.setText(phone.getDonGia().toString());
        return convertView;
    }
}
