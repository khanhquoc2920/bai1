package vn.khanh.spring.demo.repository;

import vn.khanh.spring.demo.model.*;
import java.util.List;

public interface InfoRepository {
    List<Info> findAll();

    Info findById(int id);

    void save(Info info);
}
