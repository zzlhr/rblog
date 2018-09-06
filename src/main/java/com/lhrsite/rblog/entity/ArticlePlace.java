package com.lhrsite.rblog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ArticlePlace {

  @Id
  private String placeTag;
  private String placeValue;
  private Integer placeType;


}
