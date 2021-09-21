/**
 * Category.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CartService;

public class Category  implements java.io.Serializable {
    private java.lang.String description_Category;

    private int id_Catygory;

    private java.lang.String image_Category;

    private java.lang.String name_Category;

    public Category() {
    }

    public Category(
           java.lang.String description_Category,
           int id_Catygory,
           java.lang.String image_Category,
           java.lang.String name_Category) {
           this.description_Category = description_Category;
           this.id_Catygory = id_Catygory;
           this.image_Category = image_Category;
           this.name_Category = name_Category;
    }


    /**
     * Gets the description_Category value for this Category.
     * 
     * @return description_Category
     */
    public java.lang.String getDescription_Category() {
        return description_Category;
    }


    /**
     * Sets the description_Category value for this Category.
     * 
     * @param description_Category
     */
    public void setDescription_Category(java.lang.String description_Category) {
        this.description_Category = description_Category;
    }


    /**
     * Gets the id_Catygory value for this Category.
     * 
     * @return id_Catygory
     */
    public int getId_Catygory() {
        return id_Catygory;
    }


    /**
     * Sets the id_Catygory value for this Category.
     * 
     * @param id_Catygory
     */
    public void setId_Catygory(int id_Catygory) {
        this.id_Catygory = id_Catygory;
    }


    /**
     * Gets the image_Category value for this Category.
     * 
     * @return image_Category
     */
    public java.lang.String getImage_Category() {
        return image_Category;
    }


    /**
     * Sets the image_Category value for this Category.
     * 
     * @param image_Category
     */
    public void setImage_Category(java.lang.String image_Category) {
        this.image_Category = image_Category;
    }


    /**
     * Gets the name_Category value for this Category.
     * 
     * @return name_Category
     */
    public java.lang.String getName_Category() {
        return name_Category;
    }


    /**
     * Sets the name_Category value for this Category.
     * 
     * @param name_Category
     */
    public void setName_Category(java.lang.String name_Category) {
        this.name_Category = name_Category;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Category)) return false;
        Category other = (Category) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description_Category==null && other.getDescription_Category()==null) || 
             (this.description_Category!=null &&
              this.description_Category.equals(other.getDescription_Category()))) &&
            this.id_Catygory == other.getId_Catygory() &&
            ((this.image_Category==null && other.getImage_Category()==null) || 
             (this.image_Category!=null &&
              this.image_Category.equals(other.getImage_Category()))) &&
            ((this.name_Category==null && other.getName_Category()==null) || 
             (this.name_Category!=null &&
              this.name_Category.equals(other.getName_Category())));
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
        if (getDescription_Category() != null) {
            _hashCode += getDescription_Category().hashCode();
        }
        _hashCode += getId_Catygory();
        if (getImage_Category() != null) {
            _hashCode += getImage_Category().hashCode();
        }
        if (getName_Category() != null) {
            _hashCode += getName_Category().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Category.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://CartService/", "category"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description_Category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description_Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_Catygory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_Catygory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image_Category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image_Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name_Category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name_Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
