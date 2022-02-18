// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies settings related to VM Guest Patching on Linux.
 * 
 */
public final class LinuxPatchSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinuxPatchSettingsResponse Empty = new LinuxPatchSettingsResponse();

    /**
     * Specifies the mode of VM Guest Patch Assessment for the IaaS virtual machine.<br /><br /> Possible values are:<br /><br /> **ImageDefault** - You control the timing of patch assessments on a virtual machine. <br /><br /> **AutomaticByPlatform** - The platform will trigger periodic patch assessments. The property provisionVMAgent must be true.
     * 
     */
    @InputImport(name="assessmentMode")
    private final @Nullable String assessmentMode;

    public Optional<String> getAssessmentMode() {
        return this.assessmentMode == null ? Optional.empty() : Optional.ofNullable(this.assessmentMode);
    }

    /**
     * Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines associated to virtual machine scale set with OrchestrationMode as Flexible.<br /><br /> Possible values are:<br /><br /> **ImageDefault** - The virtual machine's default patching configuration is used. <br /><br /> **AutomaticByPlatform** - The virtual machine will be automatically updated by the platform. The property provisionVMAgent must be true
     * 
     */
    @InputImport(name="patchMode")
    private final @Nullable String patchMode;

    public Optional<String> getPatchMode() {
        return this.patchMode == null ? Optional.empty() : Optional.ofNullable(this.patchMode);
    }

    public LinuxPatchSettingsResponse(
        @Nullable String assessmentMode,
        @Nullable String patchMode) {
        this.assessmentMode = assessmentMode;
        this.patchMode = patchMode;
    }

    private LinuxPatchSettingsResponse() {
        this.assessmentMode = null;
        this.patchMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxPatchSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assessmentMode;
        private @Nullable String patchMode;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxPatchSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentMode = defaults.assessmentMode;
    	      this.patchMode = defaults.patchMode;
        }

        public Builder setAssessmentMode(@Nullable String assessmentMode) {
            this.assessmentMode = assessmentMode;
            return this;
        }

        public Builder setPatchMode(@Nullable String patchMode) {
            this.patchMode = patchMode;
            return this;
        }

        public LinuxPatchSettingsResponse build() {
            return new LinuxPatchSettingsResponse(assessmentMode, patchMode);
        }
    }
}
