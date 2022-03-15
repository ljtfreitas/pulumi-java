// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkspaceWorkspaceProperties {
    /**
     * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
     * 
     */
    private final @Nullable String computeTypeName;
    /**
     * The size of the root volume.
     * 
     */
    private final @Nullable Integer rootVolumeSizeGib;
    /**
     * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
     * 
     */
    private final @Nullable String runningMode;
    /**
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
     * 
     */
    private final @Nullable Integer runningModeAutoStopTimeoutInMinutes;
    /**
     * The size of the user storage.
     * 
     */
    private final @Nullable Integer userVolumeSizeGib;

    @CustomType.Constructor
    private WorkspaceWorkspaceProperties(
        @CustomType.Parameter("computeTypeName") @Nullable String computeTypeName,
        @CustomType.Parameter("rootVolumeSizeGib") @Nullable Integer rootVolumeSizeGib,
        @CustomType.Parameter("runningMode") @Nullable String runningMode,
        @CustomType.Parameter("runningModeAutoStopTimeoutInMinutes") @Nullable Integer runningModeAutoStopTimeoutInMinutes,
        @CustomType.Parameter("userVolumeSizeGib") @Nullable Integer userVolumeSizeGib) {
        this.computeTypeName = computeTypeName;
        this.rootVolumeSizeGib = rootVolumeSizeGib;
        this.runningMode = runningMode;
        this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
        this.userVolumeSizeGib = userVolumeSizeGib;
    }

    /**
     * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
     * 
    */
    public Optional<String> getComputeTypeName() {
        return Optional.ofNullable(this.computeTypeName);
    }
    /**
     * The size of the root volume.
     * 
    */
    public Optional<Integer> getRootVolumeSizeGib() {
        return Optional.ofNullable(this.rootVolumeSizeGib);
    }
    /**
     * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
     * 
    */
    public Optional<String> getRunningMode() {
        return Optional.ofNullable(this.runningMode);
    }
    /**
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
     * 
    */
    public Optional<Integer> getRunningModeAutoStopTimeoutInMinutes() {
        return Optional.ofNullable(this.runningModeAutoStopTimeoutInMinutes);
    }
    /**
     * The size of the user storage.
     * 
    */
    public Optional<Integer> getUserVolumeSizeGib() {
        return Optional.ofNullable(this.userVolumeSizeGib);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceWorkspaceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeTypeName;
        private @Nullable Integer rootVolumeSizeGib;
        private @Nullable String runningMode;
        private @Nullable Integer runningModeAutoStopTimeoutInMinutes;
        private @Nullable Integer userVolumeSizeGib;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceWorkspaceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeTypeName = defaults.computeTypeName;
    	      this.rootVolumeSizeGib = defaults.rootVolumeSizeGib;
    	      this.runningMode = defaults.runningMode;
    	      this.runningModeAutoStopTimeoutInMinutes = defaults.runningModeAutoStopTimeoutInMinutes;
    	      this.userVolumeSizeGib = defaults.userVolumeSizeGib;
        }

        public Builder computeTypeName(@Nullable String computeTypeName) {
            this.computeTypeName = computeTypeName;
            return this;
        }

        public Builder rootVolumeSizeGib(@Nullable Integer rootVolumeSizeGib) {
            this.rootVolumeSizeGib = rootVolumeSizeGib;
            return this;
        }

        public Builder runningMode(@Nullable String runningMode) {
            this.runningMode = runningMode;
            return this;
        }

        public Builder runningModeAutoStopTimeoutInMinutes(@Nullable Integer runningModeAutoStopTimeoutInMinutes) {
            this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
            return this;
        }

        public Builder userVolumeSizeGib(@Nullable Integer userVolumeSizeGib) {
            this.userVolumeSizeGib = userVolumeSizeGib;
            return this;
        }
        public WorkspaceWorkspaceProperties build() {
            return new WorkspaceWorkspaceProperties(computeTypeName, rootVolumeSizeGib, runningMode, runningModeAutoStopTimeoutInMinutes, userVolumeSizeGib);
        }
    }
}
