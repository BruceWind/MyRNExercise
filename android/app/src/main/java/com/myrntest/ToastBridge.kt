package com.myrntest

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ToastBridge(val context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {

    override fun getName() =  "AndroidToast"

    @ReactMethod
    fun toast(str:String){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show()
    }
}