// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1DatastoreConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDatastoreResult {
    /**
     * Datastore create time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    private final String createTime;
    /**
     * Datastore Configurations.
     * 
     */
    private final GoogleCloudApigeeV1DatastoreConfigResponse datastoreConfig;
    /**
     * Display name in UI
     * 
     */
    private final String displayName;
    /**
     * Datastore last update time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    private final String lastUpdateTime;
    /**
     * Organization that the datastore belongs to
     * 
     */
    private final String org;
    /**
     * Resource link of Datastore. Example: `/organizations/{org}/analytics/datastores/{uuid}`
     * 
     */
    private final String self;
    /**
     * Destination storage type. Supported types `gcs` or `bigquery`.
     * 
     */
    private final String targetType;

    @OutputCustomType.Constructor({"createTime","datastoreConfig","displayName","lastUpdateTime","org","self","targetType"})
    private GetDatastoreResult(
        String createTime,
        GoogleCloudApigeeV1DatastoreConfigResponse datastoreConfig,
        String displayName,
        String lastUpdateTime,
        String org,
        String self,
        String targetType) {
        this.createTime = Objects.requireNonNull(createTime);
        this.datastoreConfig = Objects.requireNonNull(datastoreConfig);
        this.displayName = Objects.requireNonNull(displayName);
        this.lastUpdateTime = Objects.requireNonNull(lastUpdateTime);
        this.org = Objects.requireNonNull(org);
        this.self = Objects.requireNonNull(self);
        this.targetType = Objects.requireNonNull(targetType);
    }

    /**
     * Datastore create time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Datastore Configurations.
     * 
     */
    public GoogleCloudApigeeV1DatastoreConfigResponse getDatastoreConfig() {
        return this.datastoreConfig;
    }
    /**
     * Display name in UI
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Datastore last update time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    /**
     * Organization that the datastore belongs to
     * 
     */
    public String getOrg() {
        return this.org;
    }
    /**
     * Resource link of Datastore. Example: `/organizations/{org}/analytics/datastores/{uuid}`
     * 
     */
    public String getSelf() {
        return this.self;
    }
    /**
     * Destination storage type. Supported types `gcs` or `bigquery`.
     * 
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private GoogleCloudApigeeV1DatastoreConfigResponse datastoreConfig;
        private String displayName;
        private String lastUpdateTime;
        private String org;
        private String self;
        private String targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatastoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.datastoreConfig = defaults.datastoreConfig;
    	      this.displayName = defaults.displayName;
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.org = defaults.org;
    	      this.self = defaults.self;
    	      this.targetType = defaults.targetType;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDatastoreConfig(GoogleCloudApigeeV1DatastoreConfigResponse datastoreConfig) {
            this.datastoreConfig = Objects.requireNonNull(datastoreConfig);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = Objects.requireNonNull(lastUpdateTime);
            return this;
        }

        public Builder setOrg(String org) {
            this.org = Objects.requireNonNull(org);
            return this;
        }

        public Builder setSelf(String self) {
            this.self = Objects.requireNonNull(self);
            return this;
        }

        public Builder setTargetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }
        public GetDatastoreResult build() {
            return new GetDatastoreResult(createTime, datastoreConfig, displayName, lastUpdateTime, org, self, targetType);
        }
    }
}
