package com.example.aroundme;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.sip.SipAudioCall.Listener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import static java.lang.System.currentTimeMillis;

public class notifiation extends Activity {
   EditText ed1,ed3;
  Spinner ed2;
  Button b1;
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.notification);
      
      ed1=(EditText)findViewById(R.id.editText);
      ed2=(Spinner)findViewById(R.id.spinner1);
     
      ed3=(EditText)findViewById(R.id.editText3);
      b1=(Button)findViewById(R.id.button);
      b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            String tittle=ed1.getText().toString().trim();
            String body=ed3.getText().toString().trim();
            Toast.makeText(getApplicationContext(), "Notification set at + body",Toast.LENGTH_SHORT).show();
            String subject=ed2.getSelectedItem().toString().trim();
            NotificationManager notif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        	Notification notify=new Notification(R.drawable.ic_launcher,tittle,System.currentTimeMillis());	
        notify.setLatestEventInfo(getApplicationContext(),subject,body, null);
        notif.notify(0, notify);

         }
      });
   }
   
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }
   
   public boolean onOptionsItemSelected(MenuItem item) {
      // Handle action bar item clicks here. The action bar will
      // automatically handle clicks on the Home/Up button, so long
      // as you specify a parent activity in AndroidManifest.xml.
      
      int id = item.getItemId();
      
      //noinspection SimplifiableIfStatement
      if (id == R.id.action_settings) {
         return true;
      }
      return super.onOptionsItemSelected(item);
   }
}