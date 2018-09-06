package com.lhrsite.rblog.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String loginName;
  private String username;
  private String password;
  private String token;
  private String headerUrl;
  private Date createTime;
  private Date updateTime;
  private String lastLoginIp;
  private String lastLoginAddress;
  private Integer status;
  private Integer admin;
  private Integer type;


}
