package com.example.appgallery;

import android.content.Context;
import android.content.IntentFilter;
import android.media.Image;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import java.util.List;

public class HinhAnhAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<HinhAnh> hinhAnhList;

    public HinhAnhAdapter(Context context, int layout, List<HinhAnh> hinhAnhList) {
        this.context = context;
        this.layout = layout;
        this.hinhAnhList = hinhAnhList;
    }

    @Override
    public int getCount() {
        return hinhAnhList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class viewHolder{
        ImageView imgHinh;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        if(convertView == null){
            holder = new viewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imageViewHinhAnh);
            convertView.setTag(holder);
        }else{
            holder = (viewHolder) convertView.getTag();
        }

        HinhAnh hinhAnh = hinhAnhList.get(position);
        holder.imgHinh.setImageResource(hinhAnh.getHinh());

        return convertView;
    }
}
