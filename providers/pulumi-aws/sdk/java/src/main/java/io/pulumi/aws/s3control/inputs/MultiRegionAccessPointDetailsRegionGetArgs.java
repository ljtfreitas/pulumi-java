// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class MultiRegionAccessPointDetailsRegionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointDetailsRegionGetArgs Empty = new MultiRegionAccessPointDetailsRegionGetArgs();

    /**
     * The name of the associated bucket for the Region.
     * 
     */
    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    public MultiRegionAccessPointDetailsRegionGetArgs(Input<String> bucket) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
    }

    private MultiRegionAccessPointDetailsRegionGetArgs() {
        this.bucket = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointDetailsRegionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointDetailsRegionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }
        public MultiRegionAccessPointDetailsRegionGetArgs build() {
            return new MultiRegionAccessPointDetailsRegionGetArgs(bucket);
        }
    }
}
