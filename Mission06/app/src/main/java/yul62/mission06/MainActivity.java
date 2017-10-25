package yul62.mission06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int MENU_CODE=1;

    public EditText inputId;
    public EditText inputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputId = (EditText)findViewById(R.id.editId);
        inputPassword = (EditText)findViewById(R.id.editPassword);
    }

    public void onButton1Clicked(View v){
        //id, pw 비었으면 알림
        if(inputId.getText().toString().equals("")||inputPassword.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 입력해 주세요.",
                    Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(getApplicationContext(),MainMenuActivity.class);
            startActivityForResult(intent,MENU_CODE);
            inputId.setText("");
            inputPassword.setText("");
        }
    }
}
