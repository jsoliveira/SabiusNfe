package com.emissor.nfe200.transformers;

import org.simpleframework.xml.transform.Transform;

import com.emissor.nfe200.classes.NFNotaInfoEspecieVeiculo;

public class NFNotaInfoEspecieVeiculoTransformer implements Transform<NFNotaInfoEspecieVeiculo> {

    @Override
    public NFNotaInfoEspecieVeiculo read(final String codigoEspecieVeiculo) throws Exception {
        return NFNotaInfoEspecieVeiculo.valueOfCodigo(codigoEspecieVeiculo);
    }

    @Override
    public String write(final NFNotaInfoEspecieVeiculo especieVeiculo) throws Exception {
        return especieVeiculo.getCodigo();
    }
}