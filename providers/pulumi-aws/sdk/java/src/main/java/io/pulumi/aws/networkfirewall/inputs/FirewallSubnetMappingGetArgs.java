// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FirewallSubnetMappingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallSubnetMappingGetArgs Empty = new FirewallSubnetMappingGetArgs();

    /**
     * The unique identifier for the subnet.
     * 
     */
    @InputImport(name="subnetId", required=true)
    private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    public FirewallSubnetMappingGetArgs(Input<String> subnetId) {
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private FirewallSubnetMappingGetArgs() {
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallSubnetMappingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallSubnetMappingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setSubnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public FirewallSubnetMappingGetArgs build() {
            return new FirewallSubnetMappingGetArgs(subnetId);
        }
    }
}
