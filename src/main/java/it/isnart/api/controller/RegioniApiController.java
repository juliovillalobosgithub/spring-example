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
import it.isnart.api.RegioniApi;
import it.isnart.model.Regioni;
import it.isnart.service.RegioniService;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

@Controller
public class RegioniApiController implements RegioniApi {

    private static final Logger log = LoggerFactory.getLogger(RegioniApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
	@Autowired
	private RegioniService regioniService;

    @org.springframework.beans.factory.annotation.Autowired
    public RegioniApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Regioni>> findRegioni() {
//        String accept = request.getHeader("Accept");
//        //if (accept != null && accept.contains("application/json")) {
//            try {
//            	//TODO prendere regioni da db
//                return new ResponseEntity<List<Regioni>>(objectMapper.readValue("[ {  \"id\" : 0,  \"regione\" : \"regione\"}, {  \"id\" : 0,  \"regione\" : \"regione\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<List<Regioni>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
    	 return new ResponseEntity<List<Regioni>>(regioniService.findTutti(),HttpStatus.OK);
        //}

        //return new ResponseEntity<List<Regioni>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Regioni> getRegioneById(@ApiParam(value = "ID della regione da restituire",required=true) @PathVariable("regioneId") Long regioneId) {
       // String accept = request.getHeader("Accept");
        //if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Regioni>(objectMapper.readValue("{  \"id\" : "+ regioneId +",  \"regione\" : \"regione\"}", Regioni.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Regioni>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        //}

        //return new ResponseEntity<Regioni>(HttpStatus.NOT_IMPLEMENTED);
    }

}
