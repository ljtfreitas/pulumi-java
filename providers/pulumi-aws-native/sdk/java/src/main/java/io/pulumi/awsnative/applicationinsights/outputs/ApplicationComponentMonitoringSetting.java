// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.outputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationComponentMonitoringSettingComponentConfigurationMode;
import io.pulumi.awsnative.applicationinsights.outputs.ApplicationComponentConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationComponentMonitoringSetting {
    /**
     * The ARN of the compnonent.
     * 
     */
    private final @Nullable String componentARN;
    /**
     * The component monitoring configuration mode.
     * 
     */
    private final ApplicationComponentMonitoringSettingComponentConfigurationMode componentConfigurationMode;
    /**
     * The name of the component.
     * 
     */
    private final @Nullable String componentName;
    /**
     * The monitoring configuration of the component.
     * 
     */
    private final @Nullable ApplicationComponentConfiguration customComponentConfiguration;
    /**
     * The overwritten settings on default component monitoring configuration.
     * 
     */
    private final @Nullable ApplicationComponentConfiguration defaultOverwriteComponentConfiguration;
    /**
     * The tier of the application component.
     * 
     */
    private final String tier;

    @OutputCustomType.Constructor
    private ApplicationComponentMonitoringSetting(
        @OutputCustomType.Parameter("componentARN") @Nullable String componentARN,
        @OutputCustomType.Parameter("componentConfigurationMode") ApplicationComponentMonitoringSettingComponentConfigurationMode componentConfigurationMode,
        @OutputCustomType.Parameter("componentName") @Nullable String componentName,
        @OutputCustomType.Parameter("customComponentConfiguration") @Nullable ApplicationComponentConfiguration customComponentConfiguration,
        @OutputCustomType.Parameter("defaultOverwriteComponentConfiguration") @Nullable ApplicationComponentConfiguration defaultOverwriteComponentConfiguration,
        @OutputCustomType.Parameter("tier") String tier) {
        this.componentARN = componentARN;
        this.componentConfigurationMode = componentConfigurationMode;
        this.componentName = componentName;
        this.customComponentConfiguration = customComponentConfiguration;
        this.defaultOverwriteComponentConfiguration = defaultOverwriteComponentConfiguration;
        this.tier = tier;
    }

    /**
     * The ARN of the compnonent.
     * 
    */
    public Optional<String> getComponentARN() {
        return Optional.ofNullable(this.componentARN);
    }
    /**
     * The component monitoring configuration mode.
     * 
    */
    public ApplicationComponentMonitoringSettingComponentConfigurationMode getComponentConfigurationMode() {
        return this.componentConfigurationMode;
    }
    /**
     * The name of the component.
     * 
    */
    public Optional<String> getComponentName() {
        return Optional.ofNullable(this.componentName);
    }
    /**
     * The monitoring configuration of the component.
     * 
    */
    public Optional<ApplicationComponentConfiguration> getCustomComponentConfiguration() {
        return Optional.ofNullable(this.customComponentConfiguration);
    }
    /**
     * The overwritten settings on default component monitoring configuration.
     * 
    */
    public Optional<ApplicationComponentConfiguration> getDefaultOverwriteComponentConfiguration() {
        return Optional.ofNullable(this.defaultOverwriteComponentConfiguration);
    }
    /**
     * The tier of the application component.
     * 
    */
    public String getTier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationComponentMonitoringSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentARN;
        private ApplicationComponentMonitoringSettingComponentConfigurationMode componentConfigurationMode;
        private @Nullable String componentName;
        private @Nullable ApplicationComponentConfiguration customComponentConfiguration;
        private @Nullable ApplicationComponentConfiguration defaultOverwriteComponentConfiguration;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationComponentMonitoringSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentARN = defaults.componentARN;
    	      this.componentConfigurationMode = defaults.componentConfigurationMode;
    	      this.componentName = defaults.componentName;
    	      this.customComponentConfiguration = defaults.customComponentConfiguration;
    	      this.defaultOverwriteComponentConfiguration = defaults.defaultOverwriteComponentConfiguration;
    	      this.tier = defaults.tier;
        }

        public Builder setComponentARN(@Nullable String componentARN) {
            this.componentARN = componentARN;
            return this;
        }

        public Builder setComponentConfigurationMode(ApplicationComponentMonitoringSettingComponentConfigurationMode componentConfigurationMode) {
            this.componentConfigurationMode = Objects.requireNonNull(componentConfigurationMode);
            return this;
        }

        public Builder setComponentName(@Nullable String componentName) {
            this.componentName = componentName;
            return this;
        }

        public Builder setCustomComponentConfiguration(@Nullable ApplicationComponentConfiguration customComponentConfiguration) {
            this.customComponentConfiguration = customComponentConfiguration;
            return this;
        }

        public Builder setDefaultOverwriteComponentConfiguration(@Nullable ApplicationComponentConfiguration defaultOverwriteComponentConfiguration) {
            this.defaultOverwriteComponentConfiguration = defaultOverwriteComponentConfiguration;
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public ApplicationComponentMonitoringSetting build() {
            return new ApplicationComponentMonitoringSetting(componentARN, componentConfigurationMode, componentName, customComponentConfiguration, defaultOverwriteComponentConfiguration, tier);
        }
    }
}
