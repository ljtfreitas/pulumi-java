// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListIotDpsResourceKeysForKeyNameArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListIotDpsResourceKeysForKeyNameArgs Empty = new ListIotDpsResourceKeysForKeyNameArgs();

    /**
     * Logical key name to get key-values for.
     * 
     */
    @Import(name="keyName", required=true)
      private final String keyName;

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * Name of the provisioning service.
     * 
     */
    @Import(name="provisioningServiceName", required=true)
      private final String provisioningServiceName;

    public String getProvisioningServiceName() {
        return this.provisioningServiceName;
    }

    /**
     * The name of the resource group that contains the provisioning service.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListIotDpsResourceKeysForKeyNameArgs(
        String keyName,
        String provisioningServiceName,
        String resourceGroupName) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.provisioningServiceName = Objects.requireNonNull(provisioningServiceName, "expected parameter 'provisioningServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListIotDpsResourceKeysForKeyNameArgs() {
        this.keyName = null;
        this.provisioningServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIotDpsResourceKeysForKeyNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String provisioningServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIotDpsResourceKeysForKeyNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.provisioningServiceName = defaults.provisioningServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder provisioningServiceName(String provisioningServiceName) {
            this.provisioningServiceName = Objects.requireNonNull(provisioningServiceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListIotDpsResourceKeysForKeyNameArgs build() {
            return new ListIotDpsResourceKeysForKeyNameArgs(keyName, provisioningServiceName, resourceGroupName);
        }
    }
}
