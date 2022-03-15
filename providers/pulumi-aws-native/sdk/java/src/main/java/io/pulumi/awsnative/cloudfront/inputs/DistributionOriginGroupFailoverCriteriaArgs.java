// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionStatusCodesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class DistributionOriginGroupFailoverCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupFailoverCriteriaArgs Empty = new DistributionOriginGroupFailoverCriteriaArgs();

    @Import(name="statusCodes", required=true)
      private final Output<DistributionStatusCodesArgs> statusCodes;

    public Output<DistributionStatusCodesArgs> getStatusCodes() {
        return this.statusCodes;
    }

    public DistributionOriginGroupFailoverCriteriaArgs(Output<DistributionStatusCodesArgs> statusCodes) {
        this.statusCodes = Objects.requireNonNull(statusCodes, "expected parameter 'statusCodes' to be non-null");
    }

    private DistributionOriginGroupFailoverCriteriaArgs() {
        this.statusCodes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupFailoverCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DistributionStatusCodesArgs> statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupFailoverCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder statusCodes(Output<DistributionStatusCodesArgs> statusCodes) {
            this.statusCodes = Objects.requireNonNull(statusCodes);
            return this;
        }

        public Builder statusCodes(DistributionStatusCodesArgs statusCodes) {
            this.statusCodes = Output.of(Objects.requireNonNull(statusCodes));
            return this;
        }
        public DistributionOriginGroupFailoverCriteriaArgs build() {
            return new DistributionOriginGroupFailoverCriteriaArgs(statusCodes);
        }
    }
}
