// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.azurenative.machinelearningcompute.outputs.KubernetesClusterPropertiesResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.SystemServiceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AcsClusterPropertiesResponse {
    /**
     * The number of agent nodes in the Container Service. This can be changed to scale the cluster.
     * 
     */
    private final @Nullable Integer agentCount;
    /**
     * The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
     * 
     */
    private final @Nullable String agentVmSize;
    /**
     * The FQDN of the cluster.
     * 
     */
    private final String clusterFqdn;
    /**
     * The number of master nodes in the container service.
     * 
     */
    private final @Nullable Integer masterCount;
    /**
     * Orchestrator specific properties
     * 
     */
    private final @Nullable KubernetesClusterPropertiesResponse orchestratorProperties;
    /**
     * Type of orchestrator. It cannot be changed once the cluster is created.
     * 
     */
    private final String orchestratorType;
    /**
     * The system services deployed to the cluster
     * 
     */
    private final @Nullable List<SystemServiceResponse> systemServices;

    @OutputCustomType.Constructor({"agentCount","agentVmSize","clusterFqdn","masterCount","orchestratorProperties","orchestratorType","systemServices"})
    private AcsClusterPropertiesResponse(
        @Nullable Integer agentCount,
        @Nullable String agentVmSize,
        String clusterFqdn,
        @Nullable Integer masterCount,
        @Nullable KubernetesClusterPropertiesResponse orchestratorProperties,
        String orchestratorType,
        @Nullable List<SystemServiceResponse> systemServices) {
        this.agentCount = agentCount;
        this.agentVmSize = agentVmSize;
        this.clusterFqdn = Objects.requireNonNull(clusterFqdn);
        this.masterCount = masterCount;
        this.orchestratorProperties = orchestratorProperties;
        this.orchestratorType = Objects.requireNonNull(orchestratorType);
        this.systemServices = systemServices;
    }

    /**
     * The number of agent nodes in the Container Service. This can be changed to scale the cluster.
     * 
     */
    public Optional<Integer> getAgentCount() {
        return Optional.ofNullable(this.agentCount);
    }
    /**
     * The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
     * 
     */
    public Optional<String> getAgentVmSize() {
        return Optional.ofNullable(this.agentVmSize);
    }
    /**
     * The FQDN of the cluster.
     * 
     */
    public String getClusterFqdn() {
        return this.clusterFqdn;
    }
    /**
     * The number of master nodes in the container service.
     * 
     */
    public Optional<Integer> getMasterCount() {
        return Optional.ofNullable(this.masterCount);
    }
    /**
     * Orchestrator specific properties
     * 
     */
    public Optional<KubernetesClusterPropertiesResponse> getOrchestratorProperties() {
        return Optional.ofNullable(this.orchestratorProperties);
    }
    /**
     * Type of orchestrator. It cannot be changed once the cluster is created.
     * 
     */
    public String getOrchestratorType() {
        return this.orchestratorType;
    }
    /**
     * The system services deployed to the cluster
     * 
     */
    public List<SystemServiceResponse> getSystemServices() {
        return this.systemServices == null ? List.of() : this.systemServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcsClusterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer agentCount;
        private @Nullable String agentVmSize;
        private String clusterFqdn;
        private @Nullable Integer masterCount;
        private @Nullable KubernetesClusterPropertiesResponse orchestratorProperties;
        private String orchestratorType;
        private @Nullable List<SystemServiceResponse> systemServices;

        public Builder() {
    	      // Empty
        }

        public Builder(AcsClusterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentCount = defaults.agentCount;
    	      this.agentVmSize = defaults.agentVmSize;
    	      this.clusterFqdn = defaults.clusterFqdn;
    	      this.masterCount = defaults.masterCount;
    	      this.orchestratorProperties = defaults.orchestratorProperties;
    	      this.orchestratorType = defaults.orchestratorType;
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

        public Builder setClusterFqdn(String clusterFqdn) {
            this.clusterFqdn = Objects.requireNonNull(clusterFqdn);
            return this;
        }

        public Builder setMasterCount(@Nullable Integer masterCount) {
            this.masterCount = masterCount;
            return this;
        }

        public Builder setOrchestratorProperties(@Nullable KubernetesClusterPropertiesResponse orchestratorProperties) {
            this.orchestratorProperties = orchestratorProperties;
            return this;
        }

        public Builder setOrchestratorType(String orchestratorType) {
            this.orchestratorType = Objects.requireNonNull(orchestratorType);
            return this;
        }

        public Builder setSystemServices(@Nullable List<SystemServiceResponse> systemServices) {
            this.systemServices = systemServices;
            return this;
        }

        public AcsClusterPropertiesResponse build() {
            return new AcsClusterPropertiesResponse(agentCount, agentVmSize, clusterFqdn, masterCount, orchestratorProperties, orchestratorType, systemServices);
        }
    }
}
