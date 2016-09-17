package western.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void switchToHost(View view){

		Intent hostIntent = new Intent(this, GuestActivity.class);
        startActivity(hostIntent);

	}

    public void switchToGuest(View view){

        Intent guestIntent = new Intent(this, GuestActivity.class);
        startActivity(guestIntent);

    }
}
