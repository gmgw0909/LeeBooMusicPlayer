package io.github.ryanhoo.music;

import android.content.Context;

/**
 * Created with Android Studio.
 * User: 1003220931@qq.com
 * Date: 9/10/16
 * Time: 4:11 PM
 * Desc: Injection
 */
public class Injection {

    public static Context provideContext() {
        return MusicPlayerApplication.getInstance();
    }
}
