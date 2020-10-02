package com.BrucecZJC.e_commerce.service;

import java.util.List;

import com.BrucecZJC.e_commerce.dao.CategoryDAO;
import com.BrucecZJC.e_commerce.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public List<Category> list() {
        Sort sort;
        sort = new Sort(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }
}