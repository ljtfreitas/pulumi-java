// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListDeviceFailoverSetsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListDeviceFailoverSetsArgs Empty = new ListDeviceFailoverSetsArgs();

    /**
     * The device name
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
      private final String managerName;

    public String getManagerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListDeviceFailoverSetsArgs(
        String deviceName,
        String managerName,
        String resourceGroupName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListDeviceFailoverSetsArgs() {
        this.deviceName = null;
        this.managerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDeviceFailoverSetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String managerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDeviceFailoverSetsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder managerName(String managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListDeviceFailoverSetsArgs build() {
            return new ListDeviceFailoverSetsArgs(deviceName, managerName, resourceGroupName);
        }
    }
}
