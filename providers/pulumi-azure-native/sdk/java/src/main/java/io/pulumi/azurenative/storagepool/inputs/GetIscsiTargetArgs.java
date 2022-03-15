// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIscsiTargetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIscsiTargetArgs Empty = new GetIscsiTargetArgs();

    /**
     * The name of the Disk pool.
     * 
     */
    @Import(name="diskPoolName", required=true)
      private final String diskPoolName;

    public String getDiskPoolName() {
        return this.diskPoolName;
    }

    /**
     * The name of the iSCSI target.
     * 
     */
    @Import(name="iscsiTargetName", required=true)
      private final String iscsiTargetName;

    public String getIscsiTargetName() {
        return this.iscsiTargetName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetIscsiTargetArgs(
        String diskPoolName,
        String iscsiTargetName,
        String resourceGroupName) {
        this.diskPoolName = Objects.requireNonNull(diskPoolName, "expected parameter 'diskPoolName' to be non-null");
        this.iscsiTargetName = Objects.requireNonNull(iscsiTargetName, "expected parameter 'iscsiTargetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIscsiTargetArgs() {
        this.diskPoolName = null;
        this.iscsiTargetName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIscsiTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskPoolName;
        private String iscsiTargetName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIscsiTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskPoolName = defaults.diskPoolName;
    	      this.iscsiTargetName = defaults.iscsiTargetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder diskPoolName(String diskPoolName) {
            this.diskPoolName = Objects.requireNonNull(diskPoolName);
            return this;
        }

        public Builder iscsiTargetName(String iscsiTargetName) {
            this.iscsiTargetName = Objects.requireNonNull(iscsiTargetName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetIscsiTargetArgs build() {
            return new GetIscsiTargetArgs(diskPoolName, iscsiTargetName, resourceGroupName);
        }
    }
}
