package com.example.administrator.addressproject;

import java.util.ArrayList;

public class AddressCountry {


    public static int AddLINE1 = 1;
    public static int AddLINE2 = 2;
    public static int CITY = 3;
    public static int STATE_PROVINCE = 4;
    public static int POSTCODE = 5;


    public ArrayList<CountryAddressData> getAddressData(String country) {
        ArrayList<CountryAddressData> dataList = new ArrayList<>();

        if (country.equals("aa")) {
            dataList.add(new CountryAddressData(1, R.string.addline1));
            dataList.add(new CountryAddressData(2, R.string.addline2));
            dataList.add(new CountryAddressData(3, R.string.city));
            dataList.add(new CountryAddressData(4, R.string.state));


        } else {
            dataList.add(new CountryAddressData(1, R.string.addline1));
            dataList.add(new CountryAddressData(2, R.string.addline2));
            dataList.add(new CountryAddressData(3, R.string.city));
            dataList.add(new CountryAddressData(4, R.string.state));
            dataList.add(new CountryAddressData(5, R.string.postcode));
        }


        return dataList;
    }


    public static class CountryAddressData {
        int type;
        int title_string;

        public CountryAddressData(int t, int ts) {
            type = t;
            title_string = ts;

        }
    }
}
