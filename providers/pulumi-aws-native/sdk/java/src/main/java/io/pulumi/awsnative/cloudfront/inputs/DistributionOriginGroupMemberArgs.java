// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginGroupMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupMemberArgs Empty = new DistributionOriginGroupMemberArgs();

    @Import(name="originId", required=true)
      private final Output<String> originId;

    public Output<String> getOriginId() {
        return this.originId;
    }

    public DistributionOriginGroupMemberArgs(Output<String> originId) {
        this.originId = Objects.requireNonNull(originId, "expected parameter 'originId' to be non-null");
    }

    private DistributionOriginGroupMemberArgs() {
        this.originId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> originId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originId = defaults.originId;
        }

        public Builder originId(Output<String> originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }

        public Builder originId(String originId) {
            this.originId = Output.of(Objects.requireNonNull(originId));
            return this;
        }
        public DistributionOriginGroupMemberArgs build() {
            return new DistributionOriginGroupMemberArgs(originId);
        }
    }
}
