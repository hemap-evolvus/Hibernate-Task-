package com.Hiber.Hibernatenew;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {

	@Id
	@Column(name="songid")
	private int songid;
	
	@Column(name="songname")
	private String songName;

	
	
	
	public int getSongid() {
		return songid;
	}
	public void setSongid(int songid) {
		this.songid = songid;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	/*public String getSongartist() {
		return songartist;
	}
	//public void setSongartist(String songartist) {
		this.songartist = songartist;
	}*/
	
}



