// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ConfigurationGroupResponse;
import io.pulumi.azurenative.network.outputs.ConnectivityGroupItemResponse;
import io.pulumi.azurenative.network.outputs.HubResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EffectiveConnectivityConfigurationResponse {
    /**
     * Groups for configuration
     * 
     */
    private final @Nullable List<ConnectivityGroupItemResponse> appliesToGroups;
    /**
     * Effective configuration groups.
     * 
     */
    private final @Nullable List<ConfigurationGroupResponse> configurationGroups;
    /**
     * Connectivity topology type.
     * 
     */
    private final String connectivityTopology;
    /**
     * Flag if need to remove current existing peerings.
     * 
     */
    private final @Nullable String deleteExistingPeering;
    /**
     * A description of the connectivity configuration.
     * 
     */
    private final @Nullable String description;
    /**
     * A friendly name for the resource.
     * 
     */
    private final @Nullable String displayName;
    /**
     * List of hubItems
     * 
     */
    private final @Nullable List<HubResponse> hubs;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Flag if global mesh is supported.
     * 
     */
    private final @Nullable String isGlobal;
    /**
     * The provisioning state of the connectivity configuration resource.
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"appliesToGroups","configurationGroups","connectivityTopology","deleteExistingPeering","description","displayName","hubs","id","isGlobal","provisioningState"})
    private EffectiveConnectivityConfigurationResponse(
        @Nullable List<ConnectivityGroupItemResponse> appliesToGroups,
        @Nullable List<ConfigurationGroupResponse> configurationGroups,
        String connectivityTopology,
        @Nullable String deleteExistingPeering,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable List<HubResponse> hubs,
        @Nullable String id,
        @Nullable String isGlobal,
        String provisioningState) {
        this.appliesToGroups = appliesToGroups;
        this.configurationGroups = configurationGroups;
        this.connectivityTopology = Objects.requireNonNull(connectivityTopology);
        this.deleteExistingPeering = deleteExistingPeering;
        this.description = description;
        this.displayName = displayName;
        this.hubs = hubs;
        this.id = id;
        this.isGlobal = isGlobal;
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * Groups for configuration
     * 
     */
    public List<ConnectivityGroupItemResponse> getAppliesToGroups() {
        return this.appliesToGroups == null ? List.of() : this.appliesToGroups;
    }
    /**
     * Effective configuration groups.
     * 
     */
    public List<ConfigurationGroupResponse> getConfigurationGroups() {
        return this.configurationGroups == null ? List.of() : this.configurationGroups;
    }
    /**
     * Connectivity topology type.
     * 
     */
    public String getConnectivityTopology() {
        return this.connectivityTopology;
    }
    /**
     * Flag if need to remove current existing peerings.
     * 
     */
    public Optional<String> getDeleteExistingPeering() {
        return Optional.ofNullable(this.deleteExistingPeering);
    }
    /**
     * A description of the connectivity configuration.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A friendly name for the resource.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * List of hubItems
     * 
     */
    public List<HubResponse> getHubs() {
        return this.hubs == null ? List.of() : this.hubs;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Flag if global mesh is supported.
     * 
     */
    public Optional<String> getIsGlobal() {
        return Optional.ofNullable(this.isGlobal);
    }
    /**
     * The provisioning state of the connectivity configuration resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EffectiveConnectivityConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectivityGroupItemResponse> appliesToGroups;
        private @Nullable List<ConfigurationGroupResponse> configurationGroups;
        private String connectivityTopology;
        private @Nullable String deleteExistingPeering;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable List<HubResponse> hubs;
        private @Nullable String id;
        private @Nullable String isGlobal;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(EffectiveConnectivityConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliesToGroups = defaults.appliesToGroups;
    	      this.configurationGroups = defaults.configurationGroups;
    	      this.connectivityTopology = defaults.connectivityTopology;
    	      this.deleteExistingPeering = defaults.deleteExistingPeering;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.hubs = defaults.hubs;
    	      this.id = defaults.id;
    	      this.isGlobal = defaults.isGlobal;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setAppliesToGroups(@Nullable List<ConnectivityGroupItemResponse> appliesToGroups) {
            this.appliesToGroups = appliesToGroups;
            return this;
        }

        public Builder setConfigurationGroups(@Nullable List<ConfigurationGroupResponse> configurationGroups) {
            this.configurationGroups = configurationGroups;
            return this;
        }

        public Builder setConnectivityTopology(String connectivityTopology) {
            this.connectivityTopology = Objects.requireNonNull(connectivityTopology);
            return this;
        }

        public Builder setDeleteExistingPeering(@Nullable String deleteExistingPeering) {
            this.deleteExistingPeering = deleteExistingPeering;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setHubs(@Nullable List<HubResponse> hubs) {
            this.hubs = hubs;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIsGlobal(@Nullable String isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public EffectiveConnectivityConfigurationResponse build() {
            return new EffectiveConnectivityConfigurationResponse(appliesToGroups, configurationGroups, connectivityTopology, deleteExistingPeering, description, displayName, hubs, id, isGlobal, provisioningState);
        }
    }
}
