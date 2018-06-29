package com.github.chouchouyu.hermes.wrapper;

import android.os.Parcel;
import android.os.Parcelable;

import com.github.chouchouyu.hermes.annotation.ClassId;
import com.github.chouchouyu.hermes.util.TypeUtils;

/**
 * Created by admin on 2018/6/29.
 */

public class TypeWrapper extends BaseWrapper implements Parcelable {

    public TypeWrapper() {
    }

    protected TypeWrapper(Class<?> clazz) {
        setName(!clazz.isAnnotationPresent(ClassId.class), TypeUtils.getClassId(clazz));
    }

//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//    }

    public static final Creator<TypeWrapper> CREATOR = new Creator<TypeWrapper>() {
        @Override
        public TypeWrapper createFromParcel(Parcel in) {
            TypeWrapper typeWrapper = new TypeWrapper();
            typeWrapper.readFromParcel(in);
            return typeWrapper;
        }

        @Override
        public TypeWrapper[] newArray(int size) {
            return new TypeWrapper[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

//todo
//    public void readFromParcel(Parcel in) {
//        super.readFromParcel(in);
//    }
}
