// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.my8664.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ConditionalAccessPolicyConditionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionalAccessPolicyConditionsArgs Empty = new ConditionalAccessPolicyConditionsArgs();

    @InputImport(name="clientAppTypes", required=true)
    private final Input<List<String>> clientAppTypes;

    public Input<List<String>> getClientAppTypes() {
        return this.clientAppTypes;
    }

    public ConditionalAccessPolicyConditionsArgs(Input<List<String>> clientAppTypes) {
        this.clientAppTypes = Objects.requireNonNull(clientAppTypes, "expected parameter 'clientAppTypes' to be non-null");
    }

    private ConditionalAccessPolicyConditionsArgs() {
        this.clientAppTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionalAccessPolicyConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> clientAppTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionalAccessPolicyConditionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAppTypes = defaults.clientAppTypes;
        }

        public Builder setClientAppTypes(Input<List<String>> clientAppTypes) {
            this.clientAppTypes = Objects.requireNonNull(clientAppTypes);
            return this;
        }

        public Builder setClientAppTypes(List<String> clientAppTypes) {
            this.clientAppTypes = Input.of(Objects.requireNonNull(clientAppTypes));
            return this;
        }

        public ConditionalAccessPolicyConditionsArgs build() {
            return new ConditionalAccessPolicyConditionsArgs(clientAppTypes);
        }
    }
}