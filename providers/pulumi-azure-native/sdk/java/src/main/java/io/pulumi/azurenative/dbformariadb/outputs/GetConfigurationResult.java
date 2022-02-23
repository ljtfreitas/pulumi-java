// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConfigurationResult {
    /**
     * Allowed values of the configuration.
     * 
     */
    private final String allowedValues;
    /**
     * Data type of the configuration.
     * 
     */
    private final String dataType;
    /**
     * Default value of the configuration.
     * 
     */
    private final String defaultValue;
    /**
     * Description of the configuration.
     * 
     */
    private final String description;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Source of the configuration.
     * 
     */
    private final @Nullable String source;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Value of the configuration.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"allowedValues","dataType","defaultValue","description","id","name","source","type","value"})
    private GetConfigurationResult(
        String allowedValues,
        String dataType,
        String defaultValue,
        String description,
        String id,
        String name,
        @Nullable String source,
        String type,
        @Nullable String value) {
        this.allowedValues = Objects.requireNonNull(allowedValues);
        this.dataType = Objects.requireNonNull(dataType);
        this.defaultValue = Objects.requireNonNull(defaultValue);
        this.description = Objects.requireNonNull(description);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.source = source;
        this.type = Objects.requireNonNull(type);
        this.value = value;
    }

    /**
     * Allowed values of the configuration.
     * 
     */
    public String getAllowedValues() {
        return this.allowedValues;
    }
    /**
     * Data type of the configuration.
     * 
     */
    public String getDataType() {
        return this.dataType;
    }
    /**
     * Default value of the configuration.
     * 
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Description of the configuration.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Source of the configuration.
     * 
     */
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Value of the configuration.
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allowedValues;
        private String dataType;
        private String defaultValue;
        private String description;
        private String id;
        private String name;
        private @Nullable String source;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setAllowedValues(String allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }

        public Builder setDataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }

        public Builder setDefaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public GetConfigurationResult build() {
            return new GetConfigurationResult(allowedValues, dataType, defaultValue, description, id, name, source, type, value);
        }
    }
}
