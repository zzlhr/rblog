package com.lhrsite.rblog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class ArticleMaster {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long aid;
  private String articleTitle;
  private String articleDescribe;
  private String articleContentHtml;
  private String articleContentMd;
  private long articleAuthor;
  private Integer articleStatus;
  private Integer articleDel;
  private Date createTime;
  private Date updateTime;


}
