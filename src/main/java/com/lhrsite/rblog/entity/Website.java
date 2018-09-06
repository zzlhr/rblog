package com.lhrsite.rblog.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Website {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long wid;
  private String host;
  private String name;
  private String keywords;
  private String description;
  private String masterName;
  private String masterEmail;

}
