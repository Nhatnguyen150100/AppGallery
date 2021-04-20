package com.example.appgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvHinhAnh;
    ArrayList<HinhAnh> arrayimage;
    HinhAnhAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        contextView();

        adapter = new HinhAnhAdapter(MainActivity.this,R.layout.dong_hinh_anh,arrayimage);
        gvHinhAnh.setAdapter(adapter);
    }

    private void contextView() {
        gvHinhAnh = (GridView) findViewById(R.id.gridViewHinhAnh);
        arrayimage = new ArrayList<>();

        arrayimage.add(new HinhAnh("Hình 1",R.drawable.images));
        arrayimage.add(new HinhAnh("Hình 2",R.drawable.download));
        arrayimage.add(new HinhAnh("Hình 3",R.drawable.downloada));
        arrayimage.add(new HinhAnh("Hình 4",R.drawable.downloadaa));
        arrayimage.add(new HinhAnh("Hình 5",R.drawable.downloadb));
        arrayimage.add(new HinhAnh("Hình 6",R.drawable.downloadc));
        arrayimage.add(new HinhAnh("Hình 7",R.drawable.downloadd));
        arrayimage.add(new HinhAnh("Hình 8",R.drawable.downloaddd));
    }
}