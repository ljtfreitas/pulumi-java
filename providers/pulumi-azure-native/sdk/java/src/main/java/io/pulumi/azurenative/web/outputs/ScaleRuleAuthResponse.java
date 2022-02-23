// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScaleRuleAuthResponse {
    /**
     * Name of the Container App secret from which to pull the auth params.
     * 
     */
    private final @Nullable String secretRef;
    /**
     * Trigger Parameter that uses the secret
     * 
     */
    private final @Nullable String triggerParameter;

    @OutputCustomType.Constructor({"secretRef","triggerParameter"})
    private ScaleRuleAuthResponse(
        @Nullable String secretRef,
        @Nullable String triggerParameter) {
        this.secretRef = secretRef;
        this.triggerParameter = triggerParameter;
    }

    /**
     * Name of the Container App secret from which to pull the auth params.
     * 
     */
    public Optional<String> getSecretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    /**
     * Trigger Parameter that uses the secret
     * 
     */
    public Optional<String> getTriggerParameter() {
        return Optional.ofNullable(this.triggerParameter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleAuthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String secretRef;
        private @Nullable String triggerParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleAuthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretRef = defaults.secretRef;
    	      this.triggerParameter = defaults.triggerParameter;
        }

        public Builder setSecretRef(@Nullable String secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setTriggerParameter(@Nullable String triggerParameter) {
            this.triggerParameter = triggerParameter;
            return this;
        }
        public ScaleRuleAuthResponse build() {
            return new ScaleRuleAuthResponse(secretRef, triggerParameter);
        }
    }
}
