TH-ContributionChart
====================

![alt text](https://raw.github.com/torryharris/TH-ContributionChart/master/screen1.png "")
![alt text](https://raw.github.com/torryharris/TH-ContributionChart/master/screen2.png "")
##Summary:

Contribution chart is an implementation of the github contribution chart, on android.
The chart is used to show the contribution of a person on a day-to-day basis
in a month. It contains multiple grids, each representing a day of a month. 
The month and year can be set by the developer.The color of the grid changes depending on contribution
made by the person on that particular day. 
The developer needs to know the minimum or ideal contribution that has to be done in a day.
Based on per day actual value and ideal/minimum value of contribution, the taskcalculator calculates the percentage
of work done in a day, which in turn is used as a paramater to fill the grid with a particular color.
This can also be used to show the contributions made through out an year. 
The developer can change the percent-color mapping as per the requirement.

##How to use:

- Deployment target should be Api level 13 or above.

- Layouts:

	- Add the below layout to your main layout
	
		<LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="15dp"
        android:orientation="vertical" >

        <HorizontalScrollView
            android:id="@+id/horizontalScrollView1"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:scrollbars="none" >

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="horizontal" >

                <RadioGroup
                    android:id="@+id/radioGroup1"
                    android:layout_width="fill_parent"
                    android:layout_height="wrap_content"
                    android:checkedButton="@+id/jan"
                    android:orientation="horizontal" >

                    <RadioButton
                        android:id="@+id/jan"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/jan"/>
                    <RadioButton
                        android:id="@+id/feb"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/feb" />

                    <RadioButton
                        android:id="@+id/mar"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/mar"/>
                    <RadioButton
                        android:id="@+id/apr"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text= "@string/apr"/>
                    <RadioButton
                        android:id="@+id/may"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/may"/>
                    <RadioButton
                        android:id="@+id/jun"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/jun"/>
                    <RadioButton
                        android:id="@+id/jul"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/jul"/>

                    <RadioButton
                        android:id="@+id/aug"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/aug"/>

                    <RadioButton
                        android:id="@+id/sep"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/sep"/>
                    <RadioButton
                        android:id="@+id/oct"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/oct"/>
                    <RadioButton
                        android:id="@+id/nov"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/nov"/>

                    <RadioButton
                        android:id="@+id/dec"
                        style="?android:attr/textAppearanceButton"
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:layout_margin="2dp"
                        android:background="@drawable/tab_selector"
                        android:button="@android:color/transparent"
                        android:gravity="center"
                        android:text="@string/dec"/>
                </RadioGroup>
            </LinearLayout>
        </HorizontalScrollView>

        <GridView
            android:id="@+id/gridView1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="17dp"
            android:clickable="false"
            android:focusable="false"
            android:listSelector="#00000000"
            android:numColumns="7" >
        </GridView>
    </LinearLayout>
        	
        	
        	
	- Add `griditem.xml` to your layout folder, copy all the contents of drawable in your drawable folder.
	  Copy style "Singlegradient" to your `style.xml`.
	    	
- Class:
	
	- Add `GridViewAdapter.java` and `TaskCalculator.java` to your project.


##Implementation:

-  Place `monthlystat` method in your main activity. 

- Creating TaskCalculator object:
	
		- Create object of TaskCalculator by passing the context, activity and a boolean value.
		  This boolean value should be false for an year based contribution chart and true for month based 
		  contribution chart.		
			  
			  
			  Ex:
			   	
			   	TaskCalculator t = new TaskCalculator(getApplicationContext(), MainActivity.this,
				false);  // false = chart for an year
						 // true =  chart for a month
				
				
			

-	For yearly contribution chart:

		- Create 12 arraylists of type integer,each corresponding to a month and add the contribution value of 
		  each day of the month to it. If the contribution for a day is null, put '0' as the value for that day.
		
		- Pass the arraylists, minimum/ideal value of contribution and year to the `calculate` method of `TaskCalculator.java`.
			
			Ex:
			
			t.calculate(janVal, febVal, marVal, aprVal, mayVal, junVal, julVal, augVal, sepVal, octVal, novVal, decVal, 24, 2013);
			
			// janval - decval = arrayLists
			
			// 24 = min/ideal contribution value
		
			// 2013 = year
	
	
- For monthly contribution chart:
	
		- Create an arraylist of type integer and add the contribution value of each day of the month to it.
		  If the contribution for a day is null, put '0' as the value for that day.
	

	    -  Pass the arraylist, minimum/ideal value of contribution, month(integer value, ex jan=0,feb=1...) and year
	       to the `calculateMonthContribution` method of `TaskCalculator.java`. 
	
			Ex:
	
			t.calculateMonthContribution(janVal, 24, 1, 2012);
			
		
			// janVal = array
		
			// 24 = min/ideal value of contribution
		
			// 9 = october
		
			// 2013 =year
		



##Customizations:

-  Percent-Color mapping:
	- User can change the percent to color mapping as per the requirement from the GridViewAdapter.java class
	
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
		
		
- Weekday header:

	- The header to the chart, which currently shows the days of the week can be changed as per requirement

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
	 
	

	
