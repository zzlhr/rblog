package com.lhrsite.rblog.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class ArticleComment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long cid;
  private long articleId;
  private long userId;
  private String commentContent;
  private Integer commentStatus;
  private String commentIp;
  private Date createTime;
  private Date updateTime;

}
