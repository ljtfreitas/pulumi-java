// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class StateMachineDefinitionSubstitutions {
    @CustomType.Constructor
    private StateMachineDefinitionSubstitutions() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineDefinitionSubstitutions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineDefinitionSubstitutions defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public StateMachineDefinitionSubstitutions build() {
            return new StateMachineDefinitionSubstitutions();
        }
    }
}
