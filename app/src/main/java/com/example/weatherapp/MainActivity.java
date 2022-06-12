package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
EditText etCity, etCountry;
TextView tvResult;
private final String url = "http://api.openweathermap.org/data/2.5/weather";
private final String appId = "1d2d4a90c817c8a3c3f9279b4b8317d7";
DecimalFormat df = new DecimalFormat("#.##");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCity = findViewById(R.id.etCity);
        etCountry = findViewById(R.id.etCountry);
        tvResult = findViewById(R.id.tvResult);
    }

    public void getWeatherDetails(View view) {
        String tempUrl = "";
        String city = etCity.getText().toString().trim();
        String country = etCountry.getText().toString().trim();
        if(city.equals("")){
            tvResult.sexText("City field cannot be empty");
        }else{
            if(!country.equals("")){
                tempUrl = url + "?q=" = city + "," + country + "&appid";
            }else{
                tempUrl = url + "?q=" = city + "&appid";
            }
            StringRequest stringRequest = new StringRequest(Request.Method.POST,tempUrl, new Response.Listener)
        }
    }
}