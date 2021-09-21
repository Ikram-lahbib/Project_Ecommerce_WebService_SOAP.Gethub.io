/**
 * Cart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CartService;

public class Cart  implements java.io.Serializable {
    private int id_Cart;

    private int id_User;

    private java.lang.String image_book;

    private java.lang.String name_book;

    private double price_book;

    public Cart() {
    }

    public Cart(
           int id_Cart,
           int id_User,
           java.lang.String image_book,
           java.lang.String name_book,
           double price_book) {
           this.id_Cart = id_Cart;
           this.id_User = id_User;
           this.image_book = image_book;
           this.name_book = name_book;
           this.price_book = price_book;
    }


    /**
     * Gets the id_Cart value for this Cart.
     * 
     * @return id_Cart
     */
    public int getId_Cart() {
        return id_Cart;
    }


    /**
     * Sets the id_Cart value for this Cart.
     * 
     * @param id_Cart
     */
    public void setId_Cart(int id_Cart) {
        this.id_Cart = id_Cart;
    }


    /**
     * Gets the id_User value for this Cart.
     * 
     * @return id_User
     */
    public int getId_User() {
        return id_User;
    }


    /**
     * Sets the id_User value for this Cart.
     * 
     * @param id_User
     */
    public void setId_User(int id_User) {
        this.id_User = id_User;
    }


    /**
     * Gets the image_book value for this Cart.
     * 
     * @return image_book
     */
    public java.lang.String getImage_book() {
        return image_book;
    }


    /**
     * Sets the image_book value for this Cart.
     * 
     * @param image_book
     */
    public void setImage_book(java.lang.String image_book) {
        this.image_book = image_book;
    }


    /**
     * Gets the name_book value for this Cart.
     * 
     * @return name_book
     */
    public java.lang.String getName_book() {
        return name_book;
    }


    /**
     * Sets the name_book value for this Cart.
     * 
     * @param name_book
     */
    public void setName_book(java.lang.String name_book) {
        this.name_book = name_book;
    }


    /**
     * Gets the price_book value for this Cart.
     * 
     * @return price_book
     */
    public double getPrice_book() {
        return price_book;
    }


    /**
     * Sets the price_book value for this Cart.
     * 
     * @param price_book
     */
    public void setPrice_book(double price_book) {
        this.price_book = price_book;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cart)) return false;
        Cart other = (Cart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id_Cart == other.getId_Cart() &&
            this.id_User == other.getId_User() &&
            ((this.image_book==null && other.getImage_book()==null) || 
             (this.image_book!=null &&
              this.image_book.equals(other.getImage_book()))) &&
            ((this.name_book==null && other.getName_book()==null) || 
             (this.name_book!=null &&
              this.name_book.equals(other.getName_book()))) &&
            this.price_book == other.getPrice_book();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getId_Cart();
        _hashCode += getId_User();
        if (getImage_book() != null) {
            _hashCode += getImage_book().hashCode();
        }
        if (getName_book() != null) {
            _hashCode += getName_book().hashCode();
        }
        _hashCode += new Double(getPrice_book()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://CartService/", "cart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_Cart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_Cart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_User");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image_book");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image_book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name_book");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name_book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_book");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
