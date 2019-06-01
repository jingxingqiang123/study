package com.jxq.service.model;

/**
 * @author JingXingQiang
 * @date 2019/5/31 22:46
 */
public class ItemModel {
    private Integer id;
    // 商品名称
    private String title;

    // 商品价格
    private Double price;

    // 商品的库存
    private Integer stock;

    // 商品的描述
    private String description;

    // 商品的销量
    private Integer sales;

    // 商品描述图片的url
    private String imgUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
