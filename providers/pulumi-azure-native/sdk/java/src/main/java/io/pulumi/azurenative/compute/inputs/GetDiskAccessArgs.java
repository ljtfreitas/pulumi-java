// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDiskAccessArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDiskAccessArgs Empty = new GetDiskAccessArgs();

    /**
     * The name of the disk access resource that is being created. The name can't be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    @InputImport(name="diskAccessName", required=true)
        private final String diskAccessName;

    public String getDiskAccessName() {
        return this.diskAccessName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDiskAccessArgs(
        String diskAccessName,
        String resourceGroupName) {
        this.diskAccessName = Objects.requireNonNull(diskAccessName, "expected parameter 'diskAccessName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDiskAccessArgs() {
        this.diskAccessName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskAccessName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskAccessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskAccessName = defaults.diskAccessName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDiskAccessName(String diskAccessName) {
            this.diskAccessName = Objects.requireNonNull(diskAccessName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDiskAccessArgs build() {
            return new GetDiskAccessArgs(diskAccessName, resourceGroupName);
        }
    }
}
