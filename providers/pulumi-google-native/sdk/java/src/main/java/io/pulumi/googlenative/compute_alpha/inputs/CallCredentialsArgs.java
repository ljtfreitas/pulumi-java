// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.CallCredentialsCallCredentialType;
import io.pulumi.googlenative.compute_alpha.inputs.MetadataCredentialsFromPluginArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] gRPC call credentials to access the SDS server. gRPC call credentials to access the SDS server.
 * 
 */
public final class CallCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CallCredentialsArgs Empty = new CallCredentialsArgs();

    /**
     * The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
     * 
     */
    @InputImport(name="callCredentialType")
      private final @Nullable Input<CallCredentialsCallCredentialType> callCredentialType;

    public Input<CallCredentialsCallCredentialType> getCallCredentialType() {
        return this.callCredentialType == null ? Input.empty() : this.callCredentialType;
    }

    /**
     * Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
     * 
     */
    @InputImport(name="fromPlugin")
      private final @Nullable Input<MetadataCredentialsFromPluginArgs> fromPlugin;

    public Input<MetadataCredentialsFromPluginArgs> getFromPlugin() {
        return this.fromPlugin == null ? Input.empty() : this.fromPlugin;
    }

    public CallCredentialsArgs(
        @Nullable Input<CallCredentialsCallCredentialType> callCredentialType,
        @Nullable Input<MetadataCredentialsFromPluginArgs> fromPlugin) {
        this.callCredentialType = callCredentialType;
        this.fromPlugin = fromPlugin;
    }

    private CallCredentialsArgs() {
        this.callCredentialType = Input.empty();
        this.fromPlugin = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CallCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CallCredentialsCallCredentialType> callCredentialType;
        private @Nullable Input<MetadataCredentialsFromPluginArgs> fromPlugin;

        public Builder() {
    	      // Empty
        }

        public Builder(CallCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callCredentialType = defaults.callCredentialType;
    	      this.fromPlugin = defaults.fromPlugin;
        }

        public Builder setCallCredentialType(@Nullable Input<CallCredentialsCallCredentialType> callCredentialType) {
            this.callCredentialType = callCredentialType;
            return this;
        }

        public Builder setCallCredentialType(@Nullable CallCredentialsCallCredentialType callCredentialType) {
            this.callCredentialType = Input.ofNullable(callCredentialType);
            return this;
        }

        public Builder setFromPlugin(@Nullable Input<MetadataCredentialsFromPluginArgs> fromPlugin) {
            this.fromPlugin = fromPlugin;
            return this;
        }

        public Builder setFromPlugin(@Nullable MetadataCredentialsFromPluginArgs fromPlugin) {
            this.fromPlugin = Input.ofNullable(fromPlugin);
            return this;
        }
        public CallCredentialsArgs build() {
            return new CallCredentialsArgs(callCredentialType, fromPlugin);
        }
    }
}
