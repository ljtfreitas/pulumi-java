// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.RequestHeaderMatchConditionParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliveryRuleRequestHeaderConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestHeader'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final RequestHeaderMatchConditionParametersResponse parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private DeliveryRuleRequestHeaderConditionResponse(
        String name,
        RequestHeaderMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestHeader'.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
     */
    public RequestHeaderMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestHeaderConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RequestHeaderMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestHeaderConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(RequestHeaderMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public DeliveryRuleRequestHeaderConditionResponse build() {
            return new DeliveryRuleRequestHeaderConditionResponse(name, parameters);
        }
    }
}
