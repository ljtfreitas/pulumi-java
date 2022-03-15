// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointGroupEndpointConfiguration {
    /**
     * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. See the [AWS documentation](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html) for more details. The default value is `false`.
     * **Note:** When client IP address preservation is enabled, the Global Accelerator service creates an EC2 Security Group in the VPC named `GlobalAccelerator` that must be deleted (potentially outside of the provider) before the VPC will successfully delete. If this EC2 Security Group is not deleted, the provider will retry the VPC deletion for a few minutes before reporting a `DependencyViolation` error. This cannot be resolved by re-running the provider.
     * 
     */
    private final @Nullable Boolean clientIpPreservationEnabled;
    /**
     * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
     * 
     */
    private final @Nullable String endpointId;
    /**
     * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify.
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private EndpointGroupEndpointConfiguration(
        @CustomType.Parameter("clientIpPreservationEnabled") @Nullable Boolean clientIpPreservationEnabled,
        @CustomType.Parameter("endpointId") @Nullable String endpointId,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.clientIpPreservationEnabled = clientIpPreservationEnabled;
        this.endpointId = endpointId;
        this.weight = weight;
    }

    /**
     * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. See the [AWS documentation](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html) for more details. The default value is `false`.
     * **Note:** When client IP address preservation is enabled, the Global Accelerator service creates an EC2 Security Group in the VPC named `GlobalAccelerator` that must be deleted (potentially outside of the provider) before the VPC will successfully delete. If this EC2 Security Group is not deleted, the provider will retry the VPC deletion for a few minutes before reporting a `DependencyViolation` error. This cannot be resolved by re-running the provider.
     * 
    */
    public Optional<Boolean> getClientIpPreservationEnabled() {
        return Optional.ofNullable(this.clientIpPreservationEnabled);
    }
    /**
     * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
     * 
    */
    public Optional<String> getEndpointId() {
        return Optional.ofNullable(this.endpointId);
    }
    /**
     * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify.
     * 
    */
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean clientIpPreservationEnabled;
        private @Nullable String endpointId;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIpPreservationEnabled = defaults.clientIpPreservationEnabled;
    	      this.endpointId = defaults.endpointId;
    	      this.weight = defaults.weight;
        }

        public Builder clientIpPreservationEnabled(@Nullable Boolean clientIpPreservationEnabled) {
            this.clientIpPreservationEnabled = clientIpPreservationEnabled;
            return this;
        }

        public Builder endpointId(@Nullable String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public EndpointGroupEndpointConfiguration build() {
            return new EndpointGroupEndpointConfiguration(clientIpPreservationEnabled, endpointId, weight);
        }
    }
}
