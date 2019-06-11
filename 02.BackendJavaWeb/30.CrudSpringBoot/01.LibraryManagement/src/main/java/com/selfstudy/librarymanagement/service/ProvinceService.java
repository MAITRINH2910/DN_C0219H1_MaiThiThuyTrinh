package com.selfstudy.librarymanagement.service;

import com.selfstudy.librarymanagement.entity.Province;

public interface ProvinceService {

    Iterable<Province> findAllProvinces();

   // Province findByIdProvince(int id);

    void saveProvince(Province province);

    void removeProvince(int id);
}
