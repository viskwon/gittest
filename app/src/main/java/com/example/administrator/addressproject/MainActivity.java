package com.example.administrator.addressproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

import static com.example.administrator.addressproject.AddressCountry.AddLINE1;
import static com.example.administrator.addressproject.AddressCountry.AddLINE2;

public class MainActivity extends AppCompatActivity {

    public EditText mAddressLine1;
    public EditText mAddressLine2;
    public EditText mCity;
    public EditText mState;
    public EditText mProvince;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout addressInput = findViewById(R.id.addressInput);


        ArrayList<AddressCountry.CountryAddressData> data = new AddressCountry().getAddressData("SG");

        for (AddressCountry.CountryAddressData add : data) {
            if (add.type == AddLINE1) {
                addressInput.addView(getLayoutInflater().inflate(R.layout.addressinput, null));
                addressInput.findViewById(R.id.address_title).setVisibility(View.VISIBLE);

            }
            else if (add.type == AddLINE2) {
                addressInput.addView(getLayoutInflater().inflate(R.layout.addressinput, null));

            }



        }

    }
}
