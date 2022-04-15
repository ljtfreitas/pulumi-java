// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigPostStepGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigPostStepGetArgs Empty = new PatchDeploymentPatchConfigPostStepGetArgs();

    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    @Import(name="linuxExecStepConfig")
      private final @Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs> linuxExecStepConfig;

    public Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs> linuxExecStepConfig() {
        return this.linuxExecStepConfig == null ? Codegen.empty() : this.linuxExecStepConfig;
    }

    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    @Import(name="windowsExecStepConfig")
      private final @Nullable Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGetArgs> windowsExecStepConfig;

    public Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGetArgs> windowsExecStepConfig() {
        return this.windowsExecStepConfig == null ? Codegen.empty() : this.windowsExecStepConfig;
    }

    public PatchDeploymentPatchConfigPostStepGetArgs(
        @Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs> linuxExecStepConfig,
        @Nullable Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGetArgs> windowsExecStepConfig) {
        this.linuxExecStepConfig = linuxExecStepConfig;
        this.windowsExecStepConfig = windowsExecStepConfig;
    }

    private PatchDeploymentPatchConfigPostStepGetArgs() {
        this.linuxExecStepConfig = Codegen.empty();
        this.windowsExecStepConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPostStepGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs> linuxExecStepConfig;
        private @Nullable Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGetArgs> windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPostStepGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder linuxExecStepConfig(@Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs> linuxExecStepConfig) {
            this.linuxExecStepConfig = linuxExecStepConfig;
            return this;
        }
        public Builder linuxExecStepConfig(@Nullable PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs linuxExecStepConfig) {
            this.linuxExecStepConfig = Codegen.ofNullable(linuxExecStepConfig);
            return this;
        }
        public Builder windowsExecStepConfig(@Nullable Output<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGetArgs> windowsExecStepConfig) {
            this.windowsExecStepConfig = windowsExecStepConfig;
            return this;
        }
        public Builder windowsExecStepConfig(@Nullable PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGetArgs windowsExecStepConfig) {
            this.windowsExecStepConfig = Codegen.ofNullable(windowsExecStepConfig);
            return this;
        }        public PatchDeploymentPatchConfigPostStepGetArgs build() {
            return new PatchDeploymentPatchConfigPostStepGetArgs(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
