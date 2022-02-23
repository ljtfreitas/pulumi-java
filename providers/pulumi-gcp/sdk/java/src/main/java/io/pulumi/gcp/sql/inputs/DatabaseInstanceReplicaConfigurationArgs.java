// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceReplicaConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceReplicaConfigurationArgs Empty = new DatabaseInstanceReplicaConfigurationArgs();

    /**
     * PEM representation of the trusted CA's x509
     * certificate.
     * 
     */
    @InputImport(name="caCertificate")
        private final @Nullable Input<String> caCertificate;

    public Input<String> getCaCertificate() {
        return this.caCertificate == null ? Input.empty() : this.caCertificate;
    }

    /**
     * PEM representation of the replica's x509
     * certificate.
     * 
     */
    @InputImport(name="clientCertificate")
        private final @Nullable Input<String> clientCertificate;

    public Input<String> getClientCertificate() {
        return this.clientCertificate == null ? Input.empty() : this.clientCertificate;
    }

    /**
     * PEM representation of the replica's private key. The
     * corresponding public key in encoded in the `client_certificate`.
     * 
     */
    @InputImport(name="clientKey")
        private final @Nullable Input<String> clientKey;

    public Input<String> getClientKey() {
        return this.clientKey == null ? Input.empty() : this.clientKey;
    }

    /**
     * The number of seconds
     * between connect retries.
     * 
     */
    @InputImport(name="connectRetryInterval")
        private final @Nullable Input<Integer> connectRetryInterval;

    public Input<Integer> getConnectRetryInterval() {
        return this.connectRetryInterval == null ? Input.empty() : this.connectRetryInterval;
    }

    /**
     * Path to a SQL file in GCS from which replica
     * instances are created. Format is `gs://bucket/filename`.
     * 
     */
    @InputImport(name="dumpFilePath")
        private final @Nullable Input<String> dumpFilePath;

    public Input<String> getDumpFilePath() {
        return this.dumpFilePath == null ? Input.empty() : this.dumpFilePath;
    }

    /**
     * Specifies if the replica is the failover target.
     * If the field is set to true the replica will be designated as a failover replica.
     * If the master instance fails, the replica instance will be promoted as
     * the new master instance.
     * 
     */
    @InputImport(name="failoverTarget")
        private final @Nullable Input<Boolean> failoverTarget;

    public Input<Boolean> getFailoverTarget() {
        return this.failoverTarget == null ? Input.empty() : this.failoverTarget;
    }

    /**
     * Time in ms between replication
     * heartbeats.
     * 
     */
    @InputImport(name="masterHeartbeatPeriod")
        private final @Nullable Input<Integer> masterHeartbeatPeriod;

    public Input<Integer> getMasterHeartbeatPeriod() {
        return this.masterHeartbeatPeriod == null ? Input.empty() : this.masterHeartbeatPeriod;
    }

    /**
     * Password for the replication connection.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    @InputImport(name="sslCipher")
        private final @Nullable Input<String> sslCipher;

    public Input<String> getSslCipher() {
        return this.sslCipher == null ? Input.empty() : this.sslCipher;
    }

    /**
     * Username for replication connection.
     * 
     */
    @InputImport(name="username")
        private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    /**
     * True if the master's common name
     * value is checked during the SSL handshake.
     * 
     */
    @InputImport(name="verifyServerCertificate")
        private final @Nullable Input<Boolean> verifyServerCertificate;

    public Input<Boolean> getVerifyServerCertificate() {
        return this.verifyServerCertificate == null ? Input.empty() : this.verifyServerCertificate;
    }

    public DatabaseInstanceReplicaConfigurationArgs(
        @Nullable Input<String> caCertificate,
        @Nullable Input<String> clientCertificate,
        @Nullable Input<String> clientKey,
        @Nullable Input<Integer> connectRetryInterval,
        @Nullable Input<String> dumpFilePath,
        @Nullable Input<Boolean> failoverTarget,
        @Nullable Input<Integer> masterHeartbeatPeriod,
        @Nullable Input<String> password,
        @Nullable Input<String> sslCipher,
        @Nullable Input<String> username,
        @Nullable Input<Boolean> verifyServerCertificate) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.connectRetryInterval = connectRetryInterval;
        this.dumpFilePath = dumpFilePath;
        this.failoverTarget = failoverTarget;
        this.masterHeartbeatPeriod = masterHeartbeatPeriod;
        this.password = password;
        this.sslCipher = sslCipher;
        this.username = username;
        this.verifyServerCertificate = verifyServerCertificate;
    }

    private DatabaseInstanceReplicaConfigurationArgs() {
        this.caCertificate = Input.empty();
        this.clientCertificate = Input.empty();
        this.clientKey = Input.empty();
        this.connectRetryInterval = Input.empty();
        this.dumpFilePath = Input.empty();
        this.failoverTarget = Input.empty();
        this.masterHeartbeatPeriod = Input.empty();
        this.password = Input.empty();
        this.sslCipher = Input.empty();
        this.username = Input.empty();
        this.verifyServerCertificate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceReplicaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> caCertificate;
        private @Nullable Input<String> clientCertificate;
        private @Nullable Input<String> clientKey;
        private @Nullable Input<Integer> connectRetryInterval;
        private @Nullable Input<String> dumpFilePath;
        private @Nullable Input<Boolean> failoverTarget;
        private @Nullable Input<Integer> masterHeartbeatPeriod;
        private @Nullable Input<String> password;
        private @Nullable Input<String> sslCipher;
        private @Nullable Input<String> username;
        private @Nullable Input<Boolean> verifyServerCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceReplicaConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.connectRetryInterval = defaults.connectRetryInterval;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.failoverTarget = defaults.failoverTarget;
    	      this.masterHeartbeatPeriod = defaults.masterHeartbeatPeriod;
    	      this.password = defaults.password;
    	      this.sslCipher = defaults.sslCipher;
    	      this.username = defaults.username;
    	      this.verifyServerCertificate = defaults.verifyServerCertificate;
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

        public Builder setConnectRetryInterval(@Nullable Input<Integer> connectRetryInterval) {
            this.connectRetryInterval = connectRetryInterval;
            return this;
        }

        public Builder setConnectRetryInterval(@Nullable Integer connectRetryInterval) {
            this.connectRetryInterval = Input.ofNullable(connectRetryInterval);
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

        public Builder setFailoverTarget(@Nullable Input<Boolean> failoverTarget) {
            this.failoverTarget = failoverTarget;
            return this;
        }

        public Builder setFailoverTarget(@Nullable Boolean failoverTarget) {
            this.failoverTarget = Input.ofNullable(failoverTarget);
            return this;
        }

        public Builder setMasterHeartbeatPeriod(@Nullable Input<Integer> masterHeartbeatPeriod) {
            this.masterHeartbeatPeriod = masterHeartbeatPeriod;
            return this;
        }

        public Builder setMasterHeartbeatPeriod(@Nullable Integer masterHeartbeatPeriod) {
            this.masterHeartbeatPeriod = Input.ofNullable(masterHeartbeatPeriod);
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

        public Builder setSslCipher(@Nullable Input<String> sslCipher) {
            this.sslCipher = sslCipher;
            return this;
        }

        public Builder setSslCipher(@Nullable String sslCipher) {
            this.sslCipher = Input.ofNullable(sslCipher);
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

        public Builder setVerifyServerCertificate(@Nullable Input<Boolean> verifyServerCertificate) {
            this.verifyServerCertificate = verifyServerCertificate;
            return this;
        }

        public Builder setVerifyServerCertificate(@Nullable Boolean verifyServerCertificate) {
            this.verifyServerCertificate = Input.ofNullable(verifyServerCertificate);
            return this;
        }
        public DatabaseInstanceReplicaConfigurationArgs build() {
            return new DatabaseInstanceReplicaConfigurationArgs(caCertificate, clientCertificate, clientKey, connectRetryInterval, dumpFilePath, failoverTarget, masterHeartbeatPeriod, password, sslCipher, username, verifyServerCertificate);
        }
    }
}
