package com.pojo;

public class student {
    private Integer id;

    private String name;

    private Integer qq;

    private String type;

    private String time;

    private String school;

    private Integer studentid;

    private String link;

    private String target;

    private String brother;

    private String address;

    public student(Integer id, String name, Integer qq, String type, String time, String school, Integer studentid, String link, String target, String brother, String address) {
        this.id = id;
        this.name = name;
        this.qq = qq;
        this.type = type;
        this.time = time;
        this.school = school;
        this.studentid = studentid;
        this.link = link;
        this.target = target;
        this.brother = brother;
        this.address = address;
    }

    public student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getBrother() {
        return brother;
    }

    public void setBrother(String brother) {
        this.brother = brother == null ? null : brother.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}