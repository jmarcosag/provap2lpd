package com.uv.provap2lpd.model.repository;

import com.uv.provap2lpd.model.entity.Installments;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InstallmentsMapper implements RowMapper<Installments> {

    @Override
    public Installments mapRow(ResultSet result, int i) throws SQLException {
        Installments installments = new Installments();
        installments.setId(result.getInt("id"));
        installments.setCount(result.getInt("count"));
        installments.setValue(result.getFloat("value"));
        return installments;
    }
}
