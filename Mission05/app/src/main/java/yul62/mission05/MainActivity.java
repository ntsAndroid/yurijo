package yul62.mission05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int MENU_CODE = 111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);

        startActivityForResult(intent,MENU_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==MENU_CODE){
            if(resultCode==RESULT_OK) {
                Toast.makeText(getApplicationContext(),"메뉴 : "+
                        data.getStringExtra("menu").toString(),Toast.LENGTH_LONG).show();
            }
        }
    }
}
