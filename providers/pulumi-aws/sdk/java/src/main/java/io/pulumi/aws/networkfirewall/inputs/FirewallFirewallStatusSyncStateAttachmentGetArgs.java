// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallFirewallStatusSyncStateAttachmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallFirewallStatusSyncStateAttachmentGetArgs Empty = new FirewallFirewallStatusSyncStateAttachmentGetArgs();

    /**
     * The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * 
     */
    @InputImport(name="endpointId")
    private final @Nullable Input<String> endpointId;

    public Input<String> getEndpointId() {
        return this.endpointId == null ? Input.empty() : this.endpointId;
    }

    /**
     * The unique identifier for the subnet.
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    public FirewallFirewallStatusSyncStateAttachmentGetArgs(
        @Nullable Input<String> endpointId,
        @Nullable Input<String> subnetId) {
        this.endpointId = endpointId;
        this.subnetId = subnetId;
    }

    private FirewallFirewallStatusSyncStateAttachmentGetArgs() {
        this.endpointId = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusSyncStateAttachmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endpointId;
        private @Nullable Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatusSyncStateAttachmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setEndpointId(@Nullable Input<String> endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        public Builder setEndpointId(@Nullable String endpointId) {
            this.endpointId = Input.ofNullable(endpointId);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }
        public FirewallFirewallStatusSyncStateAttachmentGetArgs build() {
            return new FirewallFirewallStatusSyncStateAttachmentGetArgs(endpointId, subnetId);
        }
    }
}
