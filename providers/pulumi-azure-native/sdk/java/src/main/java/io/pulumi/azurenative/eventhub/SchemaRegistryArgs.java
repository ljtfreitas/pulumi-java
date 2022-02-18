// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.eventhub.enums.SchemaCompatibility;
import io.pulumi.azurenative.eventhub.enums.SchemaType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaRegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaRegistryArgs Empty = new SchemaRegistryArgs();

    /**
     * dictionary object for SchemaGroup group properties
     * 
     */
    @InputImport(name="groupProperties")
    private final @Nullable Input<Map<String,String>> groupProperties;

    public Input<Map<String,String>> getGroupProperties() {
        return this.groupProperties == null ? Input.empty() : this.groupProperties;
    }

    /**
     * The Namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="schemaCompatibility")
    private final @Nullable Input<Either<String,SchemaCompatibility>> schemaCompatibility;

    public Input<Either<String,SchemaCompatibility>> getSchemaCompatibility() {
        return this.schemaCompatibility == null ? Input.empty() : this.schemaCompatibility;
    }

    /**
     * The Schema Group name
     * 
     */
    @InputImport(name="schemaGroupName")
    private final @Nullable Input<String> schemaGroupName;

    public Input<String> getSchemaGroupName() {
        return this.schemaGroupName == null ? Input.empty() : this.schemaGroupName;
    }

    @InputImport(name="schemaType")
    private final @Nullable Input<Either<String,SchemaType>> schemaType;

    public Input<Either<String,SchemaType>> getSchemaType() {
        return this.schemaType == null ? Input.empty() : this.schemaType;
    }

    public SchemaRegistryArgs(
        @Nullable Input<Map<String,String>> groupProperties,
        Input<String> namespaceName,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,SchemaCompatibility>> schemaCompatibility,
        @Nullable Input<String> schemaGroupName,
        @Nullable Input<Either<String,SchemaType>> schemaType) {
        this.groupProperties = groupProperties;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaCompatibility = schemaCompatibility;
        this.schemaGroupName = schemaGroupName;
        this.schemaType = schemaType;
    }

    private SchemaRegistryArgs() {
        this.groupProperties = Input.empty();
        this.namespaceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.schemaCompatibility = Input.empty();
        this.schemaGroupName = Input.empty();
        this.schemaType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> groupProperties;
        private Input<String> namespaceName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,SchemaCompatibility>> schemaCompatibility;
        private @Nullable Input<String> schemaGroupName;
        private @Nullable Input<Either<String,SchemaType>> schemaType;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupProperties = defaults.groupProperties;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaCompatibility = defaults.schemaCompatibility;
    	      this.schemaGroupName = defaults.schemaGroupName;
    	      this.schemaType = defaults.schemaType;
        }

        public Builder setGroupProperties(@Nullable Input<Map<String,String>> groupProperties) {
            this.groupProperties = groupProperties;
            return this;
        }

        public Builder setGroupProperties(@Nullable Map<String,String> groupProperties) {
            this.groupProperties = Input.ofNullable(groupProperties);
            return this;
        }

        public Builder setNamespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
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

        public Builder setSchemaCompatibility(@Nullable Input<Either<String,SchemaCompatibility>> schemaCompatibility) {
            this.schemaCompatibility = schemaCompatibility;
            return this;
        }

        public Builder setSchemaCompatibility(@Nullable Either<String,SchemaCompatibility> schemaCompatibility) {
            this.schemaCompatibility = Input.ofNullable(schemaCompatibility);
            return this;
        }

        public Builder setSchemaGroupName(@Nullable Input<String> schemaGroupName) {
            this.schemaGroupName = schemaGroupName;
            return this;
        }

        public Builder setSchemaGroupName(@Nullable String schemaGroupName) {
            this.schemaGroupName = Input.ofNullable(schemaGroupName);
            return this;
        }

        public Builder setSchemaType(@Nullable Input<Either<String,SchemaType>> schemaType) {
            this.schemaType = schemaType;
            return this;
        }

        public Builder setSchemaType(@Nullable Either<String,SchemaType> schemaType) {
            this.schemaType = Input.ofNullable(schemaType);
            return this;
        }

        public SchemaRegistryArgs build() {
            return new SchemaRegistryArgs(groupProperties, namespaceName, resourceGroupName, schemaCompatibility, schemaGroupName, schemaType);
        }
    }
}
