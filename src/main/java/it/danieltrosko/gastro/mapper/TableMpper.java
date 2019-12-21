package it.danieltrosko.gastro.mapper;

import it.danieltrosko.gastro.dto.TableDTO;
import it.danieltrosko.gastro.model.entities.Tables;

public class TableMpper {

    public static Tables toEntity(TableDTO tableDTO) {
        Tables tables = new Tables();
        tables.setId(tableDTO.getId());
        tables.setCreatedOn(tableDTO.getCreatedOn());
        tables.setUpdatedOn(tableDTO.getCreatedOn());
        tables.setName(tableDTO.getName());
        return tables;
    }

    public static TableDTO toDto(Tables tables) {
        TableDTO tableDTO = new TableDTO();
        tableDTO.setId(tables.getId());
        tableDTO.setCreatedOn(tables.getCreatedOn());
        tableDTO.setUpdateOn(tables.getUpdatedOn());
        tableDTO.setName(tables.getName());
        return tableDTO;
    }
}
