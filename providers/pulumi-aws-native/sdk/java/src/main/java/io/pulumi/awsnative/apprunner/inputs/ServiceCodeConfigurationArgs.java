// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.enums.ServiceCodeConfigurationConfigurationSource;
import io.pulumi.awsnative.apprunner.inputs.ServiceCodeConfigurationValuesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Code Configuration
 * 
 */
public final class ServiceCodeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCodeConfigurationArgs Empty = new ServiceCodeConfigurationArgs();

    @Import(name="codeConfigurationValues")
      private final @Nullable Output<ServiceCodeConfigurationValuesArgs> codeConfigurationValues;

    public Output<ServiceCodeConfigurationValuesArgs> getCodeConfigurationValues() {
        return this.codeConfigurationValues == null ? Output.empty() : this.codeConfigurationValues;
    }

    /**
     * Configuration Source
     * 
     */
    @Import(name="configurationSource", required=true)
      private final Output<ServiceCodeConfigurationConfigurationSource> configurationSource;

    public Output<ServiceCodeConfigurationConfigurationSource> getConfigurationSource() {
        return this.configurationSource;
    }

    public ServiceCodeConfigurationArgs(
        @Nullable Output<ServiceCodeConfigurationValuesArgs> codeConfigurationValues,
        Output<ServiceCodeConfigurationConfigurationSource> configurationSource) {
        this.codeConfigurationValues = codeConfigurationValues;
        this.configurationSource = Objects.requireNonNull(configurationSource, "expected parameter 'configurationSource' to be non-null");
    }

    private ServiceCodeConfigurationArgs() {
        this.codeConfigurationValues = Output.empty();
        this.configurationSource = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceCodeConfigurationValuesArgs> codeConfigurationValues;
        private Output<ServiceCodeConfigurationConfigurationSource> configurationSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCodeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfigurationValues = defaults.codeConfigurationValues;
    	      this.configurationSource = defaults.configurationSource;
        }

        public Builder codeConfigurationValues(@Nullable Output<ServiceCodeConfigurationValuesArgs> codeConfigurationValues) {
            this.codeConfigurationValues = codeConfigurationValues;
            return this;
        }

        public Builder codeConfigurationValues(@Nullable ServiceCodeConfigurationValuesArgs codeConfigurationValues) {
            this.codeConfigurationValues = Output.ofNullable(codeConfigurationValues);
            return this;
        }

        public Builder configurationSource(Output<ServiceCodeConfigurationConfigurationSource> configurationSource) {
            this.configurationSource = Objects.requireNonNull(configurationSource);
            return this;
        }

        public Builder configurationSource(ServiceCodeConfigurationConfigurationSource configurationSource) {
            this.configurationSource = Output.of(Objects.requireNonNull(configurationSource));
            return this;
        }
        public ServiceCodeConfigurationArgs build() {
            return new ServiceCodeConfigurationArgs(codeConfigurationValues, configurationSource);
        }
    }
}
