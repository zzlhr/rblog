package com.lhrsite.rblog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ArticleInfo {

  @Id
  private long aid;
  private long articleClick;
  private long articleCommemt;
  private long articleZan;

}
