// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.LinuxPropertiesResponse;
import io.pulumi.azurenative.automation.inputs.TargetPropertiesResponse;
import io.pulumi.azurenative.automation.inputs.WindowsPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Update specific properties of the software update configuration.
 * 
 */
public final class UpdateConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpdateConfigurationResponse Empty = new UpdateConfigurationResponse();

    /**
     * List of azure resource Ids for azure virtual machines targeted by the software update configuration.
     * 
     */
    @Import(name="azureVirtualMachines")
      private final @Nullable List<String> azureVirtualMachines;

    public List<String> getAzureVirtualMachines() {
        return this.azureVirtualMachines == null ? List.of() : this.azureVirtualMachines;
    }

    /**
     * Maximum time allowed for the software update configuration run. Duration needs to be specified using the format PT[n]H[n]M[n]S as per ISO8601
     * 
     */
    @Import(name="duration")
      private final @Nullable String duration;

    public Optional<String> getDuration() {
        return this.duration == null ? Optional.empty() : Optional.ofNullable(this.duration);
    }

    /**
     * Linux specific update configuration.
     * 
     */
    @Import(name="linux")
      private final @Nullable LinuxPropertiesResponse linux;

    public Optional<LinuxPropertiesResponse> getLinux() {
        return this.linux == null ? Optional.empty() : Optional.ofNullable(this.linux);
    }

    /**
     * List of names of non-azure machines targeted by the software update configuration.
     * 
     */
    @Import(name="nonAzureComputerNames")
      private final @Nullable List<String> nonAzureComputerNames;

    public List<String> getNonAzureComputerNames() {
        return this.nonAzureComputerNames == null ? List.of() : this.nonAzureComputerNames;
    }

    /**
     * operating system of target machines
     * 
     */
    @Import(name="operatingSystem", required=true)
      private final String operatingSystem;

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Group targets for the software update configuration.
     * 
     */
    @Import(name="targets")
      private final @Nullable TargetPropertiesResponse targets;

    public Optional<TargetPropertiesResponse> getTargets() {
        return this.targets == null ? Optional.empty() : Optional.ofNullable(this.targets);
    }

    /**
     * Windows specific update configuration.
     * 
     */
    @Import(name="windows")
      private final @Nullable WindowsPropertiesResponse windows;

    public Optional<WindowsPropertiesResponse> getWindows() {
        return this.windows == null ? Optional.empty() : Optional.ofNullable(this.windows);
    }

    public UpdateConfigurationResponse(
        @Nullable List<String> azureVirtualMachines,
        @Nullable String duration,
        @Nullable LinuxPropertiesResponse linux,
        @Nullable List<String> nonAzureComputerNames,
        String operatingSystem,
        @Nullable TargetPropertiesResponse targets,
        @Nullable WindowsPropertiesResponse windows) {
        this.azureVirtualMachines = azureVirtualMachines;
        this.duration = duration;
        this.linux = linux;
        this.nonAzureComputerNames = nonAzureComputerNames;
        this.operatingSystem = Objects.requireNonNull(operatingSystem, "expected parameter 'operatingSystem' to be non-null");
        this.targets = targets;
        this.windows = windows;
    }

    private UpdateConfigurationResponse() {
        this.azureVirtualMachines = List.of();
        this.duration = null;
        this.linux = null;
        this.nonAzureComputerNames = List.of();
        this.operatingSystem = null;
        this.targets = null;
        this.windows = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpdateConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> azureVirtualMachines;
        private @Nullable String duration;
        private @Nullable LinuxPropertiesResponse linux;
        private @Nullable List<String> nonAzureComputerNames;
        private String operatingSystem;
        private @Nullable TargetPropertiesResponse targets;
        private @Nullable WindowsPropertiesResponse windows;

        public Builder() {
    	      // Empty
        }

        public Builder(UpdateConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureVirtualMachines = defaults.azureVirtualMachines;
    	      this.duration = defaults.duration;
    	      this.linux = defaults.linux;
    	      this.nonAzureComputerNames = defaults.nonAzureComputerNames;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.targets = defaults.targets;
    	      this.windows = defaults.windows;
        }

        public Builder azureVirtualMachines(@Nullable List<String> azureVirtualMachines) {
            this.azureVirtualMachines = azureVirtualMachines;
            return this;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }

        public Builder linux(@Nullable LinuxPropertiesResponse linux) {
            this.linux = linux;
            return this;
        }

        public Builder nonAzureComputerNames(@Nullable List<String> nonAzureComputerNames) {
            this.nonAzureComputerNames = nonAzureComputerNames;
            return this;
        }

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = Objects.requireNonNull(operatingSystem);
            return this;
        }

        public Builder targets(@Nullable TargetPropertiesResponse targets) {
            this.targets = targets;
            return this;
        }

        public Builder windows(@Nullable WindowsPropertiesResponse windows) {
            this.windows = windows;
            return this;
        }
        public UpdateConfigurationResponse build() {
            return new UpdateConfigurationResponse(azureVirtualMachines, duration, linux, nonAzureComputerNames, operatingSystem, targets, windows);
        }
    }
}
