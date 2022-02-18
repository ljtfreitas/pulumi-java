// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RestHealthCheckStepAttributesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the properties of a health check step.
 * 
 */
public final class HealthCheckStepPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final HealthCheckStepPropertiesResponse Empty = new HealthCheckStepPropertiesResponse();

    /**
     * The health check step attributes
     * 
     */
    @InputImport(name="attributes", required=true)
    private final RestHealthCheckStepAttributesResponse attributes;

    public RestHealthCheckStepAttributesResponse getAttributes() {
        return this.attributes;
    }

    /**
     * The type of step.
     * Expected value is 'HealthCheck'.
     * 
     */
    @InputImport(name="stepType", required=true)
    private final String stepType;

    public String getStepType() {
        return this.stepType;
    }

    public HealthCheckStepPropertiesResponse(
        RestHealthCheckStepAttributesResponse attributes,
        String stepType) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.stepType = Objects.requireNonNull(stepType, "expected parameter 'stepType' to be non-null");
    }

    private HealthCheckStepPropertiesResponse() {
        this.attributes = null;
        this.stepType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckStepPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestHealthCheckStepAttributesResponse attributes;
        private String stepType;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckStepPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.stepType = defaults.stepType;
        }

        public Builder setAttributes(RestHealthCheckStepAttributesResponse attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setStepType(String stepType) {
            this.stepType = Objects.requireNonNull(stepType);
            return this;
        }

        public HealthCheckStepPropertiesResponse build() {
            return new HealthCheckStepPropertiesResponse(attributes, stepType);
        }
    }
}
