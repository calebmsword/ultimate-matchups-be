package com.example.controllers;

import com.example.entities.MatchupChart;
import com.example.services.MatchupChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matchupchart")
@CrossOrigin
public class MatchupChartController {
    private final MatchupChartService matchupChartService;

    @Autowired
    MatchupChartController(MatchupChartService matchupChartService) {
        this.matchupChartService = matchupChartService;
    }

    @GetMapping("")
    public ResponseEntity<List<MatchupChart>> getAllMatchupCharts() {
        return new ResponseEntity<List<MatchupChart>>(matchupChartService.findAllMatchupCharts(), HttpStatus.OK);
    }
}
