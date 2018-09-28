package com.md5.bottombar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Act_TabBar extends Activity implements OnClickListener
{

	private ImageView img_1,img_2,img_5,img_3,img_4 ;
	private TextView txt_1,txt_2,txt_5,txt_3,txt_4;
	LinearLayout layout1,layout2,layout3,layout4,layout5;
	private int tab_id = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{		
		super.onCreate(savedInstanceState);
	}
	
	public void initialize_Bottombar(int tab)
	{

		tab_id=tab;
		
		img_1=(ImageView) findViewById(R.id.img_1);
		img_2=(ImageView) findViewById(R.id.img_2);
		img_5=(ImageView) findViewById(R.id.img_5);
		img_3=(ImageView) findViewById(R.id.img_3);
		img_4=(ImageView) findViewById(R.id.img_4);
		
		txt_1=(TextView) findViewById(R.id.txt_1);
		txt_2=(TextView) findViewById(R.id.txt_2);
		txt_5=(TextView) findViewById(R.id.txt_5);
		txt_3=(TextView) findViewById(R.id.txt_3);
		txt_4=(TextView) findViewById(R.id.txt_4);

		layout1=(LinearLayout) findViewById(R.id.layout1);
		layout2=(LinearLayout) findViewById(R.id.layout2);
		layout3=(LinearLayout) findViewById(R.id.layout3);
		layout4=(LinearLayout) findViewById(R.id.layout4);
		layout5=(LinearLayout) findViewById(R.id.layout5);

		txt_1.setOnClickListener(this);
		txt_2.setOnClickListener(this);
		txt_5.setOnClickListener(this);
		txt_3.setOnClickListener(this);
		txt_4.setOnClickListener(this);

		img_1.setOnClickListener(this);
		img_2.setOnClickListener(this);
		img_5.setOnClickListener(this);
		img_3.setOnClickListener(this);
		img_4.setOnClickListener(this);

		switch (tab) 
		{
			case 1:
				img_1.setImageResource(R.drawable.home_select);

				layout1.setBackgroundResource(R.color.colorAccent);
				layout2.setBackgroundResource(R.color.colorPrimaryDark);
				layout3.setBackgroundResource(R.color.colorPrimaryDark);
				layout4.setBackgroundResource(R.color.colorPrimaryDark);
				layout5.setBackgroundResource(R.color.colorPrimaryDark);


				break;
			case 2:
				img_2.setImageResource(R.drawable.home_select);

				layout1.setBackgroundResource(R.color.colorPrimaryDark);
				layout2.setBackgroundResource(R.color.colorAccent);
				layout3.setBackgroundResource(R.color.colorPrimaryDark);
				layout4.setBackgroundResource(R.color.colorPrimaryDark);
				layout5.setBackgroundResource(R.color.colorPrimaryDark);

				break;
	
			case 3:
				img_3.setImageResource(R.drawable.home_select);

				layout1.setBackgroundResource(R.color.colorPrimaryDark);
				layout2.setBackgroundResource(R.color.colorPrimaryDark);
				layout3.setBackgroundResource(R.color.colorAccent);
				layout4.setBackgroundResource(R.color.colorPrimaryDark);
				layout5.setBackgroundResource(R.color.colorPrimaryDark);
				break;
	
			case 4:
				img_4.setImageResource(R.drawable.home_select);

				layout1.setBackgroundResource(R.color.colorPrimaryDark);
				layout2.setBackgroundResource(R.color.colorPrimaryDark);
				layout3.setBackgroundResource(R.color.colorPrimaryDark);
				layout4.setBackgroundResource(R.color.colorAccent);
				layout5.setBackgroundResource(R.color.colorPrimaryDark);

				break;
			case 5:
				img_5.setImageResource(R.drawable.home_select);

				layout1.setBackgroundResource(R.color.colorPrimaryDark);
				layout2.setBackgroundResource(R.color.colorPrimaryDark);
				layout3.setBackgroundResource(R.color.colorPrimaryDark);
				layout4.setBackgroundResource(R.color.colorPrimaryDark);
				layout5.setBackgroundResource(R.color.colorAccent);

				break;	

	
		
			default:
				break;
		}
		
		
	}



	
	@Override
	public void onClick(View v) 
	{
		if(v==txt_1||v==img_1)
		{
			if(tab_id != 1)
			{
				Intent i=new Intent(Act_TabBar.this,MainActivity.class);
				startActivity(i);
				//overridePendingTransition(android.R.anim.slide_in_left,
                //        android.R.anim.slide_out_right);
				finish();
				//SetLanguageToAll();
				
				
			}
		}
		else if (v==txt_2||v==img_2)
		{
			if(tab_id != 2)
			{
				
				Intent i=new Intent(Act_TabBar.this,Activity_two.class);
				startActivity(i);
				//overridePendingTransition(android.R.anim.slide_in_left,
                //        android.R.anim.slide_out_right);
				finish();
				//SetLanguageToAll();
			}
			
		}
		else if (v==txt_5||v==img_5)
		{
			if(tab_id != 3)
			{
				
				Intent i=new Intent(Act_TabBar.this,Activity_five.class);
				startActivity(i);
				//overridePendingTransition(android.R.anim.slide_out_right,
                //        android.R.anim.slide_in_left);
				finish();
				//SetLanguageToAll();
			}
		}
		else if (v==txt_3||v==img_3)
		{
			if(tab_id != 4)
			{
				
				Intent i=new Intent(Act_TabBar.this,Activity_three.class);
				startActivity(i);
				//overridePendingTransition(android.R.anim.slide_out_right,
                //        android.R.anim.slide_in_left);
				finish();
				//SetLanguageToAll();
			}		
			}
		else if (v==txt_4||v==img_4)
		{
			if(tab_id != 5)
			{
				
				Intent i=new Intent(Act_TabBar.this,Activity_four.class);
				startActivity(i);
				//overridePendingTransition(android.R.anim.slide_out_right,
                //        android.R.anim.slide_in_left);
				finish();
				//SetLanguageToAll();
			}
		}

	}
}

