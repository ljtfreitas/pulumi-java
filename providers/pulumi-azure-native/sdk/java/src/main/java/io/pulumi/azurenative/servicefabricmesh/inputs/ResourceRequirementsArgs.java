// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.ResourceLimitsArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.ResourceRequestsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This type describes the resource requirements for a container or a service.
 * 
 */
public final class ResourceRequirementsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceRequirementsArgs Empty = new ResourceRequirementsArgs();

    /**
     * Describes the maximum limits on the resources for a given container.
     * 
     */
    @Import(name="limits")
      private final @Nullable Output<ResourceLimitsArgs> limits;

    public Output<ResourceLimitsArgs> getLimits() {
        return this.limits == null ? Output.empty() : this.limits;
    }

    /**
     * Describes the requested resources for a given container.
     * 
     */
    @Import(name="requests", required=true)
      private final Output<ResourceRequestsArgs> requests;

    public Output<ResourceRequestsArgs> getRequests() {
        return this.requests;
    }

    public ResourceRequirementsArgs(
        @Nullable Output<ResourceLimitsArgs> limits,
        Output<ResourceRequestsArgs> requests) {
        this.limits = limits;
        this.requests = Objects.requireNonNull(requests, "expected parameter 'requests' to be non-null");
    }

    private ResourceRequirementsArgs() {
        this.limits = Output.empty();
        this.requests = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceLimitsArgs> limits;
        private Output<ResourceRequestsArgs> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequirementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder limits(@Nullable Output<ResourceLimitsArgs> limits) {
            this.limits = limits;
            return this;
        }

        public Builder limits(@Nullable ResourceLimitsArgs limits) {
            this.limits = Output.ofNullable(limits);
            return this;
        }

        public Builder requests(Output<ResourceRequestsArgs> requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }

        public Builder requests(ResourceRequestsArgs requests) {
            this.requests = Output.of(Objects.requireNonNull(requests));
            return this;
        }
        public ResourceRequirementsArgs build() {
            return new ResourceRequirementsArgs(limits, requests);
        }
    }
}
