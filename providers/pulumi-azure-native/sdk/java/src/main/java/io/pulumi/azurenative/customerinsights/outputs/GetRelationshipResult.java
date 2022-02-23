// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.PropertyDefinitionResponse;
import io.pulumi.azurenative.customerinsights.outputs.RelationshipTypeMappingResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRelationshipResult {
    /**
     * The Relationship Cardinality.
     * 
     */
    private final @Nullable String cardinality;
    /**
     * Localized descriptions for the Relationship.
     * 
     */
    private final @Nullable Map<String,String> description;
    /**
     * Localized display name for the Relationship.
     * 
     */
    private final @Nullable Map<String,String> displayName;
    /**
     * The expiry date time in UTC.
     * 
     */
    private final @Nullable String expiryDateTimeUtc;
    /**
     * The properties of the Relationship.
     * 
     */
    private final @Nullable List<PropertyDefinitionResponse> fields;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Optional property to be used to map fields in profile to their strong ids in related profile.
     * 
     */
    private final @Nullable List<RelationshipTypeMappingResponse> lookupMappings;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Profile type.
     * 
     */
    private final String profileType;
    /**
     * Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Related profile being referenced.
     * 
     */
    private final String relatedProfileType;
    /**
     * The relationship guid id.
     * 
     */
    private final String relationshipGuidId;
    /**
     * The Relationship name.
     * 
     */
    private final String relationshipName;
    /**
     * The hub name.
     * 
     */
    private final String tenantId;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"cardinality","description","displayName","expiryDateTimeUtc","fields","id","lookupMappings","name","profileType","provisioningState","relatedProfileType","relationshipGuidId","relationshipName","tenantId","type"})
    private GetRelationshipResult(
        @Nullable String cardinality,
        @Nullable Map<String,String> description,
        @Nullable Map<String,String> displayName,
        @Nullable String expiryDateTimeUtc,
        @Nullable List<PropertyDefinitionResponse> fields,
        String id,
        @Nullable List<RelationshipTypeMappingResponse> lookupMappings,
        String name,
        String profileType,
        String provisioningState,
        String relatedProfileType,
        String relationshipGuidId,
        String relationshipName,
        String tenantId,
        String type) {
        this.cardinality = cardinality;
        this.description = description;
        this.displayName = displayName;
        this.expiryDateTimeUtc = expiryDateTimeUtc;
        this.fields = fields;
        this.id = Objects.requireNonNull(id);
        this.lookupMappings = lookupMappings;
        this.name = Objects.requireNonNull(name);
        this.profileType = Objects.requireNonNull(profileType);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.relatedProfileType = Objects.requireNonNull(relatedProfileType);
        this.relationshipGuidId = Objects.requireNonNull(relationshipGuidId);
        this.relationshipName = Objects.requireNonNull(relationshipName);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The Relationship Cardinality.
     * 
     */
    public Optional<String> getCardinality() {
        return Optional.ofNullable(this.cardinality);
    }
    /**
     * Localized descriptions for the Relationship.
     * 
     */
    public Map<String,String> getDescription() {
        return this.description == null ? Map.of() : this.description;
    }
    /**
     * Localized display name for the Relationship.
     * 
     */
    public Map<String,String> getDisplayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }
    /**
     * The expiry date time in UTC.
     * 
     */
    public Optional<String> getExpiryDateTimeUtc() {
        return Optional.ofNullable(this.expiryDateTimeUtc);
    }
    /**
     * The properties of the Relationship.
     * 
     */
    public List<PropertyDefinitionResponse> getFields() {
        return this.fields == null ? List.of() : this.fields;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Optional property to be used to map fields in profile to their strong ids in related profile.
     * 
     */
    public List<RelationshipTypeMappingResponse> getLookupMappings() {
        return this.lookupMappings == null ? List.of() : this.lookupMappings;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Profile type.
     * 
     */
    public String getProfileType() {
        return this.profileType;
    }
    /**
     * Provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Related profile being referenced.
     * 
     */
    public String getRelatedProfileType() {
        return this.relatedProfileType;
    }
    /**
     * The relationship guid id.
     * 
     */
    public String getRelationshipGuidId() {
        return this.relationshipGuidId;
    }
    /**
     * The Relationship name.
     * 
     */
    public String getRelationshipName() {
        return this.relationshipName;
    }
    /**
     * The hub name.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
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

    public static Builder builder(GetRelationshipResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cardinality;
        private @Nullable Map<String,String> description;
        private @Nullable Map<String,String> displayName;
        private @Nullable String expiryDateTimeUtc;
        private @Nullable List<PropertyDefinitionResponse> fields;
        private String id;
        private @Nullable List<RelationshipTypeMappingResponse> lookupMappings;
        private String name;
        private String profileType;
        private String provisioningState;
        private String relatedProfileType;
        private String relationshipGuidId;
        private String relationshipName;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRelationshipResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardinality = defaults.cardinality;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.expiryDateTimeUtc = defaults.expiryDateTimeUtc;
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.lookupMappings = defaults.lookupMappings;
    	      this.name = defaults.name;
    	      this.profileType = defaults.profileType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.relatedProfileType = defaults.relatedProfileType;
    	      this.relationshipGuidId = defaults.relationshipGuidId;
    	      this.relationshipName = defaults.relationshipName;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setCardinality(@Nullable String cardinality) {
            this.cardinality = cardinality;
            return this;
        }

        public Builder setDescription(@Nullable Map<String,String> description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable Map<String,String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setExpiryDateTimeUtc(@Nullable String expiryDateTimeUtc) {
            this.expiryDateTimeUtc = expiryDateTimeUtc;
            return this;
        }

        public Builder setFields(@Nullable List<PropertyDefinitionResponse> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLookupMappings(@Nullable List<RelationshipTypeMappingResponse> lookupMappings) {
            this.lookupMappings = lookupMappings;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProfileType(String profileType) {
            this.profileType = Objects.requireNonNull(profileType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRelatedProfileType(String relatedProfileType) {
            this.relatedProfileType = Objects.requireNonNull(relatedProfileType);
            return this;
        }

        public Builder setRelationshipGuidId(String relationshipGuidId) {
            this.relationshipGuidId = Objects.requireNonNull(relationshipGuidId);
            return this;
        }

        public Builder setRelationshipName(String relationshipName) {
            this.relationshipName = Objects.requireNonNull(relationshipName);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRelationshipResult build() {
            return new GetRelationshipResult(cardinality, description, displayName, expiryDateTimeUtc, fields, id, lookupMappings, name, profileType, provisioningState, relatedProfileType, relationshipGuidId, relationshipName, tenantId, type);
        }
    }
}
