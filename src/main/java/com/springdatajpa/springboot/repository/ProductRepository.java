package com.springdatajpa.springboot.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>
{

	//Product save(Product product);
	List<Product> findByNameContaining(String name);
	/*
	 * return product based on Sql like condition
	 * @param name
	 * @return
	 * 
	 */
	
	List<Product> findByNameLike(String name);
	/*
	 * return products whose price is between start price and end price
	 * @param startprice
	 * @param endprice
	 * @return
	 * 
	 */
	List<Product> findByPriceBetween(BigDecimal startPrice,BigDecimal endPrice);
	
	
	/*
	 * return products whose price is between endDate and endDate
	 * @param startDate
	 * @param endDate
	 * @return
	 * 
	 */
	List<Product> findByDateCreatedBetween(LocalDateTime startDate,LocalDateTime endDate);
	

}
