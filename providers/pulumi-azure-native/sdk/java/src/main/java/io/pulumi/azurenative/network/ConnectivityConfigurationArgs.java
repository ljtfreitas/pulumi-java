// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.ConnectivityTopology;
import io.pulumi.azurenative.network.enums.DeleteExistingPeering;
import io.pulumi.azurenative.network.enums.IsGlobal;
import io.pulumi.azurenative.network.inputs.ConnectivityGroupItemArgs;
import io.pulumi.azurenative.network.inputs.HubArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectivityConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectivityConfigurationArgs Empty = new ConnectivityConfigurationArgs();

    /**
     * Groups for configuration
     * 
     */
    @InputImport(name="appliesToGroups")
    private final @Nullable Input<List<ConnectivityGroupItemArgs>> appliesToGroups;

    public Input<List<ConnectivityGroupItemArgs>> getAppliesToGroups() {
        return this.appliesToGroups == null ? Input.empty() : this.appliesToGroups;
    }

    /**
     * The name of the network manager connectivity configuration.
     * 
     */
    @InputImport(name="configurationName")
    private final @Nullable Input<String> configurationName;

    public Input<String> getConfigurationName() {
        return this.configurationName == null ? Input.empty() : this.configurationName;
    }

    /**
     * Connectivity topology type.
     * 
     */
    @InputImport(name="connectivityTopology", required=true)
    private final Input<Either<String,ConnectivityTopology>> connectivityTopology;

    public Input<Either<String,ConnectivityTopology>> getConnectivityTopology() {
        return this.connectivityTopology;
    }

    /**
     * Flag if need to remove current existing peerings.
     * 
     */
    @InputImport(name="deleteExistingPeering")
    private final @Nullable Input<Either<String,DeleteExistingPeering>> deleteExistingPeering;

    public Input<Either<String,DeleteExistingPeering>> getDeleteExistingPeering() {
        return this.deleteExistingPeering == null ? Input.empty() : this.deleteExistingPeering;
    }

    /**
     * A description of the connectivity configuration.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A friendly name for the resource.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * List of hubItems
     * 
     */
    @InputImport(name="hubs")
    private final @Nullable Input<List<HubArgs>> hubs;

    public Input<List<HubArgs>> getHubs() {
        return this.hubs == null ? Input.empty() : this.hubs;
    }

    /**
     * Flag if global mesh is supported.
     * 
     */
    @InputImport(name="isGlobal")
    private final @Nullable Input<Either<String,IsGlobal>> isGlobal;

    public Input<Either<String,IsGlobal>> getIsGlobal() {
        return this.isGlobal == null ? Input.empty() : this.isGlobal;
    }

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName", required=true)
    private final Input<String> networkManagerName;

    public Input<String> getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ConnectivityConfigurationArgs(
        @Nullable Input<List<ConnectivityGroupItemArgs>> appliesToGroups,
        @Nullable Input<String> configurationName,
        Input<Either<String,ConnectivityTopology>> connectivityTopology,
        @Nullable Input<Either<String,DeleteExistingPeering>> deleteExistingPeering,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<List<HubArgs>> hubs,
        @Nullable Input<Either<String,IsGlobal>> isGlobal,
        Input<String> networkManagerName,
        Input<String> resourceGroupName) {
        this.appliesToGroups = appliesToGroups;
        this.configurationName = configurationName;
        this.connectivityTopology = Objects.requireNonNull(connectivityTopology, "expected parameter 'connectivityTopology' to be non-null");
        this.deleteExistingPeering = deleteExistingPeering;
        this.description = description;
        this.displayName = displayName;
        this.hubs = hubs;
        this.isGlobal = isGlobal;
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ConnectivityConfigurationArgs() {
        this.appliesToGroups = Input.empty();
        this.configurationName = Input.empty();
        this.connectivityTopology = Input.empty();
        this.deleteExistingPeering = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.hubs = Input.empty();
        this.isGlobal = Input.empty();
        this.networkManagerName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ConnectivityGroupItemArgs>> appliesToGroups;
        private @Nullable Input<String> configurationName;
        private Input<Either<String,ConnectivityTopology>> connectivityTopology;
        private @Nullable Input<Either<String,DeleteExistingPeering>> deleteExistingPeering;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<List<HubArgs>> hubs;
        private @Nullable Input<Either<String,IsGlobal>> isGlobal;
        private Input<String> networkManagerName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliesToGroups = defaults.appliesToGroups;
    	      this.configurationName = defaults.configurationName;
    	      this.connectivityTopology = defaults.connectivityTopology;
    	      this.deleteExistingPeering = defaults.deleteExistingPeering;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.hubs = defaults.hubs;
    	      this.isGlobal = defaults.isGlobal;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAppliesToGroups(@Nullable Input<List<ConnectivityGroupItemArgs>> appliesToGroups) {
            this.appliesToGroups = appliesToGroups;
            return this;
        }

        public Builder setAppliesToGroups(@Nullable List<ConnectivityGroupItemArgs> appliesToGroups) {
            this.appliesToGroups = Input.ofNullable(appliesToGroups);
            return this;
        }

        public Builder setConfigurationName(@Nullable Input<String> configurationName) {
            this.configurationName = configurationName;
            return this;
        }

        public Builder setConfigurationName(@Nullable String configurationName) {
            this.configurationName = Input.ofNullable(configurationName);
            return this;
        }

        public Builder setConnectivityTopology(Input<Either<String,ConnectivityTopology>> connectivityTopology) {
            this.connectivityTopology = Objects.requireNonNull(connectivityTopology);
            return this;
        }

        public Builder setConnectivityTopology(Either<String,ConnectivityTopology> connectivityTopology) {
            this.connectivityTopology = Input.of(Objects.requireNonNull(connectivityTopology));
            return this;
        }

        public Builder setDeleteExistingPeering(@Nullable Input<Either<String,DeleteExistingPeering>> deleteExistingPeering) {
            this.deleteExistingPeering = deleteExistingPeering;
            return this;
        }

        public Builder setDeleteExistingPeering(@Nullable Either<String,DeleteExistingPeering> deleteExistingPeering) {
            this.deleteExistingPeering = Input.ofNullable(deleteExistingPeering);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setHubs(@Nullable Input<List<HubArgs>> hubs) {
            this.hubs = hubs;
            return this;
        }

        public Builder setHubs(@Nullable List<HubArgs> hubs) {
            this.hubs = Input.ofNullable(hubs);
            return this;
        }

        public Builder setIsGlobal(@Nullable Input<Either<String,IsGlobal>> isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder setIsGlobal(@Nullable Either<String,IsGlobal> isGlobal) {
            this.isGlobal = Input.ofNullable(isGlobal);
            return this;
        }

        public Builder setNetworkManagerName(Input<String> networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Input.of(Objects.requireNonNull(networkManagerName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public ConnectivityConfigurationArgs build() {
            return new ConnectivityConfigurationArgs(appliesToGroups, configurationName, connectivityTopology, deleteExistingPeering, description, displayName, hubs, isGlobal, networkManagerName, resourceGroupName);
        }
    }
}
