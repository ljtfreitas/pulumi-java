// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1DatastoreConfigResponse {
    /**
     * Name of the Cloud Storage bucket. Required for `gcs` target_type.
     * 
     */
    private final String bucketName;
    /**
     * BigQuery dataset name Required for `bigquery` target_type.
     * 
     */
    private final String datasetName;
    /**
     * Path of Cloud Storage bucket Required for `gcs` target_type.
     * 
     */
    private final String path;
    /**
     * GCP project in which the datastore exists
     * 
     */
    private final String project;
    /**
     * Prefix of BigQuery table Required for `bigquery` target_type.
     * 
     */
    private final String tablePrefix;

    @OutputCustomType.Constructor({"bucketName","datasetName","path","project","tablePrefix"})
    private GoogleCloudApigeeV1DatastoreConfigResponse(
        String bucketName,
        String datasetName,
        String path,
        String project,
        String tablePrefix) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.datasetName = Objects.requireNonNull(datasetName);
        this.path = Objects.requireNonNull(path);
        this.project = Objects.requireNonNull(project);
        this.tablePrefix = Objects.requireNonNull(tablePrefix);
    }

    /**
     * Name of the Cloud Storage bucket. Required for `gcs` target_type.
     * 
     */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * BigQuery dataset name Required for `bigquery` target_type.
     * 
     */
    public String getDatasetName() {
        return this.datasetName;
    }
    /**
     * Path of Cloud Storage bucket Required for `gcs` target_type.
     * 
     */
    public String getPath() {
        return this.path;
    }
    /**
     * GCP project in which the datastore exists
     * 
     */
    public String getProject() {
        return this.project;
    }
    /**
     * Prefix of BigQuery table Required for `bigquery` target_type.
     * 
     */
    public String getTablePrefix() {
        return this.tablePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1DatastoreConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private String datasetName;
        private String path;
        private String project;
        private String tablePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1DatastoreConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.datasetName = defaults.datasetName;
    	      this.path = defaults.path;
    	      this.project = defaults.project;
    	      this.tablePrefix = defaults.tablePrefix;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setDatasetName(String datasetName) {
            this.datasetName = Objects.requireNonNull(datasetName);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setTablePrefix(String tablePrefix) {
            this.tablePrefix = Objects.requireNonNull(tablePrefix);
            return this;
        }
        public GoogleCloudApigeeV1DatastoreConfigResponse build() {
            return new GoogleCloudApigeeV1DatastoreConfigResponse(bucketName, datasetName, path, project, tablePrefix);
        }
    }
}
