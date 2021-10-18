package com.TonyYTan.lookify.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonyYTan.lookify.model.Song;

@Repository
public interface songRepository extends CrudRepository<Song, Long> {
	List<Song> findAll(); //select * from songs
	List<Song> findByArtistContaining(String search);
	List<Song> findTop10ByOrderByRatingDesc();
}
