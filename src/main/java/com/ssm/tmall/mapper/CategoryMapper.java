package com.ssm.tmall.mapper;

import com.ssm.tmall.pojo.Category;
import com.ssm.tmall.util.Page;

import java.util.List;

/**
 * Created by LXX on 2019/4/24.
 */
public interface CategoryMapper {

    List<Category> list(Page page);

    int total();
}
