# react-native-barcode-zxing-scan

The zxing module scanning barcodes in android.

This module abstracts the library zxing-android-embedded, developed by JourneyApps.

## Barcode formats:

- CODE 128
- UPC A
- UPC E
- EAN 8
- EAN 13
- RSS 14
- CODE 39
- CODE 93
- ITF
- RSS EXPANDED
- QR CODE
- DATA MATRIX
- PDF 417


## Getting started

```$ npm install react-native-barcode-zxing-scan --save```

## Mostly automatic installation

```$ react-native link react-native-barcode-zxing-scan```

## Manual installation 

Android
Update rn to 0.60.* and use autolink

## Usage 

#### App.js 

```
import React from "react";
import { Text, View, TouchableOpacity } from "react-native";
import BarcodeZxingScan from "react-native-barcode-zxing-scan";

const App = () => {
  const barcodeScanned = (data) => {
    console.log("Barcode ", data);
  };

  const handleClick = () => {
    BarcodeZxingScan.showQrReader(barcodeScanned);
  };

  return (
    <View>
      <TouchableOpacity
        onPress={() => handleClick()}
        style={{
          margin: 20,
          backgroundColor: "blue",
          justifyContent: "center",
          alignItems: "center",
        }}
      >
        <Text style={{ fontSize: 30 }}>SCAN</Text>
      </TouchableOpacity>
    </View>
  );
};

export default App;
```