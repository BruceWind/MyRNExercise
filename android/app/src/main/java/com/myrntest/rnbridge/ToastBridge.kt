package com.myrntest.rnbridge

import android.widget.Toast
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.myrntest.MainActivity

class ToastBridge(val context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {

    override fun getName() =  "AndroidToast"

    @ReactMethod
    fun toast(str:String,promise: Promise){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show()
        promise.resolve(true)
    }
}