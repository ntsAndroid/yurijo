package yul62.mission06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener{
    public static final int MAIN_MENU_CODE = 111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button1:
                Intent intent1 = new Intent(getApplicationContext(),CustomerActivity.class);
                startActivityForResult(intent1,MAIN_MENU_CODE);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(getApplicationContext(),SalesActivity.class);
                startActivityForResult(intent2,MAIN_MENU_CODE);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(getApplicationContext(),ProductActivity.class);
                startActivityForResult(intent3,MAIN_MENU_CODE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==MAIN_MENU_CODE){
            if(resultCode==RESULT_OK){
                if(data.getStringExtra("status").toString().equals("menu"))
                    ;
                else if(data.getStringExtra("status").toString().equals("login"))
                    finish();
            }
        }
    }
}