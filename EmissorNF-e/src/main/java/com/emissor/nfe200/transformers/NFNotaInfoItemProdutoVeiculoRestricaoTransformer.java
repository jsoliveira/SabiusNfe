package com.emissor.nfe200.transformers;

import org.simpleframework.xml.transform.Transform;

import com.emissor.nfe200.classes.NFNotaInfoItemProdutoVeiculoRestricao;

class NFNotaInfoItemProdutoVeiculoRestricaoTransformer implements Transform<NFNotaInfoItemProdutoVeiculoRestricao> {
	
	@Override
	public NFNotaInfoItemProdutoVeiculoRestricao read(final String codigo) throws Exception {
		return NFNotaInfoItemProdutoVeiculoRestricao.valueOfCodigo(codigo);
	}
	
	@Override
	public String write(final NFNotaInfoItemProdutoVeiculoRestricao tipo) throws Exception {
		return tipo.getCodigo();
	}
}