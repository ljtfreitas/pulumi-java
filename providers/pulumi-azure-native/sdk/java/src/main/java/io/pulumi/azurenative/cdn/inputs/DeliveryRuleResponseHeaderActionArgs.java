// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.HeaderActionParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the response header action for the delivery rule.
 * 
 */
public final class DeliveryRuleResponseHeaderActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleResponseHeaderActionArgs Empty = new DeliveryRuleResponseHeaderActionArgs();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'ModifyResponseHeader'.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<HeaderActionParametersArgs> parameters;

    public Output<HeaderActionParametersArgs> getParameters() {
        return this.parameters;
    }

    public DeliveryRuleResponseHeaderActionArgs(
        Output<String> name,
        Output<HeaderActionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleResponseHeaderActionArgs() {
        this.name = Output.empty();
        this.parameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleResponseHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<HeaderActionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleResponseHeaderActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder parameters(Output<HeaderActionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder parameters(HeaderActionParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }
        public DeliveryRuleResponseHeaderActionArgs build() {
            return new DeliveryRuleResponseHeaderActionArgs(name, parameters);
        }
    }
}
