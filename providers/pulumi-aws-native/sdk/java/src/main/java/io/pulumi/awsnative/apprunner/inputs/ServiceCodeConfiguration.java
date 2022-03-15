// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.enums.ServiceCodeConfigurationConfigurationSource;
import io.pulumi.awsnative.apprunner.inputs.ServiceCodeConfigurationValues;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Code Configuration
 * 
 */
public final class ServiceCodeConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ServiceCodeConfiguration Empty = new ServiceCodeConfiguration();

    @Import(name="codeConfigurationValues")
      private final @Nullable ServiceCodeConfigurationValues codeConfigurationValues;

    public Optional<ServiceCodeConfigurationValues> getCodeConfigurationValues() {
        return this.codeConfigurationValues == null ? Optional.empty() : Optional.ofNullable(this.codeConfigurationValues);
    }

    /**
     * Configuration Source
     * 
     */
    @Import(name="configurationSource", required=true)
      private final ServiceCodeConfigurationConfigurationSource configurationSource;

    public ServiceCodeConfigurationConfigurationSource getConfigurationSource() {
        return this.configurationSource;
    }

    public ServiceCodeConfiguration(
        @Nullable ServiceCodeConfigurationValues codeConfigurationValues,
        ServiceCodeConfigurationConfigurationSource configurationSource) {
        this.codeConfigurationValues = codeConfigurationValues;
        this.configurationSource = Objects.requireNonNull(configurationSource, "expected parameter 'configurationSource' to be non-null");
    }

    private ServiceCodeConfiguration() {
        this.codeConfigurationValues = null;
        this.configurationSource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCodeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceCodeConfigurationValues codeConfigurationValues;
        private ServiceCodeConfigurationConfigurationSource configurationSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCodeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfigurationValues = defaults.codeConfigurationValues;
    	      this.configurationSource = defaults.configurationSource;
        }

        public Builder codeConfigurationValues(@Nullable ServiceCodeConfigurationValues codeConfigurationValues) {
            this.codeConfigurationValues = codeConfigurationValues;
            return this;
        }

        public Builder configurationSource(ServiceCodeConfigurationConfigurationSource configurationSource) {
            this.configurationSource = Objects.requireNonNull(configurationSource);
            return this;
        }
        public ServiceCodeConfiguration build() {
            return new ServiceCodeConfiguration(codeConfigurationValues, configurationSource);
        }
    }
}
