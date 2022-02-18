// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.UrlFileExtensionMatchConditionParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliveryRuleUrlFileExtensionConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'UrlFileExtension'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final UrlFileExtensionMatchConditionParametersResponse parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private DeliveryRuleUrlFileExtensionConditionResponse(
        String name,
        UrlFileExtensionMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'UrlFileExtension'.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
     */
    public UrlFileExtensionMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleUrlFileExtensionConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlFileExtensionMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleUrlFileExtensionConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(UrlFileExtensionMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public DeliveryRuleUrlFileExtensionConditionResponse build() {
            return new DeliveryRuleUrlFileExtensionConditionResponse(name, parameters);
        }
    }
}
