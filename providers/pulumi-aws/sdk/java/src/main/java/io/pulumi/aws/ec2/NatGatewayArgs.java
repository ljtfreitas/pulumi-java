// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NatGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final NatGatewayArgs Empty = new NatGatewayArgs();

    /**
     * The Allocation ID of the Elastic IP address for the gateway. Required for `connectivity_type` of `public`.
     * 
     */
    @InputImport(name="allocationId")
    private final @Nullable Input<String> allocationId;

    public Input<String> getAllocationId() {
        return this.allocationId == null ? Input.empty() : this.allocationId;
    }

    /**
     * Connectivity type for the gateway. Valid values are `private` and `public`. Defaults to `public`.
     * 
     */
    @InputImport(name="connectivityType")
    private final @Nullable Input<String> connectivityType;

    public Input<String> getConnectivityType() {
        return this.connectivityType == null ? Input.empty() : this.connectivityType;
    }

    /**
     * The Subnet ID of the subnet in which to place the gateway.
     * 
     */
    @InputImport(name="subnetId", required=true)
    private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public NatGatewayArgs(
        @Nullable Input<String> allocationId,
        @Nullable Input<String> connectivityType,
        Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags) {
        this.allocationId = allocationId;
        this.connectivityType = connectivityType;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.tags = tags;
    }

    private NatGatewayArgs() {
        this.allocationId = Input.empty();
        this.connectivityType = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allocationId;
        private @Nullable Input<String> connectivityType;
        private Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NatGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.connectivityType = defaults.connectivityType;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
        }

        public Builder setAllocationId(@Nullable Input<String> allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        public Builder setAllocationId(@Nullable String allocationId) {
            this.allocationId = Input.ofNullable(allocationId);
            return this;
        }

        public Builder setConnectivityType(@Nullable Input<String> connectivityType) {
            this.connectivityType = connectivityType;
            return this;
        }

        public Builder setConnectivityType(@Nullable String connectivityType) {
            this.connectivityType = Input.ofNullable(connectivityType);
            return this;
        }

        public Builder setSubnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public NatGatewayArgs build() {
            return new NatGatewayArgs(allocationId, connectivityType, subnetId, tags);
        }
    }
}
