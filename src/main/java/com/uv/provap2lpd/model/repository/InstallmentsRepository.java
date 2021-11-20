package com.uv.provap2lpd.model.repository;
import com.uv.provap2lpd.model.entity.Installments;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class InstallmentsRepository {
    private JdbcTemplate jdbcTemplate;

    public InstallmentsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Installments search(int id) {
        String sql = "SELECT * FROM installments WHERE id = ?";

        return jdbcTemplate.queryForObject(sql, new InstallmentsMapper(), id);
    }
}
