// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemediationConfigurationParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemediationConfigurationParameterArgs Empty = new RemediationConfigurationParameterArgs();

    /**
     * Name of the attribute.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Value is dynamic and changes at run-time.
     * 
     */
    @Import(name="resourceValue")
      private final @Nullable Output<String> resourceValue;

    public Output<String> getResourceValue() {
        return this.resourceValue == null ? Output.empty() : this.resourceValue;
    }

    /**
     * Value is static and does not change at run-time.
     * 
     */
    @Import(name="staticValue")
      private final @Nullable Output<String> staticValue;

    public Output<String> getStaticValue() {
        return this.staticValue == null ? Output.empty() : this.staticValue;
    }

    public RemediationConfigurationParameterArgs(
        Output<String> name,
        @Nullable Output<String> resourceValue,
        @Nullable Output<String> staticValue) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceValue = resourceValue;
        this.staticValue = staticValue;
    }

    private RemediationConfigurationParameterArgs() {
        this.name = Output.empty();
        this.resourceValue = Output.empty();
        this.staticValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationConfigurationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<String> resourceValue;
        private @Nullable Output<String> staticValue;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationConfigurationParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceValue = defaults.resourceValue;
    	      this.staticValue = defaults.staticValue;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder resourceValue(@Nullable Output<String> resourceValue) {
            this.resourceValue = resourceValue;
            return this;
        }

        public Builder resourceValue(@Nullable String resourceValue) {
            this.resourceValue = Output.ofNullable(resourceValue);
            return this;
        }

        public Builder staticValue(@Nullable Output<String> staticValue) {
            this.staticValue = staticValue;
            return this;
        }

        public Builder staticValue(@Nullable String staticValue) {
            this.staticValue = Output.ofNullable(staticValue);
            return this;
        }
        public RemediationConfigurationParameterArgs build() {
            return new RemediationConfigurationParameterArgs(name, resourceValue, staticValue);
        }
    }
}
