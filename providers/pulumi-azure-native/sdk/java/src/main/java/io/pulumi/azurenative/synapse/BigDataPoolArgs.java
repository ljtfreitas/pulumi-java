// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.synapse.enums.NodeSize;
import io.pulumi.azurenative.synapse.enums.NodeSizeFamily;
import io.pulumi.azurenative.synapse.inputs.AutoPausePropertiesArgs;
import io.pulumi.azurenative.synapse.inputs.AutoScalePropertiesArgs;
import io.pulumi.azurenative.synapse.inputs.DynamicExecutorAllocationArgs;
import io.pulumi.azurenative.synapse.inputs.LibraryInfoArgs;
import io.pulumi.azurenative.synapse.inputs.LibraryRequirementsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BigDataPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final BigDataPoolArgs Empty = new BigDataPoolArgs();

    /**
     * Auto-pausing properties
     * 
     */
    @Import(name="autoPause")
      private final @Nullable Output<AutoPausePropertiesArgs> autoPause;

    public Output<AutoPausePropertiesArgs> getAutoPause() {
        return this.autoPause == null ? Output.empty() : this.autoPause;
    }

    /**
     * Auto-scaling properties
     * 
     */
    @Import(name="autoScale")
      private final @Nullable Output<AutoScalePropertiesArgs> autoScale;

    public Output<AutoScalePropertiesArgs> getAutoScale() {
        return this.autoScale == null ? Output.empty() : this.autoScale;
    }

    /**
     * Big Data pool name
     * 
     */
    @Import(name="bigDataPoolName")
      private final @Nullable Output<String> bigDataPoolName;

    public Output<String> getBigDataPoolName() {
        return this.bigDataPoolName == null ? Output.empty() : this.bigDataPoolName;
    }

    /**
     * The cache size
     * 
     */
    @Import(name="cacheSize")
      private final @Nullable Output<Integer> cacheSize;

    public Output<Integer> getCacheSize() {
        return this.cacheSize == null ? Output.empty() : this.cacheSize;
    }

    /**
     * The time when the Big Data pool was created.
     * 
     */
    @Import(name="creationDate")
      private final @Nullable Output<String> creationDate;

    public Output<String> getCreationDate() {
        return this.creationDate == null ? Output.empty() : this.creationDate;
    }

    /**
     * List of custom libraries/packages associated with the spark pool.
     * 
     */
    @Import(name="customLibraries")
      private final @Nullable Output<List<LibraryInfoArgs>> customLibraries;

    public Output<List<LibraryInfoArgs>> getCustomLibraries() {
        return this.customLibraries == null ? Output.empty() : this.customLibraries;
    }

    /**
     * The default folder where Spark logs will be written.
     * 
     */
    @Import(name="defaultSparkLogFolder")
      private final @Nullable Output<String> defaultSparkLogFolder;

    public Output<String> getDefaultSparkLogFolder() {
        return this.defaultSparkLogFolder == null ? Output.empty() : this.defaultSparkLogFolder;
    }

    /**
     * Dynamic Executor Allocation
     * 
     */
    @Import(name="dynamicExecutorAllocation")
      private final @Nullable Output<DynamicExecutorAllocationArgs> dynamicExecutorAllocation;

    public Output<DynamicExecutorAllocationArgs> getDynamicExecutorAllocation() {
        return this.dynamicExecutorAllocation == null ? Output.empty() : this.dynamicExecutorAllocation;
    }

    /**
     * Whether to stop any running jobs in the Big Data pool
     * 
     */
    @Import(name="force")
      private final @Nullable Output<Boolean> force;

    public Output<Boolean> getForce() {
        return this.force == null ? Output.empty() : this.force;
    }

    /**
     * Whether compute isolation is required or not.
     * 
     */
    @Import(name="isComputeIsolationEnabled")
      private final @Nullable Output<Boolean> isComputeIsolationEnabled;

    public Output<Boolean> getIsComputeIsolationEnabled() {
        return this.isComputeIsolationEnabled == null ? Output.empty() : this.isComputeIsolationEnabled;
    }

    /**
     * Library version requirements
     * 
     */
    @Import(name="libraryRequirements")
      private final @Nullable Output<LibraryRequirementsArgs> libraryRequirements;

    public Output<LibraryRequirementsArgs> getLibraryRequirements() {
        return this.libraryRequirements == null ? Output.empty() : this.libraryRequirements;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The number of nodes in the Big Data pool.
     * 
     */
    @Import(name="nodeCount")
      private final @Nullable Output<Integer> nodeCount;

    public Output<Integer> getNodeCount() {
        return this.nodeCount == null ? Output.empty() : this.nodeCount;
    }

    /**
     * The level of compute power that each node in the Big Data pool has.
     * 
     */
    @Import(name="nodeSize")
      private final @Nullable Output<Either<String,NodeSize>> nodeSize;

    public Output<Either<String,NodeSize>> getNodeSize() {
        return this.nodeSize == null ? Output.empty() : this.nodeSize;
    }

    /**
     * The kind of nodes that the Big Data pool provides.
     * 
     */
    @Import(name="nodeSizeFamily")
      private final @Nullable Output<Either<String,NodeSizeFamily>> nodeSizeFamily;

    public Output<Either<String,NodeSizeFamily>> getNodeSizeFamily() {
        return this.nodeSizeFamily == null ? Output.empty() : this.nodeSizeFamily;
    }

    /**
     * The state of the Big Data pool.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Whether session level packages enabled.
     * 
     */
    @Import(name="sessionLevelPackagesEnabled")
      private final @Nullable Output<Boolean> sessionLevelPackagesEnabled;

    public Output<Boolean> getSessionLevelPackagesEnabled() {
        return this.sessionLevelPackagesEnabled == null ? Output.empty() : this.sessionLevelPackagesEnabled;
    }

    /**
     * Spark configuration file to specify additional properties
     * 
     */
    @Import(name="sparkConfigProperties")
      private final @Nullable Output<LibraryRequirementsArgs> sparkConfigProperties;

    public Output<LibraryRequirementsArgs> getSparkConfigProperties() {
        return this.sparkConfigProperties == null ? Output.empty() : this.sparkConfigProperties;
    }

    /**
     * The Spark events folder
     * 
     */
    @Import(name="sparkEventsFolder")
      private final @Nullable Output<String> sparkEventsFolder;

    public Output<String> getSparkEventsFolder() {
        return this.sparkEventsFolder == null ? Output.empty() : this.sparkEventsFolder;
    }

    /**
     * The Apache Spark version.
     * 
     */
    @Import(name="sparkVersion")
      private final @Nullable Output<String> sparkVersion;

    public Output<String> getSparkVersion() {
        return this.sparkVersion == null ? Output.empty() : this.sparkVersion;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public BigDataPoolArgs(
        @Nullable Output<AutoPausePropertiesArgs> autoPause,
        @Nullable Output<AutoScalePropertiesArgs> autoScale,
        @Nullable Output<String> bigDataPoolName,
        @Nullable Output<Integer> cacheSize,
        @Nullable Output<String> creationDate,
        @Nullable Output<List<LibraryInfoArgs>> customLibraries,
        @Nullable Output<String> defaultSparkLogFolder,
        @Nullable Output<DynamicExecutorAllocationArgs> dynamicExecutorAllocation,
        @Nullable Output<Boolean> force,
        @Nullable Output<Boolean> isComputeIsolationEnabled,
        @Nullable Output<LibraryRequirementsArgs> libraryRequirements,
        @Nullable Output<String> location,
        @Nullable Output<Integer> nodeCount,
        @Nullable Output<Either<String,NodeSize>> nodeSize,
        @Nullable Output<Either<String,NodeSizeFamily>> nodeSizeFamily,
        @Nullable Output<String> provisioningState,
        Output<String> resourceGroupName,
        @Nullable Output<Boolean> sessionLevelPackagesEnabled,
        @Nullable Output<LibraryRequirementsArgs> sparkConfigProperties,
        @Nullable Output<String> sparkEventsFolder,
        @Nullable Output<String> sparkVersion,
        @Nullable Output<Map<String,String>> tags,
        Output<String> workspaceName) {
        this.autoPause = autoPause;
        this.autoScale = autoScale;
        this.bigDataPoolName = bigDataPoolName;
        this.cacheSize = cacheSize;
        this.creationDate = creationDate;
        this.customLibraries = customLibraries;
        this.defaultSparkLogFolder = defaultSparkLogFolder;
        this.dynamicExecutorAllocation = dynamicExecutorAllocation;
        this.force = force;
        this.isComputeIsolationEnabled = isComputeIsolationEnabled;
        this.libraryRequirements = libraryRequirements;
        this.location = location;
        this.nodeCount = nodeCount;
        this.nodeSize = nodeSize;
        this.nodeSizeFamily = nodeSizeFamily;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sessionLevelPackagesEnabled = sessionLevelPackagesEnabled;
        this.sparkConfigProperties = sparkConfigProperties;
        this.sparkEventsFolder = sparkEventsFolder;
        this.sparkVersion = sparkVersion;
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private BigDataPoolArgs() {
        this.autoPause = Output.empty();
        this.autoScale = Output.empty();
        this.bigDataPoolName = Output.empty();
        this.cacheSize = Output.empty();
        this.creationDate = Output.empty();
        this.customLibraries = Output.empty();
        this.defaultSparkLogFolder = Output.empty();
        this.dynamicExecutorAllocation = Output.empty();
        this.force = Output.empty();
        this.isComputeIsolationEnabled = Output.empty();
        this.libraryRequirements = Output.empty();
        this.location = Output.empty();
        this.nodeCount = Output.empty();
        this.nodeSize = Output.empty();
        this.nodeSizeFamily = Output.empty();
        this.provisioningState = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sessionLevelPackagesEnabled = Output.empty();
        this.sparkConfigProperties = Output.empty();
        this.sparkEventsFolder = Output.empty();
        this.sparkVersion = Output.empty();
        this.tags = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigDataPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoPausePropertiesArgs> autoPause;
        private @Nullable Output<AutoScalePropertiesArgs> autoScale;
        private @Nullable Output<String> bigDataPoolName;
        private @Nullable Output<Integer> cacheSize;
        private @Nullable Output<String> creationDate;
        private @Nullable Output<List<LibraryInfoArgs>> customLibraries;
        private @Nullable Output<String> defaultSparkLogFolder;
        private @Nullable Output<DynamicExecutorAllocationArgs> dynamicExecutorAllocation;
        private @Nullable Output<Boolean> force;
        private @Nullable Output<Boolean> isComputeIsolationEnabled;
        private @Nullable Output<LibraryRequirementsArgs> libraryRequirements;
        private @Nullable Output<String> location;
        private @Nullable Output<Integer> nodeCount;
        private @Nullable Output<Either<String,NodeSize>> nodeSize;
        private @Nullable Output<Either<String,NodeSizeFamily>> nodeSizeFamily;
        private @Nullable Output<String> provisioningState;
        private Output<String> resourceGroupName;
        private @Nullable Output<Boolean> sessionLevelPackagesEnabled;
        private @Nullable Output<LibraryRequirementsArgs> sparkConfigProperties;
        private @Nullable Output<String> sparkEventsFolder;
        private @Nullable Output<String> sparkVersion;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(BigDataPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPause = defaults.autoPause;
    	      this.autoScale = defaults.autoScale;
    	      this.bigDataPoolName = defaults.bigDataPoolName;
    	      this.cacheSize = defaults.cacheSize;
    	      this.creationDate = defaults.creationDate;
    	      this.customLibraries = defaults.customLibraries;
    	      this.defaultSparkLogFolder = defaults.defaultSparkLogFolder;
    	      this.dynamicExecutorAllocation = defaults.dynamicExecutorAllocation;
    	      this.force = defaults.force;
    	      this.isComputeIsolationEnabled = defaults.isComputeIsolationEnabled;
    	      this.libraryRequirements = defaults.libraryRequirements;
    	      this.location = defaults.location;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeSize = defaults.nodeSize;
    	      this.nodeSizeFamily = defaults.nodeSizeFamily;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sessionLevelPackagesEnabled = defaults.sessionLevelPackagesEnabled;
    	      this.sparkConfigProperties = defaults.sparkConfigProperties;
    	      this.sparkEventsFolder = defaults.sparkEventsFolder;
    	      this.sparkVersion = defaults.sparkVersion;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder autoPause(@Nullable Output<AutoPausePropertiesArgs> autoPause) {
            this.autoPause = autoPause;
            return this;
        }

        public Builder autoPause(@Nullable AutoPausePropertiesArgs autoPause) {
            this.autoPause = Output.ofNullable(autoPause);
            return this;
        }

        public Builder autoScale(@Nullable Output<AutoScalePropertiesArgs> autoScale) {
            this.autoScale = autoScale;
            return this;
        }

        public Builder autoScale(@Nullable AutoScalePropertiesArgs autoScale) {
            this.autoScale = Output.ofNullable(autoScale);
            return this;
        }

        public Builder bigDataPoolName(@Nullable Output<String> bigDataPoolName) {
            this.bigDataPoolName = bigDataPoolName;
            return this;
        }

        public Builder bigDataPoolName(@Nullable String bigDataPoolName) {
            this.bigDataPoolName = Output.ofNullable(bigDataPoolName);
            return this;
        }

        public Builder cacheSize(@Nullable Output<Integer> cacheSize) {
            this.cacheSize = cacheSize;
            return this;
        }

        public Builder cacheSize(@Nullable Integer cacheSize) {
            this.cacheSize = Output.ofNullable(cacheSize);
            return this;
        }

        public Builder creationDate(@Nullable Output<String> creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder creationDate(@Nullable String creationDate) {
            this.creationDate = Output.ofNullable(creationDate);
            return this;
        }

        public Builder customLibraries(@Nullable Output<List<LibraryInfoArgs>> customLibraries) {
            this.customLibraries = customLibraries;
            return this;
        }

        public Builder customLibraries(@Nullable List<LibraryInfoArgs> customLibraries) {
            this.customLibraries = Output.ofNullable(customLibraries);
            return this;
        }

        public Builder defaultSparkLogFolder(@Nullable Output<String> defaultSparkLogFolder) {
            this.defaultSparkLogFolder = defaultSparkLogFolder;
            return this;
        }

        public Builder defaultSparkLogFolder(@Nullable String defaultSparkLogFolder) {
            this.defaultSparkLogFolder = Output.ofNullable(defaultSparkLogFolder);
            return this;
        }

        public Builder dynamicExecutorAllocation(@Nullable Output<DynamicExecutorAllocationArgs> dynamicExecutorAllocation) {
            this.dynamicExecutorAllocation = dynamicExecutorAllocation;
            return this;
        }

        public Builder dynamicExecutorAllocation(@Nullable DynamicExecutorAllocationArgs dynamicExecutorAllocation) {
            this.dynamicExecutorAllocation = Output.ofNullable(dynamicExecutorAllocation);
            return this;
        }

        public Builder force(@Nullable Output<Boolean> force) {
            this.force = force;
            return this;
        }

        public Builder force(@Nullable Boolean force) {
            this.force = Output.ofNullable(force);
            return this;
        }

        public Builder isComputeIsolationEnabled(@Nullable Output<Boolean> isComputeIsolationEnabled) {
            this.isComputeIsolationEnabled = isComputeIsolationEnabled;
            return this;
        }

        public Builder isComputeIsolationEnabled(@Nullable Boolean isComputeIsolationEnabled) {
            this.isComputeIsolationEnabled = Output.ofNullable(isComputeIsolationEnabled);
            return this;
        }

        public Builder libraryRequirements(@Nullable Output<LibraryRequirementsArgs> libraryRequirements) {
            this.libraryRequirements = libraryRequirements;
            return this;
        }

        public Builder libraryRequirements(@Nullable LibraryRequirementsArgs libraryRequirements) {
            this.libraryRequirements = Output.ofNullable(libraryRequirements);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Output.ofNullable(nodeCount);
            return this;
        }

        public Builder nodeSize(@Nullable Output<Either<String,NodeSize>> nodeSize) {
            this.nodeSize = nodeSize;
            return this;
        }

        public Builder nodeSize(@Nullable Either<String,NodeSize> nodeSize) {
            this.nodeSize = Output.ofNullable(nodeSize);
            return this;
        }

        public Builder nodeSizeFamily(@Nullable Output<Either<String,NodeSizeFamily>> nodeSizeFamily) {
            this.nodeSizeFamily = nodeSizeFamily;
            return this;
        }

        public Builder nodeSizeFamily(@Nullable Either<String,NodeSizeFamily> nodeSizeFamily) {
            this.nodeSizeFamily = Output.ofNullable(nodeSizeFamily);
            return this;
        }

        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sessionLevelPackagesEnabled(@Nullable Output<Boolean> sessionLevelPackagesEnabled) {
            this.sessionLevelPackagesEnabled = sessionLevelPackagesEnabled;
            return this;
        }

        public Builder sessionLevelPackagesEnabled(@Nullable Boolean sessionLevelPackagesEnabled) {
            this.sessionLevelPackagesEnabled = Output.ofNullable(sessionLevelPackagesEnabled);
            return this;
        }

        public Builder sparkConfigProperties(@Nullable Output<LibraryRequirementsArgs> sparkConfigProperties) {
            this.sparkConfigProperties = sparkConfigProperties;
            return this;
        }

        public Builder sparkConfigProperties(@Nullable LibraryRequirementsArgs sparkConfigProperties) {
            this.sparkConfigProperties = Output.ofNullable(sparkConfigProperties);
            return this;
        }

        public Builder sparkEventsFolder(@Nullable Output<String> sparkEventsFolder) {
            this.sparkEventsFolder = sparkEventsFolder;
            return this;
        }

        public Builder sparkEventsFolder(@Nullable String sparkEventsFolder) {
            this.sparkEventsFolder = Output.ofNullable(sparkEventsFolder);
            return this;
        }

        public Builder sparkVersion(@Nullable Output<String> sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }

        public Builder sparkVersion(@Nullable String sparkVersion) {
            this.sparkVersion = Output.ofNullable(sparkVersion);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public BigDataPoolArgs build() {
            return new BigDataPoolArgs(autoPause, autoScale, bigDataPoolName, cacheSize, creationDate, customLibraries, defaultSparkLogFolder, dynamicExecutorAllocation, force, isComputeIsolationEnabled, libraryRequirements, location, nodeCount, nodeSize, nodeSizeFamily, provisioningState, resourceGroupName, sessionLevelPackagesEnabled, sparkConfigProperties, sparkEventsFolder, sparkVersion, tags, workspaceName);
        }
    }
}
