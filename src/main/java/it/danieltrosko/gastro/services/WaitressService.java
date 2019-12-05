package it.danieltrosko.gastro.services;

import it.danieltrosko.gastro.dto.WaitressDTO;
import it.danieltrosko.gastro.mapper.WaitressMapper;
import it.danieltrosko.gastro.model.entities.Waitress;
import it.danieltrosko.gastro.model.repositories.WaitressRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class WaitressService {
    private WaitressRepository waitressRepository;

    public WaitressService(WaitressRepository waitressRepository) {
        this.waitressRepository = waitressRepository;
    }


    public WaitressDTO getById(Long id) {
        Optional<Waitress> optionalWaitress = waitressRepository.getWaitressById(id);
        WaitressDTO waitressDTO = new WaitressDTO();
        return optionalWaitress.map(WaitressMapper::toDto).orElse(waitressDTO);
    }

    public WaitressDTO getByUsername(String username) {
        Optional<Waitress> waitress = waitressRepository.getWaitressByUsername(username);
        WaitressDTO waitressDTO = new WaitressDTO();
        return waitress.map(WaitressMapper::toDto).orElse(waitressDTO);
    }

    public void createOrUpdateWaitress(WaitressDTO waitressDTO) {
        Waitress waitress = WaitressMapper.toEntity(waitressDTO);
        waitressRepository.save(waitress);
    }
}