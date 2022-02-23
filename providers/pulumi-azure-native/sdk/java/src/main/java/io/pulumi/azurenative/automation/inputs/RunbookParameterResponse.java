// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the runbook parameter type.
 * 
 */
public final class RunbookParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final RunbookParameterResponse Empty = new RunbookParameterResponse();

    /**
     * Gets or sets the default value of parameter.
     * 
     */
    @InputImport(name="defaultValue")
        private final @Nullable String defaultValue;

    public Optional<String> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue);
    }

    /**
     * Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
     */
    @InputImport(name="isMandatory")
        private final @Nullable Boolean isMandatory;

    public Optional<Boolean> getIsMandatory() {
        return this.isMandatory == null ? Optional.empty() : Optional.ofNullable(this.isMandatory);
    }

    /**
     * Get or sets the position of the parameter.
     * 
     */
    @InputImport(name="position")
        private final @Nullable Integer position;

    public Optional<Integer> getPosition() {
        return this.position == null ? Optional.empty() : Optional.ofNullable(this.position);
    }

    /**
     * Gets or sets the type of the parameter.
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public RunbookParameterResponse(
        @Nullable String defaultValue,
        @Nullable Boolean isMandatory,
        @Nullable Integer position,
        @Nullable String type) {
        this.defaultValue = defaultValue;
        this.isMandatory = isMandatory;
        this.position = position;
        this.type = type;
    }

    private RunbookParameterResponse() {
        this.defaultValue = null;
        this.isMandatory = null;
        this.position = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunbookParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable Boolean isMandatory;
        private @Nullable Integer position;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RunbookParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.isMandatory = defaults.isMandatory;
    	      this.position = defaults.position;
    	      this.type = defaults.type;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setIsMandatory(@Nullable Boolean isMandatory) {
            this.isMandatory = isMandatory;
            return this;
        }

        public Builder setPosition(@Nullable Integer position) {
            this.position = position;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public RunbookParameterResponse build() {
            return new RunbookParameterResponse(defaultValue, isMandatory, position, type);
        }
    }
}
