// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.azurenative.labservices.enums.ConnectionType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connection profile for how users connect to lab virtual machines.
 * 
 */
public final class ConnectionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileArgs Empty = new ConnectionProfileArgs();

    /**
     * The enabled access level for Client Access over RDP.
     * 
     */
    @Import(name="clientRdpAccess")
      private final @Nullable Output<ConnectionType> clientRdpAccess;

    public Output<ConnectionType> getClientRdpAccess() {
        return this.clientRdpAccess == null ? Output.empty() : this.clientRdpAccess;
    }

    /**
     * The enabled access level for Client Access over SSH.
     * 
     */
    @Import(name="clientSshAccess")
      private final @Nullable Output<ConnectionType> clientSshAccess;

    public Output<ConnectionType> getClientSshAccess() {
        return this.clientSshAccess == null ? Output.empty() : this.clientSshAccess;
    }

    /**
     * The enabled access level for Web Access over RDP.
     * 
     */
    @Import(name="webRdpAccess")
      private final @Nullable Output<ConnectionType> webRdpAccess;

    public Output<ConnectionType> getWebRdpAccess() {
        return this.webRdpAccess == null ? Output.empty() : this.webRdpAccess;
    }

    /**
     * The enabled access level for Web Access over SSH.
     * 
     */
    @Import(name="webSshAccess")
      private final @Nullable Output<ConnectionType> webSshAccess;

    public Output<ConnectionType> getWebSshAccess() {
        return this.webSshAccess == null ? Output.empty() : this.webSshAccess;
    }

    public ConnectionProfileArgs(
        @Nullable Output<ConnectionType> clientRdpAccess,
        @Nullable Output<ConnectionType> clientSshAccess,
        @Nullable Output<ConnectionType> webRdpAccess,
        @Nullable Output<ConnectionType> webSshAccess) {
        this.clientRdpAccess = clientRdpAccess == null ? Output.ofNullable(io.pulumi.azurenative.labservices.enums.ConnectionType.None) : clientRdpAccess;
        this.clientSshAccess = clientSshAccess == null ? Output.ofNullable(io.pulumi.azurenative.labservices.enums.ConnectionType.None) : clientSshAccess;
        this.webRdpAccess = webRdpAccess == null ? Output.ofNullable(io.pulumi.azurenative.labservices.enums.ConnectionType.None) : webRdpAccess;
        this.webSshAccess = webSshAccess == null ? Output.ofNullable(io.pulumi.azurenative.labservices.enums.ConnectionType.None) : webSshAccess;
    }

    private ConnectionProfileArgs() {
        this.clientRdpAccess = Output.empty();
        this.clientSshAccess = Output.empty();
        this.webRdpAccess = Output.empty();
        this.webSshAccess = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConnectionType> clientRdpAccess;
        private @Nullable Output<ConnectionType> clientSshAccess;
        private @Nullable Output<ConnectionType> webRdpAccess;
        private @Nullable Output<ConnectionType> webSshAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientRdpAccess = defaults.clientRdpAccess;
    	      this.clientSshAccess = defaults.clientSshAccess;
    	      this.webRdpAccess = defaults.webRdpAccess;
    	      this.webSshAccess = defaults.webSshAccess;
        }

        public Builder clientRdpAccess(@Nullable Output<ConnectionType> clientRdpAccess) {
            this.clientRdpAccess = clientRdpAccess;
            return this;
        }

        public Builder clientRdpAccess(@Nullable ConnectionType clientRdpAccess) {
            this.clientRdpAccess = Output.ofNullable(clientRdpAccess);
            return this;
        }

        public Builder clientSshAccess(@Nullable Output<ConnectionType> clientSshAccess) {
            this.clientSshAccess = clientSshAccess;
            return this;
        }

        public Builder clientSshAccess(@Nullable ConnectionType clientSshAccess) {
            this.clientSshAccess = Output.ofNullable(clientSshAccess);
            return this;
        }

        public Builder webRdpAccess(@Nullable Output<ConnectionType> webRdpAccess) {
            this.webRdpAccess = webRdpAccess;
            return this;
        }

        public Builder webRdpAccess(@Nullable ConnectionType webRdpAccess) {
            this.webRdpAccess = Output.ofNullable(webRdpAccess);
            return this;
        }

        public Builder webSshAccess(@Nullable Output<ConnectionType> webSshAccess) {
            this.webSshAccess = webSshAccess;
            return this;
        }

        public Builder webSshAccess(@Nullable ConnectionType webSshAccess) {
            this.webSshAccess = Output.ofNullable(webSshAccess);
            return this;
        }
        public ConnectionProfileArgs build() {
            return new ConnectionProfileArgs(clientRdpAccess, clientSshAccess, webRdpAccess, webSshAccess);
        }
    }
}
