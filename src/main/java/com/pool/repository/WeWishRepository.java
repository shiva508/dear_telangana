package com.pool.repository;

import com.pool.domine.WeWish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeWishRepository extends JpaRepository<WeWish, Long> {

}
