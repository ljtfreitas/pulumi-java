// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStorageAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStorageAccountArgs Empty = new GetStorageAccountArgs();

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The storage account name.
     * 
     */
    @Import(name="storageAccountName", required=true)
      private final String storageAccountName;

    public String getStorageAccountName() {
        return this.storageAccountName;
    }

    public GetStorageAccountArgs(
        String deviceName,
        String resourceGroupName,
        String storageAccountName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
    }

    private GetStorageAccountArgs() {
        this.deviceName = null;
        this.resourceGroupName = null;
        this.storageAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String resourceGroupName;
        private String storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public GetStorageAccountArgs build() {
            return new GetStorageAccountArgs(deviceName, resourceGroupName, storageAccountName);
        }
    }
}
