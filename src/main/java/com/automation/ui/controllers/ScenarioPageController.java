package com.automation.ui.controllers;

import com.automation.ui.service.ScenarioComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scenario/pages")
public class ScenarioPageController {
    @Autowired
    ScenarioComponentService service;
}
