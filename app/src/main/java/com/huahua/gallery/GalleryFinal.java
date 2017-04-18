package com.huahua.gallery;

import android.content.Context;
import android.content.Intent;

import java.util.List;

/**
 * Created by administror on 2017/4/18 0018.
 */

public class GalleryFinal {
    private static int mRequestCode;
    private static OnHandlerResultCallback mCallback;
    static Context mContext;
    public static void openGallerySingle(Context context,int requestCode, OnHandlerResultCallback callback){
        mRequestCode = requestCode;
        mContext = context;
        mCallback = callback;
        Intent intent = new Intent(mContext,ShowPhotoActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);
    }
    public static interface OnHandlerResultCallback{
        /**
         *处理成功
         *  @param requestCode
         *  @param resultList
         */
        public void onHandlerSuccess(int requestCode,List<PhotoInfo> resultList);
        /**
         *处理失败或异常
         * @param requestCode
         * @param errorMessage
         * */
        public void onHandlerFailure(int requestCode,String errorMessage);
    }
}
