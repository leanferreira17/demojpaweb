package net.leanif17.demojpaweb.interfaces;

import net.leanif17.demojpaweb.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
