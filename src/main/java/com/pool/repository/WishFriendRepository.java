package com.pool.repository;

import java.util.List;

import com.pool.domine.WishFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishFriendRepository extends JpaRepository<WishFriend, Long> {

	public List<WishFriend> findByweWishId(Long weWishId);
}
