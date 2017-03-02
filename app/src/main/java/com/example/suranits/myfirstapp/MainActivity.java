package com.example.suranits.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    private int[] ints = new int[]{R.drawable.traffic_01,
            R.drawable.traffic_02,
            R.drawable.traffic_03,
            R.drawable.traffic_04,
            R.drawable.traffic_05,
            R.drawable.traffic_06,
            R.drawable.traffic_07,
            R.drawable.traffic_08,
            R.drawable.traffic_09,
            R.drawable.traffic_10,
            R.drawable.traffic_11,
            R.drawable.traffic_12,
            R.drawable.traffic_13,
            R.drawable.traffic_14,
            R.drawable.traffic_15,
            R.drawable.traffic_16,
            R.drawable.traffic_17,
            R.drawable.traffic_18,
            R.drawable.traffic_19,
            R.drawable.traffic_20};
    //ประการตัวแปร
    private String [] titleStrings,detailStrings,shortStrings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initealview ผูกตัวแปรกับไอดีของวิว
        listView = (ListView) findViewById(R.id.livtarffic);

        //getview
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        //ซับสติงดีเทลสติงเพื่อให้มีข้อความไม่เกิน 30 ชาเลกเตอร์
        shortStrings = new String[detailStrings.length]; //จองเพิ่มที่ในหน่วยความจำในshortStringa
        for(int i=0; i < detailStrings.length;i++)
        {
            shortStrings[i] = detailStrings[i].substring(0, 29)+"...";

        }//end for


            //create Listview

            MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints, titleStrings, shortStrings);
        listView.setAdapter(myAdapter);

//active whew clink list view ลิ้งไปหน้าดีเทลเมื่อคลิ๊กเลือกไอเทม

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(MainActivity.this,Detail.class);
                intent.putExtra("Title",titleStrings[position]);
                intent.putExtra("Image",ints[position]);
                intent.putExtra("Detail",detailStrings[position]);
                startActivity(intent);
            }
        }); //เมื่อuserมีการคลิ๊กตำแหน่งข้อมูลใด จะเกบข้อมูลจากการคลิ๊ก
    }

    public void onClikmoreinfo (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dlt.go.th/th/dlt-knowledge/view.php?_did=111"));
        startActivity(intent);
    }

}
