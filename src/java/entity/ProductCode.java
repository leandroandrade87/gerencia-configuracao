/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Leandro
 */
@Entity
@Table(name = "PRODUCT_CODE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductCode.findAll", query = "SELECT p FROM ProductCode p"),
    @NamedQuery(name = "ProductCode.findByProdCode", query = "SELECT p FROM ProductCode p WHERE p.prodCode = :prodCode"),
    @NamedQuery(name = "ProductCode.findByDiscountCode", query = "SELECT p FROM ProductCode p WHERE p.discountCode = :discountCode"),
    @NamedQuery(name = "ProductCode.findByDescription", query = "SELECT p FROM ProductCode p WHERE p.description = :description")})
public class ProductCode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROD_CODE")
    private String prodCode;
    @Basic(optional = false)
    @Column(name = "DISCOUNT_CODE")
    private char discountCode;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCode", fetch = FetchType.LAZY)
    private List<Product> productList;

    public ProductCode() {
    }

    public ProductCode( String prodCode ) {
        this.prodCode = prodCode;
    }

    public ProductCode( String prodCode, char discountCode ) {
        this.prodCode = prodCode;
        this.discountCode = discountCode;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode( String prodCode ) {
        this.prodCode = prodCode;
    }

    public char getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode( char discountCode ) {
        this.discountCode = discountCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList( List<Product> productList ) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodCode != null ? prodCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals( Object object ) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if ( !(object instanceof ProductCode) ) {
            return false;
        }
        ProductCode other = (ProductCode) object;
        if ( (this.prodCode == null && other.prodCode != null) || (this.prodCode != null && !this.prodCode.equals(other.prodCode)) ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ProductCode[ prodCode=" + prodCode + " ]";
    }
    
}
