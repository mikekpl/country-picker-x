Country Picker X
================

A helpful and customizable Country Picker for your needs.

![device-2016-09-22-134039](https://cloud.githubusercontent.com/assets/16832215/18738030/600bf0c0-80ca-11e6-97b2-0fff48ec1ba5.png)

Gradle

```java
	repositories {
    	maven { url "https://jitpack.io" }
    }
```

```java
	compile 'com.github.ekimual:country-picker-x:1.0.0'
```

Sample Usage:

```java
  /* Declare */
  CountryPickerDialog countryPicker;
  
  /* Name of your Custom JSON list */
  int resourceId = getResources().getIdentifier("country_avail", "raw", getApplicationContext().getPackageName());
  
  countryPicker = new CountryPickerDialog(MainActivity.this, new CountryPickerCallbacks() {
          @Override
          public void onCountrySelected(Country country, int flagResId) {
                /* Get Country Name: country.getCountryName(context); */
                /* Call countryPicker.dismiss(); to prevent memory leaks */
          }
          
          /* Set to false if you want to disable Dial Code in the results and true if you want to show it 
             Set to zero if you don't have a custom JSON list of countries in your raw file otherwise use 
             resourceId for your customly available countries */
      }, false, 0);
  countryPicker.show();
```

Sample format of JSON list of countries
Arranged in format with Country Code : Dial Code

```javascript
  {
    "ID" : "62",
    "PH" : "63",
    "VN" : "84"
  }
```

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-country--picker--x-green.svg?style=true)](https://android-arsenal.com/details/1/4390)
