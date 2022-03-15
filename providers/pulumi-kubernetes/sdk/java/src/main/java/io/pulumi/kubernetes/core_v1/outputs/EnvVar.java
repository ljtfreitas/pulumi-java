// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.EnvVarSource;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvVar {
    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * 
     */
    private final String name;
    /**
     * Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * 
     */
    private final @Nullable String value;
    /**
     * Source for the environment variable's value. Cannot be used if value is not empty.
     * 
     */
    private final @Nullable EnvVarSource valueFrom;

    @CustomType.Constructor
    private EnvVar(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") @Nullable String value,
        @CustomType.Parameter("valueFrom") @Nullable EnvVarSource valueFrom) {
        this.name = name;
        this.value = value;
        this.valueFrom = valueFrom;
    }

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }
    /**
     * Source for the environment variable's value. Cannot be used if value is not empty.
     * 
    */
    public Optional<EnvVarSource> getValueFrom() {
        return Optional.ofNullable(this.valueFrom);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVar defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String value;
        private @Nullable EnvVarSource valueFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVar defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFrom = defaults.valueFrom;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }

        public Builder valueFrom(@Nullable EnvVarSource valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public EnvVar build() {
            return new EnvVar(name, value, valueFrom);
        }
    }
}
