package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	
	 // ExtentSparkReporter
	//ExtentReports
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\Batch_6_FrameWork\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Report");
		reporter.config().setReportName("Batch 6 Report Name");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Regression_Batch_6");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Version_build", "3.1.0");
		extent.setSystemInfo("QA", "PQR");
		return extent;
		
	}
}
