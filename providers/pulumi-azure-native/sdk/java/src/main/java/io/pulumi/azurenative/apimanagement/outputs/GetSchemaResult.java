// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSchemaResult {
    /**
     * Free-form schema entity description.
     * 
     */
    private final @Nullable String description;
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
     * Schema Type. Immutable.
     * 
     */
    private final String schemaType;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Json-encoded string for non json-based schema.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"description","id","name","schemaType","type","value"})
    private GetSchemaResult(
        @Nullable String description,
        String id,
        String name,
        String schemaType,
        String type,
        @Nullable String value) {
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.schemaType = Objects.requireNonNull(schemaType);
        this.type = Objects.requireNonNull(type);
        this.value = value;
    }

    /**
     * Free-form schema entity description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
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
     * Schema Type. Immutable.
     * 
     */
    public String getSchemaType() {
        return this.schemaType;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Json-encoded string for non json-based schema.
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String id;
        private String name;
        private String schemaType;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchemaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.schemaType = defaults.schemaType;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
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

        public Builder setSchemaType(String schemaType) {
            this.schemaType = Objects.requireNonNull(schemaType);
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

        public GetSchemaResult build() {
            return new GetSchemaResult(description, id, name, schemaType, type, value);
        }
    }
}
