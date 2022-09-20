package com.example.jpa2608;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface SampleEntityRepository extends JpaRepository<SampleEntity, String> {

    @Query("SELECT a FROM SampleEntity a")
    Page<SampleEntity> findSampleEntities(Pageable pageable);
}
