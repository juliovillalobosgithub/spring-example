package it.isnart.api.controller;

import it.isnart.api.AttrattoriApi;
import it.isnart.model.Attrattori;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

@Controller
public class AttrattoriApiController implements AttrattoriApi {

    private static final Logger log = LoggerFactory.getLogger(AttrattoriApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AttrattoriApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Attrattori>> findAttrattori() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Attrattori>>(objectMapper.readValue("[ {  \"idProvincia\" : 1,  \"idComuni\" : 5,  \"idAttrattore\" : 0,  \"attrattore\" : \"attrattore\",  \"idRegione\" : 6}, {  \"idProvincia\" : 1,  \"idComuni\" : 5,  \"idAttrattore\" : 0,  \"attrattore\" : \"attrattore\",  \"idRegione\" : 6} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Attrattori>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Attrattori>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Attrattori> getAttrattoreById(@ApiParam(value = "ID del attrattore da restituire",required=true) @PathVariable("attrattoriId") Long attrattoriId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Attrattori>(objectMapper.readValue("{  \"idProvincia\" : 1,  \"idComuni\" : 5,  \"idAttrattore\" : 0,  \"attrattore\" : \"attrattore\",  \"idRegione\" : 6}", Attrattori.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Attrattori>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Attrattori>(HttpStatus.NOT_IMPLEMENTED);
    }

}
