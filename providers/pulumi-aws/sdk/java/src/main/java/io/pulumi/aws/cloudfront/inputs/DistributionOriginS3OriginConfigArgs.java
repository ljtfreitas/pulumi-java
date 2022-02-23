// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginS3OriginConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginS3OriginConfigArgs Empty = new DistributionOriginS3OriginConfigArgs();

    /**
     * The [CloudFront origin access
     * identity][5] to associate with the origin.
     * 
     */
    @InputImport(name="originAccessIdentity", required=true)
    private final Input<String> originAccessIdentity;

    public Input<String> getOriginAccessIdentity() {
        return this.originAccessIdentity;
    }

    public DistributionOriginS3OriginConfigArgs(Input<String> originAccessIdentity) {
        this.originAccessIdentity = Objects.requireNonNull(originAccessIdentity, "expected parameter 'originAccessIdentity' to be non-null");
    }

    private DistributionOriginS3OriginConfigArgs() {
        this.originAccessIdentity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginS3OriginConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> originAccessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginS3OriginConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originAccessIdentity = defaults.originAccessIdentity;
        }

        public Builder setOriginAccessIdentity(Input<String> originAccessIdentity) {
            this.originAccessIdentity = Objects.requireNonNull(originAccessIdentity);
            return this;
        }

        public Builder setOriginAccessIdentity(String originAccessIdentity) {
            this.originAccessIdentity = Input.of(Objects.requireNonNull(originAccessIdentity));
            return this;
        }
        public DistributionOriginS3OriginConfigArgs build() {
            return new DistributionOriginS3OriginConfigArgs(originAccessIdentity);
        }
    }
}
