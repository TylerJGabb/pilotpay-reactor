package com.gabb.study.persistance.services;

import com.gabb.study.persistance.dao.PilotDao;
import com.gabb.study.persistance.entities.Pilot;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

//turned off, replaced with db.migration using flywaydb
//@Service
@Data
@RequiredArgsConstructor
@Builder
public class DataFillerService {

    private final PilotDao pilotDao;

    @PostConstruct
    @Transactional
    private void fill(){
        var pilot = new Pilot("name", "email", 100);
        pilotDao.save(pilot);
    }
}
