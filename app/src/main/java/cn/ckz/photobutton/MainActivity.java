package cn.ckz.photobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


import cn.ckz.takephotoview.TakePhotoButton;


public class MainActivity extends AppCompatActivity {


    private TakePhotoButton buttontake;
    private TakePhotoButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buttontake = (TakePhotoButton) findViewById(R.id.button_take);
        button = (TakePhotoButton) findViewById(R.id.normal_btn);
        buttontake.setOnProgressTouchListener(new TakePhotoButton.OnProgressTouchListener() {
            @Override
            public void onClick(TakePhotoButton photoButton) {
                Toast.makeText(MainActivity.this,"单机",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(TakePhotoButton photoButton) {
                Toast.makeText(MainActivity.this,"长按",Toast.LENGTH_SHORT).show();
                buttontake.start();

            }

            @Override
            public void onLongClickUp(TakePhotoButton photoButton) {
                onFinish();
            }


            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"录制结束",Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnProgressTouchListener(new TakePhotoButton.OnProgressTouchListener() {
            @Override
            public void onClick(TakePhotoButton photoButton) {
                Toast.makeText(MainActivity.this,"单机",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(TakePhotoButton photoButton) {
                Toast.makeText(MainActivity.this,"长按",Toast.LENGTH_SHORT).show();
                button.start();

            }

            @Override
            public void onLongClickUp(TakePhotoButton photoButton) {
                onFinish();
            }


            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"录制结束",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
