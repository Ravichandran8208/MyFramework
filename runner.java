package com.runner.cucumber;

import org.testng.annotations.Test;

import com.stepdefinitiion.cucumber.EEbase;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src\\main\\java\\com\\testing\\cucumber", glue="com.stepdefinitiion.cucumber", monochrome=true,publish=true)

public class runner extends EEbase  {
	
{

	}

}
