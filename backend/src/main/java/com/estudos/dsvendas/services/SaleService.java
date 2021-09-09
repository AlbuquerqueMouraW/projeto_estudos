package com.estudos.dsvendas.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.estudos.dsvendas.dto.SaleDTO;
import com.estudos.dsvendas.entities.Sale;
import com.estudos.dsvendas.repositories.SaleRepository;
import com.estudos.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageble){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageble);
		return result.map(x -> new SaleDTO(x));
	}
	
}
