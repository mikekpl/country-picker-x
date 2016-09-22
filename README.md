Country Picker X
================

A helpful and customizable Country Picker for your needs.

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
	int resourceId = getResources().getIdentifier("country_avail", "raw", getApplicationContext().getPackageName());
  CountryPickerDialog countryPicker =
      new CountryPickerDialog(MainActivity.this, new CountryPickerCallbacks() {
          @Override
          public void onCountrySelected(Country country, int flagResId) {
                /* Get Country Name: country.getCountryName(context); */
          }
          
          /* Set to false if you want to disable Dial Code in the results and true if you want to show it 
             Set to zero if you don't have a custom JSON list of countries in your raw file */
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
