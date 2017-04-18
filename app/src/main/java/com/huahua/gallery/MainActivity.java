package com.huahua.gallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_GALLERY = 1;
    private GalleryFinal.OnHandlerResultCallback mOnHandlerResultCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //打开相册
        GalleryFinal.openGallerySingle(this,REQUEST_CODE_GALLERY, mOnHandlerResultCallback);
    }

}
