package com.gagan.awesomelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Gagan on 7/3/2016.
 */
public class AwesomeLibrary {
    private static AwesomeLibrary ourInstance = new AwesomeLibrary();

    public static AwesomeLibrary getInstance() {
        return ourInstance;
    }

    private AwesomeLibrary() {
    }

    public void makeMeAwesome(Context context, String data1){
        Toast.makeText(context,"Awesome "+data1,Toast.LENGTH_SHORT).show();
    }
}
