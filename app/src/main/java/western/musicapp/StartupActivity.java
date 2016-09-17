package western.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;

import static com.firebase.ui.auth.ui.AcquireEmailHelper.RC_SIGN_IN;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

//        startActivityForResult(
//                // Get an instance of AuthUI based on the default app
//                AuthUI.getInstance().createSignInIntentBuilder().build(),
//                RC_SIGN_IN);

        FirebaseAuth auth = FirebaseAuth.getInstance();
        if(auth.getCurrentUser() != null)
        {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }

        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setProviders(
                                AuthUI.GOOGLE_PROVIDER)
                        .build(),
                RC_SIGN_IN);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
		Toast.makeText(StartupActivity.this, "checking credentials", Toast.LENGTH_SHORT).show();
        if (requestCode == RC_SIGN_IN) {
            if (resultCode == RESULT_OK) {
				Toast.makeText(StartupActivity.this, "User signed in", Toast.LENGTH_SHORT).show();
                // user is signed in!
                startActivity(new Intent(this, MainActivity.class));
                finish();
            } else {
				Toast.makeText(StartupActivity.this, "User didn't sign in", Toast.LENGTH_SHORT).show();
				// user is not signed in. Maybe just wait for the user to press
                // "sign in" again, or show a message
            }
        }
    }
}
