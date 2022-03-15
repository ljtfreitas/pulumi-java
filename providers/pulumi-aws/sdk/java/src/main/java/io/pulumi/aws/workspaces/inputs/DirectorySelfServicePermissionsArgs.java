// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DirectorySelfServicePermissionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectorySelfServicePermissionsArgs Empty = new DirectorySelfServicePermissionsArgs();

    /**
     * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
     * 
     */
    @Import(name="changeComputeType")
      private final @Nullable Output<Boolean> changeComputeType;

    public Output<Boolean> getChangeComputeType() {
        return this.changeComputeType == null ? Output.empty() : this.changeComputeType;
    }

    /**
     * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
     * 
     */
    @Import(name="increaseVolumeSize")
      private final @Nullable Output<Boolean> increaseVolumeSize;

    public Output<Boolean> getIncreaseVolumeSize() {
        return this.increaseVolumeSize == null ? Output.empty() : this.increaseVolumeSize;
    }

    /**
     * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
     * 
     */
    @Import(name="rebuildWorkspace")
      private final @Nullable Output<Boolean> rebuildWorkspace;

    public Output<Boolean> getRebuildWorkspace() {
        return this.rebuildWorkspace == null ? Output.empty() : this.rebuildWorkspace;
    }

    /**
     * Whether WorkSpaces directory users can restart their workspace. Default `true`.
     * 
     */
    @Import(name="restartWorkspace")
      private final @Nullable Output<Boolean> restartWorkspace;

    public Output<Boolean> getRestartWorkspace() {
        return this.restartWorkspace == null ? Output.empty() : this.restartWorkspace;
    }

    /**
     * Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
     * 
     */
    @Import(name="switchRunningMode")
      private final @Nullable Output<Boolean> switchRunningMode;

    public Output<Boolean> getSwitchRunningMode() {
        return this.switchRunningMode == null ? Output.empty() : this.switchRunningMode;
    }

    public DirectorySelfServicePermissionsArgs(
        @Nullable Output<Boolean> changeComputeType,
        @Nullable Output<Boolean> increaseVolumeSize,
        @Nullable Output<Boolean> rebuildWorkspace,
        @Nullable Output<Boolean> restartWorkspace,
        @Nullable Output<Boolean> switchRunningMode) {
        this.changeComputeType = changeComputeType;
        this.increaseVolumeSize = increaseVolumeSize;
        this.rebuildWorkspace = rebuildWorkspace;
        this.restartWorkspace = restartWorkspace;
        this.switchRunningMode = switchRunningMode;
    }

    private DirectorySelfServicePermissionsArgs() {
        this.changeComputeType = Output.empty();
        this.increaseVolumeSize = Output.empty();
        this.rebuildWorkspace = Output.empty();
        this.restartWorkspace = Output.empty();
        this.switchRunningMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectorySelfServicePermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> changeComputeType;
        private @Nullable Output<Boolean> increaseVolumeSize;
        private @Nullable Output<Boolean> rebuildWorkspace;
        private @Nullable Output<Boolean> restartWorkspace;
        private @Nullable Output<Boolean> switchRunningMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectorySelfServicePermissionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeComputeType = defaults.changeComputeType;
    	      this.increaseVolumeSize = defaults.increaseVolumeSize;
    	      this.rebuildWorkspace = defaults.rebuildWorkspace;
    	      this.restartWorkspace = defaults.restartWorkspace;
    	      this.switchRunningMode = defaults.switchRunningMode;
        }

        public Builder changeComputeType(@Nullable Output<Boolean> changeComputeType) {
            this.changeComputeType = changeComputeType;
            return this;
        }

        public Builder changeComputeType(@Nullable Boolean changeComputeType) {
            this.changeComputeType = Output.ofNullable(changeComputeType);
            return this;
        }

        public Builder increaseVolumeSize(@Nullable Output<Boolean> increaseVolumeSize) {
            this.increaseVolumeSize = increaseVolumeSize;
            return this;
        }

        public Builder increaseVolumeSize(@Nullable Boolean increaseVolumeSize) {
            this.increaseVolumeSize = Output.ofNullable(increaseVolumeSize);
            return this;
        }

        public Builder rebuildWorkspace(@Nullable Output<Boolean> rebuildWorkspace) {
            this.rebuildWorkspace = rebuildWorkspace;
            return this;
        }

        public Builder rebuildWorkspace(@Nullable Boolean rebuildWorkspace) {
            this.rebuildWorkspace = Output.ofNullable(rebuildWorkspace);
            return this;
        }

        public Builder restartWorkspace(@Nullable Output<Boolean> restartWorkspace) {
            this.restartWorkspace = restartWorkspace;
            return this;
        }

        public Builder restartWorkspace(@Nullable Boolean restartWorkspace) {
            this.restartWorkspace = Output.ofNullable(restartWorkspace);
            return this;
        }

        public Builder switchRunningMode(@Nullable Output<Boolean> switchRunningMode) {
            this.switchRunningMode = switchRunningMode;
            return this;
        }

        public Builder switchRunningMode(@Nullable Boolean switchRunningMode) {
            this.switchRunningMode = Output.ofNullable(switchRunningMode);
            return this;
        }
        public DirectorySelfServicePermissionsArgs build() {
            return new DirectorySelfServicePermissionsArgs(changeComputeType, increaseVolumeSize, rebuildWorkspace, restartWorkspace, switchRunningMode);
        }
    }
}
