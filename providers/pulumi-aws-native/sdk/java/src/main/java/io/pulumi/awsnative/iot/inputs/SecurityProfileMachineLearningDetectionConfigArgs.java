// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.SecurityProfileMachineLearningDetectionConfigConfidenceLevel;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration of an ML Detect Security Profile.
 * 
 */
public final class SecurityProfileMachineLearningDetectionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileMachineLearningDetectionConfigArgs Empty = new SecurityProfileMachineLearningDetectionConfigArgs();

    /**
     * The sensitivity of anomalous behavior evaluation. Can be Low, Medium, or High.
     * 
     */
    @InputImport(name="confidenceLevel")
        private final @Nullable Input<SecurityProfileMachineLearningDetectionConfigConfidenceLevel> confidenceLevel;

    public Input<SecurityProfileMachineLearningDetectionConfigConfidenceLevel> getConfidenceLevel() {
        return this.confidenceLevel == null ? Input.empty() : this.confidenceLevel;
    }

    public SecurityProfileMachineLearningDetectionConfigArgs(@Nullable Input<SecurityProfileMachineLearningDetectionConfigConfidenceLevel> confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    private SecurityProfileMachineLearningDetectionConfigArgs() {
        this.confidenceLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMachineLearningDetectionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecurityProfileMachineLearningDetectionConfigConfidenceLevel> confidenceLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMachineLearningDetectionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceLevel = defaults.confidenceLevel;
        }

        public Builder setConfidenceLevel(@Nullable Input<SecurityProfileMachineLearningDetectionConfigConfidenceLevel> confidenceLevel) {
            this.confidenceLevel = confidenceLevel;
            return this;
        }

        public Builder setConfidenceLevel(@Nullable SecurityProfileMachineLearningDetectionConfigConfidenceLevel confidenceLevel) {
            this.confidenceLevel = Input.ofNullable(confidenceLevel);
            return this;
        }
        public SecurityProfileMachineLearningDetectionConfigArgs build() {
            return new SecurityProfileMachineLearningDetectionConfigArgs(confidenceLevel);
        }
    }
}
