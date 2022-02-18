// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The custom setup of setting environment variable.
 * 
 */
public final class EnvironmentVariableSetupResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentVariableSetupResponse Empty = new EnvironmentVariableSetupResponse();

    /**
     * The type of custom setup.
     * Expected value is 'EnvironmentVariableSetup'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The name of the environment variable.
     * 
     */
    @InputImport(name="variableName", required=true)
    private final String variableName;

    public String getVariableName() {
        return this.variableName;
    }

    /**
     * The value of the environment variable.
     * 
     */
    @InputImport(name="variableValue", required=true)
    private final String variableValue;

    public String getVariableValue() {
        return this.variableValue;
    }

    public EnvironmentVariableSetupResponse(
        String type,
        String variableName,
        String variableValue) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.variableName = Objects.requireNonNull(variableName, "expected parameter 'variableName' to be non-null");
        this.variableValue = Objects.requireNonNull(variableValue, "expected parameter 'variableValue' to be non-null");
    }

    private EnvironmentVariableSetupResponse() {
        this.type = null;
        this.variableName = null;
        this.variableValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String variableName;
        private String variableValue;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVariableSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.variableName = defaults.variableName;
    	      this.variableValue = defaults.variableValue;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVariableName(String variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }

        public Builder setVariableValue(String variableValue) {
            this.variableValue = Objects.requireNonNull(variableValue);
            return this;
        }

        public EnvironmentVariableSetupResponse build() {
            return new EnvironmentVariableSetupResponse(type, variableName, variableValue);
        }
    }
}
