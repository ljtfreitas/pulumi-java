// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse {
    /**
     * If true, DF Interaction logging is currently enabled.
     * 
     */
    private final Boolean enableInteractionLogging;
    /**
     * If true, StackDriver logging is currently enabled.
     * 
     */
    private final Boolean enableStackdriverLogging;

    @OutputCustomType.Constructor({"enableInteractionLogging","enableStackdriverLogging"})
    private GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse(
        Boolean enableInteractionLogging,
        Boolean enableStackdriverLogging) {
        this.enableInteractionLogging = Objects.requireNonNull(enableInteractionLogging);
        this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging);
    }

    /**
     * If true, DF Interaction logging is currently enabled.
     * 
     */
    public Boolean getEnableInteractionLogging() {
        return this.enableInteractionLogging;
    }
    /**
     * If true, StackDriver logging is currently enabled.
     * 
     */
    public Boolean getEnableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableInteractionLogging;
        private Boolean enableStackdriverLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInteractionLogging = defaults.enableInteractionLogging;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
        }

        public Builder setEnableInteractionLogging(Boolean enableInteractionLogging) {
            this.enableInteractionLogging = Objects.requireNonNull(enableInteractionLogging);
            return this;
        }

        public Builder setEnableStackdriverLogging(Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging);
            return this;
        }
        public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse(enableInteractionLogging, enableStackdriverLogging);
        }
    }
}
