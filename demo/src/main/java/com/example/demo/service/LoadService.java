package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Load;
import com.example.demo.repository.LoadRepository;

import java.util.List;
import java.util.UUID;

@Service
public class LoadService {
    private final LoadRepository loadRepository;

    @Autowired
    public LoadService(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }
    public void addLoad(Load load) {
        load.setId(UUID.randomUUID());
        loadRepository.save(load);
    }

    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }

    public Load getLoadById(UUID loadId) {
        return loadRepository.findById(loadId).orElse(null);
    }

    public Load updateLoad(UUID loadId, Load load) {
        if (loadRepository.existsById(loadId)) {
            load.setId(loadId);
            return loadRepository.save(load);
        }
        return null;
    }

    public void deleteLoad(UUID loadId) {
        loadRepository.deleteById(loadId);
    }
}
