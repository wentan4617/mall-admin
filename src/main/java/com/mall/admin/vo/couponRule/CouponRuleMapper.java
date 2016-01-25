package com.mall.admin.vo.couponRule;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CouponRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    int countByExample(CouponRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    int deleteByExample(CouponRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    int deleteByPrimaryKey(Integer couponId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    int insert(CouponRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    int insertSelective(CouponRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    List<CouponRule> selectByExample(CouponRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    CouponRule selectByPrimaryKey(Integer couponId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    int updateByExampleSelective(@Param("record") CouponRule record, @Param("example") CouponRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    int updateByExample(@Param("record") CouponRule record, @Param("example") CouponRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    int updateByPrimaryKeySelective(CouponRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon_rule
     *
     * @mbggenerated Mon Jul 20 10:28:13 CST 2015
     */
    int updateByPrimaryKey(CouponRule record);
    
    List<CouponRule> selectFirstSub(@Param("collegeId") long collegeId, @Param("excludeCouponRuleId") long excludeCouponRuleId);
    
    List<CouponRule> selectFullSubByTotalMoney(@Param("collegeId") long collegeId, @Param("totalMoney") int totalMoney, @Param("excludeCouponRuleId") long excludeCouponRuleId);
}