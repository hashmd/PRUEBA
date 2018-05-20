/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnicapersistencia;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Vanesa
 */
@Entity
public class Lote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private long referencia;
     /*
    @Temporal(TemporalType.DATE);
    private Date fechaElabor;
    @Temporal(TemporalType.DATE);
    private Date fechaconsumo;
    @OneToMany(mappedBy="lote");
            private List<Producto> productos;
       private int id;
*/
  
    public long getReferencia() {
        return referencia;
    }

    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }

    public Date getFechaElabor() {
        return fechaElabor;
    }

    public void setFechaElabor(Date fechaElabor) {
        this.fechaElabor = fechaElabor;
    }

    public Date getFechaconsumo() {
        return fechaconsumo;
    }

    public void setFechaconsumo(Date fechaconsumo) {
        this.fechaconsumo = fechaconsumo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    /*

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lote)) {
            return false;
        }
        Lote other = (Lote) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carnicapersistencia.Lote[ id=" + id + " ]";
    }
    
*/
}
