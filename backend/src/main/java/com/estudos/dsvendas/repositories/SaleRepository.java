package com.estudos.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long> {

}
