package com.ashutosh.random.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ashutosh.random.entities.Random_Table;

@Repository
public interface Random_Table_Repository extends JpaRepository<Random_Table, Integer> {
	@Query("SELECT r FROM Random_Table r WHERE r.rnumber LIKE CONCAT('%',:data,'%')")
	public List<Random_Table> toCheck(@Param("data") String data);
}
