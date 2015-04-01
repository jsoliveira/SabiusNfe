package com.nfe.bean;

import com.nfe.model.Empresa;
import com.nfe.tools.Mensagem;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jsoliveira
 */
@SessionScoped
@Named
public class EmpresaBean implements Serializable{

    
    
    @Inject
    private Mensagem mensagem;
    
    
    
    private Empresa empresa;
    
    public void teste(){
    
    
        mensagem.info("Teste");
        
    }
    
    
    
}
