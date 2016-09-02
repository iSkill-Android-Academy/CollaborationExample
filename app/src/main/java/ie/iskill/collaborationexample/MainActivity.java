package ie.iskill.collaborationexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ie.iskill.collaborationexample.christina.ChristinaActivity;
import ie.iskill.collaborationexample.eric.EricActivity;
import ie.iskill.collaborationexample.ger.GerActivity;
import ie.iskill.collaborationexample.josh.JoshActivity;
import ie.iskill.collaborationexample.tomas.TomasActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.christina_button : intent = new Intent(this, ChristinaActivity.class);break;
            case R.id.eric_button : intent = new Intent(this, EricActivity.class);break;
            case R.id.ger_button : intent = new Intent(this, GerActivity.class); break;
            case R.id.josh_button : intent = new Intent(this, JoshActivity.class); break;
            case R.id.tom_button : intent = new Intent(this, TomasActivity.class); break;
        }
        if(intent != null) {
            startActivity(intent);
        }
    }
}
