package western.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setContentView(R.layout.activity_main);
		setContentView(R.layout.activity_main);

    }

	public void switchToHost(View view){

		//Intent hostIntent = new Intent(this, HostActivity.class);
        //startActivity(hostIntent);

	}

    public void switchToGuest(View view){

        Intent guestIntent = new Intent(this, GuestActivity.class);
        startActivity(guestIntent);

    }
}
