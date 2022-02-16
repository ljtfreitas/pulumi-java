// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeFieldMap;
import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeKeyMap;
import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetObjectTypeResult {
    private final @Nullable Boolean allowProfileCreation;
    private final @Nullable String createdAt;
    private final @Nullable String description;
    private final @Nullable String encryptionKey;
    private final @Nullable Integer expirationDays;
    private final @Nullable List<ObjectTypeFieldMap> fields;
    private final @Nullable List<ObjectTypeKeyMap> keys;
    private final @Nullable String lastUpdatedAt;
    private final @Nullable List<ObjectTypeTag> tags;
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

    public Optional<Boolean> getAllowProfileCreation() {
        return Optional.ofNullable(this.allowProfileCreation);
    }
    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getEncryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    public Optional<Integer> getExpirationDays() {
        return Optional.ofNullable(this.expirationDays);
    }
    public List<ObjectTypeFieldMap> getFields() {
        return this.fields == null ? List.of() : this.fields;
    }
    public List<ObjectTypeKeyMap> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }
    public Optional<String> getLastUpdatedAt() {
        return Optional.ofNullable(this.lastUpdatedAt);
    }
    public List<ObjectTypeTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
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