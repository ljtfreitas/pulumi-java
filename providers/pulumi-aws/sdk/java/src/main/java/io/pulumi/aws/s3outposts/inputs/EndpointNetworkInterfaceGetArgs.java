// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3outposts.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointNetworkInterfaceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointNetworkInterfaceGetArgs Empty = new EndpointNetworkInterfaceGetArgs();

    /**
     * Identifier of the Elastic Network Interface (ENI).
     * 
     */
    @InputImport(name="networkInterfaceId")
    private final @Nullable Input<String> networkInterfaceId;

    public Input<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Input.empty() : this.networkInterfaceId;
    }

    public EndpointNetworkInterfaceGetArgs(@Nullable Input<String> networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    private EndpointNetworkInterfaceGetArgs() {
        this.networkInterfaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointNetworkInterfaceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> networkInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointNetworkInterfaceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaceId = defaults.networkInterfaceId;
        }

        public Builder setNetworkInterfaceId(@Nullable Input<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder setNetworkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Input.ofNullable(networkInterfaceId);
            return this;
        }
        public EndpointNetworkInterfaceGetArgs build() {
            return new EndpointNetworkInterfaceGetArgs(networkInterfaceId);
        }
    }
}
