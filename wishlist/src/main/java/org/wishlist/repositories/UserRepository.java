package org.wishlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wishlist.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {


}
