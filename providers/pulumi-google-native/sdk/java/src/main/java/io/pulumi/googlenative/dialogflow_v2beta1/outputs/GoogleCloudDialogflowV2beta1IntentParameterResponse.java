// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentParameterResponse {
    /**
     * Optional. The default value to use when the `value` yields an empty result. Default values can be extracted from contexts by using the following syntax: `#context_name.parameter_name`.
     * 
     */
    private final String defaultValue;
    /**
     * The name of the parameter.
     * 
     */
    private final String displayName;
    /**
     * Optional. The name of the entity type, prefixed with `@`, that describes values of the parameter. If the parameter is required, this must be provided.
     * 
     */
    private final String entityTypeDisplayName;
    /**
     * Optional. Indicates whether the parameter represents a list of values.
     * 
     */
    private final Boolean isList;
    /**
     * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be completed without collecting the parameter value.
     * 
     */
    private final Boolean mandatory;
    /**
     * The unique identifier of this parameter.
     * 
     */
    private final String name;
    /**
     * Optional. The collection of prompts that the agent can present to the user in order to collect a value for the parameter.
     * 
     */
    private final List<String> prompts;
    /**
     * Optional. The definition of the parameter value. It can be: - a constant string, - a parameter value defined as `$parameter_name`, - an original parameter value defined as `$parameter_name.original`, - a parameter value from some context defined as `#context_name.parameter_name`.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentParameterResponse(
        @CustomType.Parameter("defaultValue") String defaultValue,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("entityTypeDisplayName") String entityTypeDisplayName,
        @CustomType.Parameter("isList") Boolean isList,
        @CustomType.Parameter("mandatory") Boolean mandatory,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("prompts") List<String> prompts,
        @CustomType.Parameter("value") String value) {
        this.defaultValue = defaultValue;
        this.displayName = displayName;
        this.entityTypeDisplayName = entityTypeDisplayName;
        this.isList = isList;
        this.mandatory = mandatory;
        this.name = name;
        this.prompts = prompts;
        this.value = value;
    }

    /**
     * Optional. The default value to use when the `value` yields an empty result. Default values can be extracted from contexts by using the following syntax: `#context_name.parameter_name`.
     * 
    */
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * The name of the parameter.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. The name of the entity type, prefixed with `@`, that describes values of the parameter. If the parameter is required, this must be provided.
     * 
    */
    public String getEntityTypeDisplayName() {
        return this.entityTypeDisplayName;
    }
    /**
     * Optional. Indicates whether the parameter represents a list of values.
     * 
    */
    public Boolean getIsList() {
        return this.isList;
    }
    /**
     * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be completed without collecting the parameter value.
     * 
    */
    public Boolean getMandatory() {
        return this.mandatory;
    }
    /**
     * The unique identifier of this parameter.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. The collection of prompts that the agent can present to the user in order to collect a value for the parameter.
     * 
    */
    public List<String> getPrompts() {
        return this.prompts;
    }
    /**
     * Optional. The definition of the parameter value. It can be: - a constant string, - a parameter value defined as `$parameter_name`, - an original parameter value defined as `$parameter_name.original`, - a parameter value from some context defined as `#context_name.parameter_name`.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultValue;
        private String displayName;
        private String entityTypeDisplayName;
        private Boolean isList;
        private Boolean mandatory;
        private String name;
        private List<String> prompts;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentParameterResponse defaults) {
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

        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = Objects.requireNonNull(entityTypeDisplayName);
            return this;
        }

        public Builder isList(Boolean isList) {
            this.isList = Objects.requireNonNull(isList);
            return this;
        }

        public Builder mandatory(Boolean mandatory) {
            this.mandatory = Objects.requireNonNull(mandatory);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder prompts(List<String> prompts) {
            this.prompts = Objects.requireNonNull(prompts);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentParameterResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentParameterResponse(defaultValue, displayName, entityTypeDisplayName, isList, mandatory, name, prompts, value);
        }
    }
}
