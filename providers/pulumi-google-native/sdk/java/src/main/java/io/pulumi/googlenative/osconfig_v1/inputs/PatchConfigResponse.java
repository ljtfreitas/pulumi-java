// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.inputs.AptSettingsResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.ExecStepResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.GooSettingsResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.WindowsUpdateSettingsResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.YumSettingsResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.ZypperSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Patch configuration specifications. Contains details on how to apply the patch(es) to a VM instance.
 * 
 */
public final class PatchConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final PatchConfigResponse Empty = new PatchConfigResponse();

    /**
     * Apt update settings. Use this setting to override the default `apt` patch rules.
     * 
     */
    @InputImport(name="apt", required=true)
      private final AptSettingsResponse apt;

    public AptSettingsResponse getApt() {
        return this.apt;
    }

    /**
     * Goo update settings. Use this setting to override the default `goo` patch rules.
     * 
     */
    @InputImport(name="goo", required=true)
      private final GooSettingsResponse goo;

    public GooSettingsResponse getGoo() {
        return this.goo;
    }

    /**
     * Allows the patch job to run on Managed instance groups (MIGs).
     * 
     */
    @InputImport(name="migInstancesAllowed", required=true)
      private final Boolean migInstancesAllowed;

    public Boolean getMigInstancesAllowed() {
        return this.migInstancesAllowed;
    }

    /**
     * The `ExecStep` to run after the patch update.
     * 
     */
    @InputImport(name="postStep", required=true)
      private final ExecStepResponse postStep;

    public ExecStepResponse getPostStep() {
        return this.postStep;
    }

    /**
     * The `ExecStep` to run before the patch update.
     * 
     */
    @InputImport(name="preStep", required=true)
      private final ExecStepResponse preStep;

    public ExecStepResponse getPreStep() {
        return this.preStep;
    }

    /**
     * Post-patch reboot settings.
     * 
     */
    @InputImport(name="rebootConfig", required=true)
      private final String rebootConfig;

    public String getRebootConfig() {
        return this.rebootConfig;
    }

    /**
     * Windows update settings. Use this override the default windows patch rules.
     * 
     */
    @InputImport(name="windowsUpdate", required=true)
      private final WindowsUpdateSettingsResponse windowsUpdate;

    public WindowsUpdateSettingsResponse getWindowsUpdate() {
        return this.windowsUpdate;
    }

    /**
     * Yum update settings. Use this setting to override the default `yum` patch rules.
     * 
     */
    @InputImport(name="yum", required=true)
      private final YumSettingsResponse yum;

    public YumSettingsResponse getYum() {
        return this.yum;
    }

    /**
     * Zypper update settings. Use this setting to override the default `zypper` patch rules.
     * 
     */
    @InputImport(name="zypper", required=true)
      private final ZypperSettingsResponse zypper;

    public ZypperSettingsResponse getZypper() {
        return this.zypper;
    }

    public PatchConfigResponse(
        AptSettingsResponse apt,
        GooSettingsResponse goo,
        Boolean migInstancesAllowed,
        ExecStepResponse postStep,
        ExecStepResponse preStep,
        String rebootConfig,
        WindowsUpdateSettingsResponse windowsUpdate,
        YumSettingsResponse yum,
        ZypperSettingsResponse zypper) {
        this.apt = Objects.requireNonNull(apt, "expected parameter 'apt' to be non-null");
        this.goo = Objects.requireNonNull(goo, "expected parameter 'goo' to be non-null");
        this.migInstancesAllowed = Objects.requireNonNull(migInstancesAllowed, "expected parameter 'migInstancesAllowed' to be non-null");
        this.postStep = Objects.requireNonNull(postStep, "expected parameter 'postStep' to be non-null");
        this.preStep = Objects.requireNonNull(preStep, "expected parameter 'preStep' to be non-null");
        this.rebootConfig = Objects.requireNonNull(rebootConfig, "expected parameter 'rebootConfig' to be non-null");
        this.windowsUpdate = Objects.requireNonNull(windowsUpdate, "expected parameter 'windowsUpdate' to be non-null");
        this.yum = Objects.requireNonNull(yum, "expected parameter 'yum' to be non-null");
        this.zypper = Objects.requireNonNull(zypper, "expected parameter 'zypper' to be non-null");
    }

    private PatchConfigResponse() {
        this.apt = null;
        this.goo = null;
        this.migInstancesAllowed = null;
        this.postStep = null;
        this.preStep = null;
        this.rebootConfig = null;
        this.windowsUpdate = null;
        this.yum = null;
        this.zypper = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AptSettingsResponse apt;
        private GooSettingsResponse goo;
        private Boolean migInstancesAllowed;
        private ExecStepResponse postStep;
        private ExecStepResponse preStep;
        private String rebootConfig;
        private WindowsUpdateSettingsResponse windowsUpdate;
        private YumSettingsResponse yum;
        private ZypperSettingsResponse zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchConfigResponse defaults) {
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

        public Builder setApt(AptSettingsResponse apt) {
            this.apt = Objects.requireNonNull(apt);
            return this;
        }

        public Builder setGoo(GooSettingsResponse goo) {
            this.goo = Objects.requireNonNull(goo);
            return this;
        }

        public Builder setMigInstancesAllowed(Boolean migInstancesAllowed) {
            this.migInstancesAllowed = Objects.requireNonNull(migInstancesAllowed);
            return this;
        }

        public Builder setPostStep(ExecStepResponse postStep) {
            this.postStep = Objects.requireNonNull(postStep);
            return this;
        }

        public Builder setPreStep(ExecStepResponse preStep) {
            this.preStep = Objects.requireNonNull(preStep);
            return this;
        }

        public Builder setRebootConfig(String rebootConfig) {
            this.rebootConfig = Objects.requireNonNull(rebootConfig);
            return this;
        }

        public Builder setWindowsUpdate(WindowsUpdateSettingsResponse windowsUpdate) {
            this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
            return this;
        }

        public Builder setYum(YumSettingsResponse yum) {
            this.yum = Objects.requireNonNull(yum);
            return this;
        }

        public Builder setZypper(ZypperSettingsResponse zypper) {
            this.zypper = Objects.requireNonNull(zypper);
            return this;
        }
        public PatchConfigResponse build() {
            return new PatchConfigResponse(apt, goo, migInstancesAllowed, postStep, preStep, rebootConfig, windowsUpdate, yum, zypper);
        }
    }
}
