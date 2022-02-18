// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScopeConnectionResult {
    /**
     * A description of the scope connection.
     * 
     */
    private final @Nullable String description;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * The system metadata related to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Tenant ID.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","etag","id","name","resourceId","systemData","tenantId","type"})
    private GetScopeConnectionResult(
        @Nullable String description,
        String etag,
        String id,
        String name,
        @Nullable String resourceId,
        SystemDataResponse systemData,
        @Nullable String tenantId,
        String type) {
        this.description = description;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.resourceId = resourceId;
        this.systemData = Objects.requireNonNull(systemData);
        this.tenantId = tenantId;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A description of the scope connection.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Tenant ID.
     * 
     */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScopeConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String etag;
        private String id;
        private String name;
        private @Nullable String resourceId;
        private SystemDataResponse systemData;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScopeConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.systemData = defaults.systemData;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetScopeConnectionResult build() {
            return new GetScopeConnectionResult(description, etag, id, name, resourceId, systemData, tenantId, type);
        }
    }
}
