package com.mikelau.countrypickerxsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mikelau.countrypickerx.Country;
import com.mikelau.countrypickerx.CountryPickerCallbacks;
import com.mikelau.countrypickerx.CountryPickerDialog;

public class MainActivity extends AppCompatActivity {

    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = (TextView) findViewById(R.id.tvName);

        int resourceId = getResources().getIdentifier("country_avail", "raw", getApplicationContext().getPackageName());
        CountryPickerDialog countryPicker =
                new CountryPickerDialog(MainActivity.this, new CountryPickerCallbacks() {
                    @Override
                    public void onCountrySelected(Country country, int flagResId) {
                        tvName.setText(country.getCountryName(MainActivity.this));
                    }
                }, false, 0);
        countryPicker.show();
    }
}
