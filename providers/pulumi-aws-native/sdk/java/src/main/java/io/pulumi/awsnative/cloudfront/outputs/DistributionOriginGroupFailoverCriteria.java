// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.DistributionStatusCodes;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class DistributionOriginGroupFailoverCriteria {
    private final DistributionStatusCodes statusCodes;

    @OutputCustomType.Constructor({"statusCodes"})
    private DistributionOriginGroupFailoverCriteria(DistributionStatusCodes statusCodes) {
        this.statusCodes = Objects.requireNonNull(statusCodes);
    }

    public DistributionStatusCodes getStatusCodes() {
        return this.statusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupFailoverCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionStatusCodes statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupFailoverCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder setStatusCodes(DistributionStatusCodes statusCodes) {
            this.statusCodes = Objects.requireNonNull(statusCodes);
            return this;
        }
        public DistributionOriginGroupFailoverCriteria build() {
            return new DistributionOriginGroupFailoverCriteria(statusCodes);
        }
    }
}
