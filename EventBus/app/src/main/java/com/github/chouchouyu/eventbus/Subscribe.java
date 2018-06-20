package com.github.chouchouyu.eventbus;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by admin on 2018/6/20.
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface Subscribe {
    ThreadMode thredMode() default ThreadMode.PostThread;
}
