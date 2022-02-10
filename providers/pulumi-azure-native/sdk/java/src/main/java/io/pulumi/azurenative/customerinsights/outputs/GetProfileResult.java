// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.PropertyDefinitionResponse;
import io.pulumi.azurenative.customerinsights.outputs.StrongIdResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProfileResult {
    private final @Nullable String apiEntitySetName;
    private final @Nullable Map<String,List<String>> attributes;
    private final @Nullable Map<String,String> description;
    private final @Nullable Map<String,String> displayName;
    private final @Nullable String entityType;
    private final @Nullable List<PropertyDefinitionResponse> fields;
    private final String id;
    private final @Nullable Integer instancesCount;
    private final @Nullable String largeImage;
    private final String lastChangedUtc;
    private final @Nullable Map<String,Map<String,String>> localizedAttributes;
    private final @Nullable String mediumImage;
    private final String name;
    private final String provisioningState;
    private final @Nullable String schemaItemTypeLink;
    private final @Nullable String smallImage;
    private final @Nullable List<StrongIdResponse> strongIds;
    private final String tenantId;
    private final @Nullable String timestampFieldName;
    private final String type;
    private final @Nullable String typeName;

    @OutputCustomType.Constructor({"apiEntitySetName","attributes","description","displayName","entityType","fields","id","instancesCount","largeImage","lastChangedUtc","localizedAttributes","mediumImage","name","provisioningState","schemaItemTypeLink","smallImage","strongIds","tenantId","timestampFieldName","type","typeName"})
    private GetProfileResult(
        @Nullable String apiEntitySetName,
        @Nullable Map<String,List<String>> attributes,
        @Nullable Map<String,String> description,
        @Nullable Map<String,String> displayName,
        @Nullable String entityType,
        @Nullable List<PropertyDefinitionResponse> fields,
        String id,
        @Nullable Integer instancesCount,
        @Nullable String largeImage,
        String lastChangedUtc,
        @Nullable Map<String,Map<String,String>> localizedAttributes,
        @Nullable String mediumImage,
        String name,
        String provisioningState,
        @Nullable String schemaItemTypeLink,
        @Nullable String smallImage,
        @Nullable List<StrongIdResponse> strongIds,
        String tenantId,
        @Nullable String timestampFieldName,
        String type,
        @Nullable String typeName) {
        this.apiEntitySetName = apiEntitySetName;
        this.attributes = attributes;
        this.description = description;
        this.displayName = displayName;
        this.entityType = entityType;
        this.fields = fields;
        this.id = Objects.requireNonNull(id);
        this.instancesCount = instancesCount;
        this.largeImage = largeImage;
        this.lastChangedUtc = Objects.requireNonNull(lastChangedUtc);
        this.localizedAttributes = localizedAttributes;
        this.mediumImage = mediumImage;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.schemaItemTypeLink = schemaItemTypeLink;
        this.smallImage = smallImage;
        this.strongIds = strongIds;
        this.tenantId = Objects.requireNonNull(tenantId);
        this.timestampFieldName = timestampFieldName;
        this.type = Objects.requireNonNull(type);
        this.typeName = typeName;
    }

    public Optional<String> getApiEntitySetName() {
        return Optional.ofNullable(this.apiEntitySetName);
    }
    public Map<String,List<String>> getAttributes() {
        return this.attributes == null ? Map.of() : this.attributes;
    }
    public Map<String,String> getDescription() {
        return this.description == null ? Map.of() : this.description;
    }
    public Map<String,String> getDisplayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }
    public Optional<String> getEntityType() {
        return Optional.ofNullable(this.entityType);
    }
    public List<PropertyDefinitionResponse> getFields() {
        return this.fields == null ? List.of() : this.fields;
    }
    public String getId() {
        return this.id;
    }
    public Optional<Integer> getInstancesCount() {
        return Optional.ofNullable(this.instancesCount);
    }
    public Optional<String> getLargeImage() {
        return Optional.ofNullable(this.largeImage);
    }
    public String getLastChangedUtc() {
        return this.lastChangedUtc;
    }
    public Map<String,Map<String,String>> getLocalizedAttributes() {
        return this.localizedAttributes == null ? Map.of() : this.localizedAttributes;
    }
    public Optional<String> getMediumImage() {
        return Optional.ofNullable(this.mediumImage);
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getSchemaItemTypeLink() {
        return Optional.ofNullable(this.schemaItemTypeLink);
    }
    public Optional<String> getSmallImage() {
        return Optional.ofNullable(this.smallImage);
    }
    public List<StrongIdResponse> getStrongIds() {
        return this.strongIds == null ? List.of() : this.strongIds;
    }
    public String getTenantId() {
        return this.tenantId;
    }
    public Optional<String> getTimestampFieldName() {
        return Optional.ofNullable(this.timestampFieldName);
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getTypeName() {
        return Optional.ofNullable(this.typeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiEntitySetName;
        private @Nullable Map<String,List<String>> attributes;
        private @Nullable Map<String,String> description;
        private @Nullable Map<String,String> displayName;
        private @Nullable String entityType;
        private @Nullable List<PropertyDefinitionResponse> fields;
        private String id;
        private @Nullable Integer instancesCount;
        private @Nullable String largeImage;
        private String lastChangedUtc;
        private @Nullable Map<String,Map<String,String>> localizedAttributes;
        private @Nullable String mediumImage;
        private String name;
        private String provisioningState;
        private @Nullable String schemaItemTypeLink;
        private @Nullable String smallImage;
        private @Nullable List<StrongIdResponse> strongIds;
        private String tenantId;
        private @Nullable String timestampFieldName;
        private String type;
        private @Nullable String typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEntitySetName = defaults.apiEntitySetName;
    	      this.attributes = defaults.attributes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.instancesCount = defaults.instancesCount;
    	      this.largeImage = defaults.largeImage;
    	      this.lastChangedUtc = defaults.lastChangedUtc;
    	      this.localizedAttributes = defaults.localizedAttributes;
    	      this.mediumImage = defaults.mediumImage;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.schemaItemTypeLink = defaults.schemaItemTypeLink;
    	      this.smallImage = defaults.smallImage;
    	      this.strongIds = defaults.strongIds;
    	      this.tenantId = defaults.tenantId;
    	      this.timestampFieldName = defaults.timestampFieldName;
    	      this.type = defaults.type;
    	      this.typeName = defaults.typeName;
        }

        public Builder setApiEntitySetName(@Nullable String apiEntitySetName) {
            this.apiEntitySetName = apiEntitySetName;
            return this;
        }

        public Builder setAttributes(@Nullable Map<String,List<String>> attributes) {
            this.attributes = attributes;
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

        public Builder setEntityType(@Nullable String entityType) {
            this.entityType = entityType;
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

        public Builder setInstancesCount(@Nullable Integer instancesCount) {
            this.instancesCount = instancesCount;
            return this;
        }

        public Builder setLargeImage(@Nullable String largeImage) {
            this.largeImage = largeImage;
            return this;
        }

        public Builder setLastChangedUtc(String lastChangedUtc) {
            this.lastChangedUtc = Objects.requireNonNull(lastChangedUtc);
            return this;
        }

        public Builder setLocalizedAttributes(@Nullable Map<String,Map<String,String>> localizedAttributes) {
            this.localizedAttributes = localizedAttributes;
            return this;
        }

        public Builder setMediumImage(@Nullable String mediumImage) {
            this.mediumImage = mediumImage;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSchemaItemTypeLink(@Nullable String schemaItemTypeLink) {
            this.schemaItemTypeLink = schemaItemTypeLink;
            return this;
        }

        public Builder setSmallImage(@Nullable String smallImage) {
            this.smallImage = smallImage;
            return this;
        }

        public Builder setStrongIds(@Nullable List<StrongIdResponse> strongIds) {
            this.strongIds = strongIds;
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTimestampFieldName(@Nullable String timestampFieldName) {
            this.timestampFieldName = timestampFieldName;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeName(@Nullable String typeName) {
            this.typeName = typeName;
            return this;
        }

        public GetProfileResult build() {
            return new GetProfileResult(apiEntitySetName, attributes, description, displayName, entityType, fields, id, instancesCount, largeImage, lastChangedUtc, localizedAttributes, mediumImage, name, provisioningState, schemaItemTypeLink, smallImage, strongIds, tenantId, timestampFieldName, type, typeName);
        }
    }
}