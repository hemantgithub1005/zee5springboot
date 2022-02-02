package com.zee.zee5app.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zee.zee5app.dto.Series;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.repository.SeriesRepository;
import com.zee.zee5app.service.SeriesService;

@Service
public class SeriesServiceImpl implements SeriesService {

	@Autowired
	private SeriesRepository seriesservice;
	
	public SeriesServiceImpl() throws IOException{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String addSeries(Series series) {
		// TODO Auto-generated method stub
		Series series2=seriesservice.save(series);
		if(series2==null)
		{
			return "fail";
		}
		return "success";
	}

	@Override
	public String updateSeries(String id, Series series) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Series> getSeriesById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return seriesservice.findById(id);
	}

	@Override
	public Optional<List<Series>> getAllSeries() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(seriesservice.findAll());
	}

	@Override
	public String deleteSeriesById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Optional<Series> optional=this.getSeriesById(id);
		if(optional.isEmpty())
		{
			return "id not found";
		}
		seriesservice.deleteById(id);
		return "success";
	}
	
	
//	@Override
//	public String addSeries(Series series) {
//		// TODO Auto-generated method stub
//		Series series2=Service.
//	}
//
//	@Override
//	public String updateSeries(String id, Series series) {
//		// TODO Auto-generated method stub
//		return service.updateSeries(id, series);
//	}
//
//	@Override
//	public Optional<Series> getSeriesById(String id) throws IdNotFound {
//		// TODO Auto-generated method stub
//		return service.getSeriesById(id);
//	}
//
//	@Override
//	public Optional<List<Series>> getAllSeries() {
//		// TODO Auto-generated method stub
//		return service.getAllSeries();
//	}
//
//	@Override
//	public String deleteSeriesById(String id) throws IdNotFound {
//		// TODO Auto-generated method stub
//		return service.deleteSeriesById(id);
//	}

}