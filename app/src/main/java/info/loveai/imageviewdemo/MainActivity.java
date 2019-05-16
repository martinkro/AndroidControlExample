package info.loveai.imageviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_start_second).setOnClickListener(this);
    }

    public void onClick(View v){
        int id = v.getId();
        switch (id){
            case R.id.btn_start_second:
                startActivity(new Intent(this,SecondActivity.class));
                break;
            default:
                break;
        }
    }
}
