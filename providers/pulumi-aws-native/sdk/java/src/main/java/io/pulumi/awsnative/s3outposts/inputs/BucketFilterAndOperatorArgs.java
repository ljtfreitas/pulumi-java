// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.inputs;

import java.util.Objects;


public final class BucketFilterAndOperatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketFilterAndOperatorArgs Empty = new BucketFilterAndOperatorArgs();

    public BucketFilterAndOperatorArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketFilterAndOperatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(BucketFilterAndOperatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public BucketFilterAndOperatorArgs build() {
            return new BucketFilterAndOperatorArgs();
        }
    }
}
