// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.diagflow.outputs.CxPageFormParameterFillBehaviorInitialPromptFulfillment;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageFormParameterFillBehavior {
    /**
     * The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * Structure is documented below.
     * 
     */
    private final @Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment;

    @CustomType.Constructor
    private CxPageFormParameterFillBehavior(@CustomType.Parameter("initialPromptFulfillment") @Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment) {
        this.initialPromptFulfillment = initialPromptFulfillment;
    }

    /**
     * The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * Structure is documented below.
     * 
    */
    public Optional<CxPageFormParameterFillBehaviorInitialPromptFulfillment> getInitialPromptFulfillment() {
        return Optional.ofNullable(this.initialPromptFulfillment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehavior defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterFillBehavior defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialPromptFulfillment = defaults.initialPromptFulfillment;
        }

        public Builder initialPromptFulfillment(@Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment) {
            this.initialPromptFulfillment = initialPromptFulfillment;
            return this;
        }
        public CxPageFormParameterFillBehavior build() {
            return new CxPageFormParameterFillBehavior(initialPromptFulfillment);
        }
    }
}
