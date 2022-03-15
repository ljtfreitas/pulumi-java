// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.containerservice.enums.SnapshotType;
import io.pulumi.azurenative.containerservice.inputs.CreationDataArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * CreationData to be used to specify the source agent pool resource ID to create this snapshot.
     * 
     */
    @Import(name="creationData")
      private final @Nullable Output<CreationDataArgs> creationData;

    public Output<CreationDataArgs> getCreationData() {
        return this.creationData == null ? Output.empty() : this.creationData;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the managed cluster resource.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    /**
     * The type of a snapshot. The default is NodePool.
     * 
     */
    @Import(name="snapshotType")
      private final @Nullable Output<Either<String,SnapshotType>> snapshotType;

    public Output<Either<String,SnapshotType>> getSnapshotType() {
        return this.snapshotType == null ? Output.empty() : this.snapshotType;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SnapshotArgs(
        @Nullable Output<CreationDataArgs> creationData,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<Either<String,SnapshotType>> snapshotType,
        @Nullable Output<Map<String,String>> tags) {
        this.creationData = creationData;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.snapshotType = snapshotType;
        this.tags = tags;
    }

    private SnapshotArgs() {
        this.creationData = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
        this.snapshotType = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CreationDataArgs> creationData;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<Either<String,SnapshotType>> snapshotType;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationData = defaults.creationData;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.snapshotType = defaults.snapshotType;
    	      this.tags = defaults.tags;
        }

        public Builder creationData(@Nullable Output<CreationDataArgs> creationData) {
            this.creationData = creationData;
            return this;
        }

        public Builder creationData(@Nullable CreationDataArgs creationData) {
            this.creationData = Output.ofNullable(creationData);
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

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Output.ofNullable(resourceName);
            return this;
        }

        public Builder snapshotType(@Nullable Output<Either<String,SnapshotType>> snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }

        public Builder snapshotType(@Nullable Either<String,SnapshotType> snapshotType) {
            this.snapshotType = Output.ofNullable(snapshotType);
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
        public SnapshotArgs build() {
            return new SnapshotArgs(creationData, location, resourceGroupName, resourceName, snapshotType, tags);
        }
    }
}
