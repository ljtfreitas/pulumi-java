// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfig;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeVirtualMachine {
    /**
     * - 
     * The unique identifier of the Managed Compute Engine instance.
     * 
     */
    private final @Nullable String instanceId;
    /**
     * - 
     * The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    private final @Nullable String instanceName;
    /**
     * Virtual Machine configuration settings.
     * Structure is documented below.
     * 
     */
    private final @Nullable RuntimeVirtualMachineVirtualMachineConfig virtualMachineConfig;

    @CustomType.Constructor
    private RuntimeVirtualMachine(
        @CustomType.Parameter("instanceId") @Nullable String instanceId,
        @CustomType.Parameter("instanceName") @Nullable String instanceName,
        @CustomType.Parameter("virtualMachineConfig") @Nullable RuntimeVirtualMachineVirtualMachineConfig virtualMachineConfig) {
        this.instanceId = instanceId;
        this.instanceName = instanceName;
        this.virtualMachineConfig = virtualMachineConfig;
    }

    /**
     * - 
     * The unique identifier of the Managed Compute Engine instance.
     * 
    */
    public Optional<String> getInstanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    /**
     * - 
     * The user-friendly name of the Managed Compute Engine instance.
     * 
    */
    public Optional<String> getInstanceName() {
        return Optional.ofNullable(this.instanceName);
    }
    /**
     * Virtual Machine configuration settings.
     * Structure is documented below.
     * 
    */
    public Optional<RuntimeVirtualMachineVirtualMachineConfig> getVirtualMachineConfig() {
        return Optional.ofNullable(this.virtualMachineConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachine defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instanceId;
        private @Nullable String instanceName;
        private @Nullable RuntimeVirtualMachineVirtualMachineConfig virtualMachineConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.virtualMachineConfig = defaults.virtualMachineConfig;
        }

        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder instanceName(@Nullable String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        public Builder virtualMachineConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfig virtualMachineConfig) {
            this.virtualMachineConfig = virtualMachineConfig;
            return this;
        }
        public RuntimeVirtualMachine build() {
            return new RuntimeVirtualMachine(instanceId, instanceName, virtualMachineConfig);
        }
    }
}
