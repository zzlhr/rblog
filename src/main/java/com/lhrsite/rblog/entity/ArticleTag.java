package com.lhrsite.rblog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class ArticleTag {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long tid;
  private long articleId;
  private String tagContent;

}
