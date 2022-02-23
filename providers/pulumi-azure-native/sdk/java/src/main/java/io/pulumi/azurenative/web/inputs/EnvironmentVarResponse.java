// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App container environment variable.
 * 
 */
public final class EnvironmentVarResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentVarResponse Empty = new EnvironmentVarResponse();

    /**
     * Environment variable name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Name of the Container App secret from which to pull the environment variable value.
     * 
     */
    @InputImport(name="secretRef")
        private final @Nullable String secretRef;

    public Optional<String> getSecretRef() {
        return this.secretRef == null ? Optional.empty() : Optional.ofNullable(this.secretRef);
    }

    /**
     * Non-secret environment variable value.
     * 
     */
    @InputImport(name="value")
        private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public EnvironmentVarResponse(
        @Nullable String name,
        @Nullable String secretRef,
        @Nullable String value) {
        this.name = name;
        this.secretRef = secretRef;
        this.value = value;
    }

    private EnvironmentVarResponse() {
        this.name = null;
        this.secretRef = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVarResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String secretRef;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVarResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secretRef = defaults.secretRef;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSecretRef(@Nullable String secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public EnvironmentVarResponse build() {
            return new EnvironmentVarResponse(name, secretRef, value);
        }
    }
}
