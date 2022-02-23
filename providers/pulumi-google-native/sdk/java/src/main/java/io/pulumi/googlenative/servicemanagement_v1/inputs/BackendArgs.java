// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.BackendRuleArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `Backend` defines the backend configuration for a service.
 * 
 */
public final class BackendArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendArgs Empty = new BackendArgs();

    /**
     * A list of API backend rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<BackendRuleArgs>> rules;

    public Input<List<BackendRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public BackendArgs(@Nullable Input<List<BackendRuleArgs>> rules) {
        this.rules = rules;
    }

    private BackendArgs() {
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BackendRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(@Nullable Input<List<BackendRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<BackendRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }
        public BackendArgs build() {
            return new BackendArgs(rules);
        }
    }
}
