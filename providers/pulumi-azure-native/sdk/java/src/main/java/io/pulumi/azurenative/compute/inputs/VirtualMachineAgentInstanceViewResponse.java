// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineExtensionHandlerInstanceViewResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of the VM Agent running on the virtual machine.
 * 
 */
public final class VirtualMachineAgentInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineAgentInstanceViewResponse Empty = new VirtualMachineAgentInstanceViewResponse();

    /**
     * The virtual machine extension handler instance view.
     * 
     */
    @InputImport(name="extensionHandlers")
    private final @Nullable List<VirtualMachineExtensionHandlerInstanceViewResponse> extensionHandlers;

    public List<VirtualMachineExtensionHandlerInstanceViewResponse> getExtensionHandlers() {
        return this.extensionHandlers == null ? List.of() : this.extensionHandlers;
    }

    /**
     * The resource status information.
     * 
     */
    @InputImport(name="statuses")
    private final @Nullable List<InstanceViewStatusResponse> statuses;

    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    /**
     * The VM Agent full version.
     * 
     */
    @InputImport(name="vmAgentVersion")
    private final @Nullable String vmAgentVersion;

    public Optional<String> getVmAgentVersion() {
        return this.vmAgentVersion == null ? Optional.empty() : Optional.ofNullable(this.vmAgentVersion);
    }

    public VirtualMachineAgentInstanceViewResponse(
        @Nullable List<VirtualMachineExtensionHandlerInstanceViewResponse> extensionHandlers,
        @Nullable List<InstanceViewStatusResponse> statuses,
        @Nullable String vmAgentVersion) {
        this.extensionHandlers = extensionHandlers;
        this.statuses = statuses;
        this.vmAgentVersion = vmAgentVersion;
    }

    private VirtualMachineAgentInstanceViewResponse() {
        this.extensionHandlers = List.of();
        this.statuses = List.of();
        this.vmAgentVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineAgentInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<VirtualMachineExtensionHandlerInstanceViewResponse> extensionHandlers;
        private @Nullable List<InstanceViewStatusResponse> statuses;
        private @Nullable String vmAgentVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineAgentInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionHandlers = defaults.extensionHandlers;
    	      this.statuses = defaults.statuses;
    	      this.vmAgentVersion = defaults.vmAgentVersion;
        }

        public Builder setExtensionHandlers(@Nullable List<VirtualMachineExtensionHandlerInstanceViewResponse> extensionHandlers) {
            this.extensionHandlers = extensionHandlers;
            return this;
        }

        public Builder setStatuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setVmAgentVersion(@Nullable String vmAgentVersion) {
            this.vmAgentVersion = vmAgentVersion;
            return this;
        }

        public VirtualMachineAgentInstanceViewResponse build() {
            return new VirtualMachineAgentInstanceViewResponse(extensionHandlers, statuses, vmAgentVersion);
        }
    }
}
