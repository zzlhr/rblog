package com.lhrsite.rblog.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long lid;
  private String userName;
  private long userId;
  private String userIp;
  private String operation;
  private java.sql.Timestamp createTime;


}
