package com.gabb.study.persistance.services;

import com.gabb.study.persistance.dao.PilotDao;
import com.gabb.study.persistance.entities.Pilot;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

//turned off, replaced with db.migration using flywaydb
//@Service
public class DataFillerService {

    private PilotDao pilotDao;

    public DataFillerService(PilotDao pilotDao) {
        this.pilotDao = pilotDao;
    }

    @PostConstruct
    @Transactional
    private void fill(){
        var pilot = new Pilot("name", "email", 100);
        pilotDao.save(pilot);
    }
}
