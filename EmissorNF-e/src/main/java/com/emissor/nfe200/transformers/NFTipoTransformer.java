package com.emissor.nfe200.transformers;

import org.simpleframework.xml.transform.Transform;

import com.emissor.nfe200.classes.NFTipo;

class NFTipoTransformer implements Transform<NFTipo> {
	
	@Override
	public NFTipo read(final String codigo) throws Exception {
		return NFTipo.valueOfCodigo(codigo);
	}
	
	@Override
	public String write(final NFTipo tipo) throws Exception {
		return tipo.getCodigo();
	}
}