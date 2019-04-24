package com.ssm.tmall.controller;

import com.ssm.tmall.pojo.Category;
import com.ssm.tmall.service.CategoryService;
import com.ssm.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by LXX on 2019/4/24.
 */
@Controller
@RequestMapping(value = "")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("admin_category_list")
    public String list(Model model, Page page){
        List<Category> cs = categoryService.list(page);
        int total = categoryService.total();
        page.setTotal(total);
        model.addAttribute("page",page);
        model.addAttribute("cs",cs);
        return "admin/listCategory";
    }
}
