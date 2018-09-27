package com.songhaozhi.mayday.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songhaozhi.mayday.mapper.generator.CategoryMapper;
import com.songhaozhi.mayday.model.domain.Category;
import com.songhaozhi.mayday.service.CategoryService;

/**
* @author 宋浩志
* @createDate 创建时间：2018年9月26日 下午8:40:51
* 
*/
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public List<Category> findCategory() {
		return categoryMapper.selectByExample(null);
	}

	@Override
	public Category findByCategoryId(int categoryId) {
		return categoryMapper.selectByPrimaryKey(categoryId);
	}

	@Override
	public void save(Category category) {
		categoryMapper.insert(category);	
	}

	@Override
	public void update(Category category) {
		categoryMapper.updateByPrimaryKeySelective(category);		
	}

	@Override
	public void delete(int categoryId) {
		categoryMapper.deleteByPrimaryKey(categoryId);		
	}

}
