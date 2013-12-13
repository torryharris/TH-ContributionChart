package com.thbs.contributionchart;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.example.grid.R;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	//create a gridview
	GridView contibutionView;
	
	//Create a gridviewAdapter object
	GridViewAdapter gridAdapter;
	
	//Taskcalculator object
	TaskCalculator t;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		contibutionView = (GridView) findViewById(R.id.gridView1);

		ArrayList<Integer> janVal = new ArrayList<Integer>();
		ArrayList<Integer> febVal = new ArrayList<Integer>();
		ArrayList<Integer> marVal = new ArrayList<Integer>();
		ArrayList<Integer> aprVal = new ArrayList<Integer>();

		ArrayList<Integer> mayVal = new ArrayList<Integer>();

		ArrayList<Integer> junVal = new ArrayList<Integer>();
		ArrayList<Integer> julVal = new ArrayList<Integer>();
		ArrayList<Integer> augVal = new ArrayList<Integer>();
		ArrayList<Integer> sepVal = new ArrayList<Integer>();
		ArrayList<Integer> octVal = new ArrayList<Integer>();
		ArrayList<Integer> novVal = new ArrayList<Integer>();
		ArrayList<Integer> decVal = new ArrayList<Integer>();
		

		janVal.add(0);
		janVal.add(0);
		janVal.add(20);
		janVal.add(12);
		janVal.add(0);
		janVal.add(0);
		janVal.add(10);
		janVal.add(10);
		janVal.add(15);
		janVal.add(20);
		janVal.add(24);
		janVal.add(0);
		janVal.add(0);
		janVal.add(13);
		janVal.add(2);
		janVal.add(6);
		janVal.add(3);
		janVal.add(4);
		janVal.add(0);
		janVal.add(0);
		janVal.add(3);
		janVal.add(12);
		janVal.add(7);
		janVal.add(6);
		janVal.add(9);
		janVal.add(0);
		janVal.add(0);
		janVal.add(0);
		janVal.add(19);
		janVal.add(17);
		janVal.add(16);

		marVal.add(20);
		marVal.add(20);
		marVal.add(2);
		marVal.add(0);
		marVal.add(0);
		marVal.add(22);
		marVal.add(20);
		marVal.add(12);
		marVal.add(19);
		marVal.add(20);
		marVal.add(0);
		marVal.add(20);
		marVal.add(0);
		marVal.add(18);
		marVal.add(2);
		marVal.add(6);
		marVal.add(22);
		marVal.add(4);
		marVal.add(0);
		marVal.add(24);
		marVal.add(19);
		marVal.add(0);
		marVal.add(7);
		marVal.add(6);
		marVal.add(9);
		marVal.add(0);
		marVal.add(22);
		marVal.add(0);
		marVal.add(11);
		marVal.add(17);
		marVal.add(0);

		aprVal.add(0);
		aprVal.add(1);
		aprVal.add(0);
		aprVal.add(2);
		aprVal.add(0);
		aprVal.add(22);
		aprVal.add(10);
		aprVal.add(10);
		aprVal.add(19);
		aprVal.add(21);
		aprVal.add(24);
		aprVal.add(0);
		aprVal.add(0);
		aprVal.add(2);
		aprVal.add(2);
		aprVal.add(6);
		aprVal.add(3);
		aprVal.add(4);
		aprVal.add(0);
		aprVal.add(12);
		aprVal.add(19);
		aprVal.add(0);
		aprVal.add(7);
		aprVal.add(6);
		aprVal.add(9);
		aprVal.add(0);
		aprVal.add(0);
		aprVal.add(0);
		aprVal.add(21);
		aprVal.add(17);
		aprVal.add(22);

		mayVal.add(0);
		mayVal.add(1);
		mayVal.add(0);
		mayVal.add(2);
		mayVal.add(0);
		mayVal.add(0);
		mayVal.add(20);
		mayVal.add(10);
		mayVal.add(19);
		mayVal.add(20);
		mayVal.add(24);
		mayVal.add(0);
		mayVal.add(21);
		mayVal.add(16);
		mayVal.add(2);
		mayVal.add(6);
		mayVal.add(10);
		mayVal.add(4);
		mayVal.add(0);
		mayVal.add(0);
		mayVal.add(19);
		mayVal.add(0);
		mayVal.add(19);
		mayVal.add(6);
		mayVal.add(9);
		mayVal.add(10);
		mayVal.add(0);
		mayVal.add(0);
		mayVal.add(19);
		mayVal.add(17);
		mayVal.add(20);

		junVal.add(20);
		junVal.add(1);
		junVal.add(0);
		junVal.add(2);
		junVal.add(10);
		junVal.add(0);
		junVal.add(20);
		junVal.add(10);
		junVal.add(19);
		junVal.add(20);
		junVal.add(24);
		junVal.add(0);
		junVal.add(15);
		junVal.add(16);
		junVal.add(2);
		junVal.add(6);
		junVal.add(24);
		junVal.add(4);
		junVal.add(0);
		junVal.add(20);
		junVal.add(19);
		junVal.add(0);
		junVal.add(7);
		junVal.add(6);
		junVal.add(9);
		junVal.add(10);
		junVal.add(24);
		junVal.add(0);
		junVal.add(11);
		junVal.add(17);
		junVal.add(22);

		julVal.add(20);
		julVal.add(1);
		julVal.add(0);
		julVal.add(2);
		julVal.add(0);
		julVal.add(0);
		julVal.add(20);
		julVal.add(10);
		julVal.add(19);
		julVal.add(20);
		julVal.add(24);
		julVal.add(0);
		julVal.add(0);
		julVal.add(16);
		julVal.add(2);
		julVal.add(6);
		julVal.add(24);
		julVal.add(4);
		julVal.add(0);
		julVal.add(0);
		julVal.add(19);
		julVal.add(0);
		julVal.add(7);
		julVal.add(6);
		julVal.add(9);
		julVal.add(10);
		julVal.add(0);
		julVal.add(0);
		julVal.add(11);
		julVal.add(17);
		julVal.add(22);

		augVal.add(0);
		augVal.add(1);
		augVal.add(0);
		augVal.add(2);
		augVal.add(0);
		augVal.add(0);
		augVal.add(20);
		augVal.add(10);
		augVal.add(1);
		augVal.add(20);
		augVal.add(24);
		augVal.add(0);
		augVal.add(24);
		augVal.add(16);
		augVal.add(2);
		augVal.add(6);
		augVal.add(24);
		augVal.add(4);
		augVal.add(0);
		augVal.add(0);
		augVal.add(5);
		augVal.add(0);
		augVal.add(7);
		augVal.add(6);
		augVal.add(12);
		augVal.add(10);
		augVal.add(0);
		augVal.add(0);
		augVal.add(11);
		augVal.add(17);
		augVal.add(0);

		sepVal.add(20);
		sepVal.add(1);
		sepVal.add(0);
		sepVal.add(2);
		sepVal.add(0);
		sepVal.add(0);
		sepVal.add(20);
		sepVal.add(10);
		sepVal.add(19);
		sepVal.add(20);
		sepVal.add(24);
		sepVal.add(0);
		sepVal.add(0);
		sepVal.add(16);
		sepVal.add(2);
		sepVal.add(6);
		sepVal.add(24);
		sepVal.add(4);
		sepVal.add(0);
		sepVal.add(0);
		sepVal.add(19);
		sepVal.add(0);
		sepVal.add(7);
		sepVal.add(6);
		sepVal.add(9);
		sepVal.add(10);
		sepVal.add(0);
		sepVal.add(0);
		sepVal.add(11);
		sepVal.add(17);
		sepVal.add(22);

		octVal.add(20);
		octVal.add(1);
		octVal.add(0);
		octVal.add(2);
		octVal.add(0);
		octVal.add(5);
		octVal.add(20);
		octVal.add(10);
		octVal.add(19);
		octVal.add(20);
		octVal.add(24);
		octVal.add(0);
		octVal.add(12);
		octVal.add(16);
		octVal.add(2);
		octVal.add(6);
		octVal.add(24);
		octVal.add(4);
		octVal.add(0);
		octVal.add(16);
		octVal.add(19);
		octVal.add(0);
		octVal.add(7);
		octVal.add(6);
		octVal.add(9);
		octVal.add(0);
		octVal.add(0);
		octVal.add(0);
		octVal.add(11);
		octVal.add(17);
		octVal.add(2);

		novVal.add(20);
		novVal.add(1);
		novVal.add(0);
		novVal.add(2);
		novVal.add(0);
		novVal.add(0);
		novVal.add(20);
		novVal.add(10);
		novVal.add(19);
		novVal.add(20);
		novVal.add(24);
		novVal.add(0);
		novVal.add(0);
		novVal.add(16);
		novVal.add(2);
		novVal.add(6);
		novVal.add(24);
		novVal.add(4);
		novVal.add(0);
		novVal.add(0);
		novVal.add(19);
		novVal.add(0);
		novVal.add(7);
		novVal.add(6);
		novVal.add(9);
		novVal.add(10);
		novVal.add(0);
		novVal.add(0);
		novVal.add(11);
		novVal.add(17);
		novVal.add(22);

		decVal.add(20);
		decVal.add(1);
		decVal.add(0);
		decVal.add(2);
		decVal.add(0);
		decVal.add(0);
		decVal.add(20);
		decVal.add(10);
		decVal.add(19);
		decVal.add(20);
		decVal.add(24);
		decVal.add(0);
		decVal.add(0);
		decVal.add(16);
		decVal.add(2);
		decVal.add(6);
		decVal.add(24);
		decVal.add(4);
		decVal.add(0);
		decVal.add(0);
		decVal.add(19);
		decVal.add(0);
		decVal.add(7);
		decVal.add(6);
		decVal.add(9);
		decVal.add(10);
		decVal.add(0);
		decVal.add(0);
		decVal.add(11);
		decVal.add(17);
		decVal.add(22);

		febVal.add(20);
		febVal.add(1);
		febVal.add(0);
		febVal.add(2);
		febVal.add(0);
		febVal.add(0);
		febVal.add(20);
		febVal.add(10);
		febVal.add(19);
		febVal.add(20);
		febVal.add(24);
		febVal.add(0);
		febVal.add(0);
		febVal.add(16);
		febVal.add(2);
		febVal.add(6);
		febVal.add(24);
		febVal.add(4);
		febVal.add(0);
		febVal.add(0);
		febVal.add(19);
		febVal.add(0);
		febVal.add(7);
		febVal.add(6);
		febVal.add(9);
		febVal.add(10);
		febVal.add(0);
		febVal.add(0);
		febVal.add(11);
		febVal.add(17);
		febVal.add(22);
		
		
		
		
		//Create a task calculator object with the monthly flag as false for 
		//year based contribution chart or true for month based contribution chart.
	
		//Pass the context, activity, monthly flag
		
		t = new TaskCalculator(getApplicationContext(), MainActivity.this,
				false);
		
		
		//Use this method to calculate and show the contributions for the whole year.
		
		t.calculate(janVal, febVal, marVal, aprVal, mayVal, junVal, julVal, augVal, sepVal, octVal, novVal, decVal, 24, 2013);
		
		
		//Use the below method to show contributions for a single month
		
		//**************************************************************
		
		// t.calculateMonthContribution(janVal, 24, 1, 2012);

		
		//**************************************************************
	}

	
	//This method is to set/update the gridview adapter
	
	public void monthlystat(int flag, ArrayList<Integer> a) {

		
		if (flag == 0) {
			
			//Define the gridViewAdapter
			gridAdapter = new GridViewAdapter(this, R.layout.griditem, a);
			
			//Setting the adapter to the gridview
			contibutionView.setAdapter(gridAdapter);
			
		} else {

			gridAdapter.updatedata(a);
			gridAdapter.notifyDataSetChanged();
			
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
