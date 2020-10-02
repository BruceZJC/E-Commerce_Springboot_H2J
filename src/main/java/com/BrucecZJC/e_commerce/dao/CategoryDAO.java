package com.BrucecZJC.e_commerce.dao;

import com.BrucecZJC.e_commerce.pojo.Category;
import com.tdunning.math.stats.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
