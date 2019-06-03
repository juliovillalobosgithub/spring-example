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

import it.isnart.api.ComuniApi;
import it.isnart.model.Comuni;
import it.isnart.model.ViewComuni;
import it.isnart.service.ComuniService;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

@Controller
public class ComuniApiController implements ComuniApi {

    private static final Logger log = LoggerFactory.getLogger(ComuniApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
	@Autowired
	private ComuniService comuniService;

    @org.springframework.beans.factory.annotation.Autowired
    public ComuniApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ViewComuni>> findComuni() {
        //String accept = request.getHeader("Accept");
        //if (accept != null && accept.contains("application/json")) {

               // return new ResponseEntity<List<Comuni>>(objectMapper.readValue("[ {  \"idProvincia\" : 1,  \"comune\" : \"comune\",  \"idComune\" : 0,  \"idRegione\" : 6}, {  \"idProvincia\" : 1,  \"comune\" : \"comune\",  \"idComune\" : 0,  \"idRegione\" : 6} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
          //System.out.println(new ResponseEntity<List<Comuni>>(comuniService.tutti(),HttpStatus.OK));  	
    	return new ResponseEntity<List<ViewComuni>>(comuniService.tutti(),HttpStatus.OK);

       // }

       
    }

    public ResponseEntity<Comuni> getComuneById(
//    		@ApiParam(value = "ID del comune da restituire",required=true) 
    		@PathVariable("comuneId") Long comuneId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Comuni>(objectMapper.readValue("{  \"idProvincia\" : 1,  \"comune\" : \"comune\",  \"idComune\" : 0,  \"idRegione\" : 6}", Comuni.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Comuni>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Comuni>(HttpStatus.NOT_IMPLEMENTED);
    }

}
