 package com.example.aroundmee;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class CustomListAdapter extends ArrayAdapter<String> {
 
private final Activity context;
private final String[] itemname;
private final Integer[] imgid;
public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
super(context, R.layout.sub1, itemname);
// TODO Auto-generated constructor stub
this.context=context;
this.itemname=itemname;    
this.imgid=imgid;
}
public View getView(int position,View view,ViewGroup parent) {
LayoutInflater inflater=context.getLayoutInflater();
View rowView=inflater.inflate(R.layout.sub1, null,true);
TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);
txtTitle.setText(itemname[position]);
imageView.setImageResource(imgid[position]);
extratxt.setText(" ");

return rowView;
}
}









