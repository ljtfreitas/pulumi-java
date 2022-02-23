// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GcsProfileResponse {
    /**
     * The full project and resource path for Cloud Storage bucket including the name.
     * 
     */
    private final String bucketName;
    /**
     * The root path inside the Cloud Storage bucket.
     * 
     */
    private final String rootPath;

    @OutputCustomType.Constructor({"bucketName","rootPath"})
    private GcsProfileResponse(
        String bucketName,
        String rootPath) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.rootPath = Objects.requireNonNull(rootPath);
    }

    /**
     * The full project and resource path for Cloud Storage bucket including the name.
     * 
     */
    public String getBucketName() {
        return this.bucketName;
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
        private String bucketName;
        private String rootPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.rootPath = defaults.rootPath;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setRootPath(String rootPath) {
            this.rootPath = Objects.requireNonNull(rootPath);
            return this;
        }
        public GcsProfileResponse build() {
            return new GcsProfileResponse(bucketName, rootPath);
        }
    }
}
