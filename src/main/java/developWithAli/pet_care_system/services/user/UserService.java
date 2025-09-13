package developWithAli.pet_care_system.services.user;


import developWithAli.pet_care_system.model.User;
import developWithAli.pet_care_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public void addUser(User user) {
        userRepository.save(user);
    }






}
