// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Binding resource properties payload
 * 
 */
public final class BindingResourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final BindingResourcePropertiesResponse Empty = new BindingResourcePropertiesResponse();

    /**
     * Binding parameters of the Binding resource
     * 
     */
    @InputImport(name="bindingParameters")
        private final @Nullable Map<String,Object> bindingParameters;

    public Map<String,Object> getBindingParameters() {
        return this.bindingParameters == null ? Map.of() : this.bindingParameters;
    }

    /**
     * Creation time of the Binding resource
     * 
     */
    @InputImport(name="createdAt", required=true)
        private final String createdAt;

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The generated Spring Boot property file for this binding. The secret will be deducted.
     * 
     */
    @InputImport(name="generatedProperties", required=true)
        private final String generatedProperties;

    public String getGeneratedProperties() {
        return this.generatedProperties;
    }

    /**
     * The key of the bound resource
     * 
     */
    @InputImport(name="key")
        private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * The Azure resource id of the bound resource
     * 
     */
    @InputImport(name="resourceId")
        private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    /**
     * The name of the bound resource
     * 
     */
    @InputImport(name="resourceName", required=true)
        private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    /**
     * The standard Azure resource type of the bound resource
     * 
     */
    @InputImport(name="resourceType", required=true)
        private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Update time of the Binding resource
     * 
     */
    @InputImport(name="updatedAt", required=true)
        private final String updatedAt;

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public BindingResourcePropertiesResponse(
        @Nullable Map<String,Object> bindingParameters,
        String createdAt,
        String generatedProperties,
        @Nullable String key,
        @Nullable String resourceId,
        String resourceName,
        String resourceType,
        String updatedAt) {
        this.bindingParameters = bindingParameters;
        this.createdAt = Objects.requireNonNull(createdAt, "expected parameter 'createdAt' to be non-null");
        this.generatedProperties = Objects.requireNonNull(generatedProperties, "expected parameter 'generatedProperties' to be non-null");
        this.key = key;
        this.resourceId = resourceId;
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.updatedAt = Objects.requireNonNull(updatedAt, "expected parameter 'updatedAt' to be non-null");
    }

    private BindingResourcePropertiesResponse() {
        this.bindingParameters = Map.of();
        this.createdAt = null;
        this.generatedProperties = null;
        this.key = null;
        this.resourceId = null;
        this.resourceName = null;
        this.resourceType = null;
        this.updatedAt = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BindingResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> bindingParameters;
        private String createdAt;
        private String generatedProperties;
        private @Nullable String key;
        private @Nullable String resourceId;
        private String resourceName;
        private String resourceType;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(BindingResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindingParameters = defaults.bindingParameters;
    	      this.createdAt = defaults.createdAt;
    	      this.generatedProperties = defaults.generatedProperties;
    	      this.key = defaults.key;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder setBindingParameters(@Nullable Map<String,Object> bindingParameters) {
            this.bindingParameters = bindingParameters;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setGeneratedProperties(String generatedProperties) {
            this.generatedProperties = Objects.requireNonNull(generatedProperties);
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public BindingResourcePropertiesResponse build() {
            return new BindingResourcePropertiesResponse(bindingParameters, createdAt, generatedProperties, key, resourceId, resourceName, resourceType, updatedAt);
        }
    }
}
