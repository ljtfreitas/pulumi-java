// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Input parameters in the form of key-value pairs for the conformance pack.
 * 
 */
public final class OrganizationConformancePackConformancePackInputParameter extends io.pulumi.resources.InvokeArgs {

    public static final OrganizationConformancePackConformancePackInputParameter Empty = new OrganizationConformancePackConformancePackInputParameter();

    @InputImport(name="parameterName", required=true)
        private final String parameterName;

    public String getParameterName() {
        return this.parameterName;
    }

    @InputImport(name="parameterValue", required=true)
        private final String parameterValue;

    public String getParameterValue() {
        return this.parameterValue;
    }

    public OrganizationConformancePackConformancePackInputParameter(
        String parameterName,
        String parameterValue) {
        this.parameterName = Objects.requireNonNull(parameterName, "expected parameter 'parameterName' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private OrganizationConformancePackConformancePackInputParameter() {
        this.parameterName = null;
        this.parameterValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConformancePackConformancePackInputParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterName;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConformancePackConformancePackInputParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder setParameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder setParameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }
        public OrganizationConformancePackConformancePackInputParameter build() {
            return new OrganizationConformancePackConformancePackInputParameter(parameterName, parameterValue);
        }
    }
}
