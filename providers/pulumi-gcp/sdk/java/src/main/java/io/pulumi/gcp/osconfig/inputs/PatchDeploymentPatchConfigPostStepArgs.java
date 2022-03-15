// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigPostStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigPostStepArgs Empty = new PatchDeploymentPatchConfigPostStepArgs();

    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    @Import(name="linuxExecStepConfig")
      private final @Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs> linuxExecStepConfig;

    public Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs> getLinuxExecStepConfig() {
        return this.linuxExecStepConfig == null ? Output.empty() : this.linuxExecStepConfig;
    }

    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    @Import(name="windowsExecStepConfig")
      private final @Nullable Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs> windowsExecStepConfig;

    public Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs> getWindowsExecStepConfig() {
        return this.windowsExecStepConfig == null ? Output.empty() : this.windowsExecStepConfig;
    }

    public PatchDeploymentPatchConfigPostStepArgs(
        @Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs> linuxExecStepConfig,
        @Nullable Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs> windowsExecStepConfig) {
        this.linuxExecStepConfig = linuxExecStepConfig;
        this.windowsExecStepConfig = windowsExecStepConfig;
    }

    private PatchDeploymentPatchConfigPostStepArgs() {
        this.linuxExecStepConfig = Output.empty();
        this.windowsExecStepConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPostStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs> linuxExecStepConfig;
        private @Nullable Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs> windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPostStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder linuxExecStepConfig(@Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs> linuxExecStepConfig) {
            this.linuxExecStepConfig = linuxExecStepConfig;
            return this;
        }

        public Builder linuxExecStepConfig(@Nullable PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs linuxExecStepConfig) {
            this.linuxExecStepConfig = Output.ofNullable(linuxExecStepConfig);
            return this;
        }

        public Builder windowsExecStepConfig(@Nullable Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs> windowsExecStepConfig) {
            this.windowsExecStepConfig = windowsExecStepConfig;
            return this;
        }

        public Builder windowsExecStepConfig(@Nullable PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs windowsExecStepConfig) {
            this.windowsExecStepConfig = Output.ofNullable(windowsExecStepConfig);
            return this;
        }
        public PatchDeploymentPatchConfigPostStepArgs build() {
            return new PatchDeploymentPatchConfigPostStepArgs(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
