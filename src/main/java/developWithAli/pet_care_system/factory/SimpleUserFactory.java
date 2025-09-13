package developWithAli.pet_care_system.factory;

import developWithAli.pet_care_system.exceptions.UserAlreadyExistsException;
import developWithAli.pet_care_system.model.User;
import developWithAli.pet_care_system.repository.UserRepository;
import developWithAli.pet_care_system.request.RegistrationRequest;

public class SimpleUserFactory implements UserFactory {

    private UserRepository userRepository;
    private VeterinarianFactory veterinarianFactory;
    private PatientFactory patientFactory;
    private AdminFactory adminFactory;


    @Override
    public User createUser(RegistrationRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new UserAlreadyExistsException ("Oops! " + request.getEmail() + " already exists!");
        }


        return null;
    }


}
