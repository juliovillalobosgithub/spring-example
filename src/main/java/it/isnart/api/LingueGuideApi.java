/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package it.isnart.api;

import it.isnart.model.RegistroImprese2018;
import it.isnart.model.ViewLingueGuidePerRegione;
import io.swagger.annotations.*;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-19T10:04:35.057Z")

@Api(value = "LingueGuide", description = "the LingueGuide API")
public interface LingueGuideApi {

    @ApiOperation(value = "Visualizza Lingue Guide per regione", nickname = "getLingueGuideById", notes = "Ottiene una lista di lingue per regione da mostrare", response = ViewLingueGuidePerRegione.class ,responseContainer = "List", tags={ "LingueGuide", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "operazione completata con successo", response = ViewLingueGuidePerRegione.class),
        @ApiResponse(code = 400, message = "ID non valido"),
        @ApiResponse(code = 404, message = "Lingue Guide non trovata") })
    @RequestMapping(value = "/LingueGuide/elenco/{idRegione}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ViewLingueGuidePerRegione>> findLingueGuideById(@ApiParam(value = "ID delle regioni da restituire",required=true) @PathVariable("idRegione") List <Long> idRegione);
    


}
