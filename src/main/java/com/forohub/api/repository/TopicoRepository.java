package com.forohub.api.repository;

import com.forohub.api.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository <Topico, Long>{

}
