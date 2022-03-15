// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network manager security group item.
 * 
 */
public final class NetworkManagerSecurityGroupItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkManagerSecurityGroupItemResponse Empty = new NetworkManagerSecurityGroupItemResponse();

    /**
     * Network manager group Id.
     * 
     */
    @Import(name="networkGroupId")
      private final @Nullable String networkGroupId;

    public Optional<String> getNetworkGroupId() {
        return this.networkGroupId == null ? Optional.empty() : Optional.ofNullable(this.networkGroupId);
    }

    public NetworkManagerSecurityGroupItemResponse(@Nullable String networkGroupId) {
        this.networkGroupId = networkGroupId;
    }

    private NetworkManagerSecurityGroupItemResponse() {
        this.networkGroupId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerSecurityGroupItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String networkGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkManagerSecurityGroupItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkGroupId = defaults.networkGroupId;
        }

        public Builder networkGroupId(@Nullable String networkGroupId) {
            this.networkGroupId = networkGroupId;
            return this;
        }
        public NetworkManagerSecurityGroupItemResponse build() {
            return new NetworkManagerSecurityGroupItemResponse(networkGroupId);
        }
    }
}
