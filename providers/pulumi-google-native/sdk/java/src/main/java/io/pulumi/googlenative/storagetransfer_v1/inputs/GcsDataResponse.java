// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * In a GcsData resource, an object's name is the Cloud Storage object's name and its "last modification time" refers to the object's `updated` property of Cloud Storage objects, which changes when the content or the metadata of the object is updated.
 * 
 */
public final class GcsDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GcsDataResponse Empty = new GcsDataResponse();

    /**
     * Cloud Storage bucket name. Must meet [Bucket Name Requirements](/storage/docs/naming#requirements).
     * 
     */
    @Import(name="bucketName", required=true)
      private final String bucketName;

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'. The root path value must meet [Object Name Requirements](/storage/docs/naming#objectnames).
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    public GcsDataResponse(
        String bucketName,
        String path) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private GcsDataResponse() {
        this.bucketName = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.path = defaults.path;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public GcsDataResponse build() {
            return new GcsDataResponse(bucketName, path);
        }
    }
}
