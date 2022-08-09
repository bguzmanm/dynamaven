package cl.sustantiva.model.service;

import java.util.List;

import cl.sustantiva.model.dao.FilmDAO;
import cl.sustantiva.model.dao.FilmDAOImpl;
import cl.sustantiva.model.entity.Film;

public class FilmService {

	FilmDAO dao = new FilmDAOImpl();

	public List<Film> read(){
		return dao.read();
	}
	public Film read(int filmId){
		return dao.read(filmId);
	}
	
	public void update(Film film) {
		dao.update(film);
	}
	
	public void create(Film film){
		dao.create(film);
	}
	
	public void delete(int filmId) {
		dao.delete(filmId);
	}

}
