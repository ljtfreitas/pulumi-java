// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sfn.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineTracingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineTracingConfigurationArgs Empty = new StateMachineTracingConfigurationArgs();

    /**
     * When set to `true`, AWS X-Ray tracing is enabled. Make sure the State Machine has the correct IAM policies for logging. See the [AWS Step Functions Developer Guide](https://docs.aws.amazon.com/step-functions/latest/dg/xray-iam.html) for details.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public StateMachineTracingConfigurationArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private StateMachineTracingConfigurationArgs() {
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineTracingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineTracingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public StateMachineTracingConfigurationArgs build() {
            return new StateMachineTracingConfigurationArgs(enabled);
        }
    }
}
