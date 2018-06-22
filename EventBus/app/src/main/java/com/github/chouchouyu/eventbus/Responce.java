package com.github.chouchouyu.eventbus;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by susan on 2018/6/21.
 */

public class Responce implements Parcelable {
    protected Responce(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Responce> CREATOR = new Creator<Responce>() {
        @Override
        public Responce createFromParcel(Parcel in) {
            return new Responce(in);
        }

        @Override
        public Responce[] newArray(int size) {
            return new Responce[size];
        }
    };
}
