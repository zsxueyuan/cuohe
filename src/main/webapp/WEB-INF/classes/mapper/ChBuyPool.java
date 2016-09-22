import java.math.BigDecimal;
import java.util.Date;

public class ChBuyPool {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.ItemsID
     *
     * @mbggenerated
     */
    private Integer itemsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.customerId
     *
     * @mbggenerated
     */
    private Integer customerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.Quantity
     *
     * @mbggenerated
     */
    private Double quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.Unit
     *
     * @mbggenerated
     */
    private Integer unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.Title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.Context
     *
     * @mbggenerated
     */
    private String context;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.Status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.CreatedAt
     *
     * @mbggenerated
     */
    private Date createdat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.CreatedBy
     *
     * @mbggenerated
     */
    private Integer createdby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.UpdatedAt
     *
     * @mbggenerated
     */
    private Date updatedat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.UpdatedBy
     *
     * @mbggenerated
     */
    private Integer updatedby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.ProStatus
     *
     * @mbggenerated
     */
    private Integer prostatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.commodity_id
     *
     * @mbggenerated
     */
    private Integer commodityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.mall_buy_id
     *
     * @mbggenerated
     */
    private Integer mallBuyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.mall_user_account
     *
     * @mbggenerated
     */
    private String mallUserAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.lastPriceType
     *
     * @mbggenerated
     */
    private Integer lastpricetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.lastPrice
     *
     * @mbggenerated
     */
    private BigDecimal lastprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.lastCustomerId
     *
     * @mbggenerated
     */
    private Integer lastcustomerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.lastMallAccount
     *
     * @mbggenerated
     */
    private String lastmallaccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.lastCustomerName
     *
     * @mbggenerated
     */
    private String lastcustomername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.poolPriceCount
     *
     * @mbggenerated
     */
    private Integer poolpricecount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.lastTime
     *
     * @mbggenerated
     */
    private String lasttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.isConfirm
     *
     * @mbggenerated
     */
    private Integer isconfirm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.orderId
     *
     * @mbggenerated
     */
    private String orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.priceType
     *
     * @mbggenerated
     */
    private Integer pricetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.isClose
     *
     * @mbggenerated
     */
    private Integer isclose;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.ware_province
     *
     * @mbggenerated
     */
    private Integer wareProvince;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.ware_id
     *
     * @mbggenerated
     */
    private String wareId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.ware_name
     *
     * @mbggenerated
     */
    private String wareName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.initPrice
     *
     * @mbggenerated
     */
    private BigDecimal initprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.FuturesMonth
     *
     * @mbggenerated
     */
    private String futuresmonth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ch_buy_pool.initPriceType
     *
     * @mbggenerated
     */
    private Integer initpricetype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.ID
     *
     * @return the value of ch_buy_pool.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.ID
     *
     * @param id the value for ch_buy_pool.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.ItemsID
     *
     * @return the value of ch_buy_pool.ItemsID
     *
     * @mbggenerated
     */
    public Integer getItemsid() {
        return itemsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.ItemsID
     *
     * @param itemsid the value for ch_buy_pool.ItemsID
     *
     * @mbggenerated
     */
    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.customerId
     *
     * @return the value of ch_buy_pool.customerId
     *
     * @mbggenerated
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.customerId
     *
     * @param customerid the value for ch_buy_pool.customerId
     *
     * @mbggenerated
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.Quantity
     *
     * @return the value of ch_buy_pool.Quantity
     *
     * @mbggenerated
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.Quantity
     *
     * @param quantity the value for ch_buy_pool.Quantity
     *
     * @mbggenerated
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.Unit
     *
     * @return the value of ch_buy_pool.Unit
     *
     * @mbggenerated
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.Unit
     *
     * @param unit the value for ch_buy_pool.Unit
     *
     * @mbggenerated
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.Title
     *
     * @return the value of ch_buy_pool.Title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.Title
     *
     * @param title the value for ch_buy_pool.Title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.Context
     *
     * @return the value of ch_buy_pool.Context
     *
     * @mbggenerated
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.Context
     *
     * @param context the value for ch_buy_pool.Context
     *
     * @mbggenerated
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.Status
     *
     * @return the value of ch_buy_pool.Status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.Status
     *
     * @param status the value for ch_buy_pool.Status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.CreatedAt
     *
     * @return the value of ch_buy_pool.CreatedAt
     *
     * @mbggenerated
     */
    public Date getCreatedat() {
        return createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.CreatedAt
     *
     * @param createdat the value for ch_buy_pool.CreatedAt
     *
     * @mbggenerated
     */
    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.CreatedBy
     *
     * @return the value of ch_buy_pool.CreatedBy
     *
     * @mbggenerated
     */
    public Integer getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.CreatedBy
     *
     * @param createdby the value for ch_buy_pool.CreatedBy
     *
     * @mbggenerated
     */
    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.UpdatedAt
     *
     * @return the value of ch_buy_pool.UpdatedAt
     *
     * @mbggenerated
     */
    public Date getUpdatedat() {
        return updatedat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.UpdatedAt
     *
     * @param updatedat the value for ch_buy_pool.UpdatedAt
     *
     * @mbggenerated
     */
    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.UpdatedBy
     *
     * @return the value of ch_buy_pool.UpdatedBy
     *
     * @mbggenerated
     */
    public Integer getUpdatedby() {
        return updatedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.UpdatedBy
     *
     * @param updatedby the value for ch_buy_pool.UpdatedBy
     *
     * @mbggenerated
     */
    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.ProStatus
     *
     * @return the value of ch_buy_pool.ProStatus
     *
     * @mbggenerated
     */
    public Integer getProstatus() {
        return prostatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.ProStatus
     *
     * @param prostatus the value for ch_buy_pool.ProStatus
     *
     * @mbggenerated
     */
    public void setProstatus(Integer prostatus) {
        this.prostatus = prostatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.commodity_id
     *
     * @return the value of ch_buy_pool.commodity_id
     *
     * @mbggenerated
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.commodity_id
     *
     * @param commodityId the value for ch_buy_pool.commodity_id
     *
     * @mbggenerated
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.mall_buy_id
     *
     * @return the value of ch_buy_pool.mall_buy_id
     *
     * @mbggenerated
     */
    public Integer getMallBuyId() {
        return mallBuyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.mall_buy_id
     *
     * @param mallBuyId the value for ch_buy_pool.mall_buy_id
     *
     * @mbggenerated
     */
    public void setMallBuyId(Integer mallBuyId) {
        this.mallBuyId = mallBuyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.mall_user_account
     *
     * @return the value of ch_buy_pool.mall_user_account
     *
     * @mbggenerated
     */
    public String getMallUserAccount() {
        return mallUserAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.mall_user_account
     *
     * @param mallUserAccount the value for ch_buy_pool.mall_user_account
     *
     * @mbggenerated
     */
    public void setMallUserAccount(String mallUserAccount) {
        this.mallUserAccount = mallUserAccount == null ? null : mallUserAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.lastPriceType
     *
     * @return the value of ch_buy_pool.lastPriceType
     *
     * @mbggenerated
     */
    public Integer getLastpricetype() {
        return lastpricetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.lastPriceType
     *
     * @param lastpricetype the value for ch_buy_pool.lastPriceType
     *
     * @mbggenerated
     */
    public void setLastpricetype(Integer lastpricetype) {
        this.lastpricetype = lastpricetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.lastPrice
     *
     * @return the value of ch_buy_pool.lastPrice
     *
     * @mbggenerated
     */
    public BigDecimal getLastprice() {
        return lastprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.lastPrice
     *
     * @param lastprice the value for ch_buy_pool.lastPrice
     *
     * @mbggenerated
     */
    public void setLastprice(BigDecimal lastprice) {
        this.lastprice = lastprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.lastCustomerId
     *
     * @return the value of ch_buy_pool.lastCustomerId
     *
     * @mbggenerated
     */
    public Integer getLastcustomerid() {
        return lastcustomerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.lastCustomerId
     *
     * @param lastcustomerid the value for ch_buy_pool.lastCustomerId
     *
     * @mbggenerated
     */
    public void setLastcustomerid(Integer lastcustomerid) {
        this.lastcustomerid = lastcustomerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.lastMallAccount
     *
     * @return the value of ch_buy_pool.lastMallAccount
     *
     * @mbggenerated
     */
    public String getLastmallaccount() {
        return lastmallaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.lastMallAccount
     *
     * @param lastmallaccount the value for ch_buy_pool.lastMallAccount
     *
     * @mbggenerated
     */
    public void setLastmallaccount(String lastmallaccount) {
        this.lastmallaccount = lastmallaccount == null ? null : lastmallaccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.lastCustomerName
     *
     * @return the value of ch_buy_pool.lastCustomerName
     *
     * @mbggenerated
     */
    public String getLastcustomername() {
        return lastcustomername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.lastCustomerName
     *
     * @param lastcustomername the value for ch_buy_pool.lastCustomerName
     *
     * @mbggenerated
     */
    public void setLastcustomername(String lastcustomername) {
        this.lastcustomername = lastcustomername == null ? null : lastcustomername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.poolPriceCount
     *
     * @return the value of ch_buy_pool.poolPriceCount
     *
     * @mbggenerated
     */
    public Integer getPoolpricecount() {
        return poolpricecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.poolPriceCount
     *
     * @param poolpricecount the value for ch_buy_pool.poolPriceCount
     *
     * @mbggenerated
     */
    public void setPoolpricecount(Integer poolpricecount) {
        this.poolpricecount = poolpricecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.lastTime
     *
     * @return the value of ch_buy_pool.lastTime
     *
     * @mbggenerated
     */
    public String getLasttime() {
        return lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.lastTime
     *
     * @param lasttime the value for ch_buy_pool.lastTime
     *
     * @mbggenerated
     */
    public void setLasttime(String lasttime) {
        this.lasttime = lasttime == null ? null : lasttime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.isConfirm
     *
     * @return the value of ch_buy_pool.isConfirm
     *
     * @mbggenerated
     */
    public Integer getIsconfirm() {
        return isconfirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.isConfirm
     *
     * @param isconfirm the value for ch_buy_pool.isConfirm
     *
     * @mbggenerated
     */
    public void setIsconfirm(Integer isconfirm) {
        this.isconfirm = isconfirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.orderId
     *
     * @return the value of ch_buy_pool.orderId
     *
     * @mbggenerated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.orderId
     *
     * @param orderid the value for ch_buy_pool.orderId
     *
     * @mbggenerated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.priceType
     *
     * @return the value of ch_buy_pool.priceType
     *
     * @mbggenerated
     */
    public Integer getPricetype() {
        return pricetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.priceType
     *
     * @param pricetype the value for ch_buy_pool.priceType
     *
     * @mbggenerated
     */
    public void setPricetype(Integer pricetype) {
        this.pricetype = pricetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.isClose
     *
     * @return the value of ch_buy_pool.isClose
     *
     * @mbggenerated
     */
    public Integer getIsclose() {
        return isclose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.isClose
     *
     * @param isclose the value for ch_buy_pool.isClose
     *
     * @mbggenerated
     */
    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.price
     *
     * @return the value of ch_buy_pool.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.price
     *
     * @param price the value for ch_buy_pool.price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.ware_province
     *
     * @return the value of ch_buy_pool.ware_province
     *
     * @mbggenerated
     */
    public Integer getWareProvince() {
        return wareProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.ware_province
     *
     * @param wareProvince the value for ch_buy_pool.ware_province
     *
     * @mbggenerated
     */
    public void setWareProvince(Integer wareProvince) {
        this.wareProvince = wareProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.ware_id
     *
     * @return the value of ch_buy_pool.ware_id
     *
     * @mbggenerated
     */
    public String getWareId() {
        return wareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.ware_id
     *
     * @param wareId the value for ch_buy_pool.ware_id
     *
     * @mbggenerated
     */
    public void setWareId(String wareId) {
        this.wareId = wareId == null ? null : wareId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.ware_name
     *
     * @return the value of ch_buy_pool.ware_name
     *
     * @mbggenerated
     */
    public String getWareName() {
        return wareName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.ware_name
     *
     * @param wareName the value for ch_buy_pool.ware_name
     *
     * @mbggenerated
     */
    public void setWareName(String wareName) {
        this.wareName = wareName == null ? null : wareName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.initPrice
     *
     * @return the value of ch_buy_pool.initPrice
     *
     * @mbggenerated
     */
    public BigDecimal getInitprice() {
        return initprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.initPrice
     *
     * @param initprice the value for ch_buy_pool.initPrice
     *
     * @mbggenerated
     */
    public void setInitprice(BigDecimal initprice) {
        this.initprice = initprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.FuturesMonth
     *
     * @return the value of ch_buy_pool.FuturesMonth
     *
     * @mbggenerated
     */
    public String getFuturesmonth() {
        return futuresmonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.FuturesMonth
     *
     * @param futuresmonth the value for ch_buy_pool.FuturesMonth
     *
     * @mbggenerated
     */
    public void setFuturesmonth(String futuresmonth) {
        this.futuresmonth = futuresmonth == null ? null : futuresmonth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ch_buy_pool.initPriceType
     *
     * @return the value of ch_buy_pool.initPriceType
     *
     * @mbggenerated
     */
    public Integer getInitpricetype() {
        return initpricetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ch_buy_pool.initPriceType
     *
     * @param initpricetype the value for ch_buy_pool.initPriceType
     *
     * @mbggenerated
     */
    public void setInitpricetype(Integer initpricetype) {
        this.initpricetype = initpricetype;
    }
}