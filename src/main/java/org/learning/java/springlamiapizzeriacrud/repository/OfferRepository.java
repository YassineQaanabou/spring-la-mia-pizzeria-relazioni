package org.learning.java.springlamiapizzeriacrud.repository;

import org.learning.java.springlamiapizzeriacrud.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Integer> {

}