package com.mikelau.countrypickerx;

import android.content.Context;

import java.util.Locale;

public class Country {
    private String isoCode;
    private String dialingCode;

    public Country() {

    }

    public Country(String isoCode, String dialingCode) {
        this.isoCode = isoCode;
        this.dialingCode = dialingCode;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getDialingCode() {
        return dialingCode;
    }

    public void setDialingCode(String dialingCode) {
        this.dialingCode = dialingCode;
    }

    public String getCountryName(Context con) {
        return new Locale(con.getResources().getConfiguration().locale.getLanguage(), isoCode).getDisplayCountry();
    }
}
