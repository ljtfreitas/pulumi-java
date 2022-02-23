// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.InstanceReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * On-premises instance configuration.
 * 
 */
public final class OnPremisesConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnPremisesConfigurationArgs Empty = new OnPremisesConfigurationArgs();

    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
     */
    @InputImport(name="caCertificate")
      private final @Nullable Input<String> caCertificate;

    public Input<String> getCaCertificate() {
        return this.caCertificate == null ? Input.empty() : this.caCertificate;
    }

    /**
     * PEM representation of the replica's x509 certificate.
     * 
     */
    @InputImport(name="clientCertificate")
      private final @Nullable Input<String> clientCertificate;

    public Input<String> getClientCertificate() {
        return this.clientCertificate == null ? Input.empty() : this.clientCertificate;
    }

    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
     */
    @InputImport(name="clientKey")
      private final @Nullable Input<String> clientKey;

    public Input<String> getClientKey() {
        return this.clientKey == null ? Input.empty() : this.clientKey;
    }

    /**
     * The dump file to create the Cloud SQL replica.
     * 
     */
    @InputImport(name="dumpFilePath")
      private final @Nullable Input<String> dumpFilePath;

    public Input<String> getDumpFilePath() {
        return this.dumpFilePath == null ? Input.empty() : this.dumpFilePath;
    }

    /**
     * The host and port of the on-premises instance in host:port format
     * 
     */
    @InputImport(name="hostPort")
      private final @Nullable Input<String> hostPort;

    public Input<String> getHostPort() {
        return this.hostPort == null ? Input.empty() : this.hostPort;
    }

    /**
     * This is always `sql#onPremisesConfiguration`.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The password for connecting to on-premises instance.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The reference to Cloud SQL instance if the source is Cloud SQL.
     * 
     */
    @InputImport(name="sourceInstance")
      private final @Nullable Input<InstanceReferenceArgs> sourceInstance;

    public Input<InstanceReferenceArgs> getSourceInstance() {
        return this.sourceInstance == null ? Input.empty() : this.sourceInstance;
    }

    /**
     * The username for connecting to on-premises instance.
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public OnPremisesConfigurationArgs(
        @Nullable Input<String> caCertificate,
        @Nullable Input<String> clientCertificate,
        @Nullable Input<String> clientKey,
        @Nullable Input<String> dumpFilePath,
        @Nullable Input<String> hostPort,
        @Nullable Input<String> kind,
        @Nullable Input<String> password,
        @Nullable Input<InstanceReferenceArgs> sourceInstance,
        @Nullable Input<String> username) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.dumpFilePath = dumpFilePath;
        this.hostPort = hostPort;
        this.kind = kind;
        this.password = password;
        this.sourceInstance = sourceInstance;
        this.username = username;
    }

    private OnPremisesConfigurationArgs() {
        this.caCertificate = Input.empty();
        this.clientCertificate = Input.empty();
        this.clientKey = Input.empty();
        this.dumpFilePath = Input.empty();
        this.hostPort = Input.empty();
        this.kind = Input.empty();
        this.password = Input.empty();
        this.sourceInstance = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremisesConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> caCertificate;
        private @Nullable Input<String> clientCertificate;
        private @Nullable Input<String> clientKey;
        private @Nullable Input<String> dumpFilePath;
        private @Nullable Input<String> hostPort;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> password;
        private @Nullable Input<InstanceReferenceArgs> sourceInstance;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremisesConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.hostPort = defaults.hostPort;
    	      this.kind = defaults.kind;
    	      this.password = defaults.password;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.username = defaults.username;
        }

        public Builder setCaCertificate(@Nullable Input<String> caCertificate) {
            this.caCertificate = caCertificate;
            return this;
        }

        public Builder setCaCertificate(@Nullable String caCertificate) {
            this.caCertificate = Input.ofNullable(caCertificate);
            return this;
        }

        public Builder setClientCertificate(@Nullable Input<String> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }

        public Builder setClientCertificate(@Nullable String clientCertificate) {
            this.clientCertificate = Input.ofNullable(clientCertificate);
            return this;
        }

        public Builder setClientKey(@Nullable Input<String> clientKey) {
            this.clientKey = clientKey;
            return this;
        }

        public Builder setClientKey(@Nullable String clientKey) {
            this.clientKey = Input.ofNullable(clientKey);
            return this;
        }

        public Builder setDumpFilePath(@Nullable Input<String> dumpFilePath) {
            this.dumpFilePath = dumpFilePath;
            return this;
        }

        public Builder setDumpFilePath(@Nullable String dumpFilePath) {
            this.dumpFilePath = Input.ofNullable(dumpFilePath);
            return this;
        }

        public Builder setHostPort(@Nullable Input<String> hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        public Builder setHostPort(@Nullable String hostPort) {
            this.hostPort = Input.ofNullable(hostPort);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setSourceInstance(@Nullable Input<InstanceReferenceArgs> sourceInstance) {
            this.sourceInstance = sourceInstance;
            return this;
        }

        public Builder setSourceInstance(@Nullable InstanceReferenceArgs sourceInstance) {
            this.sourceInstance = Input.ofNullable(sourceInstance);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public OnPremisesConfigurationArgs build() {
            return new OnPremisesConfigurationArgs(caCertificate, clientCertificate, clientKey, dumpFilePath, hostPort, kind, password, sourceInstance, username);
        }
    }
}
