// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="networkGroupId")
      private final @Nullable Output<String> networkGroupId;

    public Output<String> getNetworkGroupId() {
        return this.networkGroupId == null ? Output.empty() : this.networkGroupId;
    }

    public NetworkManagerSecurityGroupItemArgs(@Nullable Output<String> networkGroupId) {
        this.networkGroupId = networkGroupId;
    }

    private NetworkManagerSecurityGroupItemArgs() {
        this.networkGroupId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerSecurityGroupItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> networkGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkManagerSecurityGroupItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkGroupId = defaults.networkGroupId;
        }

        public Builder networkGroupId(@Nullable Output<String> networkGroupId) {
            this.networkGroupId = networkGroupId;
            return this;
        }

        public Builder networkGroupId(@Nullable String networkGroupId) {
            this.networkGroupId = Output.ofNullable(networkGroupId);
            return this;
        }
        public NetworkManagerSecurityGroupItemArgs build() {
            return new NetworkManagerSecurityGroupItemArgs(networkGroupId);
        }
    }
}
