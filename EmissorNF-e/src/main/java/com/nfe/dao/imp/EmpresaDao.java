package com.nfe.dao.imp;

import com.nfe.model.Empresa;
import java.io.Serializable;
import javax.ejb.Stateless;

/**
 *
 * @author jsoliveira
 */

@Stateless
public class EmpresaDao extends DAOImplementado<String, Empresa> implements Serializable{

    public EmpresaDao() {
        super(Empresa.class);
    }
    
    
    
    
}
