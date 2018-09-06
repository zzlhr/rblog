package com.lhrsite.rblog.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class FriendLink {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long fid;
  private String value;
  private String url;
  private Integer status;

}
