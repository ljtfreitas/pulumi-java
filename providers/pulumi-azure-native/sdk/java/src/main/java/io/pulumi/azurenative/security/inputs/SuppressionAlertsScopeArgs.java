// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.ScopeElementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class SuppressionAlertsScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SuppressionAlertsScopeArgs Empty = new SuppressionAlertsScopeArgs();

    /**
     * All the conditions inside need to be true in order to suppress the alert
     * 
     */
    @Import(name="allOf", required=true)
      private final Output<List<ScopeElementArgs>> allOf;

    public Output<List<ScopeElementArgs>> getAllOf() {
        return this.allOf;
    }

    public SuppressionAlertsScopeArgs(Output<List<ScopeElementArgs>> allOf) {
        this.allOf = Objects.requireNonNull(allOf, "expected parameter 'allOf' to be non-null");
    }

    private SuppressionAlertsScopeArgs() {
        this.allOf = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionAlertsScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ScopeElementArgs>> allOf;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionAlertsScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
        }

        public Builder allOf(Output<List<ScopeElementArgs>> allOf) {
            this.allOf = Objects.requireNonNull(allOf);
            return this;
        }

        public Builder allOf(List<ScopeElementArgs> allOf) {
            this.allOf = Output.of(Objects.requireNonNull(allOf));
            return this;
        }
        public SuppressionAlertsScopeArgs build() {
            return new SuppressionAlertsScopeArgs(allOf);
        }
    }
}
