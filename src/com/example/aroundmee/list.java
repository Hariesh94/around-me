package com.example.aroundmee;



import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
 
 
public class list extends Activity{
ListView list;
String[] itemname ={
		"Hospitals","Restaurant","Theatre","PetrolStation","Hotel","Bank/ATM"
};
Integer[] imgid={
R.drawable.hospital,
R.drawable.restaurant,
R.drawable.theatre,
R.drawable.petrol,
R.drawable.hotel,
R.drawable.atm,

};
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
list=(ListView)findViewById(R.id.list);
list.setAdapter(adapter);
list.setOnItemClickListener(new OnItemClickListener() {
 
@Override
public void onItemClick(AdapterView<?> parent, View view,
int position, long id) {



	
    switch( position )
    {
       case 0:  Intent i1 = new Intent(list.this, GooglePlacesActivity.class);     
                startActivity(i1);
                break;
       case 1:  Intent i2 = new Intent(list.this, GooglePlacesActivity.class);     
                startActivity(i2);
                break;
       case 2:  Intent i3 = new Intent(list.this, GooglePlacesActivity.class);     
                startActivity(i3);
                break;
       case 3:  Intent i4 = new Intent(list.this, GooglePlacesActivity.class);     
                startActivity(i4);
                break;
       case 4:  Intent i5 = new Intent(list.this, GooglePlacesActivity.class);     
                startActivity(i5);
                break;
       case 5: Intent i6 = new Intent(list.this, GooglePlacesActivity.class);     
        startActivity(i6);
        break;
    }
}


});
}
}