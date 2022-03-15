// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.BackendRuleResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BackendResponse {
    /**
     * A list of API backend rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    private final List<BackendRuleResponse> rules;

    @CustomType.Constructor
    private BackendResponse(@CustomType.Parameter("rules") List<BackendRuleResponse> rules) {
        this.rules = rules;
    }

    /**
     * A list of API backend rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
    */
    public List<BackendRuleResponse> getRules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BackendRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(List<BackendRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public BackendResponse build() {
            return new BackendResponse(rules);
        }
    }
}
