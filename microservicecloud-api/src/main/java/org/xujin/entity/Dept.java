package org.xujin.entity;

import java.io.Serializable;

/**
 * @author xujin
 * @package-name org.xujin.entity
 * @createtime 2020-03-22 16:22
 */

public class Dept implements Serializable {
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    public static Builder newBuilder(){
        return new Builder();
    }

    public Dept() {
    }
    public Dept(Builder builder) {
        this.setDeptno(builder.deptno);
        this.setDname(builder.dname);
        this.setDb_source(builder.db_source);
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    public static final class Builder{
        private Long  deptno;
        private String  dname;
        private String  db_source;

        public Builder deptno(Long deptno) {
            this.deptno = deptno;
            return this;
        }

        public Builder dname(String dname) {
            this.dname = dname;
            return this;
        }

        public Builder db_source(String db_source) {
            this.db_source = db_source;
            return this;
        }

        public Dept build(){
            return new Dept(this);
        }
    }
}
