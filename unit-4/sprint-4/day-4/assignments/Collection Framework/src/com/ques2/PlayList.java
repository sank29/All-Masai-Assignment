package com.ques2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
//	public Collection<Song> songs = new LinkedHashSet<>();

	public List<Song> songs = new ArrayList<>();

	public void addSong(Song song) {

		if (songs.size() == 0) {
			songs.add(song);
			System.out.println("Song added to the playlist successfully....!");
		} else if (songs.size() != 0) {

			for (Song ss : songs) {

				if (ss.getMovieName().equals(song.getMovieName()) && ss.getSongName().equals(song.getSongName())) {

					System.out.println("Song is already added in the playlist");
					break;

				} else {
					songs.add(song);
					System.out.println("Song added to the playlist successfully....!");
					break;
				}
			}
		}
	}

	public void playSongs() {
		for (Song eachSongs : songs) {
			eachSongs.play();
//			System.out.println(
//					"Song name is " + eachSongs.getSongName() + ". " + "Movie name is " + eachSongs.getMovieName());
		}
	}

}
