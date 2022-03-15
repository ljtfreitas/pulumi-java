// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GcsProfileResponse {
    /**
     * The Cloud Storage bucket name.
     * 
     */
    private final String bucket;
    /**
     * The root path inside the Cloud Storage bucket.
     * 
     */
    private final String rootPath;

    @CustomType.Constructor
    private GcsProfileResponse(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("rootPath") String rootPath) {
        this.bucket = bucket;
        this.rootPath = rootPath;
    }

    /**
     * The Cloud Storage bucket name.
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * The root path inside the Cloud Storage bucket.
     * 
    */
    public String getRootPath() {
        return this.rootPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String rootPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.rootPath = defaults.rootPath;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder rootPath(String rootPath) {
            this.rootPath = Objects.requireNonNull(rootPath);
            return this;
        }
        public GcsProfileResponse build() {
            return new GcsProfileResponse(bucket, rootPath);
        }
    }
}
