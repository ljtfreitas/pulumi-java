// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.AutoPausePropertiesResponse;
import io.pulumi.azurenative.synapse.outputs.AutoScalePropertiesResponse;
import io.pulumi.azurenative.synapse.outputs.DynamicExecutorAllocationResponse;
import io.pulumi.azurenative.synapse.outputs.LibraryInfoResponse;
import io.pulumi.azurenative.synapse.outputs.LibraryRequirementsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBigDataPoolResult {
    /**
     * Auto-pausing properties
     * 
     */
    private final @Nullable AutoPausePropertiesResponse autoPause;
    /**
     * Auto-scaling properties
     * 
     */
    private final @Nullable AutoScalePropertiesResponse autoScale;
    /**
     * The cache size
     * 
     */
    private final @Nullable Integer cacheSize;
    /**
     * The time when the Big Data pool was created.
     * 
     */
    private final @Nullable String creationDate;
    /**
     * List of custom libraries/packages associated with the spark pool.
     * 
     */
    private final @Nullable List<LibraryInfoResponse> customLibraries;
    /**
     * The default folder where Spark logs will be written.
     * 
     */
    private final @Nullable String defaultSparkLogFolder;
    /**
     * Dynamic Executor Allocation
     * 
     */
    private final @Nullable DynamicExecutorAllocationResponse dynamicExecutorAllocation;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Whether compute isolation is required or not.
     * 
     */
    private final @Nullable Boolean isComputeIsolationEnabled;
    /**
     * The time when the Big Data pool was updated successfully.
     * 
     */
    private final String lastSucceededTimestamp;
    /**
     * Library version requirements
     * 
     */
    private final @Nullable LibraryRequirementsResponse libraryRequirements;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The number of nodes in the Big Data pool.
     * 
     */
    private final @Nullable Integer nodeCount;
    /**
     * The level of compute power that each node in the Big Data pool has.
     * 
     */
    private final @Nullable String nodeSize;
    /**
     * The kind of nodes that the Big Data pool provides.
     * 
     */
    private final @Nullable String nodeSizeFamily;
    /**
     * The state of the Big Data pool.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Whether session level packages enabled.
     * 
     */
    private final @Nullable Boolean sessionLevelPackagesEnabled;
    /**
     * Spark configuration file to specify additional properties
     * 
     */
    private final @Nullable LibraryRequirementsResponse sparkConfigProperties;
    /**
     * The Spark events folder
     * 
     */
    private final @Nullable String sparkEventsFolder;
    /**
     * The Apache Spark version.
     * 
     */
    private final @Nullable String sparkVersion;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"autoPause","autoScale","cacheSize","creationDate","customLibraries","defaultSparkLogFolder","dynamicExecutorAllocation","id","isComputeIsolationEnabled","lastSucceededTimestamp","libraryRequirements","location","name","nodeCount","nodeSize","nodeSizeFamily","provisioningState","sessionLevelPackagesEnabled","sparkConfigProperties","sparkEventsFolder","sparkVersion","tags","type"})
    private GetBigDataPoolResult(
        @Nullable AutoPausePropertiesResponse autoPause,
        @Nullable AutoScalePropertiesResponse autoScale,
        @Nullable Integer cacheSize,
        @Nullable String creationDate,
        @Nullable List<LibraryInfoResponse> customLibraries,
        @Nullable String defaultSparkLogFolder,
        @Nullable DynamicExecutorAllocationResponse dynamicExecutorAllocation,
        String id,
        @Nullable Boolean isComputeIsolationEnabled,
        String lastSucceededTimestamp,
        @Nullable LibraryRequirementsResponse libraryRequirements,
        String location,
        String name,
        @Nullable Integer nodeCount,
        @Nullable String nodeSize,
        @Nullable String nodeSizeFamily,
        @Nullable String provisioningState,
        @Nullable Boolean sessionLevelPackagesEnabled,
        @Nullable LibraryRequirementsResponse sparkConfigProperties,
        @Nullable String sparkEventsFolder,
        @Nullable String sparkVersion,
        @Nullable Map<String,String> tags,
        String type) {
        this.autoPause = autoPause;
        this.autoScale = autoScale;
        this.cacheSize = cacheSize;
        this.creationDate = creationDate;
        this.customLibraries = customLibraries;
        this.defaultSparkLogFolder = defaultSparkLogFolder;
        this.dynamicExecutorAllocation = dynamicExecutorAllocation;
        this.id = Objects.requireNonNull(id);
        this.isComputeIsolationEnabled = isComputeIsolationEnabled;
        this.lastSucceededTimestamp = Objects.requireNonNull(lastSucceededTimestamp);
        this.libraryRequirements = libraryRequirements;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.nodeCount = nodeCount;
        this.nodeSize = nodeSize;
        this.nodeSizeFamily = nodeSizeFamily;
        this.provisioningState = provisioningState;
        this.sessionLevelPackagesEnabled = sessionLevelPackagesEnabled;
        this.sparkConfigProperties = sparkConfigProperties;
        this.sparkEventsFolder = sparkEventsFolder;
        this.sparkVersion = sparkVersion;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Auto-pausing properties
     * 
     */
    public Optional<AutoPausePropertiesResponse> getAutoPause() {
        return Optional.ofNullable(this.autoPause);
    }
    /**
     * Auto-scaling properties
     * 
     */
    public Optional<AutoScalePropertiesResponse> getAutoScale() {
        return Optional.ofNullable(this.autoScale);
    }
    /**
     * The cache size
     * 
     */
    public Optional<Integer> getCacheSize() {
        return Optional.ofNullable(this.cacheSize);
    }
    /**
     * The time when the Big Data pool was created.
     * 
     */
    public Optional<String> getCreationDate() {
        return Optional.ofNullable(this.creationDate);
    }
    /**
     * List of custom libraries/packages associated with the spark pool.
     * 
     */
    public List<LibraryInfoResponse> getCustomLibraries() {
        return this.customLibraries == null ? List.of() : this.customLibraries;
    }
    /**
     * The default folder where Spark logs will be written.
     * 
     */
    public Optional<String> getDefaultSparkLogFolder() {
        return Optional.ofNullable(this.defaultSparkLogFolder);
    }
    /**
     * Dynamic Executor Allocation
     * 
     */
    public Optional<DynamicExecutorAllocationResponse> getDynamicExecutorAllocation() {
        return Optional.ofNullable(this.dynamicExecutorAllocation);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Whether compute isolation is required or not.
     * 
     */
    public Optional<Boolean> getIsComputeIsolationEnabled() {
        return Optional.ofNullable(this.isComputeIsolationEnabled);
    }
    /**
     * The time when the Big Data pool was updated successfully.
     * 
     */
    public String getLastSucceededTimestamp() {
        return this.lastSucceededTimestamp;
    }
    /**
     * Library version requirements
     * 
     */
    public Optional<LibraryRequirementsResponse> getLibraryRequirements() {
        return Optional.ofNullable(this.libraryRequirements);
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The number of nodes in the Big Data pool.
     * 
     */
    public Optional<Integer> getNodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }
    /**
     * The level of compute power that each node in the Big Data pool has.
     * 
     */
    public Optional<String> getNodeSize() {
        return Optional.ofNullable(this.nodeSize);
    }
    /**
     * The kind of nodes that the Big Data pool provides.
     * 
     */
    public Optional<String> getNodeSizeFamily() {
        return Optional.ofNullable(this.nodeSizeFamily);
    }
    /**
     * The state of the Big Data pool.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Whether session level packages enabled.
     * 
     */
    public Optional<Boolean> getSessionLevelPackagesEnabled() {
        return Optional.ofNullable(this.sessionLevelPackagesEnabled);
    }
    /**
     * Spark configuration file to specify additional properties
     * 
     */
    public Optional<LibraryRequirementsResponse> getSparkConfigProperties() {
        return Optional.ofNullable(this.sparkConfigProperties);
    }
    /**
     * The Spark events folder
     * 
     */
    public Optional<String> getSparkEventsFolder() {
        return Optional.ofNullable(this.sparkEventsFolder);
    }
    /**
     * The Apache Spark version.
     * 
     */
    public Optional<String> getSparkVersion() {
        return Optional.ofNullable(this.sparkVersion);
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBigDataPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoPausePropertiesResponse autoPause;
        private @Nullable AutoScalePropertiesResponse autoScale;
        private @Nullable Integer cacheSize;
        private @Nullable String creationDate;
        private @Nullable List<LibraryInfoResponse> customLibraries;
        private @Nullable String defaultSparkLogFolder;
        private @Nullable DynamicExecutorAllocationResponse dynamicExecutorAllocation;
        private String id;
        private @Nullable Boolean isComputeIsolationEnabled;
        private String lastSucceededTimestamp;
        private @Nullable LibraryRequirementsResponse libraryRequirements;
        private String location;
        private String name;
        private @Nullable Integer nodeCount;
        private @Nullable String nodeSize;
        private @Nullable String nodeSizeFamily;
        private @Nullable String provisioningState;
        private @Nullable Boolean sessionLevelPackagesEnabled;
        private @Nullable LibraryRequirementsResponse sparkConfigProperties;
        private @Nullable String sparkEventsFolder;
        private @Nullable String sparkVersion;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBigDataPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPause = defaults.autoPause;
    	      this.autoScale = defaults.autoScale;
    	      this.cacheSize = defaults.cacheSize;
    	      this.creationDate = defaults.creationDate;
    	      this.customLibraries = defaults.customLibraries;
    	      this.defaultSparkLogFolder = defaults.defaultSparkLogFolder;
    	      this.dynamicExecutorAllocation = defaults.dynamicExecutorAllocation;
    	      this.id = defaults.id;
    	      this.isComputeIsolationEnabled = defaults.isComputeIsolationEnabled;
    	      this.lastSucceededTimestamp = defaults.lastSucceededTimestamp;
    	      this.libraryRequirements = defaults.libraryRequirements;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeSize = defaults.nodeSize;
    	      this.nodeSizeFamily = defaults.nodeSizeFamily;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sessionLevelPackagesEnabled = defaults.sessionLevelPackagesEnabled;
    	      this.sparkConfigProperties = defaults.sparkConfigProperties;
    	      this.sparkEventsFolder = defaults.sparkEventsFolder;
    	      this.sparkVersion = defaults.sparkVersion;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAutoPause(@Nullable AutoPausePropertiesResponse autoPause) {
            this.autoPause = autoPause;
            return this;
        }

        public Builder setAutoScale(@Nullable AutoScalePropertiesResponse autoScale) {
            this.autoScale = autoScale;
            return this;
        }

        public Builder setCacheSize(@Nullable Integer cacheSize) {
            this.cacheSize = cacheSize;
            return this;
        }

        public Builder setCreationDate(@Nullable String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder setCustomLibraries(@Nullable List<LibraryInfoResponse> customLibraries) {
            this.customLibraries = customLibraries;
            return this;
        }

        public Builder setDefaultSparkLogFolder(@Nullable String defaultSparkLogFolder) {
            this.defaultSparkLogFolder = defaultSparkLogFolder;
            return this;
        }

        public Builder setDynamicExecutorAllocation(@Nullable DynamicExecutorAllocationResponse dynamicExecutorAllocation) {
            this.dynamicExecutorAllocation = dynamicExecutorAllocation;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsComputeIsolationEnabled(@Nullable Boolean isComputeIsolationEnabled) {
            this.isComputeIsolationEnabled = isComputeIsolationEnabled;
            return this;
        }

        public Builder setLastSucceededTimestamp(String lastSucceededTimestamp) {
            this.lastSucceededTimestamp = Objects.requireNonNull(lastSucceededTimestamp);
            return this;
        }

        public Builder setLibraryRequirements(@Nullable LibraryRequirementsResponse libraryRequirements) {
            this.libraryRequirements = libraryRequirements;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder setNodeSize(@Nullable String nodeSize) {
            this.nodeSize = nodeSize;
            return this;
        }

        public Builder setNodeSizeFamily(@Nullable String nodeSizeFamily) {
            this.nodeSizeFamily = nodeSizeFamily;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSessionLevelPackagesEnabled(@Nullable Boolean sessionLevelPackagesEnabled) {
            this.sessionLevelPackagesEnabled = sessionLevelPackagesEnabled;
            return this;
        }

        public Builder setSparkConfigProperties(@Nullable LibraryRequirementsResponse sparkConfigProperties) {
            this.sparkConfigProperties = sparkConfigProperties;
            return this;
        }

        public Builder setSparkEventsFolder(@Nullable String sparkEventsFolder) {
            this.sparkEventsFolder = sparkEventsFolder;
            return this;
        }

        public Builder setSparkVersion(@Nullable String sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetBigDataPoolResult build() {
            return new GetBigDataPoolResult(autoPause, autoScale, cacheSize, creationDate, customLibraries, defaultSparkLogFolder, dynamicExecutorAllocation, id, isComputeIsolationEnabled, lastSucceededTimestamp, libraryRequirements, location, name, nodeCount, nodeSize, nodeSizeFamily, provisioningState, sessionLevelPackagesEnabled, sparkConfigProperties, sparkEventsFolder, sparkVersion, tags, type);
        }
    }
}
