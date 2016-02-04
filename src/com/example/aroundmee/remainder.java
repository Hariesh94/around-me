package com.example.aroundmee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class remainder extends Activity {

	 protected void onCreate(Bundle savedInstanceState)
	 {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.remainder);
	    Button b1=(Button) findViewById(R.id.button1);
	    b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(remainder.this,list.class);
				startActivity(i);
			}
		});

}
}
