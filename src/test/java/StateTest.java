import br.com.oatsolutions.gof.objectscope.behavioral.state.Player;
import br.com.oatsolutions.gof.objectscope.behavioral.state.Song;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * File: StateTest
 * Project: DesignPatterns
 * File Created: 14/04/2021 14:51
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class StateTest {

    @Test
    public void givenAddedSongsToPlaylist_whenPressPlay_ThenPlayCurrentSong() {
        System.out.println("*** TEST 1 ***");
        Player player = new Player();

        Song firstSong = new Song("Nine Symphonie", "Bethoven", null, 0 );
        player.addSong(firstSong);
        Song secondSong = new Song("Il Trovatore", "Giuseppe Verdi", null, 0 );
        player.addSong(secondSong);
        Song thirdSong = new Song("Herr, lehre doch mich", "Johannes " +
                "Brahms", null, 0 );
        player.addSong(thirdSong);
        player.clickPlay();
        player.clickNext();
        player.clickNext();
        Assert.assertEquals(player.getCurrentSong().getName(), "Herr, lehre doch mich");
    }

    @Test
    public void givenPlayerIsPlaying_whenLock_thenPlayerStop() {
        System.out.println("*** TEST 2 ***");
        Player player = new Player();
        Song firstSong = new Song("Nine Syphonie", "Bethoven", null, 0 );
        player.addSong(firstSong);
        player.clickPlay();
        player.clickLock();

        Assert.assertFalse(player.isPlaying());
    }

    @Test
    public void givenPlayerIsReady_whenLock_thenPlayerStop() {
        System.out.println("*** TEST 3 ***");
        Player player = new Player();
        Song firstSong = new Song("Nine Syphonie", "Bethoven", null, 0 );
        player.addSong(firstSong);
        player.clickLock();

        Assert.assertFalse(player.isPlaying());
    }

    @Test
    public void givenPlayerIsReady_whenNext_thenPlayerStop() {
        System.out.println("*** TEST 4 ***");
        Player player = new Player();
        Song firstSong = new Song("Nine Syphonie", "Bethoven", null, 0 );
        player.addSong(firstSong);
        player.clickNext();

        Assert.assertFalse(player.isPlaying());
    }

    @Test
    public void givenPlayerIsStopped_whenPlay_thenPlayerStart() {
        System.out.println("*** TEST 5 ***");
        Player player = new Player();
        Song firstSong = new Song("Nine Syphonie", "Bethoven", null, 0 );
        player.addSong(firstSong);
        player.clickLock();
        player.clickPlay();
        player.clickPlay();

        Assert.assertTrue(player.isPlaying());
    }

    @Test
    public void givenNoSong_whenPlay_thenErrorMessage() {
        System.out.println("*** TEST 6 ***");
        Player player = new Player();
        player.clickPlay();
        Assert.assertFalse(player.isPlaying());
    }
}
