package yul62.mission06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProductActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Button cMenuBtn = (Button)findViewById(R.id.PMenuBtn);
        cMenuBtn.setOnClickListener(this);

        Button cLgnBtn = (Button)findViewById(R.id.PLgnBtn);
        cLgnBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.PMenuBtn:
                intent.putExtra("status","menu");
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.PLgnBtn:
                intent.putExtra("status","login");
                setResult(RESULT_OK,intent);
                finish();
                break;
        }

    }
}
