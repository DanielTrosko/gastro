package it.danieltrosko.gastro.mapper;

import it.danieltrosko.gastro.dto.WaitressDTO;
import it.danieltrosko.gastro.model.entities.Waitress;

public class WaitressMapper {


    public static Waitress toEntity(WaitressDTO waitressDTO) {
        Waitress waitress = new Waitress();
        waitress.setId(waitressDTO.getId());
        waitress.setUsername(waitressDTO.getUsername());
        waitress.setPassword(waitressDTO.getPassword());
        waitress.setFirstName(waitressDTO.getFirstName());
        waitress.setSecondName(waitressDTO.getSecondName());
        waitress.setBalance(waitressDTO.getBalance());
        waitress.setCreatedOn(waitressDTO.getCreatedOn());
        waitress.setUpdatedOn(waitressDTO.getUpdateOn());
        return waitress;
    }

    public static WaitressDTO toDto(Waitress waitress) {
        WaitressDTO waitressDTO = new WaitressDTO();
        waitressDTO.setId(waitress.getId());
        waitressDTO.setUsername(waitress.getUsername());
        waitressDTO.setPassword(waitress.getPassword());
        waitressDTO.setFirstName(waitress.getFirstName());
        waitressDTO.setSecondName(waitress.getSecondName());
        waitressDTO.setBalance(waitress.getBalance());
        waitressDTO.setCreatedOn(waitress.getCreatedOn());
        waitressDTO.setUpdateOn(waitress.getCreatedOn());
        return waitressDTO;
    }
}
