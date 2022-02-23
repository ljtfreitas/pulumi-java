// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.ClusterDefinitionResponse;
import io.pulumi.azurenative.hdinsight.outputs.ComputeIsolationPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.ComputeProfileResponse;
import io.pulumi.azurenative.hdinsight.outputs.ConnectivityEndpointResponse;
import io.pulumi.azurenative.hdinsight.outputs.DiskEncryptionPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.EncryptionInTransitPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.ErrorsResponse;
import io.pulumi.azurenative.hdinsight.outputs.ExcludedServicesConfigResponse;
import io.pulumi.azurenative.hdinsight.outputs.KafkaRestPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.NetworkPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.QuotaInfoResponse;
import io.pulumi.azurenative.hdinsight.outputs.SecurityProfileResponse;
import io.pulumi.azurenative.hdinsight.outputs.StorageProfileResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterGetPropertiesResponse {
    /**
     * The cluster definition.
     * 
     */
    private final ClusterDefinitionResponse clusterDefinition;
    /**
     * The hdp version of the cluster.
     * 
     */
    private final @Nullable String clusterHdpVersion;
    /**
     * The cluster id.
     * 
     */
    private final @Nullable String clusterId;
    /**
     * The state of the cluster.
     * 
     */
    private final @Nullable String clusterState;
    /**
     * The version of the cluster.
     * 
     */
    private final @Nullable String clusterVersion;
    /**
     * The compute isolation properties.
     * 
     */
    private final @Nullable ComputeIsolationPropertiesResponse computeIsolationProperties;
    /**
     * The compute profile.
     * 
     */
    private final @Nullable ComputeProfileResponse computeProfile;
    /**
     * The list of connectivity endpoints.
     * 
     */
    private final @Nullable List<ConnectivityEndpointResponse> connectivityEndpoints;
    /**
     * The date on which the cluster was created.
     * 
     */
    private final @Nullable String createdDate;
    /**
     * The disk encryption properties.
     * 
     */
    private final @Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties;
    /**
     * The encryption-in-transit properties.
     * 
     */
    private final @Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties;
    /**
     * The list of errors.
     * 
     */
    private final @Nullable List<ErrorsResponse> errors;
    /**
     * The excluded services config.
     * 
     */
    private final @Nullable ExcludedServicesConfigResponse excludedServicesConfig;
    /**
     * The cluster kafka rest proxy configuration.
     * 
     */
    private final @Nullable KafkaRestPropertiesResponse kafkaRestProperties;
    /**
     * The minimal supported tls version.
     * 
     */
    private final @Nullable String minSupportedTlsVersion;
    /**
     * The network properties.
     * 
     */
    private final @Nullable NetworkPropertiesResponse networkProperties;
    /**
     * The type of operating system.
     * 
     */
    private final @Nullable String osType;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The quota information.
     * 
     */
    private final @Nullable QuotaInfoResponse quotaInfo;
    /**
     * The security profile.
     * 
     */
    private final @Nullable SecurityProfileResponse securityProfile;
    /**
     * The storage profile.
     * 
     */
    private final @Nullable StorageProfileResponse storageProfile;
    /**
     * The cluster tier.
     * 
     */
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"clusterDefinition","clusterHdpVersion","clusterId","clusterState","clusterVersion","computeIsolationProperties","computeProfile","connectivityEndpoints","createdDate","diskEncryptionProperties","encryptionInTransitProperties","errors","excludedServicesConfig","kafkaRestProperties","minSupportedTlsVersion","networkProperties","osType","provisioningState","quotaInfo","securityProfile","storageProfile","tier"})
    private ClusterGetPropertiesResponse(
        ClusterDefinitionResponse clusterDefinition,
        @Nullable String clusterHdpVersion,
        @Nullable String clusterId,
        @Nullable String clusterState,
        @Nullable String clusterVersion,
        @Nullable ComputeIsolationPropertiesResponse computeIsolationProperties,
        @Nullable ComputeProfileResponse computeProfile,
        @Nullable List<ConnectivityEndpointResponse> connectivityEndpoints,
        @Nullable String createdDate,
        @Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties,
        @Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties,
        @Nullable List<ErrorsResponse> errors,
        @Nullable ExcludedServicesConfigResponse excludedServicesConfig,
        @Nullable KafkaRestPropertiesResponse kafkaRestProperties,
        @Nullable String minSupportedTlsVersion,
        @Nullable NetworkPropertiesResponse networkProperties,
        @Nullable String osType,
        @Nullable String provisioningState,
        @Nullable QuotaInfoResponse quotaInfo,
        @Nullable SecurityProfileResponse securityProfile,
        @Nullable StorageProfileResponse storageProfile,
        @Nullable String tier) {
        this.clusterDefinition = Objects.requireNonNull(clusterDefinition);
        this.clusterHdpVersion = clusterHdpVersion;
        this.clusterId = clusterId;
        this.clusterState = clusterState;
        this.clusterVersion = clusterVersion;
        this.computeIsolationProperties = computeIsolationProperties;
        this.computeProfile = computeProfile;
        this.connectivityEndpoints = connectivityEndpoints;
        this.createdDate = createdDate;
        this.diskEncryptionProperties = diskEncryptionProperties;
        this.encryptionInTransitProperties = encryptionInTransitProperties;
        this.errors = errors;
        this.excludedServicesConfig = excludedServicesConfig;
        this.kafkaRestProperties = kafkaRestProperties;
        this.minSupportedTlsVersion = minSupportedTlsVersion;
        this.networkProperties = networkProperties;
        this.osType = osType;
        this.provisioningState = provisioningState;
        this.quotaInfo = quotaInfo;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.tier = tier;
    }

    /**
     * The cluster definition.
     * 
     */
    public ClusterDefinitionResponse getClusterDefinition() {
        return this.clusterDefinition;
    }
    /**
     * The hdp version of the cluster.
     * 
     */
    public Optional<String> getClusterHdpVersion() {
        return Optional.ofNullable(this.clusterHdpVersion);
    }
    /**
     * The cluster id.
     * 
     */
    public Optional<String> getClusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * The state of the cluster.
     * 
     */
    public Optional<String> getClusterState() {
        return Optional.ofNullable(this.clusterState);
    }
    /**
     * The version of the cluster.
     * 
     */
    public Optional<String> getClusterVersion() {
        return Optional.ofNullable(this.clusterVersion);
    }
    /**
     * The compute isolation properties.
     * 
     */
    public Optional<ComputeIsolationPropertiesResponse> getComputeIsolationProperties() {
        return Optional.ofNullable(this.computeIsolationProperties);
    }
    /**
     * The compute profile.
     * 
     */
    public Optional<ComputeProfileResponse> getComputeProfile() {
        return Optional.ofNullable(this.computeProfile);
    }
    /**
     * The list of connectivity endpoints.
     * 
     */
    public List<ConnectivityEndpointResponse> getConnectivityEndpoints() {
        return this.connectivityEndpoints == null ? List.of() : this.connectivityEndpoints;
    }
    /**
     * The date on which the cluster was created.
     * 
     */
    public Optional<String> getCreatedDate() {
        return Optional.ofNullable(this.createdDate);
    }
    /**
     * The disk encryption properties.
     * 
     */
    public Optional<DiskEncryptionPropertiesResponse> getDiskEncryptionProperties() {
        return Optional.ofNullable(this.diskEncryptionProperties);
    }
    /**
     * The encryption-in-transit properties.
     * 
     */
    public Optional<EncryptionInTransitPropertiesResponse> getEncryptionInTransitProperties() {
        return Optional.ofNullable(this.encryptionInTransitProperties);
    }
    /**
     * The list of errors.
     * 
     */
    public List<ErrorsResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * The excluded services config.
     * 
     */
    public Optional<ExcludedServicesConfigResponse> getExcludedServicesConfig() {
        return Optional.ofNullable(this.excludedServicesConfig);
    }
    /**
     * The cluster kafka rest proxy configuration.
     * 
     */
    public Optional<KafkaRestPropertiesResponse> getKafkaRestProperties() {
        return Optional.ofNullable(this.kafkaRestProperties);
    }
    /**
     * The minimal supported tls version.
     * 
     */
    public Optional<String> getMinSupportedTlsVersion() {
        return Optional.ofNullable(this.minSupportedTlsVersion);
    }
    /**
     * The network properties.
     * 
     */
    public Optional<NetworkPropertiesResponse> getNetworkProperties() {
        return Optional.ofNullable(this.networkProperties);
    }
    /**
     * The type of operating system.
     * 
     */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The quota information.
     * 
     */
    public Optional<QuotaInfoResponse> getQuotaInfo() {
        return Optional.ofNullable(this.quotaInfo);
    }
    /**
     * The security profile.
     * 
     */
    public Optional<SecurityProfileResponse> getSecurityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }
    /**
     * The storage profile.
     * 
     */
    public Optional<StorageProfileResponse> getStorageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    /**
     * The cluster tier.
     * 
     */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterDefinitionResponse clusterDefinition;
        private @Nullable String clusterHdpVersion;
        private @Nullable String clusterId;
        private @Nullable String clusterState;
        private @Nullable String clusterVersion;
        private @Nullable ComputeIsolationPropertiesResponse computeIsolationProperties;
        private @Nullable ComputeProfileResponse computeProfile;
        private @Nullable List<ConnectivityEndpointResponse> connectivityEndpoints;
        private @Nullable String createdDate;
        private @Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties;
        private @Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties;
        private @Nullable List<ErrorsResponse> errors;
        private @Nullable ExcludedServicesConfigResponse excludedServicesConfig;
        private @Nullable KafkaRestPropertiesResponse kafkaRestProperties;
        private @Nullable String minSupportedTlsVersion;
        private @Nullable NetworkPropertiesResponse networkProperties;
        private @Nullable String osType;
        private @Nullable String provisioningState;
        private @Nullable QuotaInfoResponse quotaInfo;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable StorageProfileResponse storageProfile;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterGetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDefinition = defaults.clusterDefinition;
    	      this.clusterHdpVersion = defaults.clusterHdpVersion;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterState = defaults.clusterState;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.computeIsolationProperties = defaults.computeIsolationProperties;
    	      this.computeProfile = defaults.computeProfile;
    	      this.connectivityEndpoints = defaults.connectivityEndpoints;
    	      this.createdDate = defaults.createdDate;
    	      this.diskEncryptionProperties = defaults.diskEncryptionProperties;
    	      this.encryptionInTransitProperties = defaults.encryptionInTransitProperties;
    	      this.errors = defaults.errors;
    	      this.excludedServicesConfig = defaults.excludedServicesConfig;
    	      this.kafkaRestProperties = defaults.kafkaRestProperties;
    	      this.minSupportedTlsVersion = defaults.minSupportedTlsVersion;
    	      this.networkProperties = defaults.networkProperties;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.quotaInfo = defaults.quotaInfo;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tier = defaults.tier;
        }

        public Builder setClusterDefinition(ClusterDefinitionResponse clusterDefinition) {
            this.clusterDefinition = Objects.requireNonNull(clusterDefinition);
            return this;
        }

        public Builder setClusterHdpVersion(@Nullable String clusterHdpVersion) {
            this.clusterHdpVersion = clusterHdpVersion;
            return this;
        }

        public Builder setClusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder setClusterState(@Nullable String clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        public Builder setClusterVersion(@Nullable String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }

        public Builder setComputeIsolationProperties(@Nullable ComputeIsolationPropertiesResponse computeIsolationProperties) {
            this.computeIsolationProperties = computeIsolationProperties;
            return this;
        }

        public Builder setComputeProfile(@Nullable ComputeProfileResponse computeProfile) {
            this.computeProfile = computeProfile;
            return this;
        }

        public Builder setConnectivityEndpoints(@Nullable List<ConnectivityEndpointResponse> connectivityEndpoints) {
            this.connectivityEndpoints = connectivityEndpoints;
            return this;
        }

        public Builder setCreatedDate(@Nullable String createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setDiskEncryptionProperties(@Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties) {
            this.diskEncryptionProperties = diskEncryptionProperties;
            return this;
        }

        public Builder setEncryptionInTransitProperties(@Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties) {
            this.encryptionInTransitProperties = encryptionInTransitProperties;
            return this;
        }

        public Builder setErrors(@Nullable List<ErrorsResponse> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setExcludedServicesConfig(@Nullable ExcludedServicesConfigResponse excludedServicesConfig) {
            this.excludedServicesConfig = excludedServicesConfig;
            return this;
        }

        public Builder setKafkaRestProperties(@Nullable KafkaRestPropertiesResponse kafkaRestProperties) {
            this.kafkaRestProperties = kafkaRestProperties;
            return this;
        }

        public Builder setMinSupportedTlsVersion(@Nullable String minSupportedTlsVersion) {
            this.minSupportedTlsVersion = minSupportedTlsVersion;
            return this;
        }

        public Builder setNetworkProperties(@Nullable NetworkPropertiesResponse networkProperties) {
            this.networkProperties = networkProperties;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setQuotaInfo(@Nullable QuotaInfoResponse quotaInfo) {
            this.quotaInfo = quotaInfo;
            return this;
        }

        public Builder setSecurityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable StorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public ClusterGetPropertiesResponse build() {
            return new ClusterGetPropertiesResponse(clusterDefinition, clusterHdpVersion, clusterId, clusterState, clusterVersion, computeIsolationProperties, computeProfile, connectivityEndpoints, createdDate, diskEncryptionProperties, encryptionInTransitProperties, errors, excludedServicesConfig, kafkaRestProperties, minSupportedTlsVersion, networkProperties, osType, provisioningState, quotaInfo, securityProfile, storageProfile, tier);
        }
    }
}
