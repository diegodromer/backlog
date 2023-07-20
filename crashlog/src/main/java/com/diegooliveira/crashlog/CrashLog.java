package com.diegooliveira.crashlog;

import android.util.Log;

public class CrashLog {

    public static void print(String message) {
        Log.d("CrashLog", message);
    }
}
