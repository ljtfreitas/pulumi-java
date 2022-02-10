// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.azurenative.machinelearningcompute.inputs.KubernetesClusterPropertiesResponse;
import io.pulumi.azurenative.machinelearningcompute.inputs.SystemServiceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AcsClusterPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AcsClusterPropertiesResponse Empty = new AcsClusterPropertiesResponse();

    @InputImport(name="agentCount")
    private final @Nullable Integer agentCount;

    public Optional<Integer> getAgentCount() {
        return this.agentCount == null ? Optional.empty() : Optional.ofNullable(this.agentCount);
    }

    @InputImport(name="agentVmSize")
    private final @Nullable String agentVmSize;

    public Optional<String> getAgentVmSize() {
        return this.agentVmSize == null ? Optional.empty() : Optional.ofNullable(this.agentVmSize);
    }

    @InputImport(name="clusterFqdn", required=true)
    private final String clusterFqdn;

    public String getClusterFqdn() {
        return this.clusterFqdn;
    }

    @InputImport(name="masterCount")
    private final @Nullable Integer masterCount;

    public Optional<Integer> getMasterCount() {
        return this.masterCount == null ? Optional.empty() : Optional.ofNullable(this.masterCount);
    }

    @InputImport(name="orchestratorProperties")
    private final @Nullable KubernetesClusterPropertiesResponse orchestratorProperties;

    public Optional<KubernetesClusterPropertiesResponse> getOrchestratorProperties() {
        return this.orchestratorProperties == null ? Optional.empty() : Optional.ofNullable(this.orchestratorProperties);
    }

    @InputImport(name="orchestratorType", required=true)
    private final String orchestratorType;

    public String getOrchestratorType() {
        return this.orchestratorType;
    }

    @InputImport(name="systemServices")
    private final @Nullable List<SystemServiceResponse> systemServices;

    public List<SystemServiceResponse> getSystemServices() {
        return this.systemServices == null ? List.of() : this.systemServices;
    }

    public AcsClusterPropertiesResponse(
        @Nullable Integer agentCount,
        @Nullable String agentVmSize,
        String clusterFqdn,
        @Nullable Integer masterCount,
        @Nullable KubernetesClusterPropertiesResponse orchestratorProperties,
        String orchestratorType,
        @Nullable List<SystemServiceResponse> systemServices) {
        this.agentCount = agentCount == null ? 2 : agentCount;
        this.agentVmSize = agentVmSize == null ? "Standard_D3_v2" : agentVmSize;
        this.clusterFqdn = Objects.requireNonNull(clusterFqdn, "expected parameter 'clusterFqdn' to be non-null");
        this.masterCount = masterCount == null ? 1 : masterCount;
        this.orchestratorProperties = orchestratorProperties;
        this.orchestratorType = Objects.requireNonNull(orchestratorType, "expected parameter 'orchestratorType' to be non-null");
        this.systemServices = systemServices;
    }

    private AcsClusterPropertiesResponse() {
        this.agentCount = null;
        this.agentVmSize = null;
        this.clusterFqdn = null;
        this.masterCount = null;
        this.orchestratorProperties = null;
        this.orchestratorType = null;
        this.systemServices = List.of();
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