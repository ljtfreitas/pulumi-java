// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Input parameters in the form of key-value pairs for the conformance pack.
 * 
 */
public final class ConformancePackInputParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConformancePackInputParameterArgs Empty = new ConformancePackInputParameterArgs();

    @Import(name="parameterName", required=true)
      private final Output<String> parameterName;

    public Output<String> getParameterName() {
        return this.parameterName;
    }

    @Import(name="parameterValue", required=true)
      private final Output<String> parameterValue;

    public Output<String> getParameterValue() {
        return this.parameterValue;
    }

    public ConformancePackInputParameterArgs(
        Output<String> parameterName,
        Output<String> parameterValue) {
        this.parameterName = Objects.requireNonNull(parameterName, "expected parameter 'parameterName' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private ConformancePackInputParameterArgs() {
        this.parameterName = Output.empty();
        this.parameterValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConformancePackInputParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> parameterName;
        private Output<String> parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConformancePackInputParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterName(Output<String> parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder parameterName(String parameterName) {
            this.parameterName = Output.of(Objects.requireNonNull(parameterName));
            return this;
        }

        public Builder parameterValue(Output<String> parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }

        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Output.of(Objects.requireNonNull(parameterValue));
            return this;
        }
        public ConformancePackInputParameterArgs build() {
            return new ConformancePackInputParameterArgs(parameterName, parameterValue);
        }
    }
}
