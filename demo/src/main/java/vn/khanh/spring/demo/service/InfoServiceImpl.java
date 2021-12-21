package vn.khanh.spring.demo.service;

import vn.khanh.spring.demo.model.Info;
import vn.khanh.spring.demo.repository.InfoRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InfoServiceImpl implements InfoService {

    @Autowired
    public InfoRepository infoRepository;

    @Override
    public List<Info> findAll() {
        return this.infoRepository.findAll();
    }

    @Override
    public Info findById(int id) {
        return this.infoRepository.findById(id);
    }

    @Override
    public void save(Info info) {
        this.infoRepository.save(info);
    }
}
