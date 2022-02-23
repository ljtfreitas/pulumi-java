// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Define behaviors on logging.
 * 
 */
public final class GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs Empty = new GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs();

    /**
     * If true, DF Interaction logging is currently enabled.
     * 
     */
    @InputImport(name="enableInteractionLogging")
      private final @Nullable Input<Boolean> enableInteractionLogging;

    public Input<Boolean> getEnableInteractionLogging() {
        return this.enableInteractionLogging == null ? Input.empty() : this.enableInteractionLogging;
    }

    /**
     * If true, StackDriver logging is currently enabled.
     * 
     */
    @InputImport(name="enableStackdriverLogging")
      private final @Nullable Input<Boolean> enableStackdriverLogging;

    public Input<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Input.empty() : this.enableStackdriverLogging;
    }

    public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs(
        @Nullable Input<Boolean> enableInteractionLogging,
        @Nullable Input<Boolean> enableStackdriverLogging) {
        this.enableInteractionLogging = enableInteractionLogging;
        this.enableStackdriverLogging = enableStackdriverLogging;
    }

    private GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs() {
        this.enableInteractionLogging = Input.empty();
        this.enableStackdriverLogging = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableInteractionLogging;
        private @Nullable Input<Boolean> enableStackdriverLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInteractionLogging = defaults.enableInteractionLogging;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
        }

        public Builder setEnableInteractionLogging(@Nullable Input<Boolean> enableInteractionLogging) {
            this.enableInteractionLogging = enableInteractionLogging;
            return this;
        }

        public Builder setEnableInteractionLogging(@Nullable Boolean enableInteractionLogging) {
            this.enableInteractionLogging = Input.ofNullable(enableInteractionLogging);
            return this;
        }

        public Builder setEnableStackdriverLogging(@Nullable Input<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        public Builder setEnableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Input.ofNullable(enableStackdriverLogging);
            return this;
        }
        public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs build() {
            return new GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs(enableInteractionLogging, enableStackdriverLogging);
        }
    }
}
