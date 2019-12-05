package it.danieltrosko.gastro.controller;

import it.danieltrosko.gastro.dto.WaitressDTO;
import it.danieltrosko.gastro.services.WaitressService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController(value = "/waitress/")
public class WaitressController {
    private WaitressService waitressService;

    public WaitressController(WaitressService waitressService) {
        this.waitressService = waitressService;
    }

    @GetMapping(value = "/getwaitressbyid")
    public WaitressDTO getWaitress(@RequestParam("id") Long id) {
        return waitressService.getById(id);
    }

    @GetMapping(value = "/getbyusername")
    public WaitressDTO getWaitressByUsername(@RequestParam("username") String username) {
        return waitressService.getByUsername(username);
    }

    @PostMapping(value = "/waitress")
    @ResponseStatus(value = HttpStatus.OK)
    public void createOrUpdateWaitress(@ModelAttribute("WaitressDTO") WaitressDTO waitressDTO) {
        waitressService.createOrUpdateWaitress(waitressDTO);
    }
}
