// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network manager security group item.
 * 
 */
public final class NetworkManagerSecurityGroupItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkManagerSecurityGroupItemArgs Empty = new NetworkManagerSecurityGroupItemArgs();

    /**
     * Network manager group Id.
     * 
     */
    @InputImport(name="networkGroupId")
    private final @Nullable Input<String> networkGroupId;

    public Input<String> getNetworkGroupId() {
        return this.networkGroupId == null ? Input.empty() : this.networkGroupId;
    }

    public NetworkManagerSecurityGroupItemArgs(@Nullable Input<String> networkGroupId) {
        this.networkGroupId = networkGroupId;
    }

    private NetworkManagerSecurityGroupItemArgs() {
        this.networkGroupId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerSecurityGroupItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> networkGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkManagerSecurityGroupItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkGroupId = defaults.networkGroupId;
        }

        public Builder setNetworkGroupId(@Nullable Input<String> networkGroupId) {
            this.networkGroupId = networkGroupId;
            return this;
        }

        public Builder setNetworkGroupId(@Nullable String networkGroupId) {
            this.networkGroupId = Input.ofNullable(networkGroupId);
            return this;
        }

        public NetworkManagerSecurityGroupItemArgs build() {
            return new NetworkManagerSecurityGroupItemArgs(networkGroupId);
        }
    }
}
