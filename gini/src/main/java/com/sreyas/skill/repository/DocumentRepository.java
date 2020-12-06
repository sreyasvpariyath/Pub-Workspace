package com.sreyas.skill.repository;

import com.sreyas.skill.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


/**
 * Repository class of the documents table
 * Author : Sreyas V Pariyath
 * Date   : 03/12/20
 * Time   : 7:34 PM
 */
@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    Optional<Document> findByUseridAndId(String userid, long id);

    Optional<List<Document>> findByUserid(String userid);
}
