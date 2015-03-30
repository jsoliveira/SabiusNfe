package com.emissor.nfe200.transformers;

import org.simpleframework.xml.transform.Transform;

import com.emissor.nfe200.classes.NFTipoEmissao;

class NFTipoEmissaoTransformer implements Transform<NFTipoEmissao> {
	
	@Override
	public NFTipoEmissao read(final String codigo) throws Exception {
		return NFTipoEmissao.valueOfCodigo(codigo);
	}
	
	@Override
	public String write(final NFTipoEmissao tipo) throws Exception {
		return tipo.getCodigo();
	}
}