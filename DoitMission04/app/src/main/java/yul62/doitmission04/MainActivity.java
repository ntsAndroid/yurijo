package yul62.doitmission04;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        editText = (EditText)findViewById(R.id.editText);


        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                int charNum;
                charNum = editText.getText().length();
                textView.setText(charNum+" / 80 바이트");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        editText.addTextChangedListener(textWatcher);

    }

    public void onButtonSend(View v){
        String str;
        str = editText.getText().toString();
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
    }

    public void onButtonClose(View v){
        finish();
    }
}
