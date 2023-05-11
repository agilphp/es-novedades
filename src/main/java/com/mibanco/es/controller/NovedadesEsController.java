package com.mibanco.es.controller;

import com.mibanco.es.ClienteCdtDigital.gen.contract.V1ClienteCdtDigitalESApi;
import com.mibanco.es.ClienteCdtDigital.gen.type.CrearNovedadClienteCDTInput;
import com.mibanco.es.ClienteCdtDigital.gen.type.NovedadCDTDigitalType;
import com.mibanco.es.service.impl.NovedadClienteCDTServiceImpl;
import com.mibanco.es.utils.ApplicationException;
import com.mibanco.es.utils.NovedadValidator;

import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.mibanco.es.constants.Constant.ERROR_SERVICIO;

public class NovedadesEsController implements V1ClienteCdtDigitalESApi {

    private static final Logger LOG = LoggerFactory.getLogger(NovedadesEsController.class);

    @Inject
    NovedadValidator novedadValidator;

    @Inject
    NovedadClienteCDTServiceImpl novedadClienteCDTServiceImpl;


    @Override
    public List<NovedadCDTDigitalType> crearNovedadClienteCDT(CrearNovedadClienteCDTInput crearNovedadClienteCDTInput) {
        LOG.info("Inicia crearNovedadClienteCdtDigital");
        // novedadValidator.verificarDatosClienteCdtDigital(crearNovedadClienteCDTInput);

        try {

            Object clienteCDTDigitalType = novedadClienteCDTServiceImpl.crearNovedadClienteCDT(crearNovedadClienteCDTInput);

            LOG.info("Termina crearNovedadClienteCdtDigital");
            return (List<NovedadCDTDigitalType>) clienteCDTDigitalType;

        } catch (ApplicationException e) {

            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());

        }
    }
}
