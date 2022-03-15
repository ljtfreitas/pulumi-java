// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.GatewayInstanceResponse;
import io.pulumi.azurenative.appplatform.outputs.GatewayOperatorResourceRequestsResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GatewayOperatorPropertiesResponse {
    /**
     * Collection of instances belong to Spring Cloud Gateway operator.
     * 
     */
    private final List<GatewayInstanceResponse> instances;
    /**
     * The requested resource quantity for required CPU and Memory.
     * 
     */
    private final GatewayOperatorResourceRequestsResponse resourceRequests;

    @CustomType.Constructor
    private GatewayOperatorPropertiesResponse(
        @CustomType.Parameter("instances") List<GatewayInstanceResponse> instances,
        @CustomType.Parameter("resourceRequests") GatewayOperatorResourceRequestsResponse resourceRequests) {
        this.instances = instances;
        this.resourceRequests = resourceRequests;
    }

    /**
     * Collection of instances belong to Spring Cloud Gateway operator.
     * 
    */
    public List<GatewayInstanceResponse> getInstances() {
        return this.instances;
    }
    /**
     * The requested resource quantity for required CPU and Memory.
     * 
    */
    public GatewayOperatorResourceRequestsResponse getResourceRequests() {
        return this.resourceRequests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayOperatorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GatewayInstanceResponse> instances;
        private GatewayOperatorResourceRequestsResponse resourceRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayOperatorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.resourceRequests = defaults.resourceRequests;
        }

        public Builder instances(List<GatewayInstanceResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder resourceRequests(GatewayOperatorResourceRequestsResponse resourceRequests) {
            this.resourceRequests = Objects.requireNonNull(resourceRequests);
            return this;
        }
        public GatewayOperatorPropertiesResponse build() {
            return new GatewayOperatorPropertiesResponse(instances, resourceRequests);
        }
    }
}
