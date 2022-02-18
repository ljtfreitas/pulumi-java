// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A private endpoint connection
 * 
 */
public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * Connection state of the private endpoint connection.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
    private final @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Input<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    public PrivateEndpointConnectionArgs(@Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
    }

    private PrivateEndpointConnectionArgs() {
        this.privateLinkServiceConnectionState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.ofNullable(privateLinkServiceConnectionState);
            return this;
        }

        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(privateLinkServiceConnectionState);
        }
    }
}
