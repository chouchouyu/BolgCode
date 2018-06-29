package com.github.chouchouyu.hermes.wrapper;

import android.os.Parcel;
import android.os.Parcelable;

import com.github.chouchouyu.hermes.annotation.ClassId;
import com.github.chouchouyu.hermes.util.CodeUtils;
import com.github.chouchouyu.hermes.util.HermesException;
import com.github.chouchouyu.hermes.util.TypeUtils;

/**
 * Created by admin on 2018/6/29.
 */

public class ParameterWrapper extends BaseWrapper implements Parcelable {

    public ParameterWrapper() {
    }

    //only used here.
    private Class<?> mClass;

    private String mObject;

    protected ParameterWrapper(Class<?> clazz, Object object) throws HermesException {
        mClass = clazz;
        setName(!clazz.isAnnotationPresent(ClassId.class), TypeUtils.getClassId(clazz));
        mObject = CodeUtils.encode(object);

    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(mObject);
    }

    public static final Creator<ParameterWrapper> CREATOR = new Creator<ParameterWrapper>() {
        @Override
        public ParameterWrapper createFromParcel(Parcel in) {
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.readFromParcel(in);
            return parameterWrapper;
        }

        @Override
        public ParameterWrapper[] newArray(int size) {
            return new ParameterWrapper[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void readFromParcel(Parcel in) {
        super.readFromParcel(in);
        mObject = in.readString();
    }

    public Class<?> getmClass() {
        return mClass;
    }

    public String getmObject() {
        return mObject;
    }

    public static Creator<ParameterWrapper> getCREATOR() {
        return CREATOR;
    }
}
