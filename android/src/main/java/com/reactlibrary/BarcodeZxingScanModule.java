// BarcodeZxingScanModule.java

package com.reactlibrary;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class BarcodeZxingScanModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public BarcodeZxingScanModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "BarcodeZxingScan";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, Promise promise) {
        // TODO: Implement some actually useful functionality
       try {
           promise.resolve(stringArgument);
       } catch (Exception e) {
           promise.reject(e);
           //TODO: handle exception
       }
    }
}
