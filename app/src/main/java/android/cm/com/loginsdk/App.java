package android.cm.com.loginsdk;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HookUtils hook = new HookUtils(this);
    }
}
