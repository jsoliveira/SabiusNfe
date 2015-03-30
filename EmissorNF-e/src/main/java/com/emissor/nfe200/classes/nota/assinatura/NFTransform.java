package com.emissor.nfe200.classes.nota.assinatura;

import org.simpleframework.xml.Attribute;

import com.emissor.nfe200.classes.NFBase;

public class NFTransform extends NFBase {

    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(final String algorithm) {
        this.algorithm = algorithm;
    }
}
