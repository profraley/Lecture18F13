package com.example.lecture18raley;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity implements View.OnClickListener {
	private Button mBlue, mGreen, mBlack, mRed;
	private View mCanvas;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Need to call this in order to inflate the XML declared in the file layout/activity_main
		//and create a View hierarchy which is composed of actual Java Objects. 
		setContentView(R.layout.activity_main);
		
		//findViewById() searches the View Hierarchy for a View whose id is equal to what is passes in as an argument.
		//findViewById() returns a View Object. If we want to get an actual instance of the correct object type, we need to cast it to that type.
		mBlue = (Button) findViewById(R.id.blue);
		mRed = (Button) findViewById(R.id.red);
		mGreen = (Button) findViewById(R.id.green);
		mBlack = (Button) findViewById(R.id.black);
		mCanvas = findViewById(R.id.canvas);
		
		/******** Click Listener Code ***************/
		//There are multiple ways to create click listeners. Choose whichever method you prefer
		//Please note that Views can only support one click listener at a time. So each time
		//we add a new listener we are removing the old one.
		
		//Method one: Create a OnClickListener Object and store it in a variable
		View.OnClickListener buttonClickListener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Add logic for button
				
			}
		};
		mBlue.setOnClickListener(buttonClickListener);
		mBlack.setOnClickListener(buttonClickListener);
		mRed.setOnClickListener(buttonClickListener);
		mGreen.setOnClickListener(buttonClickListener);
		//End Method One
		
		//Method Two: Anonymous Inner Listener Class
		mBlue.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Add Logic for button.
				//Please note that this listener can only be used for this ONE button.
				//It cannot be shared
			}
		});
		//End Method Two
		
		//Method Three: Make your class implement a the click listener. To do this,
		//you need to the class declaration "public class MainActivity" (see ln 10) to
		//implement the View.OnClickListener. See ln 10 where its says "implements View.OnClickListener".
		//Next, you need to actually implement
		//the method onClick(). The keyword "implements" means this class is agreeing to a contract
		//that it will provide all methods required by the View.OnClickListener interface. If you don't
		//fulfill this contract, you'll get a java error.
		mBlue.setOnClickListener(this);
		mBlack.setOnClickListener(this);
		mRed.setOnClickListener(this);
		mGreen.setOnClickListener(this);
		//End Method Three
		/******** End Click Listener Code ************/
	}
	
	
	@Override
	public void onClick(View v) {

	}
	
}