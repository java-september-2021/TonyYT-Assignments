package com.TonyYTan.lookify.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TonyYTan.lookify.Repository.songRepository;
import com.TonyYTan.lookify.model.Song;

@Service
public class songService {
	private final songRepository songRepo;

	public songService(songRepository songRepo) {
		this.songRepo = songRepo;
	}
	//list all song
	public List<Song> findAllSongs() {
		return this.songRepo.findAll();
	}
	
	//find a song
	public Song findSong(Long id) {
		return this.songRepo.findById(id).orElse(null);
	}
	
	//add a song
	public Song addSong(String name, String artist, Integer rating) {
		Song song = new Song (name, artist, rating);
		return this.songRepo.save(song);
	}
	
	//update a song
	public Song updateSong(Long id,String name, String artist, Integer rating) {
		Song song = this.songRepo.findById(id).orElse(null);
		song.setName(name);
		song.setArtist(artist);
		song.setRating(rating);
		return this.songRepo.save(song);
	}
	
	
	//delete a song
	public void deleteSong(Long id) {
		Song song = this.songRepo.findById(id).orElse(null);
		this.songRepo.delete(song);
	}
}
