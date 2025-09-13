package developWithAli.pet_care_system.factory;

import developWithAli.pet_care_system.model.User;
import developWithAli.pet_care_system.request.RegistrationRequest;

public class AdminFactory implements UserFactory{
    @Override
    public User createUser(RegistrationRequest request) {
        return null;
    }
}
