package com.example.ebuyer.controller;

import com.example.ebuyer.client.ApiException;
import com.example.ebuyer.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService service;

    @GetMapping("/excel")
    public ResponseEntity<?> getExcelReport() throws ApiException {
//        HttpHeaders headers = createHeaders();
        service.createExcelReport();
        return ResponseEntity.ok("200");
    }

    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        // for .xlsx file
        headers.setContentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));

        return headers;
    }
}
