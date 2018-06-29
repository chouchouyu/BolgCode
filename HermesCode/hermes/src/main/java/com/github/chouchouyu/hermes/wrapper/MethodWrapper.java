package com.github.chouchouyu.hermes.wrapper;

import android.os.Parcel;
import android.os.Parcelable;

import com.github.chouchouyu.hermes.annotation.MethodId;
import com.github.chouchouyu.hermes.util.TypeUtils;

import java.lang.reflect.Method;

/**
 * Created by admin on 2018/6/29.
 */

public class MethodWrapper extends BaseWrapper implements Parcelable {

    private TypeWrapper[] mParameterTypes;

    private TypeWrapper mReturnType;

    public MethodWrapper() {
    }

    protected MethodWrapper(Method method) {
        setName(!method.isAnnotationPresent(MethodId.class), TypeUtils.getMethodId(method));
        Class<?>[] classes = method.getParameterTypes();
        if (classes == null) {
            classes = new Class<?>[0];
        }
        int length = classes.length;
        mParameterTypes = new TypeWrapper[length];
        for (int i = 0; i < length; ++i) {
            mParameterTypes[i] = new TypeWrapper(classes[i]);
        }
        mReturnType = new TypeWrapper(method.getReturnType());

    }

    @Override
    public void readFromParcel(Parcel in) {
        super.readFromParcel(in);
        ClassLoader classLoader = MethodWrapper.class.getClassLoader();
        Parcelable[] parcelables = in.readParcelableArray(classLoader);
        if (parcelables == null) {
            mParameterTypes = null;
        } else {
            int length = parcelables.length;
            mParameterTypes = new TypeWrapper[length];
            for (int i = 0; i < length; ++i) {
                mParameterTypes[i] = (TypeWrapper) parcelables[i];
            }
        }
        mReturnType = in.readParcelable(classLoader);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelableArray(mParameterTypes, flags);
        dest.writeParcelable(mReturnType, flags);
    }

    public static final Creator<MethodWrapper> CREATOR = new Creator<MethodWrapper>() {
        @Override
        public MethodWrapper createFromParcel(Parcel in) {
            MethodWrapper methodWrapper = new MethodWrapper();
            methodWrapper.readFromParcel(in);
            return methodWrapper;
        }

        @Override
        public MethodWrapper[] newArray(int size) {
            return new MethodWrapper[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }
}
