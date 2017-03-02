package com.example.suranits.myfirstapp;

import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initalview ผูกตัวแปรกับไอดีของวิว
        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        ImageView imageView = (ImageView) findViewById(R.id.imvImageDetail);
        TextView detailTextView = (TextView) findViewById(R.id.txtDetailScroll);
        Button button = (Button) findViewById(R.id.btnBack);

        //showdataรับข้อมูลของ main ativiti มาแสเงผลบนทีเทล

        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        imageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));

    }//end main madtod

    public void clickBack(View view){  //ทำปุ่มแบล็กปิดหน้าดีเทล
        finish();

    }


}//end
