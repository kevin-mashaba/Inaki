package za.co.inaki.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.inaki.assessment.entity.Interest;

@Repository
public interface InterestRepository extends JpaRepository<Interest, Integer>
{

}
