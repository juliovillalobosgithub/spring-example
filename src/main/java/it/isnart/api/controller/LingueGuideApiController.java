package it.isnart.api.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import it.isnart.api.LingueGuideApi;
import it.isnart.service.LingueGuideService;
import it.isnart.model.ViewLingueGuidePerRegione;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-19T10:04:35.057Z")

@Controller
public class LingueGuideApiController implements LingueGuideApi {

    private static final Logger log = LoggerFactory.getLogger(LingueGuideApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    private LingueGuideService lingueGuideService;

    @org.springframework.beans.factory.annotation.Autowired
    public LingueGuideApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ViewLingueGuidePerRegione>> findLingueGuideById(@ApiParam(value = "ID delle regioni da restituire",required=true) @PathVariable("idRegione")List <Long> idRegione) {
        

        return new ResponseEntity <List<ViewLingueGuidePerRegione>>(lingueGuideService.findLingueGuidaByRegioneId(idRegione), HttpStatus.OK);
    }


}
