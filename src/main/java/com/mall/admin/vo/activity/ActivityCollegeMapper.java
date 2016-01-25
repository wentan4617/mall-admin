package com.mall.admin.vo.activity;

import com.mall.admin.vo.activity.ActivityCollege;
import com.mall.admin.vo.activity.ActivityCollegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityCollegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    int countByExample(ActivityCollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    int deleteByExample(ActivityCollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    int deleteByPrimaryKey(Long activityCollegeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    int insert(ActivityCollege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    int insertSelective(ActivityCollege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    List<ActivityCollege> selectByExample(ActivityCollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    ActivityCollege selectByPrimaryKey(Long activityCollegeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    int updateByExampleSelective(@Param("record") ActivityCollege record, @Param("example") ActivityCollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    int updateByExample(@Param("record") ActivityCollege record, @Param("example") ActivityCollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    int updateByPrimaryKeySelective(ActivityCollege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_college
     *
     * @mbggenerated Sat Jul 25 10:00:33 CST 2015
     */
    int updateByPrimaryKey(ActivityCollege record);
}