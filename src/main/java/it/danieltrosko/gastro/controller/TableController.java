package it.danieltrosko.gastro.controller;

import java.util.ArrayList;
import java.util.List;
import it.danieltrosko.gastro.dto.TableDTO;
import it.danieltrosko.gastro.model.entities.Tables;
import it.danieltrosko.gastro.services.TableService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/table")
public class TableController {

    private TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping(value = "/getall")
    public List<Tables> getNamesOfTable(HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        return tableService.getListOfName();
    }

    @PostMapping(value = "/add")
    public String addTable(@ModelAttribute("TableDTO") TableDTO tableDTO, HttpServletResponse httpServletResponse) {
        if (tableDTO.getId() == null) {
            tableService.createTable(tableDTO);
            httpServletResponse.setStatus(HttpServletResponse.SC_CREATED);
            return "Created";
        } else {
            httpServletResponse.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            return "Error";
        }
    }
}
