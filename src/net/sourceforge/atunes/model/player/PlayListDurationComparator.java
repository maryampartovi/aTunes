package net.sourceforge.atunes.model.player;

import net.sourceforge.atunes.kernel.modules.repository.audio.AudioFile;

import java.util.Comparator;

/**
 * Created by Maryam on 10/11/2015.
 */
public class PlayListDurationComparator implements Comparator {
    public static PlayListDurationComparator comparator = new PlayListDurationComparator();

    public PlayListDurationComparator() {
        super();
    }

    public int compare(Object o1, Object o2) {
        AudioFile f1 = (AudioFile) o1;
        AudioFile f2 = (AudioFile) o2;
        Long dur1 = f1.getDuration();
        Long dur2 = f2.getDuration();
        return dur1.compareTo(dur2);
    }
}