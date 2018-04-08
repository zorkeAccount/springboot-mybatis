package cn.caizhaoke.kf.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_test")
public class DbTest {
    /**
     * 测试Id
     */
    @Id
    @Column(name = "`db_test_id`")
    private String dbTestId;

    /**
     * 测试文本
     */
    @Column(name = "`db_test_text`")
    private String dbTestText;

    /**
     * 状态，1启用(默认)，-1禁用
     */
    @Column(name = "`status`")
    private String status;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 获取测试Id
     *
     * @return db_test_id - 测试Id
     */
    public String getDbTestId() {
        return dbTestId;
    }

    /**
     * 设置测试Id
     *
     * @param dbTestId 测试Id
     */
    public void setDbTestId(String dbTestId) {
        this.dbTestId = dbTestId;
    }

    /**
     * 获取测试文本
     *
     * @return db_test_text - 测试文本
     */
    public String getDbTestText() {
        return dbTestText;
    }

    /**
     * 设置测试文本
     *
     * @param dbTestText 测试文本
     */
    public void setDbTestText(String dbTestText) {
        this.dbTestText = dbTestText;
    }

    /**
     * 获取状态，1启用(默认)，-1禁用
     *
     * @return status - 状态，1启用(默认)，-1禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，1启用(默认)，-1禁用
     *
     * @param status 状态，1启用(默认)，-1禁用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}