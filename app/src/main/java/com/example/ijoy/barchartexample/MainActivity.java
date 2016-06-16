package com.example.ijoy.barchartexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BarChart barChart=(BarChart) findViewById(R.id.Chart);

        ArrayList<BarEntry> entries=new ArrayList<>();
        entries.add(new BarEntry(4f,0));
        entries.add(new BarEntry(8f,1));

        BarDataSet dataSet=new BarDataSet(entries,"times");


        ArrayList<String> labels=new ArrayList<String>();
        labels.add("Jan");
        labels.add("Feb");

        BarData data=new BarData(labels,dataSet);

        barChart.setData(data);

        barChart.setDescription("easy mpandroidchart");



    }


}
