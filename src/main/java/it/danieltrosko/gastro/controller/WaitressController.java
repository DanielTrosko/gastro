package it.danieltrosko.gastro.controller;

import it.danieltrosko.gastro.dto.WaitressDTO;
import it.danieltrosko.gastro.services.WaitressService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;


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
    public String createOrUpdateWaitress(@ModelAttribute("WaitressDTO") WaitressDTO waitressDTO, HttpServletResponse httpServletResponse) {
        if (waitressDTO.getUsername().equals(waitressService.getUsedUsername(waitressDTO.getUsername()))) {
            httpServletResponse.setStatus(HttpServletResponse.SC_CONFLICT);
            return "Username is already used";

        } else {
            waitressService.createOrUpdateWaitress(waitressDTO);
            httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            return "Waitress has been added";
        }
    }
}
