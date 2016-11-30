package io.github.ryanhoo.music.event;

import io.github.ryanhoo.music.data.model.Song;

/**
 * Created with Android Studio.
 * User: 1003220931@qq.com
 * Date: 9/5/16
 * Time: 6:32 PM
 * Desc: PlaySongEvent
 */
public class PlaySongEvent {

    public Song song;

    public PlaySongEvent(Song song) {
        this.song = song;
    }
}
