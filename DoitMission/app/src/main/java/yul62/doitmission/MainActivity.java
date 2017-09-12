package yul62.doitmission;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import static yul62.doitmission.R.id.imageView1;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    BitmapDrawable bitmap;
    int imageIndex=0;
    int bitmapWidth,bitmapHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);

        Resources res = getResources();
        bitmap = (BitmapDrawable)res.getDrawable(R.drawable.minu);
        bitmapWidth = bitmap.getIntrinsicWidth();
        bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }

    public void onButtonChange1(View v){
        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
        imageView2.setImageDrawable(null);
    }
    public void onButtonChange2(View v){
        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width = bitmapWidth;
        imageView2.getLayoutParams().height = bitmapHeight;
        imageView.setImageDrawable(null);
    }


}
