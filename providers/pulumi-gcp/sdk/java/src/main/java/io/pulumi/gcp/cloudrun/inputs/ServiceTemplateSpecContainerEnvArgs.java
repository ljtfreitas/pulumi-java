// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvArgs Empty = new ServiceTemplateSpecContainerEnvArgs();

    /**
     * Volume's name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Variable references $(VAR_NAME) are expanded
     * using the previous defined environment variables in the container and
     * any route environment variables. If a variable cannot be resolved,
     * the reference in the input string will be unchanged. The $(VAR_NAME)
     * syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
     * references will never be expanded, regardless of whether the variable
     * exists or not.
     * Defaults to "".
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    /**
     * Source for the environment variable's value. Only supports secret_key_ref.
     * Structure is documented below.
     * 
     */
    @Import(name="valueFrom")
      private final @Nullable Output<ServiceTemplateSpecContainerEnvValueFromArgs> valueFrom;

    public Output<ServiceTemplateSpecContainerEnvValueFromArgs> getValueFrom() {
        return this.valueFrom == null ? Output.empty() : this.valueFrom;
    }

    public ServiceTemplateSpecContainerEnvArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> value,
        @Nullable Output<ServiceTemplateSpecContainerEnvValueFromArgs> valueFrom) {
        this.name = name;
        this.value = value;
        this.valueFrom = valueFrom;
    }

    private ServiceTemplateSpecContainerEnvArgs() {
        this.name = Output.empty();
        this.value = Output.empty();
        this.valueFrom = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> value;
        private @Nullable Output<ServiceTemplateSpecContainerEnvValueFromArgs> valueFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFrom = defaults.valueFrom;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }

        public Builder valueFrom(@Nullable Output<ServiceTemplateSpecContainerEnvValueFromArgs> valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }

        public Builder valueFrom(@Nullable ServiceTemplateSpecContainerEnvValueFromArgs valueFrom) {
            this.valueFrom = Output.ofNullable(valueFrom);
            return this;
        }
        public ServiceTemplateSpecContainerEnvArgs build() {
            return new ServiceTemplateSpecContainerEnvArgs(name, value, valueFrom);
        }
    }
}
