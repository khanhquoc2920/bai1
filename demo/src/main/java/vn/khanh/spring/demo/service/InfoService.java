package vn.khanh.spring.demo.service;

import java.util.List;

import vn.khanh.spring.demo.model.Info;

public interface InfoService {
    List<Info> findAll();

    Info findById(int id);

    void save(Info info);
}
