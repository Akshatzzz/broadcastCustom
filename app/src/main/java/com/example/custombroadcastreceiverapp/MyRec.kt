package com.example.custombroadcastreceiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyRec: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action=="com.example.custombroadcastreceiverapp.ACTION_SEND") {
            val string = intent.getStringExtra("com.example.custombroadcastreceiverapp")
            Toast.makeText(context, "Receiver string + $string", Toast.LENGTH_LONG).show()
        }

    }

}