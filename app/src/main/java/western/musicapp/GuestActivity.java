package western.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.youtube.player.YouTubeApiServiceUtil;
import com.google.api.services.youtube.YouTube;

public class GuestActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guest_activity);
	}

	public void getSearchResults(View view)
	{
		String results;
		
	}
}
