package com.emissor.nfe310.transformers;

import org.simpleframework.xml.transform.Transform;

import com.emissor.nfe310.classes.nota.NFNotaInfoItemIndicadorIncentivoFiscal;

public class NFNotaInfoItemIndicadorIncentivoFiscalTransformer implements Transform<NFNotaInfoItemIndicadorIncentivoFiscal> {

    @Override
    public NFNotaInfoItemIndicadorIncentivoFiscal read(final String codigo) throws Exception {
        return NFNotaInfoItemIndicadorIncentivoFiscal.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemIndicadorIncentivoFiscal incentivoFiscal) throws Exception {
        return incentivoFiscal.getCodigo();
    }
}