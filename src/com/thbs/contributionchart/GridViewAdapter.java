package com.thbs.contributionchart;

import java.util.ArrayList;

import com.example.grid.R;

import android.R.integer;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AnalogClock;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressWarnings("rawtypes")
public class GridViewAdapter extends ArrayAdapter {
	private Context context;
	int resid;

	ArrayList<Integer> val;

	@SuppressWarnings("unchecked")
	public GridViewAdapter(Context context, int resid, ArrayList<Integer> val) {
		super(context, resid, val);
		this.resid = resid;
		this.context = context;
		this.val = val;

	}

	public void updatedata(ArrayList<Integer> values) {
		
		val.clear();
		val.addAll(values);
	}

	@SuppressLint("ResourceAsColor")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		ViewHolder holder = null;

		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(resid, parent, false);

		}
		holder = new ViewHolder();
		holder.griditemlayout = (LinearLayout) row.findViewById(R.id.griditem);
		holder.textval = (TextView) row.findViewById(R.id.textView1);

		row.setTag(holder);

		int percentval = val.get(position);

		// Setting up the initial row of the grid to the name of days

		if (position >= 0 && position <= 6) {
			switch (position) {
			case 0:
				holder.textval.setText(R.string.sun);
				break;
			case 1:
				holder.textval.setText(R.string.mon);
				break;
			case 2:
				holder.textval.setText(R.string.tue);
				break;
			case 3:
				holder.textval.setText(R.string.wed);
				break;
			case 4:
				holder.textval.setText(R.string.thu);
				break;
			case 5:
				holder.textval.setText(R.string.fri);
				break;
			case 6:
				holder.textval.setText(R.string.sat);
				break;
			}

		} else {

			// Setting up the background colors of the grid item based upon the
			// value passed.

			
			
			if (percentval == -1) {
				holder.textval.setText("");
				
				//Do not change this color, else the result will be confusing.
				holder.textval.setBackgroundColor(Color.TRANSPARENT);
			}
			
			//The percent-color mapping can be done from below
			//Adjust the percentval/color according to the requirements
			if (percentval == 0) {

				holder.textval.setText("");
				holder.textval.setBackgroundColor(Color.WHITE);

			} else if (percentval >= 1 && percentval <= 20) {

				holder.textval.setText("");
				holder.textval.setBackgroundResource(R.color.blueShade1);

			} else if (percentval >= 21 && percentval <= 40) {

				holder.textval.setText("");
				holder.textval.setBackgroundResource(R.color.blueShade2);

			} else if (percentval >= 41 && percentval <= 60) {

				holder.textval.setText("");
				holder.textval.setBackgroundResource(R.color.blueShade3);

			} else if (percentval >= 61 && percentval <= 80) {

				holder.textval.setText("");
				holder.textval.setBackgroundResource(R.color.blueShade4);

			} else if (percentval >= 81 && percentval <= 100) {

				holder.textval.setText("");
				holder.textval.setBackgroundResource(R.color.blueShade5);
			}
		}
		return row;
	}

	static class ViewHolder {
		LinearLayout griditemlayout;
		TextView textval;
	}
}