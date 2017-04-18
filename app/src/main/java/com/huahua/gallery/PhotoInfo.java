package com.huahua.gallery;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * Created by administror on 2017/4/18 0018.
 */

public class PhotoInfo implements Serializable{
    private int photoId;
    private String photoPath;
    private int width;
    private int height;
    public PhotoInfo(){}

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof PhotoInfo)){
            return false;
        }
        PhotoInfo info = (PhotoInfo)obj;
        if(info == null){
            return false;
        }
        return TextUtils.equals(info.getPhotoPath(),getPhotoPath());
    }
}
