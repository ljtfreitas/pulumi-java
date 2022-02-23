// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeFieldMap;
import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeKeyMap;
import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetObjectTypeResult {
    /**
     * Indicates whether a profile should be created when data is received.
     * 
     */
    private final @Nullable Boolean allowProfileCreation;
    /**
     * The time of this integration got created.
     * 
     */
    private final @Nullable String createdAt;
    /**
     * Description of the profile object type.
     * 
     */
    private final @Nullable String description;
    /**
     * The default encryption key
     * 
     */
    private final @Nullable String encryptionKey;
    /**
     * The default number of days until the data within the domain expires.
     * 
     */
    private final @Nullable Integer expirationDays;
    /**
     * A list of the name and ObjectType field.
     * 
     */
    private final @Nullable List<ObjectTypeFieldMap> fields;
    /**
     * A list of unique keys that can be used to map data to the profile.
     * 
     */
    private final @Nullable List<ObjectTypeKeyMap> keys;
    /**
     * The time of this integration got last updated at.
     * 
     */
    private final @Nullable String lastUpdatedAt;
    /**
     * The tags (keys and values) associated with the integration.
     * 
     */
    private final @Nullable List<ObjectTypeTag> tags;
    /**
     * A unique identifier for the object template.
     * 
     */
    private final @Nullable String templateId;

    @OutputCustomType.Constructor({"allowProfileCreation","createdAt","description","encryptionKey","expirationDays","fields","keys","lastUpdatedAt","tags","templateId"})
    private GetObjectTypeResult(
        @Nullable Boolean allowProfileCreation,
        @Nullable String createdAt,
        @Nullable String description,
        @Nullable String encryptionKey,
        @Nullable Integer expirationDays,
        @Nullable List<ObjectTypeFieldMap> fields,
        @Nullable List<ObjectTypeKeyMap> keys,
        @Nullable String lastUpdatedAt,
        @Nullable List<ObjectTypeTag> tags,
        @Nullable String templateId) {
        this.allowProfileCreation = allowProfileCreation;
        this.createdAt = createdAt;
        this.description = description;
        this.encryptionKey = encryptionKey;
        this.expirationDays = expirationDays;
        this.fields = fields;
        this.keys = keys;
        this.lastUpdatedAt = lastUpdatedAt;
        this.tags = tags;
        this.templateId = templateId;
    }

    /**
     * Indicates whether a profile should be created when data is received.
     * 
     */
    public Optional<Boolean> getAllowProfileCreation() {
        return Optional.ofNullable(this.allowProfileCreation);
    }
    /**
     * The time of this integration got created.
     * 
     */
    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * Description of the profile object type.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The default encryption key
     * 
     */
    public Optional<String> getEncryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * The default number of days until the data within the domain expires.
     * 
     */
    public Optional<Integer> getExpirationDays() {
        return Optional.ofNullable(this.expirationDays);
    }
    /**
     * A list of the name and ObjectType field.
     * 
     */
    public List<ObjectTypeFieldMap> getFields() {
        return this.fields == null ? List.of() : this.fields;
    }
    /**
     * A list of unique keys that can be used to map data to the profile.
     * 
     */
    public List<ObjectTypeKeyMap> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }
    /**
     * The time of this integration got last updated at.
     * 
     */
    public Optional<String> getLastUpdatedAt() {
        return Optional.ofNullable(this.lastUpdatedAt);
    }
    /**
     * The tags (keys and values) associated with the integration.
     * 
     */
    public List<ObjectTypeTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * A unique identifier for the object template.
     * 
     */
    public Optional<String> getTemplateId() {
        return Optional.ofNullable(this.templateId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowProfileCreation;
        private @Nullable String createdAt;
        private @Nullable String description;
        private @Nullable String encryptionKey;
        private @Nullable Integer expirationDays;
        private @Nullable List<ObjectTypeFieldMap> fields;
        private @Nullable List<ObjectTypeKeyMap> keys;
        private @Nullable String lastUpdatedAt;
        private @Nullable List<ObjectTypeTag> tags;
        private @Nullable String templateId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowProfileCreation = defaults.allowProfileCreation;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.expirationDays = defaults.expirationDays;
    	      this.fields = defaults.fields;
    	      this.keys = defaults.keys;
    	      this.lastUpdatedAt = defaults.lastUpdatedAt;
    	      this.tags = defaults.tags;
    	      this.templateId = defaults.templateId;
        }

        public Builder setAllowProfileCreation(@Nullable Boolean allowProfileCreation) {
            this.allowProfileCreation = allowProfileCreation;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder setExpirationDays(@Nullable Integer expirationDays) {
            this.expirationDays = expirationDays;
            return this;
        }

        public Builder setFields(@Nullable List<ObjectTypeFieldMap> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setKeys(@Nullable List<ObjectTypeKeyMap> keys) {
            this.keys = keys;
            return this;
        }

        public Builder setLastUpdatedAt(@Nullable String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        public Builder setTags(@Nullable List<ObjectTypeTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTemplateId(@Nullable String templateId) {
            this.templateId = templateId;
            return this;
        }
        public GetObjectTypeResult build() {
            return new GetObjectTypeResult(allowProfileCreation, createdAt, description, encryptionKey, expirationDays, fields, keys, lastUpdatedAt, tags, templateId);
        }
    }
}
