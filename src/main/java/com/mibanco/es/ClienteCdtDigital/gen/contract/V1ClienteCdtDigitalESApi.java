package com.mibanco.es.ClienteCdtDigital.gen.contract;

import com.mibanco.es.ClienteCdtDigital.gen.type.CrearNovedadClienteCDTInput;
import com.mibanco.es.ClienteCdtDigital.gen.type.NovedadCDTDigitalType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/es/novedadCDTDigital")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-11T12:24:07.999883700-05:00[America/Bogota]")
public interface V1ClienteCdtDigitalESApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<NovedadCDTDigitalType> crearNovedadClienteCDT(@Valid CrearNovedadClienteCDTInput crearNovedadClienteCDTInput);
}
