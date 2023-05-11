package com.mibanco.es.ClienteCdtDigital.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets NovedadCDTEnum
 */
public enum NovedadCDTEnum {
  
  E01IDN("e01idn"),
  
  _7943("7943"),
  
  FALTA_DEFINIR("Falta definir"),
  
  _220("220");

  private String value;

  NovedadCDTEnum(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static NovedadCDTEnum fromString(String s) {
      for (NovedadCDTEnum b : NovedadCDTEnum.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NovedadCDTEnum fromValue(String value) {
    for (NovedadCDTEnum b : NovedadCDTEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


