package com.spring.springbootproject;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
public class Marvel {
	
	@Id
	private int movie_id;
	private String title;
	private String phase;
	private String edition;
	private String category_name;
	private int release_year;
	private int running_time;
	private String rating_name;
	private String disc_format_name;
	private int number_discs;
	private String viewing_format_name;
	private String aspect_ratio_name;
	private int status;
	private String release_date;
	private String budget;
	private String gross;
	private String time_stamp;
	
	
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public int getRunning_time() {
		return running_time;
	}
	public void setRunning_time(int running_time) {
		this.running_time = running_time;
	}
	public String getRating_name() {
		return rating_name;
	}
	public void setRating_name(String rating_name) {
		this.rating_name = rating_name;
	}
	public String getDisc_format_name() {
		return disc_format_name;
	}
	public void setDisc_format_name(String disc_format_name) {
		this.disc_format_name = disc_format_name;
	}
	public int getNumber_discs() {
		return number_discs;
	}
	public void setNumber_discs(int number_discs) {
		this.number_discs = number_discs;
	}
	public String getViewing_format_name() {
		return viewing_format_name;
	}
	public void setViewing_format_name(String viewing_format_name) {
		this.viewing_format_name = viewing_format_name;
	}
	public String getAspect_ratio_name() {
		return aspect_ratio_name;
	}
	public void setAspect_ratio_name(String aspect_ratio_name) {
		this.aspect_ratio_name = aspect_ratio_name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getGross() {
		return gross;
	}
	public void setGross(String gross) {
		this.gross = gross;
	}
	public String getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}
	public Marvel(int movie_id, String title, String phase, String category_name, int release_year, int running_time,
			String rating_name, String disc_format_name, int number_discs, String viewing_format_name,
			String aspect_ratio_name, int status, String release_date, String budget, String gross, String time_stamp) {
		super();
		this.movie_id = movie_id;
		this.title = title;
		this.phase = phase;
		this.category_name = category_name;
		this.release_year = release_year;
		this.running_time = running_time;
		this.rating_name = rating_name;
		this.disc_format_name = disc_format_name;
		this.number_discs = number_discs;
		this.viewing_format_name = viewing_format_name;
		this.aspect_ratio_name = aspect_ratio_name;
		this.status = status;
		this.release_date = release_date;
		this.budget = budget;
		this.gross = gross;
		this.time_stamp = time_stamp;
	}
	public Marvel() {
		super();
	}
	
	
	

}
