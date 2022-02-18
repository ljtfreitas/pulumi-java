// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetExtensionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set extension profile.
 * 
 */
public final class VirtualMachineScaleSetExtensionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetExtensionProfileArgs Empty = new VirtualMachineScaleSetExtensionProfileArgs();

    /**
     * The virtual machine scale set child extension resources.
     * 
     */
    @InputImport(name="extensions")
    private final @Nullable Input<List<VirtualMachineScaleSetExtensionArgs>> extensions;

    public Input<List<VirtualMachineScaleSetExtensionArgs>> getExtensions() {
        return this.extensions == null ? Input.empty() : this.extensions;
    }

    /**
     * Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). <br><br> Minimum api-version: 2020-06-01
     * 
     */
    @InputImport(name="extensionsTimeBudget")
    private final @Nullable Input<String> extensionsTimeBudget;

    public Input<String> getExtensionsTimeBudget() {
        return this.extensionsTimeBudget == null ? Input.empty() : this.extensionsTimeBudget;
    }

    public VirtualMachineScaleSetExtensionProfileArgs(
        @Nullable Input<List<VirtualMachineScaleSetExtensionArgs>> extensions,
        @Nullable Input<String> extensionsTimeBudget) {
        this.extensions = extensions;
        this.extensionsTimeBudget = extensionsTimeBudget;
    }

    private VirtualMachineScaleSetExtensionProfileArgs() {
        this.extensions = Input.empty();
        this.extensionsTimeBudget = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetExtensionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<VirtualMachineScaleSetExtensionArgs>> extensions;
        private @Nullable Input<String> extensionsTimeBudget;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetExtensionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
    	      this.extensionsTimeBudget = defaults.extensionsTimeBudget;
        }

        public Builder setExtensions(@Nullable Input<List<VirtualMachineScaleSetExtensionArgs>> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder setExtensions(@Nullable List<VirtualMachineScaleSetExtensionArgs> extensions) {
            this.extensions = Input.ofNullable(extensions);
            return this;
        }

        public Builder setExtensionsTimeBudget(@Nullable Input<String> extensionsTimeBudget) {
            this.extensionsTimeBudget = extensionsTimeBudget;
            return this;
        }

        public Builder setExtensionsTimeBudget(@Nullable String extensionsTimeBudget) {
            this.extensionsTimeBudget = Input.ofNullable(extensionsTimeBudget);
            return this;
        }

        public VirtualMachineScaleSetExtensionProfileArgs build() {
            return new VirtualMachineScaleSetExtensionProfileArgs(extensions, extensionsTimeBudget);
        }
    }
}
