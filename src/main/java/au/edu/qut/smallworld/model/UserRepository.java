package au.edu.qut.smallworld.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by andrew on 25/06/2014.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByUserScreenName(String UserScreenName);
}
