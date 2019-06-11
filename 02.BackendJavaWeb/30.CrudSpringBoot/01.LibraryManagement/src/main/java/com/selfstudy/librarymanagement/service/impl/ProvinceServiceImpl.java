package com.selfstudy.librarymanagement.service.impl;

import com.selfstudy.librarymanagement.entity.Province;
import com.selfstudy.librarymanagement.repository.ProvinceRepository;
import com.selfstudy.librarymanagement.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAllProvinces() {
        return provinceRepository.findAll();
    }

//    @Override
//    public Province findByIdProvince(int id) {
//        return provinceRepository.findById(id);
//    }

    @Override
    public void saveProvince(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void removeProvince(int id) {
        provinceRepository.deleteById(id);
    }
}