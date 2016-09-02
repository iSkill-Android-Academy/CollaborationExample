package ie.iskill.collaborationexample.josh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ie.iskill.collaborationexample.R;

public class JoshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_josh);
    }
    public void onDonateClick(View View){
        goToUrl("https://www.iprt.ie/donation-form");

    }
    public void onIskillClick(View view){
        goToUrl("http://www.iskill.ie/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
