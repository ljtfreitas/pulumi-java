// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EndpointConfigurationDataCaptureConfigCaptureOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationDataCaptureConfigCaptureOptionArgs Empty = new EndpointConfigurationDataCaptureConfigCaptureOptionArgs();

    /**
     * Specifies the data to be captured. Should be one of `Input` or `Output`.
     * 
     */
    @Import(name="captureMode", required=true)
      private final Output<String> captureMode;

    public Output<String> getCaptureMode() {
        return this.captureMode;
    }

    public EndpointConfigurationDataCaptureConfigCaptureOptionArgs(Output<String> captureMode) {
        this.captureMode = Objects.requireNonNull(captureMode, "expected parameter 'captureMode' to be non-null");
    }

    private EndpointConfigurationDataCaptureConfigCaptureOptionArgs() {
        this.captureMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationDataCaptureConfigCaptureOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> captureMode;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationDataCaptureConfigCaptureOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captureMode = defaults.captureMode;
        }

        public Builder captureMode(Output<String> captureMode) {
            this.captureMode = Objects.requireNonNull(captureMode);
            return this;
        }

        public Builder captureMode(String captureMode) {
            this.captureMode = Output.of(Objects.requireNonNull(captureMode));
            return this;
        }
        public EndpointConfigurationDataCaptureConfigCaptureOptionArgs build() {
            return new EndpointConfigurationDataCaptureConfigCaptureOptionArgs(captureMode);
        }
    }
}
