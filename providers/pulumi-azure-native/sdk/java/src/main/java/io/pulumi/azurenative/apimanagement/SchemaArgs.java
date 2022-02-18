// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.SchemaType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    /**
     * Free-form schema entity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schema id identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="schemaId")
    private final @Nullable Input<String> schemaId;

    public Input<String> getSchemaId() {
        return this.schemaId == null ? Input.empty() : this.schemaId;
    }

    /**
     * Schema Type. Immutable.
     * 
     */
    @InputImport(name="schemaType", required=true)
    private final Input<Either<String,SchemaType>> schemaType;

    public Input<Either<String,SchemaType>> getSchemaType() {
        return this.schemaType;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Json-encoded string for non json-based schema.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public SchemaArgs(
        @Nullable Input<String> description,
        Input<String> resourceGroupName,
        @Nullable Input<String> schemaId,
        Input<Either<String,SchemaType>> schemaType,
        Input<String> serviceName,
        @Nullable Input<String> value) {
        this.description = description;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaId = schemaId;
        this.schemaType = Objects.requireNonNull(schemaType, "expected parameter 'schemaType' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.value = value;
    }

    private SchemaArgs() {
        this.description = Input.empty();
        this.resourceGroupName = Input.empty();
        this.schemaId = Input.empty();
        this.schemaType = Input.empty();
        this.serviceName = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> schemaId;
        private Input<Either<String,SchemaType>> schemaType;
        private Input<String> serviceName;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaId = defaults.schemaId;
    	      this.schemaType = defaults.schemaType;
    	      this.serviceName = defaults.serviceName;
    	      this.value = defaults.value;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSchemaId(@Nullable Input<String> schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public Builder setSchemaId(@Nullable String schemaId) {
            this.schemaId = Input.ofNullable(schemaId);
            return this;
        }

        public Builder setSchemaType(Input<Either<String,SchemaType>> schemaType) {
            this.schemaType = Objects.requireNonNull(schemaType);
            return this;
        }

        public Builder setSchemaType(Either<String,SchemaType> schemaType) {
            this.schemaType = Input.of(Objects.requireNonNull(schemaType));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
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

        public SchemaArgs build() {
            return new SchemaArgs(description, resourceGroupName, schemaId, schemaType, serviceName, value);
        }
    }
}
