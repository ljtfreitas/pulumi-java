// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResolverDnsSecConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverDnsSecConfigArgs Empty = new ResolverDnsSecConfigArgs();

    /**
     * The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    public ResolverDnsSecConfigArgs(Input<String> resourceId) {
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private ResolverDnsSecConfigArgs() {
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverDnsSecConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverDnsSecConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public ResolverDnsSecConfigArgs build() {
            return new ResolverDnsSecConfigArgs(resourceId);
        }
    }
}
