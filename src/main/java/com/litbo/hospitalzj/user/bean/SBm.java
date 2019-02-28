package com.litbo.hospitalzj.user.bean;

/**
 * 部门表
 */
public class SBm {
        private String bmId;

        private String bmName;

        private String userId;

        private String bmTel;

        private String bmAddr;

        private String wxFlag;

        private String pBmId;

        private Integer obmId;

        private String xbmFlag;

        public String getBmId() {
            return bmId;
        }

        public void setBmId(String bmId) {
            this.bmId = bmId == null ? null : bmId.trim();
        }

        public String getBmName() {
            return bmName;
        }

        public void setBmName(String bmName) {
            this.bmName = bmName == null ? null : bmName.trim();
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId == null ? null : userId.trim();
        }

        public String getBmTel() {
            return bmTel;
        }

        public void setBmTel(String bmTel) {
            this.bmTel = bmTel == null ? null : bmTel.trim();
        }

        public String getBmAddr() {
            return bmAddr;
        }

        public void setBmAddr(String bmAddr) {
            this.bmAddr = bmAddr == null ? null : bmAddr.trim();
        }

        public String getWxFlag() {
            return wxFlag;
        }

        public void setWxFlag(String wxFlag) {
            this.wxFlag = wxFlag == null ? null : wxFlag.trim();
        }

        public String getpBmId() {
            return pBmId;
        }

        public void setpBmId(String pBmId) {
            this.pBmId = pBmId == null ? null : pBmId.trim();
        }

        public Integer getObmId() {
            return obmId;
        }

        public void setObmId(Integer obmId) {
            this.obmId = obmId;
        }

        public String getXbmFlag() {
            return xbmFlag;
        }

        public void setXbmFlag(String xbmFlag) {
            this.xbmFlag = xbmFlag == null ? null : xbmFlag.trim();
        }

}
