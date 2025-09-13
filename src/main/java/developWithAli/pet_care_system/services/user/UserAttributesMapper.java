package developWithAli.pet_care_system.services.user;


import developWithAli.pet_care_system.model.User;
import developWithAli.pet_care_system.request.RegistrationRequest;

public class UserAttributesMapper {

    public void setCommonAttributes(RegistrationRequest source , User target) {

        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());
        target.setGender(source.getGender());
        target.setPhoneNumber(source.getPhoneNumber());
        target.setEmail(source.getEmail());
        target.setEnabled(source.isEnabled());
        target.setUserType(source.getUserType());

    }
}
