package com.md5.bottombar;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;
import com.md5.bottombar.SimpleGestureFilter.SimpleGestureListener;

public class MainActivity extends Act_TabBar implements SimpleGestureListener
{
    Act_TabBar atb;
    Context mcontext;
    private SimpleGestureFilter detector;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atb=new Act_TabBar();
        mcontext=this;
        initialize_Controls();
        detector = new SimpleGestureFilter(MainActivity.this, this);

    }
    private void initialize_Controls()
    {
        super.initialize_Bottombar(1);
        //super.SetLanguageToAll_teb();
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent me){
        // Call onTouchEvent of SimpleGestureFilter class
        this.detector.onTouchEvent(me);
        return super.dispatchTouchEvent(me);
    }
    @Override
    public void onSwipe(int direction) {
        String str = "";

        switch (direction) {

            case SimpleGestureFilter.SWIPE_RIGHT : str = "Swipe Right";
                break;
            case SimpleGestureFilter.SWIPE_LEFT :  str = "Swipe Left";
                break;
            case SimpleGestureFilter.SWIPE_DOWN :  str = "Swipe Down";
                break;
            case SimpleGestureFilter.SWIPE_UP :    str = "Swipe Up";
                break;

        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDoubleTap() {
        Toast.makeText(this, "Double Tap", Toast.LENGTH_SHORT).show();
    }


}
