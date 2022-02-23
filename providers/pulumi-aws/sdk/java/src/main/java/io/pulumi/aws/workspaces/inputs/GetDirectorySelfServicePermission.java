// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class GetDirectorySelfServicePermission extends io.pulumi.resources.InvokeArgs {

    public static final GetDirectorySelfServicePermission Empty = new GetDirectorySelfServicePermission();

    /**
     * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace.
     * 
     */
    @InputImport(name="changeComputeType", required=true)
    private final Boolean changeComputeType;

    public Boolean getChangeComputeType() {
        return this.changeComputeType;
    }

    /**
     * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace.
     * 
     */
    @InputImport(name="increaseVolumeSize", required=true)
    private final Boolean increaseVolumeSize;

    public Boolean getIncreaseVolumeSize() {
        return this.increaseVolumeSize;
    }

    /**
     * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state.
     * 
     */
    @InputImport(name="rebuildWorkspace", required=true)
    private final Boolean rebuildWorkspace;

    public Boolean getRebuildWorkspace() {
        return this.rebuildWorkspace;
    }

    /**
     * Whether WorkSpaces directory users can restart their workspace.
     * 
     */
    @InputImport(name="restartWorkspace", required=true)
    private final Boolean restartWorkspace;

    public Boolean getRestartWorkspace() {
        return this.restartWorkspace;
    }

    /**
     * Whether WorkSpaces directory users can switch the running mode of their workspace.
     * 
     */
    @InputImport(name="switchRunningMode", required=true)
    private final Boolean switchRunningMode;

    public Boolean getSwitchRunningMode() {
        return this.switchRunningMode;
    }

    public GetDirectorySelfServicePermission(
        Boolean changeComputeType,
        Boolean increaseVolumeSize,
        Boolean rebuildWorkspace,
        Boolean restartWorkspace,
        Boolean switchRunningMode) {
        this.changeComputeType = Objects.requireNonNull(changeComputeType, "expected parameter 'changeComputeType' to be non-null");
        this.increaseVolumeSize = Objects.requireNonNull(increaseVolumeSize, "expected parameter 'increaseVolumeSize' to be non-null");
        this.rebuildWorkspace = Objects.requireNonNull(rebuildWorkspace, "expected parameter 'rebuildWorkspace' to be non-null");
        this.restartWorkspace = Objects.requireNonNull(restartWorkspace, "expected parameter 'restartWorkspace' to be non-null");
        this.switchRunningMode = Objects.requireNonNull(switchRunningMode, "expected parameter 'switchRunningMode' to be non-null");
    }

    private GetDirectorySelfServicePermission() {
        this.changeComputeType = null;
        this.increaseVolumeSize = null;
        this.rebuildWorkspace = null;
        this.restartWorkspace = null;
        this.switchRunningMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectorySelfServicePermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean changeComputeType;
        private Boolean increaseVolumeSize;
        private Boolean rebuildWorkspace;
        private Boolean restartWorkspace;
        private Boolean switchRunningMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectorySelfServicePermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeComputeType = defaults.changeComputeType;
    	      this.increaseVolumeSize = defaults.increaseVolumeSize;
    	      this.rebuildWorkspace = defaults.rebuildWorkspace;
    	      this.restartWorkspace = defaults.restartWorkspace;
    	      this.switchRunningMode = defaults.switchRunningMode;
        }

        public Builder setChangeComputeType(Boolean changeComputeType) {
            this.changeComputeType = Objects.requireNonNull(changeComputeType);
            return this;
        }

        public Builder setIncreaseVolumeSize(Boolean increaseVolumeSize) {
            this.increaseVolumeSize = Objects.requireNonNull(increaseVolumeSize);
            return this;
        }

        public Builder setRebuildWorkspace(Boolean rebuildWorkspace) {
            this.rebuildWorkspace = Objects.requireNonNull(rebuildWorkspace);
            return this;
        }

        public Builder setRestartWorkspace(Boolean restartWorkspace) {
            this.restartWorkspace = Objects.requireNonNull(restartWorkspace);
            return this;
        }

        public Builder setSwitchRunningMode(Boolean switchRunningMode) {
            this.switchRunningMode = Objects.requireNonNull(switchRunningMode);
            return this;
        }
        public GetDirectorySelfServicePermission build() {
            return new GetDirectorySelfServicePermission(changeComputeType, increaseVolumeSize, rebuildWorkspace, restartWorkspace, switchRunningMode);
        }
    }
}
