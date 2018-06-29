package com.github.chouchouyu.hermes.internal;

import android.os.Parcel;
import android.os.Parcelable;

import com.github.chouchouyu.hermes.util.CodeUtils;
import com.github.chouchouyu.hermes.util.HermesException;
import com.github.chouchouyu.hermes.util.TypeCenter;
import com.github.chouchouyu.hermes.wrapper.ParameterWrapper;
import com.github.chouchouyu.hermes.wrapper.TypeWrapper;

/**
 * Created by admin on 2018/6/29.
 */

public class Reply implements Parcelable {

    private final static TypeCenter TYPE_CENTER = TypeCenter.getInstance();

    private int mErrorCode;
    private String mErrorMessage;
    private TypeWrapper mClass;
    private Object mResult;

    protected Reply() {
    }

   public Reply(ParameterWrapper parameterWrapper){

    }

    public static final Creator<Reply> CREATOR = new Creator<Reply>() {
        @Override
        public Reply createFromParcel(Parcel in) {
            Reply reply = new Reply();
            reply.readFromParcel(in);
            return reply;
        }

        @Override
        public Reply[] newArray(int size) {
            return new Reply[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(mErrorCode);
        parcel.writeString(mErrorMessage);
        parcel.writeParcelable(mClass, flags);
        try {
            parcel.writeString(CodeUtils.encode(mResult));
        } catch (HermesException e) {
            e.printStackTrace();
        }
    }

    private void readFromParcel(Parcel in) {
        mErrorCode = in.readInt();
        ClassLoader classLoader = Reply.class.getClassLoader();
        mErrorMessage = in.readString();
        mClass = in.readParcelable(classLoader);
        try {
            Class<?> clazz = TYPE_CENTER.getClassType(mClass);
            mResult = CodeUtils.decode(in.readString(), clazz);
        } catch (HermesException e) {
            e.printStackTrace();
        }
    }



}
