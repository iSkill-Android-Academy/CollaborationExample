package ie.iskill.collaborationexample.eric;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ie.iskill.collaborationexample.R;

public class EricActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eric);
    }

    public void onCAClick(View View){
        goToUrl("http://www.citizensinformation.ie/en/");

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
