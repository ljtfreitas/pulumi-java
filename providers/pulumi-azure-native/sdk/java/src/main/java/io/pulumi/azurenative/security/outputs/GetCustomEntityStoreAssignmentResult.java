// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCustomEntityStoreAssignmentResult {
    /**
     * The link to entity store database.
     * 
     */
    private final @Nullable String entityStoreDatabaseLink;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The principal assigned with entity store. Format of principal is: [AAD type]=[PrincipalObjectId];[TenantId]
     * 
     */
    private final @Nullable String principal;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"entityStoreDatabaseLink","id","name","principal","systemData","type"})
    private GetCustomEntityStoreAssignmentResult(
        @Nullable String entityStoreDatabaseLink,
        String id,
        String name,
        @Nullable String principal,
        SystemDataResponse systemData,
        String type) {
        this.entityStoreDatabaseLink = entityStoreDatabaseLink;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.principal = principal;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The link to entity store database.
     * 
     */
    public Optional<String> getEntityStoreDatabaseLink() {
        return Optional.ofNullable(this.entityStoreDatabaseLink);
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The principal assigned with entity store. Format of principal is: [AAD type]=[PrincipalObjectId];[TenantId]
     * 
     */
    public Optional<String> getPrincipal() {
        return Optional.ofNullable(this.principal);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomEntityStoreAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String entityStoreDatabaseLink;
        private String id;
        private String name;
        private @Nullable String principal;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomEntityStoreAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityStoreDatabaseLink = defaults.entityStoreDatabaseLink;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.principal = defaults.principal;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setEntityStoreDatabaseLink(@Nullable String entityStoreDatabaseLink) {
            this.entityStoreDatabaseLink = entityStoreDatabaseLink;
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

        public Builder setPrincipal(@Nullable String principal) {
            this.principal = principal;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetCustomEntityStoreAssignmentResult build() {
            return new GetCustomEntityStoreAssignmentResult(entityStoreDatabaseLink, id, name, principal, systemData, type);
        }
    }
}
