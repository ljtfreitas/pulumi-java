// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App container environment variable.
 * 
 */
public final class EnvironmentVarArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentVarArgs Empty = new EnvironmentVarArgs();

    /**
     * Environment variable name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Name of the Container App secret from which to pull the environment variable value.
     * 
     */
    @InputImport(name="secretRef")
        private final @Nullable Input<String> secretRef;

    public Input<String> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    /**
     * Non-secret environment variable value.
     * 
     */
    @InputImport(name="value")
        private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public EnvironmentVarArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> secretRef,
        @Nullable Input<String> value) {
        this.name = name;
        this.secretRef = secretRef;
        this.value = value;
    }

    private EnvironmentVarArgs() {
        this.name = Input.empty();
        this.secretRef = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> secretRef;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVarArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secretRef = defaults.secretRef;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSecretRef(@Nullable Input<String> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setSecretRef(@Nullable String secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public EnvironmentVarArgs build() {
            return new EnvironmentVarArgs(name, secretRef, value);
        }
    }
}
