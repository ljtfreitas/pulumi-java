// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.AksNetworkingConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.SslConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.SystemServiceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AKS properties
 * 
 */
public final class AKSResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final AKSResponseProperties Empty = new AKSResponseProperties();

    /**
     * Number of agents
     * 
     */
    @InputImport(name="agentCount")
        private final @Nullable Integer agentCount;

    public Optional<Integer> getAgentCount() {
        return this.agentCount == null ? Optional.empty() : Optional.ofNullable(this.agentCount);
    }

    /**
     * Agent virtual machine size
     * 
     */
    @InputImport(name="agentVmSize")
        private final @Nullable String agentVmSize;

    public Optional<String> getAgentVmSize() {
        return this.agentVmSize == null ? Optional.empty() : Optional.ofNullable(this.agentVmSize);
    }

    /**
     * AKS networking configuration for vnet
     * 
     */
    @InputImport(name="aksNetworkingConfiguration")
        private final @Nullable AksNetworkingConfigurationResponse aksNetworkingConfiguration;

    public Optional<AksNetworkingConfigurationResponse> getAksNetworkingConfiguration() {
        return this.aksNetworkingConfiguration == null ? Optional.empty() : Optional.ofNullable(this.aksNetworkingConfiguration);
    }

    /**
     * Cluster full qualified domain name
     * 
     */
    @InputImport(name="clusterFqdn")
        private final @Nullable String clusterFqdn;

    public Optional<String> getClusterFqdn() {
        return this.clusterFqdn == null ? Optional.empty() : Optional.ofNullable(this.clusterFqdn);
    }

    /**
     * Intended usage of the cluster
     * 
     */
    @InputImport(name="clusterPurpose")
        private final @Nullable String clusterPurpose;

    public Optional<String> getClusterPurpose() {
        return this.clusterPurpose == null ? Optional.empty() : Optional.ofNullable(this.clusterPurpose);
    }

    /**
     * SSL configuration
     * 
     */
    @InputImport(name="sslConfiguration")
        private final @Nullable SslConfigurationResponse sslConfiguration;

    public Optional<SslConfigurationResponse> getSslConfiguration() {
        return this.sslConfiguration == null ? Optional.empty() : Optional.ofNullable(this.sslConfiguration);
    }

    /**
     * System services
     * 
     */
    @InputImport(name="systemServices", required=true)
        private final List<SystemServiceResponse> systemServices;

    public List<SystemServiceResponse> getSystemServices() {
        return this.systemServices;
    }

    public AKSResponseProperties(
        @Nullable Integer agentCount,
        @Nullable String agentVmSize,
        @Nullable AksNetworkingConfigurationResponse aksNetworkingConfiguration,
        @Nullable String clusterFqdn,
        @Nullable String clusterPurpose,
        @Nullable SslConfigurationResponse sslConfiguration,
        List<SystemServiceResponse> systemServices) {
        this.agentCount = agentCount;
        this.agentVmSize = agentVmSize;
        this.aksNetworkingConfiguration = aksNetworkingConfiguration;
        this.clusterFqdn = clusterFqdn;
        this.clusterPurpose = clusterPurpose == null ? "FastProd" : clusterPurpose;
        this.sslConfiguration = sslConfiguration;
        this.systemServices = Objects.requireNonNull(systemServices, "expected parameter 'systemServices' to be non-null");
    }

    private AKSResponseProperties() {
        this.agentCount = null;
        this.agentVmSize = null;
        this.aksNetworkingConfiguration = null;
        this.clusterFqdn = null;
        this.clusterPurpose = null;
        this.sslConfiguration = null;
        this.systemServices = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer agentCount;
        private @Nullable String agentVmSize;
        private @Nullable AksNetworkingConfigurationResponse aksNetworkingConfiguration;
        private @Nullable String clusterFqdn;
        private @Nullable String clusterPurpose;
        private @Nullable SslConfigurationResponse sslConfiguration;
        private List<SystemServiceResponse> systemServices;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentCount = defaults.agentCount;
    	      this.agentVmSize = defaults.agentVmSize;
    	      this.aksNetworkingConfiguration = defaults.aksNetworkingConfiguration;
    	      this.clusterFqdn = defaults.clusterFqdn;
    	      this.clusterPurpose = defaults.clusterPurpose;
    	      this.sslConfiguration = defaults.sslConfiguration;
    	      this.systemServices = defaults.systemServices;
        }

        public Builder setAgentCount(@Nullable Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }

        public Builder setAgentVmSize(@Nullable String agentVmSize) {
            this.agentVmSize = agentVmSize;
            return this;
        }

        public Builder setAksNetworkingConfiguration(@Nullable AksNetworkingConfigurationResponse aksNetworkingConfiguration) {
            this.aksNetworkingConfiguration = aksNetworkingConfiguration;
            return this;
        }

        public Builder setClusterFqdn(@Nullable String clusterFqdn) {
            this.clusterFqdn = clusterFqdn;
            return this;
        }

        public Builder setClusterPurpose(@Nullable String clusterPurpose) {
            this.clusterPurpose = clusterPurpose;
            return this;
        }

        public Builder setSslConfiguration(@Nullable SslConfigurationResponse sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            return this;
        }

        public Builder setSystemServices(List<SystemServiceResponse> systemServices) {
            this.systemServices = Objects.requireNonNull(systemServices);
            return this;
        }
        public AKSResponseProperties build() {
            return new AKSResponseProperties(agentCount, agentVmSize, aksNetworkingConfiguration, clusterFqdn, clusterPurpose, sslConfiguration, systemServices);
        }
    }
}
