// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerEnvironmentVariable extends io.pulumi.resources.InvokeArgs {

    public static final ContainerEnvironmentVariable Empty = new ContainerEnvironmentVariable();

    @InputImport(name="value")
        private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    @InputImport(name="variable")
        private final @Nullable String variable;

    public Optional<String> getVariable() {
        return this.variable == null ? Optional.empty() : Optional.ofNullable(this.variable);
    }

    public ContainerEnvironmentVariable(
        @Nullable String value,
        @Nullable String variable) {
        this.value = value;
        this.variable = variable;
    }

    private ContainerEnvironmentVariable() {
        this.value = null;
        this.variable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerEnvironmentVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String value;
        private @Nullable String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerEnvironmentVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.variable = defaults.variable;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public Builder setVariable(@Nullable String variable) {
            this.variable = variable;
            return this;
        }
        public ContainerEnvironmentVariable build() {
            return new ContainerEnvironmentVariable(value, variable);
        }
    }
}
