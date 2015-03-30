package com.emissor.nfe200.classes.nota.assinatura;

import org.simpleframework.xml.Element;

import com.emissor.nfe200.classes.NFBase;

public class NFKeyInfo extends NFBase {

    @Element(name = "X509Data", required = false)
    private NFX509Data data;

    public void setData(final NFX509Data data) {
        this.data = data;
    }

    public NFX509Data getData() {
        return this.data;
    }
}