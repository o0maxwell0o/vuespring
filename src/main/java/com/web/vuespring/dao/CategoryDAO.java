package com.web.vuespring.dao;

import com.web.vuespring.pojo.Category;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
