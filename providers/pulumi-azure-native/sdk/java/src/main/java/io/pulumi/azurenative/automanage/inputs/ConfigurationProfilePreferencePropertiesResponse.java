// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage.inputs;

import io.pulumi.azurenative.automanage.inputs.ConfigurationProfilePreferenceAntiMalwareResponse;
import io.pulumi.azurenative.automanage.inputs.ConfigurationProfilePreferenceVmBackupResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Automanage configuration profile preference properties.
 * 
 */
public final class ConfigurationProfilePreferencePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationProfilePreferencePropertiesResponse Empty = new ConfigurationProfilePreferencePropertiesResponse();

    /**
     * The custom preferences for Azure Antimalware.
     * 
     */
    @Import(name="antiMalware")
      private final @Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware;

    public Optional<ConfigurationProfilePreferenceAntiMalwareResponse> getAntiMalware() {
        return this.antiMalware == null ? Optional.empty() : Optional.ofNullable(this.antiMalware);
    }

    /**
     * The custom preferences for Azure VM Backup.
     * 
     */
    @Import(name="vmBackup")
      private final @Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup;

    public Optional<ConfigurationProfilePreferenceVmBackupResponse> getVmBackup() {
        return this.vmBackup == null ? Optional.empty() : Optional.ofNullable(this.vmBackup);
    }

    public ConfigurationProfilePreferencePropertiesResponse(
        @Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware,
        @Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup) {
        this.antiMalware = antiMalware;
        this.vmBackup = vmBackup;
    }

    private ConfigurationProfilePreferencePropertiesResponse() {
        this.antiMalware = null;
        this.vmBackup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfilePreferencePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware;
        private @Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfilePreferencePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antiMalware = defaults.antiMalware;
    	      this.vmBackup = defaults.vmBackup;
        }

        public Builder antiMalware(@Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware) {
            this.antiMalware = antiMalware;
            return this;
        }

        public Builder vmBackup(@Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup) {
            this.vmBackup = vmBackup;
            return this;
        }
        public ConfigurationProfilePreferencePropertiesResponse build() {
            return new ConfigurationProfilePreferencePropertiesResponse(antiMalware, vmBackup);
        }
    }
}
