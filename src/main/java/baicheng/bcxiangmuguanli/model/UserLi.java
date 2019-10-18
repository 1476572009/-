package baicheng.bcxiangmuguanli.model;

import java.io.Serializable;

/**
 * 用户表
 */
public class UserLi implements Serializable {
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private int userId;

    public String getWorkId() {
        return WorkId;
    }

    public void setWorkId(String workId) {
        WorkId = workId;
    }

    private String WorkId;
 private   String userName;

}