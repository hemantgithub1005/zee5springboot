package com.zee.zee5app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Series;
import com.zee.zee5app.exception.IdNotFoundException;

@Service
public interface SeriesService {

	public String addSeries(Series series);
	public String updateSeries(String id, Series series);
	public Optional<Series> getSeriesById(String id) throws IdNotFoundException;
	public Optional<List<Series>> getAllSeries();
	public String deleteSeriesById(String id) throws IdNotFoundException;
	
}