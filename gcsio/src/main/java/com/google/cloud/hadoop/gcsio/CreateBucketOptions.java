/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.hadoop.gcsio;

import java.time.Duration;
import javax.annotation.Nullable;

/**
 * Options that can be specified when creating a bucket in the
 * {@code GoogleCloudStorage}.
 */
public class CreateBucketOptions {

  /**
   * Create bucket with all default settings.
   */
  public static final CreateBucketOptions DEFAULT = new CreateBucketOptions();

  private final String location;
  private final String storageClass;
  private final Duration ttl;

  /**
   * Create a bucket with all default settings.
   */
  private CreateBucketOptions() {
    this(null, null);
  }

  /**
   * Create a bucket with specified location.
   *
   * @param location Bucket location
   * @param storageClass Bucket location
   */
  public CreateBucketOptions(String location, String storageClass) {
    this(location, storageClass, /* retentionPeriod= */ null);
  }

  /**
   * Create a bucket with specified location.
   *
   * @param location Bucket location
   * @param storageClass Bucket storage class
   * @param ttl Bucket objects TTL
   */
  public CreateBucketOptions(String location, String storageClass, Duration ttl) {
    this.location = location;
    this.storageClass = storageClass;
    this.ttl = ttl;
  }

  /**
   * Returns the bucket location.
   */
  @Nullable
  public String getLocation() {
    return location;
  }

  /**
   * Returns the bucket storage class.
   */
  @Nullable
  public String getStorageClass() {
    return storageClass;
  }

  /** Returns the bucket retention period. */
  @Nullable
  public Duration getTtl() {
    return ttl;
  }
}
