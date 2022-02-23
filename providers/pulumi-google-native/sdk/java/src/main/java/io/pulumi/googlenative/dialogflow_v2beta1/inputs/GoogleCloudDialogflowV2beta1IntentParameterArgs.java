// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents intent parameters.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentParameterArgs Empty = new GoogleCloudDialogflowV2beta1IntentParameterArgs();

    /**
     * Optional. The default value to use when the `value` yields an empty result. Default values can be extracted from contexts by using the following syntax: `#context_name.parameter_name`.
     * 
     */
    @InputImport(name="defaultValue")
      private final @Nullable Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    /**
     * The name of the parameter.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Optional. The name of the entity type, prefixed with `@`, that describes values of the parameter. If the parameter is required, this must be provided.
     * 
     */
    @InputImport(name="entityTypeDisplayName")
      private final @Nullable Input<String> entityTypeDisplayName;

    public Input<String> getEntityTypeDisplayName() {
        return this.entityTypeDisplayName == null ? Input.empty() : this.entityTypeDisplayName;
    }

    /**
     * Optional. Indicates whether the parameter represents a list of values.
     * 
     */
    @InputImport(name="isList")
      private final @Nullable Input<Boolean> isList;

    public Input<Boolean> getIsList() {
        return this.isList == null ? Input.empty() : this.isList;
    }

    /**
     * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be completed without collecting the parameter value.
     * 
     */
    @InputImport(name="mandatory")
      private final @Nullable Input<Boolean> mandatory;

    public Input<Boolean> getMandatory() {
        return this.mandatory == null ? Input.empty() : this.mandatory;
    }

    /**
     * The unique identifier of this parameter.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optional. The collection of prompts that the agent can present to the user in order to collect a value for the parameter.
     * 
     */
    @InputImport(name="prompts")
      private final @Nullable Input<List<String>> prompts;

    public Input<List<String>> getPrompts() {
        return this.prompts == null ? Input.empty() : this.prompts;
    }

    /**
     * Optional. The definition of the parameter value. It can be: - a constant string, - a parameter value defined as `$parameter_name`, - an original parameter value defined as `$parameter_name.original`, - a parameter value from some context defined as `#context_name.parameter_name`.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public GoogleCloudDialogflowV2beta1IntentParameterArgs(
        @Nullable Input<String> defaultValue,
        Input<String> displayName,
        @Nullable Input<String> entityTypeDisplayName,
        @Nullable Input<Boolean> isList,
        @Nullable Input<Boolean> mandatory,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> prompts,
        @Nullable Input<String> value) {
        this.defaultValue = defaultValue;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.entityTypeDisplayName = entityTypeDisplayName;
        this.isList = isList;
        this.mandatory = mandatory;
        this.name = name;
        this.prompts = prompts;
        this.value = value;
    }

    private GoogleCloudDialogflowV2beta1IntentParameterArgs() {
        this.defaultValue = Input.empty();
        this.displayName = Input.empty();
        this.entityTypeDisplayName = Input.empty();
        this.isList = Input.empty();
        this.mandatory = Input.empty();
        this.name = Input.empty();
        this.prompts = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultValue;
        private Input<String> displayName;
        private @Nullable Input<String> entityTypeDisplayName;
        private @Nullable Input<Boolean> isList;
        private @Nullable Input<Boolean> mandatory;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> prompts;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.displayName = defaults.displayName;
    	      this.entityTypeDisplayName = defaults.entityTypeDisplayName;
    	      this.isList = defaults.isList;
    	      this.mandatory = defaults.mandatory;
    	      this.name = defaults.name;
    	      this.prompts = defaults.prompts;
    	      this.value = defaults.value;
        }

        public Builder setDefaultValue(@Nullable Input<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEntityTypeDisplayName(@Nullable Input<String> entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            return this;
        }

        public Builder setEntityTypeDisplayName(@Nullable String entityTypeDisplayName) {
            this.entityTypeDisplayName = Input.ofNullable(entityTypeDisplayName);
            return this;
        }

        public Builder setIsList(@Nullable Input<Boolean> isList) {
            this.isList = isList;
            return this;
        }

        public Builder setIsList(@Nullable Boolean isList) {
            this.isList = Input.ofNullable(isList);
            return this;
        }

        public Builder setMandatory(@Nullable Input<Boolean> mandatory) {
            this.mandatory = mandatory;
            return this;
        }

        public Builder setMandatory(@Nullable Boolean mandatory) {
            this.mandatory = Input.ofNullable(mandatory);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPrompts(@Nullable Input<List<String>> prompts) {
            this.prompts = prompts;
            return this;
        }

        public Builder setPrompts(@Nullable List<String> prompts) {
            this.prompts = Input.ofNullable(prompts);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentParameterArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentParameterArgs(defaultValue, displayName, entityTypeDisplayName, isList, mandatory, name, prompts, value);
        }
    }
}
