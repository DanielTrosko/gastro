package it.danieltrosko.gastro.controller;

import it.danieltrosko.gastro.dto.WaitressDTO;
import it.danieltrosko.gastro.services.WaitressService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;


@RestController
@RequestMapping("/waitress")
public class WaitressController {
    private WaitressService waitressService;

    public WaitressController(WaitressService waitressService) {
        this.waitressService = waitressService;
    }



    @PostMapping(value = "/login")
    public boolean login(@RequestParam Map<String, String> param, HttpServletResponse httpServletResponse){
        String username = param.get("username");
        String password = param.get("password");
        WaitressDTO waitressDTO = waitressService.getByUsername(username);
        System.out.println(username);
        System.out.println(password);
        if (waitressDTO.getPassword().equals(password)){
            httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            return true;
        }else {
            httpServletResponse.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            return false;
        }
    }


    @GetMapping(value = "/getwaitressbyid")
    public WaitressDTO getWaitress(@RequestParam("id") Long id) {
        return waitressService.getById(id);
    }

    @GetMapping(value = "/getbyusername")
    public WaitressDTO getWaitressByUsername(@RequestParam("username") String username) {
        return waitressService.getByUsername(username);
    }

    @PostMapping(value = "/addorupdate")
    public String createWaitress(@ModelAttribute("WaitressDTO") WaitressDTO waitressDTO, HttpServletResponse httpServletResponse) {
        if (waitressDTO.getId() == null & waitressDTO.getUsername().equals(waitressService.getUsedUsername(waitressDTO.getUsername())) ) {
            httpServletResponse.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            return "Username is already used";

        } else {
            waitressService.createOrUpdateWaitress(waitressDTO);
            httpServletResponse.setStatus(HttpServletResponse.SC_CREATED);
            return "Waitress has been added or updated";
        }
    }
}
