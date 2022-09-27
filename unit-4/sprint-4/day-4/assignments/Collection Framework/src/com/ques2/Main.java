package com.ques2;

public class Main {

	public static void main(String[] args) {
		PlayList playList = new PlayList();
		playList.addSong(new Song("PK", "Chaar Kadam"));
		playList.addSong(new Song("PK", "Chaar Kadam"));
		playList.addSong(new Song("Give Me Some Sunshine", "3 Idiots"));

		playList.playSongs();
	}

}
