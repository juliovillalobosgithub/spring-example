package it.isnart.api.controller;

import it.isnart.api.AreaProdottoApi;
import it.isnart.api.AttrattoriApi;
import it.isnart.model.AreaProdotto;
import it.isnart.model.Attrattori;
import it.isnart.service.AreaProdottoService;
import it.isnart.service.ComuniService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

@Controller
public class AreaProdottoApiController implements AreaProdottoApi {

    private static final Logger log = LoggerFactory.getLogger(AreaProdottoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
	@Autowired
	private AreaProdottoService areaProdottoService;

    @org.springframework.beans.factory.annotation.Autowired
    public AreaProdottoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<AreaProdotto>> findAreaProdotto() {
        return new ResponseEntity<List<AreaProdotto>>(areaProdottoService.tutti(), HttpStatus.OK);
            
    }

}
