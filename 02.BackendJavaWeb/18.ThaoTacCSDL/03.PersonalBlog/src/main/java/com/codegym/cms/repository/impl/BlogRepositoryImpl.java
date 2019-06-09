package com.codegym.cms.repository.impl;

import com.codegym.cms.model.Blog;
import com.codegym.cms.repository.BlogRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Blog> findAll(){
        TypedQuery<Blog> query = em.createQuery("select c from Blog c", Blog.class);
        return query.getResultList();
    }

    public void save(Blog model){
        if (model.getNameBlog()!= null ){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    public void remove(String nameBlog){
        Blog blog = findByName(nameBlog);
        if(blog !=null){
            em.remove(blog);
        }
    }

    public Blog findByName(String nameBlog){
        TypedQuery<Blog> query = em.createQuery("select c from Blog where c.nameBlog=:nameBlog", Blog.class);
        query.setParameter("nameBlog", nameBlog);
        try{
            return query.getSingleResult();
        } catch (NoResultException e){
            return null;
        }
    }

}
