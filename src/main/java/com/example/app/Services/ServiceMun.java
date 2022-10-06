package com.example.app.Services;

import com.example.app.Models.Municipio;
import com.example.app.Repositories.RepMun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMun {
    private final RepMun repMun;

    @Autowired
    public ServiceMun(RepMun repMun) {
        this.repMun = repMun;
    }

    public List<Municipio> getMunicipio(){
        return repMun.findAll();
    }

}