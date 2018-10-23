# Country Picker X
> A helpful and customizable Country Picker for your needs.

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-country--picker--x-brightgreen.svg?style=popout-square)](https://android-arsenal.com/details/1/4390)
[![Android Arsenal](https://img.shields.io/badge/Twitter-mike14u-blue.svg?style=popout-square)](https://www.twitter.com/mike14u)
[![Android Arsenal](https://img.shields.io/badge/Github-mike14u-ff69b4.svg?style=popout-square)](https://github.com/mike14u)

<img src="https://cloud.githubusercontent.com/assets/16832215/18738030/600bf0c0-80ca-11e6-97b2-0fff48ec1ba5.png" width="200" height="400">

## Getting Started

Make sure to have Android Studio

**Gradle**

```
repositories {
    maven { url "https://jitpack.io" }
}
```

```
implementation 'com.github.ekimual:country-picker-x:1.0.0'
```

## Usage

```
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

```
{
    "ID" : "62",
    "PH" : "63",
    "VN" : "84"
}
```

## License

```
The MIT License (MIT)

Copyright (c) 2016 Mike Lau

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```
