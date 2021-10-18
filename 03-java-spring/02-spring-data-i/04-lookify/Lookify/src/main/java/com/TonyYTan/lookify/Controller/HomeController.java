package com.TonyYTan.lookify.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TonyYTan.lookify.Service.songService;
import com.TonyYTan.lookify.model.Song;

@Controller
public class HomeController {
	private final songService songSer;
	public HomeController (songService songSer) {
		this.songSer = songSer;
	}
	
	@GetMapping("/")
	public String index() {
//		model.addAttribute("allSongs", this.songSer.findAllSongs());
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model, @ModelAttribute("song") Song song, BindingResult result) {
		model.addAttribute("song", this.songSer.findAllSongs());
		return "dashboard.jsp";
	}
	
	@GetMapping("/song/new")
	public String getToNewSongPage(Model model) {
		model.addAttribute("song", this.songSer.findAllSongs());
		return "addnew.jsp";
	}
	
	//add a song
	@PostMapping("/song/new")
	public String addNewSong(@RequestParam(value = "name") String name, @RequestParam (value = "artist") String artist, @RequestParam (value = "rating") Integer rating, @Valid @ModelAttribute("song") Song song, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("song", this.songSer.findAllSongs());
			return "redirect:/song/new";
//			return "redirect:/song/new";
		}
		this.songSer.addSong(name, artist, rating);
		return "redirect:/dashboard";
	}
	
	
	
	@GetMapping("/song/{id}")
	public String detail(@PathVariable (value = "id") Long id, Model model) {
		model.addAttribute("thisSong", this.songSer.findSong(id));
		return "detail.jsp";
	}
	
	
	//delete a song
	@GetMapping("/{id}")
	public String deleteThisSong(@PathVariable(value = "id") Long id) {
		this.songSer.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	//top ten songs
	@GetMapping("/topten")
	public String topTen(Model model) {
		model.addAttribute("songs", this.songSer.topTenByRating());
		return "topten.jsp";
	}
	
	
	//Search
	@PostMapping("/search")
	public String search(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("songs", this.songSer.songsContainingArtist(artist));
		model.addAttribute("artist",artist);
		return "search.jsp";
	}
	
	
	
}
