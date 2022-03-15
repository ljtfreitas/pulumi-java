// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.azurenative.signalrservice.enums.ACLAction;
import io.pulumi.azurenative.signalrservice.inputs.NetworkACLArgs;
import io.pulumi.azurenative.signalrservice.inputs.PrivateEndpointACLArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network ACLs for SignalR
 * 
 */
public final class SignalRNetworkACLsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SignalRNetworkACLsArgs Empty = new SignalRNetworkACLsArgs();

    /**
     * Default action when no other rule matches
     * 
     */
    @Import(name="defaultAction")
      private final @Nullable Output<Either<String,ACLAction>> defaultAction;

    public Output<Either<String,ACLAction>> getDefaultAction() {
        return this.defaultAction == null ? Output.empty() : this.defaultAction;
    }

    /**
     * ACLs for requests from private endpoints
     * 
     */
    @Import(name="privateEndpoints")
      private final @Nullable Output<List<PrivateEndpointACLArgs>> privateEndpoints;

    public Output<List<PrivateEndpointACLArgs>> getPrivateEndpoints() {
        return this.privateEndpoints == null ? Output.empty() : this.privateEndpoints;
    }

    /**
     * ACL for requests from public network
     * 
     */
    @Import(name="publicNetwork")
      private final @Nullable Output<NetworkACLArgs> publicNetwork;

    public Output<NetworkACLArgs> getPublicNetwork() {
        return this.publicNetwork == null ? Output.empty() : this.publicNetwork;
    }

    public SignalRNetworkACLsArgs(
        @Nullable Output<Either<String,ACLAction>> defaultAction,
        @Nullable Output<List<PrivateEndpointACLArgs>> privateEndpoints,
        @Nullable Output<NetworkACLArgs> publicNetwork) {
        this.defaultAction = defaultAction == null ? Output.ofLeft("Deny") : defaultAction;
        this.privateEndpoints = privateEndpoints;
        this.publicNetwork = publicNetwork;
    }

    private SignalRNetworkACLsArgs() {
        this.defaultAction = Output.empty();
        this.privateEndpoints = Output.empty();
        this.publicNetwork = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRNetworkACLsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ACLAction>> defaultAction;
        private @Nullable Output<List<PrivateEndpointACLArgs>> privateEndpoints;
        private @Nullable Output<NetworkACLArgs> publicNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRNetworkACLsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.privateEndpoints = defaults.privateEndpoints;
    	      this.publicNetwork = defaults.publicNetwork;
        }

        public Builder defaultAction(@Nullable Output<Either<String,ACLAction>> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder defaultAction(@Nullable Either<String,ACLAction> defaultAction) {
            this.defaultAction = Output.ofNullable(defaultAction);
            return this;
        }

        public Builder privateEndpoints(@Nullable Output<List<PrivateEndpointACLArgs>> privateEndpoints) {
            this.privateEndpoints = privateEndpoints;
            return this;
        }

        public Builder privateEndpoints(@Nullable List<PrivateEndpointACLArgs> privateEndpoints) {
            this.privateEndpoints = Output.ofNullable(privateEndpoints);
            return this;
        }

        public Builder publicNetwork(@Nullable Output<NetworkACLArgs> publicNetwork) {
            this.publicNetwork = publicNetwork;
            return this;
        }

        public Builder publicNetwork(@Nullable NetworkACLArgs publicNetwork) {
            this.publicNetwork = Output.ofNullable(publicNetwork);
            return this;
        }
        public SignalRNetworkACLsArgs build() {
            return new SignalRNetworkACLsArgs(defaultAction, privateEndpoints, publicNetwork);
        }
    }
}
