package com.mibanco.es.ClienteCdtDigital.gen.type;

import com.mibanco.es.ClienteCdtDigital.gen.type.NovedadCDTEnum;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CrearNovedadClienteCDTInput")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-11T12:24:07.999883700-05:00[America/Bogota]")
public class CrearNovedadClienteCDTInput   {
  private @Valid String numeroDocumento;
  private @Valid NovedadCDTEnum codigoNovedad;

  /**
   **/
  public CrearNovedadClienteCDTInput numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

  
  @JsonProperty("numeroDocumento")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  @JsonProperty("numeroDocumento")
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   **/
  public CrearNovedadClienteCDTInput codigoNovedad(NovedadCDTEnum codigoNovedad) {
    this.codigoNovedad = codigoNovedad;
    return this;
  }

  
  @JsonProperty("codigoNovedad")
  public NovedadCDTEnum getCodigoNovedad() {
    return codigoNovedad;
  }

  @JsonProperty("codigoNovedad")
  public void setCodigoNovedad(NovedadCDTEnum codigoNovedad) {
    this.codigoNovedad = codigoNovedad;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrearNovedadClienteCDTInput crearNovedadClienteCDTInput = (CrearNovedadClienteCDTInput) o;
    return Objects.equals(this.numeroDocumento, crearNovedadClienteCDTInput.numeroDocumento) &&
        Objects.equals(this.codigoNovedad, crearNovedadClienteCDTInput.codigoNovedad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroDocumento, codigoNovedad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrearNovedadClienteCDTInput {\n");
    
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    codigoNovedad: ").append(toIndentedString(codigoNovedad)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

