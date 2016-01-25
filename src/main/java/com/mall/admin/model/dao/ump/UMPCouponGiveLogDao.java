package com.mall.admin.model.dao.ump;

import java.util.List;
import java.util.Map;

import com.mall.admin.model.pagination.PaginationInfo;
import com.mall.admin.vo.ump.CouponGive;
import com.mall.admin.vo.ump.CouponGiveLog;



public interface UMPCouponGiveLogDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_batch
     *
     * @mbggenerated Wed Jul 29 16:20:34 CST 2015
     */
    //int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_batch
     *
     * @mbggenerated Wed Jul 29 16:20:34 CST 2015
     */
    int insert(CouponGiveLog record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_batch
     *
     * @mbggenerated Wed Jul 29 16:20:34 CST 2015
     */
    CouponGiveLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_batch
     *
     * @mbggenerated Wed Jul 29 16:20:34 CST 2015
     */
    int updateByPrimaryKeySelective(CouponGiveLog record);
    
    
    List<CouponGiveLog> getList(Map<String,String> param,PaginationInfo paginationInfo);
    
    int updateByCouponGiveIdAndUserId(CouponGiveLog record);
    
    
    List<CouponGiveLog> querySendedCouponGiveLogByCouponGiveId(Long couponGiveId);
}