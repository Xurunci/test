package com.example.test.bean;

public class productDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pname
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    private String pname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pdesc
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    private String pdesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pname
     *
     * @return the value of product.pname
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    public String getPname() {
        return pname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pname
     *
     * @param pname the value for product.pname
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pdesc
     *
     * @return the value of product.pdesc
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    public String getPdesc() {
        return pdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pdesc
     *
     * @param pdesc the value for product.pdesc
     *
     * @mbg.generated Tue Apr 14 14:28:55 GMT+08:00 2020
     */
    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }
}