// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.UrlFileNameMatchConditionParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the UrlFileName condition for the delivery rule.
 * 
 */
public final class DeliveryRuleUrlFileNameConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleUrlFileNameConditionArgs Empty = new DeliveryRuleUrlFileNameConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'UrlFileName'.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @InputImport(name="parameters", required=true)
        private final Input<UrlFileNameMatchConditionParametersArgs> parameters;

    public Input<UrlFileNameMatchConditionParametersArgs> getParameters() {
        return this.parameters;
    }

    public DeliveryRuleUrlFileNameConditionArgs(
        Input<String> name,
        Input<UrlFileNameMatchConditionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleUrlFileNameConditionArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleUrlFileNameConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<UrlFileNameMatchConditionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleUrlFileNameConditionArgs defaults) {
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

        public Builder setParameters(Input<UrlFileNameMatchConditionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(UrlFileNameMatchConditionParametersArgs parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }
        public DeliveryRuleUrlFileNameConditionArgs build() {
            return new DeliveryRuleUrlFileNameConditionArgs(name, parameters);
        }
    }
}
