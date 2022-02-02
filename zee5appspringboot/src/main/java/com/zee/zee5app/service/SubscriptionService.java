package com.zee.zee5app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.exception.IdNotFoundException;

@Service
public interface SubscriptionService {

	public String addSubscription(Subscription subscription);
	public String deleteSubscription(String id) throws IdNotFoundException;
	public String updateSubscription(String id, Subscription subscription);
	public Optional<Subscription> getSubscriptionById(String id);
	public Optional<List<Subscription>> getAllSubscription();

}