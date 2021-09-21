/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package UserService;

public class User  implements java.io.Serializable {
    private java.lang.String date_Add_User;

    private int id_user;

    private int role;

    private java.lang.String user_Name;

    private java.lang.String user_Password;

    private java.lang.String user_login;

    public User() {
    }

    public User(
           java.lang.String date_Add_User,
           int id_user,
           int role,
           java.lang.String user_Name,
           java.lang.String user_Password,
           java.lang.String user_login) {
           this.date_Add_User = date_Add_User;
           this.id_user = id_user;
           this.role = role;
           this.user_Name = user_Name;
           this.user_Password = user_Password;
           this.user_login = user_login;
    }


    /**
     * Gets the date_Add_User value for this User.
     * 
     * @return date_Add_User
     */
    public java.lang.String getDate_Add_User() {
        return date_Add_User;
    }


    /**
     * Sets the date_Add_User value for this User.
     * 
     * @param date_Add_User
     */
    public void setDate_Add_User(java.lang.String date_Add_User) {
        this.date_Add_User = date_Add_User;
    }


    /**
     * Gets the id_user value for this User.
     * 
     * @return id_user
     */
    public int getId_user() {
        return id_user;
    }


    /**
     * Sets the id_user value for this User.
     * 
     * @param id_user
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }


    /**
     * Gets the role value for this User.
     * 
     * @return role
     */
    public int getRole() {
        return role;
    }


    /**
     * Sets the role value for this User.
     * 
     * @param role
     */
    public void setRole(int role) {
        this.role = role;
    }


    /**
     * Gets the user_Name value for this User.
     * 
     * @return user_Name
     */
    public java.lang.String getUser_Name() {
        return user_Name;
    }


    /**
     * Sets the user_Name value for this User.
     * 
     * @param user_Name
     */
    public void setUser_Name(java.lang.String user_Name) {
        this.user_Name = user_Name;
    }


    /**
     * Gets the user_Password value for this User.
     * 
     * @return user_Password
     */
    public java.lang.String getUser_Password() {
        return user_Password;
    }


    /**
     * Sets the user_Password value for this User.
     * 
     * @param user_Password
     */
    public void setUser_Password(java.lang.String user_Password) {
        this.user_Password = user_Password;
    }


    /**
     * Gets the user_login value for this User.
     * 
     * @return user_login
     */
    public java.lang.String getUser_login() {
        return user_login;
    }


    /**
     * Sets the user_login value for this User.
     * 
     * @param user_login
     */
    public void setUser_login(java.lang.String user_login) {
        this.user_login = user_login;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date_Add_User==null && other.getDate_Add_User()==null) || 
             (this.date_Add_User!=null &&
              this.date_Add_User.equals(other.getDate_Add_User()))) &&
            this.id_user == other.getId_user() &&
            this.role == other.getRole() &&
            ((this.user_Name==null && other.getUser_Name()==null) || 
             (this.user_Name!=null &&
              this.user_Name.equals(other.getUser_Name()))) &&
            ((this.user_Password==null && other.getUser_Password()==null) || 
             (this.user_Password!=null &&
              this.user_Password.equals(other.getUser_Password()))) &&
            ((this.user_login==null && other.getUser_login()==null) || 
             (this.user_login!=null &&
              this.user_login.equals(other.getUser_login())));
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
        if (getDate_Add_User() != null) {
            _hashCode += getDate_Add_User().hashCode();
        }
        _hashCode += getId_user();
        _hashCode += getRole();
        if (getUser_Name() != null) {
            _hashCode += getUser_Name().hashCode();
        }
        if (getUser_Password() != null) {
            _hashCode += getUser_Password().hashCode();
        }
        if (getUser_login() != null) {
            _hashCode += getUser_login().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://UserService/", "user"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Add_User");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_Add_User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_Password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_login"));
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
