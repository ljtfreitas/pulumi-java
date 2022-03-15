// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud Storage bucket profile.
 * 
 */
public final class GcsProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcsProfileArgs Empty = new GcsProfileArgs();

    /**
     * The Cloud Storage bucket name.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * The root path inside the Cloud Storage bucket.
     * 
     */
    @Import(name="rootPath")
      private final @Nullable Output<String> rootPath;

    public Output<String> getRootPath() {
        return this.rootPath == null ? Output.empty() : this.rootPath;
    }

    public GcsProfileArgs(
        Output<String> bucket,
        @Nullable Output<String> rootPath) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.rootPath = rootPath;
    }

    private GcsProfileArgs() {
        this.bucket = Output.empty();
        this.rootPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<String> rootPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.rootPath = defaults.rootPath;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder rootPath(@Nullable Output<String> rootPath) {
            this.rootPath = rootPath;
            return this;
        }

        public Builder rootPath(@Nullable String rootPath) {
            this.rootPath = Output.ofNullable(rootPath);
            return this;
        }
        public GcsProfileArgs build() {
            return new GcsProfileArgs(bucket, rootPath);
        }
    }
}
