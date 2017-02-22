package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by npickard on 2/22/2017.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}