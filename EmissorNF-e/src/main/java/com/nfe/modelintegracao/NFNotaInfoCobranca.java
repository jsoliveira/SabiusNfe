package com.nfe.modelintegracao;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoCobranca {

    private NFNotaInfoFatura fatura;

    private List<NFNotaInfoDuplicata> duplicatas;

    public void setFatura(final NFNotaInfoFatura fatura) {
        this.fatura = fatura;
    }

    public void setDuplicatas(final List<NFNotaInfoDuplicata> duplicatas) {

        this.duplicatas = duplicatas;
    }

    public NFNotaInfoFatura getFatura() {
        return this.fatura;
    }

    public List<NFNotaInfoDuplicata> getDuplicatas() {
        return this.duplicatas;
    }
}
