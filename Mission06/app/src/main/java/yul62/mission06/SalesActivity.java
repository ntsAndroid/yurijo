package yul62.mission06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SalesActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);
        Button cMenuBtn = (Button)findViewById(R.id.SMenuBtn);
        cMenuBtn.setOnClickListener(this);

        Button cLgnBtn = (Button)findViewById(R.id.SLgnBtn);
        cLgnBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.SMenuBtn:
                intent.putExtra("status","menu");
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.SLgnBtn:
                intent.putExtra("status","login");
                setResult(RESULT_OK,intent);
                finish();
                break;
        }

    }
}
