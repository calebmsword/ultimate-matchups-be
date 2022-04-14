package com.example.services;

import com.example.entities.MatchupChart;
import com.example.repositories.MatchupChartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchupChartService {
    private final MatchupChartRepo matchupChartRepo;

    @Autowired
    public MatchupChartService(MatchupChartRepo matchupChartRepo) {
        this.matchupChartRepo = matchupChartRepo;
    }

    public List<MatchupChart> findAllMatchupCharts() {
        return matchupChartRepo.findAll();
    }
}
