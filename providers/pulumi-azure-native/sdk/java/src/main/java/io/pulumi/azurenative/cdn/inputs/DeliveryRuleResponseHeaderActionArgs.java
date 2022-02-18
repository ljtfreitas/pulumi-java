// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.HeaderActionParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @InputImport(name="parameters", required=true)
    private final Input<HeaderActionParametersArgs> parameters;

    public Input<HeaderActionParametersArgs> getParameters() {
        return this.parameters;
    }

    public DeliveryRuleResponseHeaderActionArgs(
        Input<String> name,
        Input<HeaderActionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleResponseHeaderActionArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleResponseHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<HeaderActionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleResponseHeaderActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setParameters(Input<HeaderActionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(HeaderActionParametersArgs parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public DeliveryRuleResponseHeaderActionArgs build() {
            return new DeliveryRuleResponseHeaderActionArgs(name, parameters);
        }
    }
}
