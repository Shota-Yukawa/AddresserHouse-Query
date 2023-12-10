package com.ah.query.apartowner.service;

import org.springframework.stereotype.Service;

import com.ah.querydatasource.entity.apartowner.ApartownersEntity;
import com.ah.querydatasource.repository.apartowner.ApartownerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ApartownerQueryService {

	private final ApartownerRepository rep;
	
	public ApartownersEntity searchById(Integer id) {
		return rep.findById(id).get();
	}
}
