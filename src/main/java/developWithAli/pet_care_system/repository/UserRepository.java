package developWithAli.pet_care_system.repository;


import developWithAli.pet_care_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User , Long> {

    boolean existsByEmail(String email);
}
