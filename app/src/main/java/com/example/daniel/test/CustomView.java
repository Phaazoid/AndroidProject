package com.example.daniel.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Daniel on 11/11/2014.
 */
public class CustomView extends View {
    public CustomView(Context context){
        super(context);
        init(null, 0);
    }

    public CustomView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(attrs, 0);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }
    private void init(AttributeSet attrs, int defStyle){

    }

}
