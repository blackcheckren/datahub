package com.linkedin.metadata.config.search;

import lombok.Data;


@Data
public class SearchConfiguration {

  private int maxTermBucketSize;
  private ExactMatchConfiguration exactMatch;
  private GraphQueryConfiguration graph;
}
