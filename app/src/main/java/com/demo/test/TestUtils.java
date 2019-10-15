package com.demo.test;

import android.content.Context;
import android.widget.Toast;

public class TestUtils
{
    public void showToastToApp(Context context, String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
