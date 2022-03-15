// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Timestamps about this resource according to a particular system.
 * 
 */
public final class GoogleCloudDatacatalogV1beta1SystemTimestampsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1beta1SystemTimestampsResponse Empty = new GoogleCloudDatacatalogV1beta1SystemTimestampsResponse();

    /**
     * The creation time of the resource within the given system.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * The expiration time of the resource within the given system. Currently only apllicable to BigQuery resources.
     * 
     */
    @Import(name="expireTime", required=true)
      private final String expireTime;

    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * The last-modified time of the resource within the given system.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public GoogleCloudDatacatalogV1beta1SystemTimestampsResponse(
        String createTime,
        String expireTime,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.expireTime = Objects.requireNonNull(expireTime, "expected parameter 'expireTime' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private GoogleCloudDatacatalogV1beta1SystemTimestampsResponse() {
        this.createTime = null;
        this.expireTime = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1SystemTimestampsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String expireTime;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1SystemTimestampsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GoogleCloudDatacatalogV1beta1SystemTimestampsResponse build() {
            return new GoogleCloudDatacatalogV1beta1SystemTimestampsResponse(createTime, expireTime, updateTime);
        }
    }
}
