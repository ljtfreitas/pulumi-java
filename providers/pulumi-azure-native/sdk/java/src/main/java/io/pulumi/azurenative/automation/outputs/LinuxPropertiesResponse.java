// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxPropertiesResponse {
    /**
     * packages excluded from the software update configuration.
     * 
     */
    private final @Nullable List<String> excludedPackageNameMasks;
    /**
     * Update classifications included in the software update configuration.
     * 
     */
    private final @Nullable String includedPackageClassifications;
    /**
     * packages included from the software update configuration.
     * 
     */
    private final @Nullable List<String> includedPackageNameMasks;
    /**
     * Reboot setting for the software update configuration.
     * 
     */
    private final @Nullable String rebootSetting;

    @CustomType.Constructor
    private LinuxPropertiesResponse(
        @CustomType.Parameter("excludedPackageNameMasks") @Nullable List<String> excludedPackageNameMasks,
        @CustomType.Parameter("includedPackageClassifications") @Nullable String includedPackageClassifications,
        @CustomType.Parameter("includedPackageNameMasks") @Nullable List<String> includedPackageNameMasks,
        @CustomType.Parameter("rebootSetting") @Nullable String rebootSetting) {
        this.excludedPackageNameMasks = excludedPackageNameMasks;
        this.includedPackageClassifications = includedPackageClassifications;
        this.includedPackageNameMasks = includedPackageNameMasks;
        this.rebootSetting = rebootSetting;
    }

    /**
     * packages excluded from the software update configuration.
     * 
    */
    public List<String> getExcludedPackageNameMasks() {
        return this.excludedPackageNameMasks == null ? List.of() : this.excludedPackageNameMasks;
    }
    /**
     * Update classifications included in the software update configuration.
     * 
    */
    public Optional<String> getIncludedPackageClassifications() {
        return Optional.ofNullable(this.includedPackageClassifications);
    }
    /**
     * packages included from the software update configuration.
     * 
    */
    public List<String> getIncludedPackageNameMasks() {
        return this.includedPackageNameMasks == null ? List.of() : this.includedPackageNameMasks;
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

    public static Builder builder(LinuxPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedPackageNameMasks;
        private @Nullable String includedPackageClassifications;
        private @Nullable List<String> includedPackageNameMasks;
        private @Nullable String rebootSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedPackageNameMasks = defaults.excludedPackageNameMasks;
    	      this.includedPackageClassifications = defaults.includedPackageClassifications;
    	      this.includedPackageNameMasks = defaults.includedPackageNameMasks;
    	      this.rebootSetting = defaults.rebootSetting;
        }

        public Builder excludedPackageNameMasks(@Nullable List<String> excludedPackageNameMasks) {
            this.excludedPackageNameMasks = excludedPackageNameMasks;
            return this;
        }

        public Builder includedPackageClassifications(@Nullable String includedPackageClassifications) {
            this.includedPackageClassifications = includedPackageClassifications;
            return this;
        }

        public Builder includedPackageNameMasks(@Nullable List<String> includedPackageNameMasks) {
            this.includedPackageNameMasks = includedPackageNameMasks;
            return this;
        }

        public Builder rebootSetting(@Nullable String rebootSetting) {
            this.rebootSetting = rebootSetting;
            return this;
        }
        public LinuxPropertiesResponse build() {
            return new LinuxPropertiesResponse(excludedPackageNameMasks, includedPackageClassifications, includedPackageNameMasks, rebootSetting);
        }
    }
}
