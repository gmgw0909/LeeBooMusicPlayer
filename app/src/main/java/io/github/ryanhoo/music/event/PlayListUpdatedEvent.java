package io.github.ryanhoo.music.event;

import io.github.ryanhoo.music.data.model.PlayList;

/**
 * Created with Android Studio.
 * User: 1003220931@qq.com
 * Date: 9/14/16
 * Time: 1:08 AM
 * Desc: PlayListUpdatedEvent
 */
public class PlayListUpdatedEvent {

    PlayList playList;

    public PlayListUpdatedEvent(PlayList playList) {
        this.playList = playList;
    }
}
