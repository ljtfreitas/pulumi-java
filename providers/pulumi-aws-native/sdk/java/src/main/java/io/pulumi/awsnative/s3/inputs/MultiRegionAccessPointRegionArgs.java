// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MultiRegionAccessPointRegionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointRegionArgs Empty = new MultiRegionAccessPointRegionArgs();

    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    public MultiRegionAccessPointRegionArgs(Output<String> bucket) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
    }

    private MultiRegionAccessPointRegionArgs() {
        this.bucket = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointRegionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public MultiRegionAccessPointRegionArgs build() {
            return new MultiRegionAccessPointRegionArgs(bucket);
        }
    }
}
