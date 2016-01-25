package com.mall.admin.vo.couponRule;

import com.mall.admin.vo.couponRule.CouponRegion;
import com.mall.admin.vo.couponRule.CouponRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    int countByExample(CouponRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    int deleteByExample(CouponRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    int deleteByPrimaryKey(Integer couponRegionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    int insert(CouponRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    int insertSelective(CouponRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    List<CouponRegion> selectByExample(CouponRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    CouponRegion selectByPrimaryKey(Integer couponRegionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    int updateByExampleSelective(@Param("record") CouponRegion record, @Param("example") CouponRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    int updateByExample(@Param("record") CouponRegion record, @Param("example") CouponRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    int updateByPrimaryKeySelective(CouponRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_region
     *
     * @mbggenerated Tue Jul 21 17:45:30 CST 2015
     */
    int updateByPrimaryKey(CouponRegion record);
}