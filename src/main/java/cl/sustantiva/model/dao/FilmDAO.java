package cl.sustantiva.model.dao;

import java.util.List;

import cl.sustantiva.model.entity.Film;


public interface FilmDAO {
	public void create(Film actor);
	public List<Film> read();
	public Film read(int filmId);
	public void update(Film film);
	public void delete(int filmId);

}
