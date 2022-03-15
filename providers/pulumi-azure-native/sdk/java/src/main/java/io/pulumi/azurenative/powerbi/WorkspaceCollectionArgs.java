// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi;

import io.pulumi.azurenative.powerbi.inputs.AzureSkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceCollectionArgs Empty = new WorkspaceCollectionArgs();

    /**
     * Azure location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Azure resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="sku")
      private final @Nullable Output<AzureSkuArgs> sku;

    public Output<AzureSkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Power BI Embedded Workspace Collection name
     * 
     */
    @Import(name="workspaceCollectionName")
      private final @Nullable Output<String> workspaceCollectionName;

    public Output<String> getWorkspaceCollectionName() {
        return this.workspaceCollectionName == null ? Output.empty() : this.workspaceCollectionName;
    }

    public WorkspaceCollectionArgs(
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<AzureSkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> workspaceCollectionName) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.workspaceCollectionName = workspaceCollectionName;
    }

    private WorkspaceCollectionArgs() {
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
        this.workspaceCollectionName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<AzureSkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> workspaceCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.workspaceCollectionName = defaults.workspaceCollectionName;
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

        public Builder sku(@Nullable Output<AzureSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable AzureSkuArgs sku) {
            this.sku = Output.ofNullable(sku);
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

        public Builder workspaceCollectionName(@Nullable Output<String> workspaceCollectionName) {
            this.workspaceCollectionName = workspaceCollectionName;
            return this;
        }

        public Builder workspaceCollectionName(@Nullable String workspaceCollectionName) {
            this.workspaceCollectionName = Output.ofNullable(workspaceCollectionName);
            return this;
        }
        public WorkspaceCollectionArgs build() {
            return new WorkspaceCollectionArgs(location, resourceGroupName, sku, tags, workspaceCollectionName);
        }
    }
}
