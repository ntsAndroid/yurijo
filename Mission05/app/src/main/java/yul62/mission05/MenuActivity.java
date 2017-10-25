package yul62.mission05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();

        switch(view.getId()){
            case R.id.button1:
                intent.putExtra("menu","고객 관리");
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.button2:
                intent.putExtra("menu","매출 관리");
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.button3:
                intent.putExtra("menu","상품 관리");
                setResult(RESULT_OK,intent);
                finish();
                break;
        }
    }

}
