// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.ClusterPurpose;
import io.pulumi.azurenative.machinelearningservices.inputs.AksNetworkingConfigurationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.SslConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AKS properties
 * 
 */
public final class AKSPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AKSPropertiesArgs Empty = new AKSPropertiesArgs();

    /**
     * Number of agents
     * 
     */
    @InputImport(name="agentCount")
        private final @Nullable Input<Integer> agentCount;

    public Input<Integer> getAgentCount() {
        return this.agentCount == null ? Input.empty() : this.agentCount;
    }

    /**
     * Agent virtual machine size
     * 
     */
    @InputImport(name="agentVmSize")
        private final @Nullable Input<String> agentVmSize;

    public Input<String> getAgentVmSize() {
        return this.agentVmSize == null ? Input.empty() : this.agentVmSize;
    }

    /**
     * AKS networking configuration for vnet
     * 
     */
    @InputImport(name="aksNetworkingConfiguration")
        private final @Nullable Input<AksNetworkingConfigurationArgs> aksNetworkingConfiguration;

    public Input<AksNetworkingConfigurationArgs> getAksNetworkingConfiguration() {
        return this.aksNetworkingConfiguration == null ? Input.empty() : this.aksNetworkingConfiguration;
    }

    /**
     * Cluster full qualified domain name
     * 
     */
    @InputImport(name="clusterFqdn")
        private final @Nullable Input<String> clusterFqdn;

    public Input<String> getClusterFqdn() {
        return this.clusterFqdn == null ? Input.empty() : this.clusterFqdn;
    }

    /**
     * Intended usage of the cluster
     * 
     */
    @InputImport(name="clusterPurpose")
        private final @Nullable Input<Either<String,ClusterPurpose>> clusterPurpose;

    public Input<Either<String,ClusterPurpose>> getClusterPurpose() {
        return this.clusterPurpose == null ? Input.empty() : this.clusterPurpose;
    }

    /**
     * SSL configuration
     * 
     */
    @InputImport(name="sslConfiguration")
        private final @Nullable Input<SslConfigurationArgs> sslConfiguration;

    public Input<SslConfigurationArgs> getSslConfiguration() {
        return this.sslConfiguration == null ? Input.empty() : this.sslConfiguration;
    }

    public AKSPropertiesArgs(
        @Nullable Input<Integer> agentCount,
        @Nullable Input<String> agentVmSize,
        @Nullable Input<AksNetworkingConfigurationArgs> aksNetworkingConfiguration,
        @Nullable Input<String> clusterFqdn,
        @Nullable Input<Either<String,ClusterPurpose>> clusterPurpose,
        @Nullable Input<SslConfigurationArgs> sslConfiguration) {
        this.agentCount = agentCount;
        this.agentVmSize = agentVmSize;
        this.aksNetworkingConfiguration = aksNetworkingConfiguration;
        this.clusterFqdn = clusterFqdn;
        this.clusterPurpose = clusterPurpose == null ? Input.ofLeft("FastProd") : clusterPurpose;
        this.sslConfiguration = sslConfiguration;
    }

    private AKSPropertiesArgs() {
        this.agentCount = Input.empty();
        this.agentVmSize = Input.empty();
        this.aksNetworkingConfiguration = Input.empty();
        this.clusterFqdn = Input.empty();
        this.clusterPurpose = Input.empty();
        this.sslConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> agentCount;
        private @Nullable Input<String> agentVmSize;
        private @Nullable Input<AksNetworkingConfigurationArgs> aksNetworkingConfiguration;
        private @Nullable Input<String> clusterFqdn;
        private @Nullable Input<Either<String,ClusterPurpose>> clusterPurpose;
        private @Nullable Input<SslConfigurationArgs> sslConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentCount = defaults.agentCount;
    	      this.agentVmSize = defaults.agentVmSize;
    	      this.aksNetworkingConfiguration = defaults.aksNetworkingConfiguration;
    	      this.clusterFqdn = defaults.clusterFqdn;
    	      this.clusterPurpose = defaults.clusterPurpose;
    	      this.sslConfiguration = defaults.sslConfiguration;
        }

        public Builder setAgentCount(@Nullable Input<Integer> agentCount) {
            this.agentCount = agentCount;
            return this;
        }

        public Builder setAgentCount(@Nullable Integer agentCount) {
            this.agentCount = Input.ofNullable(agentCount);
            return this;
        }

        public Builder setAgentVmSize(@Nullable Input<String> agentVmSize) {
            this.agentVmSize = agentVmSize;
            return this;
        }

        public Builder setAgentVmSize(@Nullable String agentVmSize) {
            this.agentVmSize = Input.ofNullable(agentVmSize);
            return this;
        }

        public Builder setAksNetworkingConfiguration(@Nullable Input<AksNetworkingConfigurationArgs> aksNetworkingConfiguration) {
            this.aksNetworkingConfiguration = aksNetworkingConfiguration;
            return this;
        }

        public Builder setAksNetworkingConfiguration(@Nullable AksNetworkingConfigurationArgs aksNetworkingConfiguration) {
            this.aksNetworkingConfiguration = Input.ofNullable(aksNetworkingConfiguration);
            return this;
        }

        public Builder setClusterFqdn(@Nullable Input<String> clusterFqdn) {
            this.clusterFqdn = clusterFqdn;
            return this;
        }

        public Builder setClusterFqdn(@Nullable String clusterFqdn) {
            this.clusterFqdn = Input.ofNullable(clusterFqdn);
            return this;
        }

        public Builder setClusterPurpose(@Nullable Input<Either<String,ClusterPurpose>> clusterPurpose) {
            this.clusterPurpose = clusterPurpose;
            return this;
        }

        public Builder setClusterPurpose(@Nullable Either<String,ClusterPurpose> clusterPurpose) {
            this.clusterPurpose = Input.ofNullable(clusterPurpose);
            return this;
        }

        public Builder setSslConfiguration(@Nullable Input<SslConfigurationArgs> sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            return this;
        }

        public Builder setSslConfiguration(@Nullable SslConfigurationArgs sslConfiguration) {
            this.sslConfiguration = Input.ofNullable(sslConfiguration);
            return this;
        }
        public AKSPropertiesArgs build() {
            return new AKSPropertiesArgs(agentCount, agentVmSize, aksNetworkingConfiguration, clusterFqdn, clusterPurpose, sslConfiguration);
        }
    }
}
