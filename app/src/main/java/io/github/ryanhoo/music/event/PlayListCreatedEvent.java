package io.github.ryanhoo.music.event;

import io.github.ryanhoo.music.data.model.PlayList;

/**
 * Created with Android Studio.
 * User: 1003220931@qq.com
 * Date: 9/10/16
 * Time: 10:36 PM
 * Desc: PlayListCreatedEvent
 */
public class PlayListCreatedEvent {

    public PlayList playList;

    public PlayListCreatedEvent(PlayList playList) {
        this.playList = playList;
    }
}
