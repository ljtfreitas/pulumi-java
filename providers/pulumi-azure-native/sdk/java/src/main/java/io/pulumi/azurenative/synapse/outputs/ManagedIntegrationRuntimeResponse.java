// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.IntegrationRuntimeComputePropertiesResponse;
import io.pulumi.azurenative.synapse.outputs.IntegrationRuntimeSsisPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedIntegrationRuntimeResponse {
    /**
     * The compute resource for managed integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties;
    /**
     * Integration runtime description.
     * 
     */
    private final @Nullable String description;
    /**
     * SSIS properties for managed integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties;
    /**
     * Integration runtime state, only valid for managed dedicated integration runtime.
     * 
     */
    private final String state;
    /**
     * The type of integration runtime.
     * Expected value is 'Managed'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"computeProperties","description","ssisProperties","state","type"})
    private ManagedIntegrationRuntimeResponse(
        @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties,
        @Nullable String description,
        @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties,
        String state,
        String type) {
        this.computeProperties = computeProperties;
        this.description = description;
        this.ssisProperties = ssisProperties;
        this.state = Objects.requireNonNull(state);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The compute resource for managed integration runtime.
     * 
     */
    public Optional<IntegrationRuntimeComputePropertiesResponse> getComputeProperties() {
        return Optional.ofNullable(this.computeProperties);
    }
    /**
     * Integration runtime description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * SSIS properties for managed integration runtime.
     * 
     */
    public Optional<IntegrationRuntimeSsisPropertiesResponse> getSsisProperties() {
        return Optional.ofNullable(this.ssisProperties);
    }
    /**
     * Integration runtime state, only valid for managed dedicated integration runtime.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The type of integration runtime.
     * Expected value is 'Managed'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties;
        private @Nullable String description;
        private @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeProperties = defaults.computeProperties;
    	      this.description = defaults.description;
    	      this.ssisProperties = defaults.ssisProperties;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setComputeProperties(@Nullable IntegrationRuntimeComputePropertiesResponse computeProperties) {
            this.computeProperties = computeProperties;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setSsisProperties(@Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties) {
            this.ssisProperties = ssisProperties;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagedIntegrationRuntimeResponse build() {
            return new ManagedIntegrationRuntimeResponse(computeProperties, description, ssisProperties, state, type);
        }
    }
}
