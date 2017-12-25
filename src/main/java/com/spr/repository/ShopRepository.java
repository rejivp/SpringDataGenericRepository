package com.spr.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spr.model.GenericEntity;
import com.spr.model.Shop;


public interface ShopRepository<T extends GenericEntity, ID extends Serializable> extends JpaRepository<T, ID> {

}
