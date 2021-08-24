package com.matheus.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.matheus.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
