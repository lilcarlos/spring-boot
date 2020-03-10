package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {



    List<User> findByEmail(String email);
    List<User> findByPassword(String password);

}
