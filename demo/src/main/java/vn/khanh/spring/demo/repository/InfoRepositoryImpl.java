package vn.khanh.spring.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vn.khanh.spring.demo.model.Info;

public class InfoRepositoryImpl implements InfoRepository {

    private static final Map<Integer, Info> infos;

    static {
    	infos = new HashMap<>();
    	infos.put(1, new Info(1, "GTFS", "Fender Stratocaster", "Fender Stratocaster"));
    	infos.put(2, new Info(2, "GTFT", "Fender Telecaster","Fender Stratocaster"));
    	infos.put(3, new Info(3, "GTLP", "Gibson Les Paul", "Fender Stratocaster"));
    	infos.put(4, new Info(4, "GTGS", "Gibson SG", "Fender Stratocaster"));
    	infos.put(5, new Info(5, "GTFV", "Gibson Flying V", "Fender Stratocaster"));
    	infos.put(6, new Info(6, "GTSS", "Superstrat", "Fender Stratocaster"));
    }

    @Override
    public List<Info> findAll() {
        return new ArrayList<>(infos.values());
    }

    @Override
    public Info findById(int id) {
        Info info = infos.get(id);
        return info;
    }

    @Override
    public void save(Info info) {
        infos.put(info.getId(), info);
    }
}
