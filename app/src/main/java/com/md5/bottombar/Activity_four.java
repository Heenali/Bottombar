package com.md5.bottombar;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

public class Activity_four extends Act_TabBar
{
	Act_TabBar atb;
	Context mcontext;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		atb=new Act_TabBar();
		mcontext=this;
		initialize_Controls();

		
}
	private void initialize_Controls() 
	{
		super.initialize_Bottombar(4);

	}


}
