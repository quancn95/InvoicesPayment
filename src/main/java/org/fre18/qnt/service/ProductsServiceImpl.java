/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 11:32:05 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.fre18.qnt.service;


import java.util.List;

import javax.transaction.Transactional;

import org.fre18.qnt.entity.Products;
import org.fre18.qnt.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	@Override
	public Products getOne(Integer productId) {
		return productsRepository.getOne(productId);
	}

	@Override
	public Boolean delete(Integer productId) {
		if (productsRepository.getOne(productId) != null) {
			productsRepository.deleteById(productId);
			return true;
		}
		return false;
	}

	@Override
	public Products create(Products products) {
		return productsRepository.save(products);
	}

	@Override
	public Products update(Products productsToUpdate) {
						Products products = productsRepository.getOne(productsToUpdate.getProductId());
										
				/*if(productsToUpdate.getProductsProductId() !=null) {
			
		}*/
				return productsRepository.save(products);
	}

	@Override
	public Boolean exist(Products products) {
						return productsRepository.existsById(products.getProductId());
									}

	@Override
	public List<Products> findAll() {
		return productsRepository.findAll();
	}

}

