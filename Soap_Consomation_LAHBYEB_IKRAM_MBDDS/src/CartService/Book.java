/**
 * Book.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CartService;

public class Book  implements java.io.Serializable {
    private CartService.Category book_Catygory;

    private java.lang.String book_Image;

    private java.lang.String book_Name;

    private double book_Price;

    private int book_Stock;

    private java.lang.String book_Summary;

    private int book_id;

    private java.lang.String date_Add_Book;

    private java.lang.String writer_Name;

    public Book() {
    }

    public Book(
           CartService.Category book_Catygory,
           java.lang.String book_Image,
           java.lang.String book_Name,
           double book_Price,
           int book_Stock,
           java.lang.String book_Summary,
           int book_id,
           java.lang.String date_Add_Book,
           java.lang.String writer_Name) {
           this.book_Catygory = book_Catygory;
           this.book_Image = book_Image;
           this.book_Name = book_Name;
           this.book_Price = book_Price;
           this.book_Stock = book_Stock;
           this.book_Summary = book_Summary;
           this.book_id = book_id;
           this.date_Add_Book = date_Add_Book;
           this.writer_Name = writer_Name;
    }


    /**
     * Gets the book_Catygory value for this Book.
     * 
     * @return book_Catygory
     */
    public CartService.Category getBook_Catygory() {
        return book_Catygory;
    }


    /**
     * Sets the book_Catygory value for this Book.
     * 
     * @param book_Catygory
     */
    public void setBook_Catygory(CartService.Category book_Catygory) {
        this.book_Catygory = book_Catygory;
    }


    /**
     * Gets the book_Image value for this Book.
     * 
     * @return book_Image
     */
    public java.lang.String getBook_Image() {
        return book_Image;
    }


    /**
     * Sets the book_Image value for this Book.
     * 
     * @param book_Image
     */
    public void setBook_Image(java.lang.String book_Image) {
        this.book_Image = book_Image;
    }


    /**
     * Gets the book_Name value for this Book.
     * 
     * @return book_Name
     */
    public java.lang.String getBook_Name() {
        return book_Name;
    }


    /**
     * Sets the book_Name value for this Book.
     * 
     * @param book_Name
     */
    public void setBook_Name(java.lang.String book_Name) {
        this.book_Name = book_Name;
    }


    /**
     * Gets the book_Price value for this Book.
     * 
     * @return book_Price
     */
    public double getBook_Price() {
        return book_Price;
    }


    /**
     * Sets the book_Price value for this Book.
     * 
     * @param book_Price
     */
    public void setBook_Price(double book_Price) {
        this.book_Price = book_Price;
    }


    /**
     * Gets the book_Stock value for this Book.
     * 
     * @return book_Stock
     */
    public int getBook_Stock() {
        return book_Stock;
    }


    /**
     * Sets the book_Stock value for this Book.
     * 
     * @param book_Stock
     */
    public void setBook_Stock(int book_Stock) {
        this.book_Stock = book_Stock;
    }


    /**
     * Gets the book_Summary value for this Book.
     * 
     * @return book_Summary
     */
    public java.lang.String getBook_Summary() {
        return book_Summary;
    }


    /**
     * Sets the book_Summary value for this Book.
     * 
     * @param book_Summary
     */
    public void setBook_Summary(java.lang.String book_Summary) {
        this.book_Summary = book_Summary;
    }


    /**
     * Gets the book_id value for this Book.
     * 
     * @return book_id
     */
    public int getBook_id() {
        return book_id;
    }


    /**
     * Sets the book_id value for this Book.
     * 
     * @param book_id
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }


    /**
     * Gets the date_Add_Book value for this Book.
     * 
     * @return date_Add_Book
     */
    public java.lang.String getDate_Add_Book() {
        return date_Add_Book;
    }


    /**
     * Sets the date_Add_Book value for this Book.
     * 
     * @param date_Add_Book
     */
    public void setDate_Add_Book(java.lang.String date_Add_Book) {
        this.date_Add_Book = date_Add_Book;
    }


    /**
     * Gets the writer_Name value for this Book.
     * 
     * @return writer_Name
     */
    public java.lang.String getWriter_Name() {
        return writer_Name;
    }


    /**
     * Sets the writer_Name value for this Book.
     * 
     * @param writer_Name
     */
    public void setWriter_Name(java.lang.String writer_Name) {
        this.writer_Name = writer_Name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.book_Catygory==null && other.getBook_Catygory()==null) || 
             (this.book_Catygory!=null &&
              this.book_Catygory.equals(other.getBook_Catygory()))) &&
            ((this.book_Image==null && other.getBook_Image()==null) || 
             (this.book_Image!=null &&
              this.book_Image.equals(other.getBook_Image()))) &&
            ((this.book_Name==null && other.getBook_Name()==null) || 
             (this.book_Name!=null &&
              this.book_Name.equals(other.getBook_Name()))) &&
            this.book_Price == other.getBook_Price() &&
            this.book_Stock == other.getBook_Stock() &&
            ((this.book_Summary==null && other.getBook_Summary()==null) || 
             (this.book_Summary!=null &&
              this.book_Summary.equals(other.getBook_Summary()))) &&
            this.book_id == other.getBook_id() &&
            ((this.date_Add_Book==null && other.getDate_Add_Book()==null) || 
             (this.date_Add_Book!=null &&
              this.date_Add_Book.equals(other.getDate_Add_Book()))) &&
            ((this.writer_Name==null && other.getWriter_Name()==null) || 
             (this.writer_Name!=null &&
              this.writer_Name.equals(other.getWriter_Name())));
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
        if (getBook_Catygory() != null) {
            _hashCode += getBook_Catygory().hashCode();
        }
        if (getBook_Image() != null) {
            _hashCode += getBook_Image().hashCode();
        }
        if (getBook_Name() != null) {
            _hashCode += getBook_Name().hashCode();
        }
        _hashCode += new Double(getBook_Price()).hashCode();
        _hashCode += getBook_Stock();
        if (getBook_Summary() != null) {
            _hashCode += getBook_Summary().hashCode();
        }
        _hashCode += getBook_id();
        if (getDate_Add_Book() != null) {
            _hashCode += getDate_Add_Book().hashCode();
        }
        if (getWriter_Name() != null) {
            _hashCode += getWriter_Name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Book.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://CartService/", "book"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_Catygory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_Catygory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://CartService/", "category"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_Image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_Image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_Price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_Stock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_Stock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_Summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_Summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Add_Book");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_Add_Book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writer_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "writer_Name"));
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
