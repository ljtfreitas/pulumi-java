// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.notebooks_v1.inputs.RuntimeAccessConfigArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.RuntimeSoftwareConfigArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.VirtualMachineArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeArgs Empty = new RuntimeArgs();

    /**
     * The config settings for accessing runtime.
     * 
     */
    @Import(name="accessConfig")
      private final @Nullable Output<RuntimeAccessConfigArgs> accessConfig;

    public Output<RuntimeAccessConfigArgs> getAccessConfig() {
        return this.accessConfig == null ? Output.empty() : this.accessConfig;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="runtimeId", required=true)
      private final Output<String> runtimeId;

    public Output<String> getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * The config settings for software inside the runtime.
     * 
     */
    @Import(name="softwareConfig")
      private final @Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig;

    public Output<RuntimeSoftwareConfigArgs> getSoftwareConfig() {
        return this.softwareConfig == null ? Output.empty() : this.softwareConfig;
    }

    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * 
     */
    @Import(name="virtualMachine")
      private final @Nullable Output<VirtualMachineArgs> virtualMachine;

    public Output<VirtualMachineArgs> getVirtualMachine() {
        return this.virtualMachine == null ? Output.empty() : this.virtualMachine;
    }

    public RuntimeArgs(
        @Nullable Output<RuntimeAccessConfigArgs> accessConfig,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        Output<String> runtimeId,
        @Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig,
        @Nullable Output<VirtualMachineArgs> virtualMachine) {
        this.accessConfig = accessConfig;
        this.location = location;
        this.project = project;
        this.runtimeId = Objects.requireNonNull(runtimeId, "expected parameter 'runtimeId' to be non-null");
        this.softwareConfig = softwareConfig;
        this.virtualMachine = virtualMachine;
    }

    private RuntimeArgs() {
        this.accessConfig = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
        this.runtimeId = Output.empty();
        this.softwareConfig = Output.empty();
        this.virtualMachine = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuntimeAccessConfigArgs> accessConfig;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private Output<String> runtimeId;
        private @Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig;
        private @Nullable Output<VirtualMachineArgs> virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfig = defaults.accessConfig;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.runtimeId = defaults.runtimeId;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder accessConfig(@Nullable Output<RuntimeAccessConfigArgs> accessConfig) {
            this.accessConfig = accessConfig;
            return this;
        }

        public Builder accessConfig(@Nullable RuntimeAccessConfigArgs accessConfig) {
            this.accessConfig = Output.ofNullable(accessConfig);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder runtimeId(Output<String> runtimeId) {
            this.runtimeId = Objects.requireNonNull(runtimeId);
            return this;
        }

        public Builder runtimeId(String runtimeId) {
            this.runtimeId = Output.of(Objects.requireNonNull(runtimeId));
            return this;
        }

        public Builder softwareConfig(@Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }

        public Builder softwareConfig(@Nullable RuntimeSoftwareConfigArgs softwareConfig) {
            this.softwareConfig = Output.ofNullable(softwareConfig);
            return this;
        }

        public Builder virtualMachine(@Nullable Output<VirtualMachineArgs> virtualMachine) {
            this.virtualMachine = virtualMachine;
            return this;
        }

        public Builder virtualMachine(@Nullable VirtualMachineArgs virtualMachine) {
            this.virtualMachine = Output.ofNullable(virtualMachine);
            return this;
        }
        public RuntimeArgs build() {
            return new RuntimeArgs(accessConfig, location, project, runtimeId, softwareConfig, virtualMachine);
        }
    }
}
