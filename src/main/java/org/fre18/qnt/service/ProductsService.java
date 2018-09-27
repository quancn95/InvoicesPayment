/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 11:32:05 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.fre18.qnt.service;

import org.fre18.qnt.entity.Products;
import java.util.List;

public interface ProductsService {

	public Products getOne(Integer productId);

	public List<Products> findAll();

	public Boolean delete(Integer productId);

	public Products create(Products products);

	public Products update(Products products);

	public Boolean exist(Products products);
}
