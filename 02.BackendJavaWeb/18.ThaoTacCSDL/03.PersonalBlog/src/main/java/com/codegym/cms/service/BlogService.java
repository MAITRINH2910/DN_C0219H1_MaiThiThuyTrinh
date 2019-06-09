package com.codegym.cms.service;

import com.codegym.cms.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void remove(String  nameBlog);

    Blog findByName(String nameBlog);
}
