package com.example.icebreaking.controller;

import com.example.icebreaking.ResponseMessage;
import com.example.icebreaking.StatusCode;
import com.example.icebreaking.domain.Communication;
import com.example.icebreaking.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("communication")
public class CommunicationController {
    @Autowired
    private final CommunicationService communicationService;

    public CommunicationController(CommunicationService communicationService) {
        this.communicationService = communicationService;
    }

    @GetMapping("{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<Communication> callCommunication(@PathVariable Long id){
        Communication communication = communicationService.loadCommunicationFromID(id);

        return new CustomizedResponseEntity<Communication>(StatusCode.OK, ResponseMessage.COMMUNICATION_LOAD_SUCCESS,communication);
    }

    @GetMapping("{category}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<List<Communication>> callCommunicationsByCategory(@PathVariable String category){
        List<Communication> communications = communicationService.loadCommunicationsFromCategory(category);
        return new CustomizedResponseEntity<List<Communication>>(StatusCode.OK, ResponseMessage.COMMUNICATION_LOAD_SUCCESS,communications);
    }
}
