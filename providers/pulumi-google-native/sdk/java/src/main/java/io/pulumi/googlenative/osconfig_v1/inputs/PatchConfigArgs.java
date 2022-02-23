// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.enums.PatchConfigRebootConfig;
import io.pulumi.googlenative.osconfig_v1.inputs.AptSettingsArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.ExecStepArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.GooSettingsArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.WindowsUpdateSettingsArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.YumSettingsArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.ZypperSettingsArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Patch configuration specifications. Contains details on how to apply the patch(es) to a VM instance.
 * 
 */
public final class PatchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchConfigArgs Empty = new PatchConfigArgs();

    /**
     * Apt update settings. Use this setting to override the default `apt` patch rules.
     * 
     */
    @InputImport(name="apt")
      private final @Nullable Input<AptSettingsArgs> apt;

    public Input<AptSettingsArgs> getApt() {
        return this.apt == null ? Input.empty() : this.apt;
    }

    /**
     * Goo update settings. Use this setting to override the default `goo` patch rules.
     * 
     */
    @InputImport(name="goo")
      private final @Nullable Input<GooSettingsArgs> goo;

    public Input<GooSettingsArgs> getGoo() {
        return this.goo == null ? Input.empty() : this.goo;
    }

    /**
     * Allows the patch job to run on Managed instance groups (MIGs).
     * 
     */
    @InputImport(name="migInstancesAllowed")
      private final @Nullable Input<Boolean> migInstancesAllowed;

    public Input<Boolean> getMigInstancesAllowed() {
        return this.migInstancesAllowed == null ? Input.empty() : this.migInstancesAllowed;
    }

    /**
     * The `ExecStep` to run after the patch update.
     * 
     */
    @InputImport(name="postStep")
      private final @Nullable Input<ExecStepArgs> postStep;

    public Input<ExecStepArgs> getPostStep() {
        return this.postStep == null ? Input.empty() : this.postStep;
    }

    /**
     * The `ExecStep` to run before the patch update.
     * 
     */
    @InputImport(name="preStep")
      private final @Nullable Input<ExecStepArgs> preStep;

    public Input<ExecStepArgs> getPreStep() {
        return this.preStep == null ? Input.empty() : this.preStep;
    }

    /**
     * Post-patch reboot settings.
     * 
     */
    @InputImport(name="rebootConfig")
      private final @Nullable Input<PatchConfigRebootConfig> rebootConfig;

    public Input<PatchConfigRebootConfig> getRebootConfig() {
        return this.rebootConfig == null ? Input.empty() : this.rebootConfig;
    }

    /**
     * Windows update settings. Use this override the default windows patch rules.
     * 
     */
    @InputImport(name="windowsUpdate")
      private final @Nullable Input<WindowsUpdateSettingsArgs> windowsUpdate;

    public Input<WindowsUpdateSettingsArgs> getWindowsUpdate() {
        return this.windowsUpdate == null ? Input.empty() : this.windowsUpdate;
    }

    /**
     * Yum update settings. Use this setting to override the default `yum` patch rules.
     * 
     */
    @InputImport(name="yum")
      private final @Nullable Input<YumSettingsArgs> yum;

    public Input<YumSettingsArgs> getYum() {
        return this.yum == null ? Input.empty() : this.yum;
    }

    /**
     * Zypper update settings. Use this setting to override the default `zypper` patch rules.
     * 
     */
    @InputImport(name="zypper")
      private final @Nullable Input<ZypperSettingsArgs> zypper;

    public Input<ZypperSettingsArgs> getZypper() {
        return this.zypper == null ? Input.empty() : this.zypper;
    }

    public PatchConfigArgs(
        @Nullable Input<AptSettingsArgs> apt,
        @Nullable Input<GooSettingsArgs> goo,
        @Nullable Input<Boolean> migInstancesAllowed,
        @Nullable Input<ExecStepArgs> postStep,
        @Nullable Input<ExecStepArgs> preStep,
        @Nullable Input<PatchConfigRebootConfig> rebootConfig,
        @Nullable Input<WindowsUpdateSettingsArgs> windowsUpdate,
        @Nullable Input<YumSettingsArgs> yum,
        @Nullable Input<ZypperSettingsArgs> zypper) {
        this.apt = apt;
        this.goo = goo;
        this.migInstancesAllowed = migInstancesAllowed;
        this.postStep = postStep;
        this.preStep = preStep;
        this.rebootConfig = rebootConfig;
        this.windowsUpdate = windowsUpdate;
        this.yum = yum;
        this.zypper = zypper;
    }

    private PatchConfigArgs() {
        this.apt = Input.empty();
        this.goo = Input.empty();
        this.migInstancesAllowed = Input.empty();
        this.postStep = Input.empty();
        this.preStep = Input.empty();
        this.rebootConfig = Input.empty();
        this.windowsUpdate = Input.empty();
        this.yum = Input.empty();
        this.zypper = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AptSettingsArgs> apt;
        private @Nullable Input<GooSettingsArgs> goo;
        private @Nullable Input<Boolean> migInstancesAllowed;
        private @Nullable Input<ExecStepArgs> postStep;
        private @Nullable Input<ExecStepArgs> preStep;
        private @Nullable Input<PatchConfigRebootConfig> rebootConfig;
        private @Nullable Input<WindowsUpdateSettingsArgs> windowsUpdate;
        private @Nullable Input<YumSettingsArgs> yum;
        private @Nullable Input<ZypperSettingsArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.migInstancesAllowed = defaults.migInstancesAllowed;
    	      this.postStep = defaults.postStep;
    	      this.preStep = defaults.preStep;
    	      this.rebootConfig = defaults.rebootConfig;
    	      this.windowsUpdate = defaults.windowsUpdate;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder setApt(@Nullable Input<AptSettingsArgs> apt) {
            this.apt = apt;
            return this;
        }

        public Builder setApt(@Nullable AptSettingsArgs apt) {
            this.apt = Input.ofNullable(apt);
            return this;
        }

        public Builder setGoo(@Nullable Input<GooSettingsArgs> goo) {
            this.goo = goo;
            return this;
        }

        public Builder setGoo(@Nullable GooSettingsArgs goo) {
            this.goo = Input.ofNullable(goo);
            return this;
        }

        public Builder setMigInstancesAllowed(@Nullable Input<Boolean> migInstancesAllowed) {
            this.migInstancesAllowed = migInstancesAllowed;
            return this;
        }

        public Builder setMigInstancesAllowed(@Nullable Boolean migInstancesAllowed) {
            this.migInstancesAllowed = Input.ofNullable(migInstancesAllowed);
            return this;
        }

        public Builder setPostStep(@Nullable Input<ExecStepArgs> postStep) {
            this.postStep = postStep;
            return this;
        }

        public Builder setPostStep(@Nullable ExecStepArgs postStep) {
            this.postStep = Input.ofNullable(postStep);
            return this;
        }

        public Builder setPreStep(@Nullable Input<ExecStepArgs> preStep) {
            this.preStep = preStep;
            return this;
        }

        public Builder setPreStep(@Nullable ExecStepArgs preStep) {
            this.preStep = Input.ofNullable(preStep);
            return this;
        }

        public Builder setRebootConfig(@Nullable Input<PatchConfigRebootConfig> rebootConfig) {
            this.rebootConfig = rebootConfig;
            return this;
        }

        public Builder setRebootConfig(@Nullable PatchConfigRebootConfig rebootConfig) {
            this.rebootConfig = Input.ofNullable(rebootConfig);
            return this;
        }

        public Builder setWindowsUpdate(@Nullable Input<WindowsUpdateSettingsArgs> windowsUpdate) {
            this.windowsUpdate = windowsUpdate;
            return this;
        }

        public Builder setWindowsUpdate(@Nullable WindowsUpdateSettingsArgs windowsUpdate) {
            this.windowsUpdate = Input.ofNullable(windowsUpdate);
            return this;
        }

        public Builder setYum(@Nullable Input<YumSettingsArgs> yum) {
            this.yum = yum;
            return this;
        }

        public Builder setYum(@Nullable YumSettingsArgs yum) {
            this.yum = Input.ofNullable(yum);
            return this;
        }

        public Builder setZypper(@Nullable Input<ZypperSettingsArgs> zypper) {
            this.zypper = zypper;
            return this;
        }

        public Builder setZypper(@Nullable ZypperSettingsArgs zypper) {
            this.zypper = Input.ofNullable(zypper);
            return this;
        }
        public PatchConfigArgs build() {
            return new PatchConfigArgs(apt, goo, migInstancesAllowed, postStep, preStep, rebootConfig, windowsUpdate, yum, zypper);
        }
    }
}
