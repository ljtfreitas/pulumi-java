// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.inputs.VirtualMachineConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Runtime using Virtual Machine for computing.
 * 
 */
public final class VirtualMachineResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineResponse Empty = new VirtualMachineResponse();

    /**
     * The unique identifier of the Managed Compute Engine instance.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    @InputImport(name="instanceName", required=true)
      private final String instanceName;

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * Virtual Machine configuration settings.
     * 
     */
    @InputImport(name="virtualMachineConfig", required=true)
      private final VirtualMachineConfigResponse virtualMachineConfig;

    public VirtualMachineConfigResponse getVirtualMachineConfig() {
        return this.virtualMachineConfig;
    }

    public VirtualMachineResponse(
        String instanceId,
        String instanceName,
        VirtualMachineConfigResponse virtualMachineConfig) {
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.instanceName = Objects.requireNonNull(instanceName, "expected parameter 'instanceName' to be non-null");
        this.virtualMachineConfig = Objects.requireNonNull(virtualMachineConfig, "expected parameter 'virtualMachineConfig' to be non-null");
    }

    private VirtualMachineResponse() {
        this.instanceId = null;
        this.instanceName = null;
        this.virtualMachineConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private String instanceName;
        private VirtualMachineConfigResponse virtualMachineConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.virtualMachineConfig = defaults.virtualMachineConfig;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }

        public Builder setVirtualMachineConfig(VirtualMachineConfigResponse virtualMachineConfig) {
            this.virtualMachineConfig = Objects.requireNonNull(virtualMachineConfig);
            return this;
        }
        public VirtualMachineResponse build() {
            return new VirtualMachineResponse(instanceId, instanceName, virtualMachineConfig);
        }
    }
}
