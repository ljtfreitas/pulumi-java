// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WindowsPropertiesResponse {
    /**
     * KB numbers excluded from the software update configuration.
     * 
     */
    private final @Nullable List<String> excludedKbNumbers;
    /**
     * KB numbers included from the software update configuration.
     * 
     */
    private final @Nullable List<String> includedKbNumbers;
    /**
     * Update classification included in the software update configuration. A comma separated string with required values
     * 
     */
    private final @Nullable String includedUpdateClassifications;
    /**
     * Reboot setting for the software update configuration.
     * 
     */
    private final @Nullable String rebootSetting;

    @OutputCustomType.Constructor({"excludedKbNumbers","includedKbNumbers","includedUpdateClassifications","rebootSetting"})
    private WindowsPropertiesResponse(
        @Nullable List<String> excludedKbNumbers,
        @Nullable List<String> includedKbNumbers,
        @Nullable String includedUpdateClassifications,
        @Nullable String rebootSetting) {
        this.excludedKbNumbers = excludedKbNumbers;
        this.includedKbNumbers = includedKbNumbers;
        this.includedUpdateClassifications = includedUpdateClassifications;
        this.rebootSetting = rebootSetting;
    }

    /**
     * KB numbers excluded from the software update configuration.
     * 
     */
    public List<String> getExcludedKbNumbers() {
        return this.excludedKbNumbers == null ? List.of() : this.excludedKbNumbers;
    }
    /**
     * KB numbers included from the software update configuration.
     * 
     */
    public List<String> getIncludedKbNumbers() {
        return this.includedKbNumbers == null ? List.of() : this.includedKbNumbers;
    }
    /**
     * Update classification included in the software update configuration. A comma separated string with required values
     * 
     */
    public Optional<String> getIncludedUpdateClassifications() {
        return Optional.ofNullable(this.includedUpdateClassifications);
    }
    /**
     * Reboot setting for the software update configuration.
     * 
     */
    public Optional<String> getRebootSetting() {
        return Optional.ofNullable(this.rebootSetting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedKbNumbers;
        private @Nullable List<String> includedKbNumbers;
        private @Nullable String includedUpdateClassifications;
        private @Nullable String rebootSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedKbNumbers = defaults.excludedKbNumbers;
    	      this.includedKbNumbers = defaults.includedKbNumbers;
    	      this.includedUpdateClassifications = defaults.includedUpdateClassifications;
    	      this.rebootSetting = defaults.rebootSetting;
        }

        public Builder setExcludedKbNumbers(@Nullable List<String> excludedKbNumbers) {
            this.excludedKbNumbers = excludedKbNumbers;
            return this;
        }

        public Builder setIncludedKbNumbers(@Nullable List<String> includedKbNumbers) {
            this.includedKbNumbers = includedKbNumbers;
            return this;
        }

        public Builder setIncludedUpdateClassifications(@Nullable String includedUpdateClassifications) {
            this.includedUpdateClassifications = includedUpdateClassifications;
            return this;
        }

        public Builder setRebootSetting(@Nullable String rebootSetting) {
            this.rebootSetting = rebootSetting;
            return this;
        }
        public WindowsPropertiesResponse build() {
            return new WindowsPropertiesResponse(excludedKbNumbers, includedKbNumbers, includedUpdateClassifications, rebootSetting);
        }
    }
}
