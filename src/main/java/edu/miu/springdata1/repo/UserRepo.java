package edu.miu.springdata1.repo;

import edu.miu.springdata1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    List<User> findAll();

    User findById(int id);

    void deleteById(int id);

    @Query("select u from User u Join u.products p Join p.reviews r where r.numberOfStars>4")
    public List<User> sampleQuery();

}
