// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RemediationConfigurationParameter {
    /**
     * Name of the attribute.
     * 
     */
    private final String name;
    /**
     * Value is dynamic and changes at run-time.
     * 
     */
    private final @Nullable String resourceValue;
    /**
     * Value is static and does not change at run-time.
     * 
     */
    private final @Nullable String staticValue;

    @CustomType.Constructor
    private RemediationConfigurationParameter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceValue") @Nullable String resourceValue,
        @CustomType.Parameter("staticValue") @Nullable String staticValue) {
        this.name = name;
        this.resourceValue = resourceValue;
        this.staticValue = staticValue;
    }

    /**
     * Name of the attribute.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Value is dynamic and changes at run-time.
     * 
    */
    public Optional<String> getResourceValue() {
        return Optional.ofNullable(this.resourceValue);
    }
    /**
     * Value is static and does not change at run-time.
     * 
    */
    public Optional<String> getStaticValue() {
        return Optional.ofNullable(this.staticValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationConfigurationParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String resourceValue;
        private @Nullable String staticValue;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationConfigurationParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceValue = defaults.resourceValue;
    	      this.staticValue = defaults.staticValue;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceValue(@Nullable String resourceValue) {
            this.resourceValue = resourceValue;
            return this;
        }

        public Builder staticValue(@Nullable String staticValue) {
            this.staticValue = staticValue;
            return this;
        }
        public RemediationConfigurationParameter build() {
            return new RemediationConfigurationParameter(name, resourceValue, staticValue);
        }
    }
}
