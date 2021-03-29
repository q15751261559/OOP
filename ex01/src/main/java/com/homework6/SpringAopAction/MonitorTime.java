package com.homework6.SpringAopAction;

import java.util.Date;

public class MonitorTime {
    private String className;
    private String methodName;
    private Date logTime;
    private long consumeTime;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public long getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(long consumeTime) {
        this.consumeTime = consumeTime;
    }

    public MonitorTime() {
    }

    public MonitorTime(String className, String methodName, Date logTime, long consumeTime) {
        this.className = className;
        this.methodName = methodName;
        this.logTime = logTime;
        this.consumeTime = consumeTime;
    }
}
