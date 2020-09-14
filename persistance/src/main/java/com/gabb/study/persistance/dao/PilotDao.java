package com.gabb.study.persistance.dao;

import com.gabb.study.persistance.entities.Pilot;
import org.springframework.data.repository.CrudRepository;

/**
 * Automatically comes out of the box with basic rest endpoints
 * for obtaining data
 */
public interface PilotDao extends CrudRepository<Pilot, Long> {}
