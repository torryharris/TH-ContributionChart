package com.thbs.contributionchart;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.example.grid.R;

import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.Toast;

public class TaskCalculator {

	Context ctx;
	
	Button janButton, febButton, marButton, aprButton, mayButton, junButton,
			julButton, augButton, sepButton, octButton, novButton, decButton;
	Activity act;
	
	int flag = 0;
	
	int maxval, year;
	
	ArrayList<Integer> jan;
	ArrayList<Integer> feb;
	ArrayList<Integer> mar;
	ArrayList<Integer> apr;
	ArrayList<Integer> may;
	ArrayList<Integer> jun;
	ArrayList<Integer> jul;
	ArrayList<Integer> aug;
	ArrayList<Integer> sep;
	ArrayList<Integer> oct;
	ArrayList<Integer> nov;
	ArrayList<Integer> dec;
	
	boolean ismonthly;
	
	HorizontalScrollView headerScroll;

	public TaskCalculator(Context applicationContext, Activity act,
			boolean ismonthly) {
		
		ctx = applicationContext;
		
		this.act = act;
		
		this.ismonthly = ismonthly;
		
		headerScroll = (HorizontalScrollView) act
				.findViewById(R.id.horizontalScrollView1);

		if (ismonthly == true) {
			
			headerScroll.setVisibility(View.GONE);
			
		} else {
			
			headerScroll.setVisibility(View.VISIBLE);
			janButton = (Button) act.findViewById(R.id.jan);
			febButton = (Button) act.findViewById(R.id.feb);
			marButton = (Button) act.findViewById(R.id.mar);
			aprButton = (Button) act.findViewById(R.id.apr);
			mayButton = (Button) act.findViewById(R.id.may);
			junButton = (Button) act.findViewById(R.id.jun);
			julButton = (Button) act.findViewById(R.id.jul);
			augButton = (Button) act.findViewById(R.id.aug);
			sepButton = (Button) act.findViewById(R.id.sep);
			octButton = (Button) act.findViewById(R.id.oct);
			novButton = (Button) act.findViewById(R.id.nov);
			decButton = (Button) act.findViewById(R.id.dec);
			
		}
	}

	public ArrayList<Integer> calulateuponmonth(ArrayList<Integer> values,
			int maxval, int month, int year) {

		int firstday = 0;

		// Creating and setting a calender object
		ArrayList<Integer> val = new ArrayList<Integer>();

		val.clear();
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.DATE, 1);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.YEAR, year);

		// Setting first day of the month
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			firstday = 8;
			System.out.println("Sunday " + firstday);
			break;
		case Calendar.MONDAY:
			firstday = 9;
			System.out.println("Monday " + firstday);
			break;
		case Calendar.TUESDAY:
			firstday = 10;
			System.out.println("Tuesday " + firstday);
			break;
		case Calendar.WEDNESDAY:
			firstday = 11;
			System.out.println("Wednesday " + firstday);
			break;
		case Calendar.THURSDAY:
			firstday = 12;
			System.out.println("Thursday " + firstday);
			break;
		case Calendar.FRIDAY:
			firstday = 13;
			System.out.println("Friday " + firstday);
			break;
		case Calendar.SATURDAY:
			firstday = 14;
			System.out.println("Saturday " + firstday);
			break;
		}

		// Getting last day of the month
		int a = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		int k = 0;
		for (int i = 0; i < a + firstday - 1; i++) {

			if (i >= firstday - 1) {
				int temp = values.get(k);
				if (temp != 0) {

					// Calculating the percent value based upon the value from
					// "Values" array and max value
					val.add(i, (temp * 100 / maxval));

				} else {
					val.add(i, 0);
				}
				k++;
			} else {

				val.add(i, -1);
			}

		}
		k = 0;

		return val;

	}

	//Method to calculate and show contributions for a single month
	
	public void calculateMonthContribution(ArrayList<Integer> values,
			int maxval, int month, int year) {
		
		if (ismonthly == true) {
			
			((MainActivity) act).monthlystat(flag,
					calulateuponmonth(values, maxval, month, year));
		
		} else {
			
			Toast.makeText(ctx, "You have selected yearly contribution chart",
					Toast.LENGTH_SHORT).show();
		
		}
	}
	
	
	//Method to calculate the contributions for the whole year

	public void calculate(final ArrayList<Integer> jan,
			final ArrayList<Integer> feb, final ArrayList<Integer> mar,
			final ArrayList<Integer> apr, final ArrayList<Integer> may,
			final ArrayList<Integer> jun, final ArrayList<Integer> jul,
			final ArrayList<Integer> aug, final ArrayList<Integer> sep,
			final ArrayList<Integer> oct, final ArrayList<Integer> nov,
			final ArrayList<Integer> dec, final int maxval, final int year) {

		if (ismonthly == false) {
			if (flag == 0) {

				this.jan = jan;
				this.feb = feb;
				this.mar = mar;
				this.apr = apr;
				this.may = may;
				this.jun = jun;
				this.jul = jul;
				this.aug = aug;
				this.sep = sep;
				this.oct = oct;
				this.nov = nov;
				this.dec = dec;
				this.maxval = maxval;
				this.year = year;

				System.out.println("*********************  in flagval");

				((MainActivity) act).monthlystat(flag,
						calulateuponmonth(this.jan, this.maxval, 0, this.year));
				flag = 1;

			}
			janButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					
					flag = 1;

					
							((MainActivity) act).monthlystat(flag,
									calulateuponmonth(jan, maxval, 0, year));

					

				}
			});
			febButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					

					flag = 1;

					((MainActivity) act).monthlystat(flag,
							calulateuponmonth(feb, maxval, 1, year));

				}
			});
			marButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					

					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(mar,
							maxval, 2, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();

				}
			});
			aprButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					
					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(apr,
							maxval, 3, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();

				}
			});
			mayButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					
					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(may,
							maxval, 4, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();

				}
			});
			junButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					

					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(jun,
							maxval, 5, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();

				}
			});
			julButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					
					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(jul,
							maxval, 6, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();

				}
			});
			augButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					
					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(aug,
							maxval, 7, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();

				}
			});
			sepButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
				

					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(sep,
							maxval, 8, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();

				}
			});
			octButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					

					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(oct,
							maxval, 9, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();
					

				}
			});
			novButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					

					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(nov,
							maxval, 10, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();

				}
			});
			decButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					

					flag = 1;

					((MainActivity) act).gridAdapter.updatedata(calulateuponmonth(dec,
							maxval, 11, year));
					((MainActivity) act).gridAdapter.notifyDataSetChanged();

				}
			});
		} else {
			Toast.makeText(ctx, "You have selected month based chart",
					Toast.LENGTH_SHORT).show();

		}

	}
}
