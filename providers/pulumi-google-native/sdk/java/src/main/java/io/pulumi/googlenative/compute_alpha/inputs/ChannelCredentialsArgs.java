// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.ChannelCredentialsChannelCredentialType;
import io.pulumi.googlenative.compute_alpha.inputs.TlsCertificatePathsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] gRPC channel credentials to access the SDS server. gRPC channel credentials to access the SDS server.
 * 
 */
public final class ChannelCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelCredentialsArgs Empty = new ChannelCredentialsArgs();

    /**
     * The call credentials to access the SDS server.
     * 
     */
    @InputImport(name="certificates")
      private final @Nullable Input<TlsCertificatePathsArgs> certificates;

    public Input<TlsCertificatePathsArgs> getCertificates() {
        return this.certificates == null ? Input.empty() : this.certificates;
    }

    /**
     * The channel credentials to access the SDS server. This field can be set to one of the following: CERTIFICATES: Use TLS certificates to access the SDS server. GCE_VM: Use local GCE VM credentials to access the SDS server.
     * 
     */
    @InputImport(name="channelCredentialType")
      private final @Nullable Input<ChannelCredentialsChannelCredentialType> channelCredentialType;

    public Input<ChannelCredentialsChannelCredentialType> getChannelCredentialType() {
        return this.channelCredentialType == null ? Input.empty() : this.channelCredentialType;
    }

    public ChannelCredentialsArgs(
        @Nullable Input<TlsCertificatePathsArgs> certificates,
        @Nullable Input<ChannelCredentialsChannelCredentialType> channelCredentialType) {
        this.certificates = certificates;
        this.channelCredentialType = channelCredentialType;
    }

    private ChannelCredentialsArgs() {
        this.certificates = Input.empty();
        this.channelCredentialType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TlsCertificatePathsArgs> certificates;
        private @Nullable Input<ChannelCredentialsChannelCredentialType> channelCredentialType;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.channelCredentialType = defaults.channelCredentialType;
        }

        public Builder setCertificates(@Nullable Input<TlsCertificatePathsArgs> certificates) {
            this.certificates = certificates;
            return this;
        }

        public Builder setCertificates(@Nullable TlsCertificatePathsArgs certificates) {
            this.certificates = Input.ofNullable(certificates);
            return this;
        }

        public Builder setChannelCredentialType(@Nullable Input<ChannelCredentialsChannelCredentialType> channelCredentialType) {
            this.channelCredentialType = channelCredentialType;
            return this;
        }

        public Builder setChannelCredentialType(@Nullable ChannelCredentialsChannelCredentialType channelCredentialType) {
            this.channelCredentialType = Input.ofNullable(channelCredentialType);
            return this;
        }
        public ChannelCredentialsArgs build() {
            return new ChannelCredentialsArgs(certificates, channelCredentialType);
        }
    }
}
