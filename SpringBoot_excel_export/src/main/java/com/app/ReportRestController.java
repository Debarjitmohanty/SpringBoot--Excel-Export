package com.app;

import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportRestController {

	@Autowired
	private ReportService reportService;
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws IOException {
		response.setContentType("application/vnd.ms-excel");
		
		String headerKey="Content-Disposition";
		String headervalue="attachment;filename=courses.xls";
		
		response.setHeader(headerKey, headervalue); 
		
		reportService.generatedExcel(response);
	}
}
