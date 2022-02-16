// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.diagflow.outputs.CxPageFormParameterFillBehaviorInitialPromptFulfillment;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxPageFormParameterFillBehavior {
    private final @Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment;

    @OutputCustomType.Constructor({"initialPromptFulfillment"})
    private CxPageFormParameterFillBehavior(@Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment) {
        this.initialPromptFulfillment = initialPromptFulfillment;
    }

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

        public Builder setInitialPromptFulfillment(@Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment) {
            this.initialPromptFulfillment = initialPromptFulfillment;
            return this;
        }

        public CxPageFormParameterFillBehavior build() {
            return new CxPageFormParameterFillBehavior(initialPromptFulfillment);
        }
    }
}