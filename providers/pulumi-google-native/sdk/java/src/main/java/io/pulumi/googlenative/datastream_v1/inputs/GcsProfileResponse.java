// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Cloud Storage bucket profile.
 * 
 */
public final class GcsProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final GcsProfileResponse Empty = new GcsProfileResponse();

    /**
     * The Cloud Storage bucket name.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    /**
     * The root path inside the Cloud Storage bucket.
     * 
     */
    @InputImport(name="rootPath", required=true)
      private final String rootPath;

    public String getRootPath() {
        return this.rootPath;
    }

    public GcsProfileResponse(
        String bucket,
        String rootPath) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.rootPath = Objects.requireNonNull(rootPath, "expected parameter 'rootPath' to be non-null");
    }

    private GcsProfileResponse() {
        this.bucket = null;
        this.rootPath = null;
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

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setRootPath(String rootPath) {
            this.rootPath = Objects.requireNonNull(rootPath);
            return this;
        }
        public GcsProfileResponse build() {
            return new GcsProfileResponse(bucket, rootPath);
        }
    }
}
