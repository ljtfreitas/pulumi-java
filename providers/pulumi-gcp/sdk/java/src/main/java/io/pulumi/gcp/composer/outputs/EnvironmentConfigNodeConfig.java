// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.composer.outputs.EnvironmentConfigNodeConfigIpAllocationPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentConfigNodeConfig {
    private final @Nullable Integer diskSizeGb;
    private final @Nullable Boolean enableIpMasqAgent;
    private final @Nullable EnvironmentConfigNodeConfigIpAllocationPolicy ipAllocationPolicy;
    private final @Nullable String machineType;
    private final @Nullable Integer maxPodsPerNode;
    private final @Nullable String network;
    private final @Nullable List<String> oauthScopes;
    private final @Nullable String serviceAccount;
    private final @Nullable String subnetwork;
    private final @Nullable List<String> tags;
    private final @Nullable String zone;

    @CustomType.Constructor
    private EnvironmentConfigNodeConfig(
        @CustomType.Parameter("diskSizeGb") @Nullable Integer diskSizeGb,
        @CustomType.Parameter("enableIpMasqAgent") @Nullable Boolean enableIpMasqAgent,
        @CustomType.Parameter("ipAllocationPolicy") @Nullable EnvironmentConfigNodeConfigIpAllocationPolicy ipAllocationPolicy,
        @CustomType.Parameter("machineType") @Nullable String machineType,
        @CustomType.Parameter("maxPodsPerNode") @Nullable Integer maxPodsPerNode,
        @CustomType.Parameter("network") @Nullable String network,
        @CustomType.Parameter("oauthScopes") @Nullable List<String> oauthScopes,
        @CustomType.Parameter("serviceAccount") @Nullable String serviceAccount,
        @CustomType.Parameter("subnetwork") @Nullable String subnetwork,
        @CustomType.Parameter("tags") @Nullable List<String> tags,
        @CustomType.Parameter("zone") @Nullable String zone) {
        this.diskSizeGb = diskSizeGb;
        this.enableIpMasqAgent = enableIpMasqAgent;
        this.ipAllocationPolicy = ipAllocationPolicy;
        this.machineType = machineType;
        this.maxPodsPerNode = maxPodsPerNode;
        this.network = network;
        this.oauthScopes = oauthScopes;
        this.serviceAccount = serviceAccount;
        this.subnetwork = subnetwork;
        this.tags = tags;
        this.zone = zone;
    }

    public Optional<Integer> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }
    public Optional<Boolean> enableIpMasqAgent() {
        return Optional.ofNullable(this.enableIpMasqAgent);
    }
    public Optional<EnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicy() {
        return Optional.ofNullable(this.ipAllocationPolicy);
    }
    public Optional<String> machineType() {
        return Optional.ofNullable(this.machineType);
    }
    public Optional<Integer> maxPodsPerNode() {
        return Optional.ofNullable(this.maxPodsPerNode);
    }
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    public List<String> oauthScopes() {
        return this.oauthScopes == null ? List.of() : this.oauthScopes;
    }
    public Optional<String> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    public Optional<String> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskSizeGb;
        private @Nullable Boolean enableIpMasqAgent;
        private @Nullable EnvironmentConfigNodeConfigIpAllocationPolicy ipAllocationPolicy;
        private @Nullable String machineType;
        private @Nullable Integer maxPodsPerNode;
        private @Nullable String network;
        private @Nullable List<String> oauthScopes;
        private @Nullable String serviceAccount;
        private @Nullable String subnetwork;
        private @Nullable List<String> tags;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.enableIpMasqAgent = defaults.enableIpMasqAgent;
    	      this.ipAllocationPolicy = defaults.ipAllocationPolicy;
    	      this.machineType = defaults.machineType;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.network = defaults.network;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder enableIpMasqAgent(@Nullable Boolean enableIpMasqAgent) {
            this.enableIpMasqAgent = enableIpMasqAgent;
            return this;
        }
        public Builder ipAllocationPolicy(@Nullable EnvironmentConfigNodeConfigIpAllocationPolicy ipAllocationPolicy) {
            this.ipAllocationPolicy = ipAllocationPolicy;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder maxPodsPerNode(@Nullable Integer maxPodsPerNode) {
            this.maxPodsPerNode = maxPodsPerNode;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = network;
            return this;
        }
        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }        public EnvironmentConfigNodeConfig build() {
            return new EnvironmentConfigNodeConfig(diskSizeGb, enableIpMasqAgent, ipAllocationPolicy, machineType, maxPodsPerNode, network, oauthScopes, serviceAccount, subnetwork, tags, zone);
        }
    }
}
