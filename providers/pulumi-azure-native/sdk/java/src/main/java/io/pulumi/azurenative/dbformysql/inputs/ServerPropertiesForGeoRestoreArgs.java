// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.inputs;

import io.pulumi.azurenative.dbformysql.enums.InfrastructureEncryption;
import io.pulumi.azurenative.dbformysql.enums.MinimalTlsVersionEnum;
import io.pulumi.azurenative.dbformysql.enums.PublicNetworkAccessEnum;
import io.pulumi.azurenative.dbformysql.enums.ServerVersion;
import io.pulumi.azurenative.dbformysql.enums.SslEnforcementEnum;
import io.pulumi.azurenative.dbformysql.inputs.StorageProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties used to create a new server by restoring to a different region from a geo replicated backup.
 * 
 */
public final class ServerPropertiesForGeoRestoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerPropertiesForGeoRestoreArgs Empty = new ServerPropertiesForGeoRestoreArgs();

    /**
     * The mode to create a new server.
     * Expected value is 'GeoRestore'.
     * 
     */
    @InputImport(name="createMode", required=true)
    private final Input<String> createMode;

    public Input<String> getCreateMode() {
        return this.createMode;
    }

    /**
     * Status showing whether the server enabled infrastructure encryption.
     * 
     */
    @InputImport(name="infrastructureEncryption")
    private final @Nullable Input<Either<String,InfrastructureEncryption>> infrastructureEncryption;

    public Input<Either<String,InfrastructureEncryption>> getInfrastructureEncryption() {
        return this.infrastructureEncryption == null ? Input.empty() : this.infrastructureEncryption;
    }

    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @InputImport(name="minimalTlsVersion")
    private final @Nullable Input<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;

    public Input<Either<String,MinimalTlsVersionEnum>> getMinimalTlsVersion() {
        return this.minimalTlsVersion == null ? Input.empty() : this.minimalTlsVersion;
    }

    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccessEnum>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * The source server id to restore from.
     * 
     */
    @InputImport(name="sourceServerId", required=true)
    private final Input<String> sourceServerId;

    public Input<String> getSourceServerId() {
        return this.sourceServerId;
    }

    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @InputImport(name="sslEnforcement")
    private final @Nullable Input<SslEnforcementEnum> sslEnforcement;

    public Input<SslEnforcementEnum> getSslEnforcement() {
        return this.sslEnforcement == null ? Input.empty() : this.sslEnforcement;
    }

    /**
     * Storage profile of a server.
     * 
     */
    @InputImport(name="storageProfile")
    private final @Nullable Input<StorageProfileArgs> storageProfile;

    public Input<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Input.empty() : this.storageProfile;
    }

    /**
     * Server version.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<Either<String,ServerVersion>> version;

    public Input<Either<String,ServerVersion>> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ServerPropertiesForGeoRestoreArgs(
        Input<String> createMode,
        @Nullable Input<Either<String,InfrastructureEncryption>> infrastructureEncryption,
        @Nullable Input<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion,
        @Nullable Input<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess,
        Input<String> sourceServerId,
        @Nullable Input<SslEnforcementEnum> sslEnforcement,
        @Nullable Input<StorageProfileArgs> storageProfile,
        @Nullable Input<Either<String,ServerVersion>> version) {
        this.createMode = Objects.requireNonNull(createMode, "expected parameter 'createMode' to be non-null");
        this.infrastructureEncryption = infrastructureEncryption;
        this.minimalTlsVersion = minimalTlsVersion;
        this.publicNetworkAccess = publicNetworkAccess;
        this.sourceServerId = Objects.requireNonNull(sourceServerId, "expected parameter 'sourceServerId' to be non-null");
        this.sslEnforcement = sslEnforcement;
        this.storageProfile = storageProfile;
        this.version = version;
    }

    private ServerPropertiesForGeoRestoreArgs() {
        this.createMode = Input.empty();
        this.infrastructureEncryption = Input.empty();
        this.minimalTlsVersion = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.sourceServerId = Input.empty();
        this.sslEnforcement = Input.empty();
        this.storageProfile = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPropertiesForGeoRestoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> createMode;
        private @Nullable Input<Either<String,InfrastructureEncryption>> infrastructureEncryption;
        private @Nullable Input<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;
        private @Nullable Input<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;
        private Input<String> sourceServerId;
        private @Nullable Input<SslEnforcementEnum> sslEnforcement;
        private @Nullable Input<StorageProfileArgs> storageProfile;
        private @Nullable Input<Either<String,ServerVersion>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPropertiesForGeoRestoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createMode = defaults.createMode;
    	      this.infrastructureEncryption = defaults.infrastructureEncryption;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.sourceServerId = defaults.sourceServerId;
    	      this.sslEnforcement = defaults.sslEnforcement;
    	      this.storageProfile = defaults.storageProfile;
    	      this.version = defaults.version;
        }

        public Builder setCreateMode(Input<String> createMode) {
            this.createMode = Objects.requireNonNull(createMode);
            return this;
        }

        public Builder setCreateMode(String createMode) {
            this.createMode = Input.of(Objects.requireNonNull(createMode));
            return this;
        }

        public Builder setInfrastructureEncryption(@Nullable Input<Either<String,InfrastructureEncryption>> infrastructureEncryption) {
            this.infrastructureEncryption = infrastructureEncryption;
            return this;
        }

        public Builder setInfrastructureEncryption(@Nullable Either<String,InfrastructureEncryption> infrastructureEncryption) {
            this.infrastructureEncryption = Input.ofNullable(infrastructureEncryption);
            return this;
        }

        public Builder setMinimalTlsVersion(@Nullable Input<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }

        public Builder setMinimalTlsVersion(@Nullable Either<String,MinimalTlsVersionEnum> minimalTlsVersion) {
            this.minimalTlsVersion = Input.ofNullable(minimalTlsVersion);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccessEnum> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder setSourceServerId(Input<String> sourceServerId) {
            this.sourceServerId = Objects.requireNonNull(sourceServerId);
            return this;
        }

        public Builder setSourceServerId(String sourceServerId) {
            this.sourceServerId = Input.of(Objects.requireNonNull(sourceServerId));
            return this;
        }

        public Builder setSslEnforcement(@Nullable Input<SslEnforcementEnum> sslEnforcement) {
            this.sslEnforcement = sslEnforcement;
            return this;
        }

        public Builder setSslEnforcement(@Nullable SslEnforcementEnum sslEnforcement) {
            this.sslEnforcement = Input.ofNullable(sslEnforcement);
            return this;
        }

        public Builder setStorageProfile(@Nullable Input<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Input.ofNullable(storageProfile);
            return this;
        }

        public Builder setVersion(@Nullable Input<Either<String,ServerVersion>> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Either<String,ServerVersion> version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public ServerPropertiesForGeoRestoreArgs build() {
            return new ServerPropertiesForGeoRestoreArgs(createMode, infrastructureEncryption, minimalTlsVersion, publicNetworkAccess, sourceServerId, sslEnforcement, storageProfile, version);
        }
    }
}
