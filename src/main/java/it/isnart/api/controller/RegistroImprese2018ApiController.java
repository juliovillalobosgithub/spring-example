package it.isnart.api.controller;

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
import it.isnart.api.RegistroImprese2018Api;
import it.isnart.model.RegistroImprese2018;
import it.isnart.service.RegistroImprese2018Service;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

@Controller
public class RegistroImprese2018ApiController implements RegistroImprese2018Api {

    private static final Logger log = LoggerFactory.getLogger(RegistroImprese2018ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
	@Autowired
	private RegistroImprese2018Service registroImprese2018Service;

    @org.springframework.beans.factory.annotation.Autowired
    public RegistroImprese2018ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<RegistroImprese2018>> findRegistroImprese2018(@ApiParam(value = "ID dei comuni da restituire",required=true) @PathVariable("idComune")List <Long> idComune) {
//        String accept = request.getHeader("Accept");
//        //if (accept != null && accept.contains("application/json")) {
//            try {
//            	//TODO prendere regioni da db
//                return new ResponseEntity<List<Regioni>>(objectMapper.readValue("[ {  \"id\" : 0,  \"regione\" : \"regione\"}, {  \"id\" : 0,  \"regione\" : \"regione\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<List<Regioni>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
    	 return new ResponseEntity<List<RegistroImprese2018>>(registroImprese2018Service.tutti(idComune),HttpStatus.OK);
        //}

        //return new ResponseEntity<List<Regioni>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
