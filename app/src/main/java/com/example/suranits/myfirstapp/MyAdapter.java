package com.example.suranits.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Suranit.S on 2/22/2017.
 */
//ativity ทำเพื่อสร้างเรเอาเสมือนเพื่อนำไปแสดงผลตรงหน้าเมน ativity

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int[] ints;
    private String[] titlestring,detailStrings;
//กดalt+insetr กดเลือกconstanterทั้ง4อัน
    public MyAdapter(Context context, int[] ints, String[] titlestring, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titlestring = titlestring;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() { //ใช้นับจำนวนข้อมูล แล้วส่งต่อไปยังเม็ดตอดgetview
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
     //กดเลือกcass to
        View view = layoutInflater.inflate(R.layout.my_listview,parent,false);

        //intial view ผูกชื่อของไอดีของview กับตัวแปล
        ImageView imageView = (ImageView) view.findViewById(R.id.imvicon);
        TextView titletextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView deteltextView = (TextView) view.findViewById(R.id.txtDetelLiv);

        //show view เอาข้อมูลไปแสดงบนหน้า app
        imageView.setImageResource(ints[position]);
        titletextView.setText(titlestring[position]);
        deteltextView.setText(detailStrings[position]);

        return view; //ทำหน้าที่รับจำนวนข้อมูลแล้วแสดงผลบนหน้าapp
    }
}//end class
