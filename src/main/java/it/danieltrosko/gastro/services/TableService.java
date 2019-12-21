package it.danieltrosko.gastro.services;

import it.danieltrosko.gastro.dto.TableDTO;
import it.danieltrosko.gastro.mapper.TableMpper;
import it.danieltrosko.gastro.model.entities.Tables;
import it.danieltrosko.gastro.model.repositories.TableRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TableService {

    private TableRepository tableRepository;

    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List<Tables> getListOfName() {
        List<Tables> listOfTables = tableRepository.findAll();
        List<String> listOfNames = new ArrayList<>();
        for (Tables temp : listOfTables) {
            listOfNames.add(temp.getName());
        }
        return tableRepository.findAll();
    }


    public void createTable(TableDTO tableDTO){
    Tables tables = TableMpper.toEntity(tableDTO);
    tableRepository.save(tables);
    }
}
