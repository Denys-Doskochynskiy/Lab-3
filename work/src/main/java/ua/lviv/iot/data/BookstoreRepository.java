package ua.lviv.iot.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.rest.RestAplication.model.Bookstore;;

@Repository
public interface BookstoreRepository extends JpaRepository<Bookstore, Integer> {

}
