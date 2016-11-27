package lab.goldentime.writenforget;

import android.app.Application;

public class WriteNForget extends Application {

    private static WriteNForget appInstance;

    private String mMemo;

    public void onCreate() {
        super.onCreate();
        appInstance = this;
        init();
    }

    private void init() {
        mMemo = "";
    }

    public static WriteNForget getInstance() {
        if(appInstance == null) {
            appInstance = new WriteNForget();
        }

        return appInstance;
    }

    public void saveMemo(String memo) {
        mMemo = memo;
    }

    public String loadMemo() {
        return mMemo;
    }
}
