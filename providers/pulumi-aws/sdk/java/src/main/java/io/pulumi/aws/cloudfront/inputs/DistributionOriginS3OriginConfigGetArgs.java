// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginS3OriginConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginS3OriginConfigGetArgs Empty = new DistributionOriginS3OriginConfigGetArgs();

    /**
     * The [CloudFront origin access
     * identity][5] to associate with the origin.
     * 
     */
    @Import(name="originAccessIdentity", required=true)
      private final Output<String> originAccessIdentity;

    public Output<String> getOriginAccessIdentity() {
        return this.originAccessIdentity;
    }

    public DistributionOriginS3OriginConfigGetArgs(Output<String> originAccessIdentity) {
        this.originAccessIdentity = Objects.requireNonNull(originAccessIdentity, "expected parameter 'originAccessIdentity' to be non-null");
    }

    private DistributionOriginS3OriginConfigGetArgs() {
        this.originAccessIdentity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginS3OriginConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> originAccessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginS3OriginConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originAccessIdentity = defaults.originAccessIdentity;
        }

        public Builder originAccessIdentity(Output<String> originAccessIdentity) {
            this.originAccessIdentity = Objects.requireNonNull(originAccessIdentity);
            return this;
        }

        public Builder originAccessIdentity(String originAccessIdentity) {
            this.originAccessIdentity = Output.of(Objects.requireNonNull(originAccessIdentity));
            return this;
        }
        public DistributionOriginS3OriginConfigGetArgs build() {
            return new DistributionOriginS3OriginConfigGetArgs(originAccessIdentity);
        }
    }
}
