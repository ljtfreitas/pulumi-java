// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of the configuration parameter type.
 * 
 */
public final class DscConfigurationParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final DscConfigurationParameterArgs Empty = new DscConfigurationParameterArgs();

    /**
     * Gets or sets the default value of parameter.
     * 
     */
    @InputImport(name="defaultValue")
    private final @Nullable Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    /**
     * Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
     */
    @InputImport(name="isMandatory")
    private final @Nullable Input<Boolean> isMandatory;

    public Input<Boolean> getIsMandatory() {
        return this.isMandatory == null ? Input.empty() : this.isMandatory;
    }

    /**
     * Get or sets the position of the parameter.
     * 
     */
    @InputImport(name="position")
    private final @Nullable Input<Integer> position;

    public Input<Integer> getPosition() {
        return this.position == null ? Input.empty() : this.position;
    }

    /**
     * Gets or sets the type of the parameter.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DscConfigurationParameterArgs(
        @Nullable Input<String> defaultValue,
        @Nullable Input<Boolean> isMandatory,
        @Nullable Input<Integer> position,
        @Nullable Input<String> type) {
        this.defaultValue = defaultValue;
        this.isMandatory = isMandatory;
        this.position = position;
        this.type = type;
    }

    private DscConfigurationParameterArgs() {
        this.defaultValue = Input.empty();
        this.isMandatory = Input.empty();
        this.position = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DscConfigurationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultValue;
        private @Nullable Input<Boolean> isMandatory;
        private @Nullable Input<Integer> position;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DscConfigurationParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.isMandatory = defaults.isMandatory;
    	      this.position = defaults.position;
    	      this.type = defaults.type;
        }

        public Builder setDefaultValue(@Nullable Input<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setIsMandatory(@Nullable Input<Boolean> isMandatory) {
            this.isMandatory = isMandatory;
            return this;
        }

        public Builder setIsMandatory(@Nullable Boolean isMandatory) {
            this.isMandatory = Input.ofNullable(isMandatory);
            return this;
        }

        public Builder setPosition(@Nullable Input<Integer> position) {
            this.position = position;
            return this;
        }

        public Builder setPosition(@Nullable Integer position) {
            this.position = Input.ofNullable(position);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public DscConfigurationParameterArgs build() {
            return new DscConfigurationParameterArgs(defaultValue, isMandatory, position, type);
        }
    }
}
