package com.ssm.tmall.service.impl;

import com.ssm.tmall.mapper.CategoryMapper;
import com.ssm.tmall.pojo.Category;
import com.ssm.tmall.service.CategoryService;
import com.ssm.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LXX on 2019/4/24.
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);
    }

    @Override
    public int total() {
        return categoryMapper.total();
    }
}
