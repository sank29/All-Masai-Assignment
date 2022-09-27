package com.ques2;

import java.util.Objects;

public class Song {
	private String movieName;
	private String songName;

	public Song(String movieName, String songName) {
		this.movieName = movieName;
		this.songName = songName;
	}

	public void play() {
		System.out.println(songName + " of " + movieName + " is playing...!");
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}

	@Override
	public boolean equals(Object obj) {
		Song s = (Song) obj;
		return (this.movieName.equals(s.getMovieName()) && this.songName.equals(s.getSongName()));
	}

	public String getMovieName() {
		return movieName;
	}

	public String getSongName() {
		return songName;
	}

}
