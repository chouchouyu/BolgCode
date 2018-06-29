package com.github.chouchouyu.hermes.wrapper;

import android.os.Parcel;
import android.os.Parcelable;

import com.github.chouchouyu.hermes.annotation.ClassId;
import com.github.chouchouyu.hermes.util.TimeStampGenerator;
import com.github.chouchouyu.hermes.util.TypeUtils;

/**
 * Created by admin on 2018/6/29.
 */

public class ObjectWrapper extends BaseWrapper implements Parcelable {

    public static final int TYPE_OBJECT_TO_NEW = 0;
    public static final int TYPE_OBJECT_TO_GET = 1;
    public static final int TYPE_OBJECT = 3;
    public static final int TYPE_CLASS = 4;
    public static final int TYPE_CLASS_TO_GET = 5;

    private long mTimeStamp;

    private int mType;

    //only used here
    private Class<?> mClass;

    public ObjectWrapper() {
    }

    protected ObjectWrapper(Class<?> clazz, int type) {
        setName(!clazz.isAnnotationPresent(ClassId.class), TypeUtils.getClassId(clazz));
        mClass = clazz;
        mTimeStamp = TimeStampGenerator.getTimeStamp();
        mType = type;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeLong(mTimeStamp);
        dest.writeInt(mType);
    }

    public static final Creator<ObjectWrapper> CREATOR = new Creator<ObjectWrapper>() {
        @Override
        public ObjectWrapper createFromParcel(Parcel in) {
            ObjectWrapper objectWrapper = new ObjectWrapper();
            objectWrapper.readFromParcel(in);
            return objectWrapper;
        }

        @Override
        public ObjectWrapper[] newArray(int size) {
            return new ObjectWrapper[size];
        }
    };

    @Override
    public void readFromParcel(Parcel in) {
        super.readFromParcel(in);
        mTimeStamp = in.readLong();
        mType = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
