package bean;

import java.sql.Time;

import service.Movie;
import service.Seat;

public class Show {

	private int showId;
	private Time showStartTime;
	private Time showEndTime;
	private Seat[] seat;
	private String showName;
	private Movie movieName;
	private int screenId;
	private int theaterId;
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public Time getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(Time showStartTime) {
		this.showStartTime = showStartTime;
	}
	public Time getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(Time showEndTime) {
		this.showEndTime = showEndTime;
	}
	public Seat[] getSeat() {
		return seat;
	}
	public void setSeat(Seat[] seat) {
		this.seat = seat;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Movie getMovieName() {
		return movieName;
	}
	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
}
