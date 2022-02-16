// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles;

import io.pulumi.awsnative.customerprofiles.inputs.ObjectTypeFieldMapArgs;
import io.pulumi.awsnative.customerprofiles.inputs.ObjectTypeKeyMapArgs;
import io.pulumi.awsnative.customerprofiles.inputs.ObjectTypeTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectTypeArgs Empty = new ObjectTypeArgs();

    @InputImport(name="allowProfileCreation")
    private final @Nullable Input<Boolean> allowProfileCreation;

    public Input<Boolean> getAllowProfileCreation() {
        return this.allowProfileCreation == null ? Input.empty() : this.allowProfileCreation;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="domainName", required=true)
    private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    @InputImport(name="encryptionKey")
    private final @Nullable Input<String> encryptionKey;

    public Input<String> getEncryptionKey() {
        return this.encryptionKey == null ? Input.empty() : this.encryptionKey;
    }

    @InputImport(name="expirationDays")
    private final @Nullable Input<Integer> expirationDays;

    public Input<Integer> getExpirationDays() {
        return this.expirationDays == null ? Input.empty() : this.expirationDays;
    }

    @InputImport(name="fields")
    private final @Nullable Input<List<ObjectTypeFieldMapArgs>> fields;

    public Input<List<ObjectTypeFieldMapArgs>> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    @InputImport(name="keys")
    private final @Nullable Input<List<ObjectTypeKeyMapArgs>> keys;

    public Input<List<ObjectTypeKeyMapArgs>> getKeys() {
        return this.keys == null ? Input.empty() : this.keys;
    }

    @InputImport(name="objectTypeName")
    private final @Nullable Input<String> objectTypeName;

    public Input<String> getObjectTypeName() {
        return this.objectTypeName == null ? Input.empty() : this.objectTypeName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<ObjectTypeTagArgs>> tags;

    public Input<List<ObjectTypeTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="templateId")
    private final @Nullable Input<String> templateId;

    public Input<String> getTemplateId() {
        return this.templateId == null ? Input.empty() : this.templateId;
    }

    public ObjectTypeArgs(
        @Nullable Input<Boolean> allowProfileCreation,
        @Nullable Input<String> description,
        Input<String> domainName,
        @Nullable Input<String> encryptionKey,
        @Nullable Input<Integer> expirationDays,
        @Nullable Input<List<ObjectTypeFieldMapArgs>> fields,
        @Nullable Input<List<ObjectTypeKeyMapArgs>> keys,
        @Nullable Input<String> objectTypeName,
        @Nullable Input<List<ObjectTypeTagArgs>> tags,
        @Nullable Input<String> templateId) {
        this.allowProfileCreation = allowProfileCreation;
        this.description = description;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.encryptionKey = encryptionKey;
        this.expirationDays = expirationDays;
        this.fields = fields;
        this.keys = keys;
        this.objectTypeName = objectTypeName;
        this.tags = tags;
        this.templateId = templateId;
    }

    private ObjectTypeArgs() {
        this.allowProfileCreation = Input.empty();
        this.description = Input.empty();
        this.domainName = Input.empty();
        this.encryptionKey = Input.empty();
        this.expirationDays = Input.empty();
        this.fields = Input.empty();
        this.keys = Input.empty();
        this.objectTypeName = Input.empty();
        this.tags = Input.empty();
        this.templateId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowProfileCreation;
        private @Nullable Input<String> description;
        private Input<String> domainName;
        private @Nullable Input<String> encryptionKey;
        private @Nullable Input<Integer> expirationDays;
        private @Nullable Input<List<ObjectTypeFieldMapArgs>> fields;
        private @Nullable Input<List<ObjectTypeKeyMapArgs>> keys;
        private @Nullable Input<String> objectTypeName;
        private @Nullable Input<List<ObjectTypeTagArgs>> tags;
        private @Nullable Input<String> templateId;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowProfileCreation = defaults.allowProfileCreation;
    	      this.description = defaults.description;
    	      this.domainName = defaults.domainName;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.expirationDays = defaults.expirationDays;
    	      this.fields = defaults.fields;
    	      this.keys = defaults.keys;
    	      this.objectTypeName = defaults.objectTypeName;
    	      this.tags = defaults.tags;
    	      this.templateId = defaults.templateId;
        }

        public Builder setAllowProfileCreation(@Nullable Input<Boolean> allowProfileCreation) {
            this.allowProfileCreation = allowProfileCreation;
            return this;
        }

        public Builder setAllowProfileCreation(@Nullable Boolean allowProfileCreation) {
            this.allowProfileCreation = Input.ofNullable(allowProfileCreation);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setEncryptionKey(@Nullable Input<String> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder setEncryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = Input.ofNullable(encryptionKey);
            return this;
        }

        public Builder setExpirationDays(@Nullable Input<Integer> expirationDays) {
            this.expirationDays = expirationDays;
            return this;
        }

        public Builder setExpirationDays(@Nullable Integer expirationDays) {
            this.expirationDays = Input.ofNullable(expirationDays);
            return this;
        }

        public Builder setFields(@Nullable Input<List<ObjectTypeFieldMapArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setFields(@Nullable List<ObjectTypeFieldMapArgs> fields) {
            this.fields = Input.ofNullable(fields);
            return this;
        }

        public Builder setKeys(@Nullable Input<List<ObjectTypeKeyMapArgs>> keys) {
            this.keys = keys;
            return this;
        }

        public Builder setKeys(@Nullable List<ObjectTypeKeyMapArgs> keys) {
            this.keys = Input.ofNullable(keys);
            return this;
        }

        public Builder setObjectTypeName(@Nullable Input<String> objectTypeName) {
            this.objectTypeName = objectTypeName;
            return this;
        }

        public Builder setObjectTypeName(@Nullable String objectTypeName) {
            this.objectTypeName = Input.ofNullable(objectTypeName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ObjectTypeTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ObjectTypeTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTemplateId(@Nullable Input<String> templateId) {
            this.templateId = templateId;
            return this;
        }

        public Builder setTemplateId(@Nullable String templateId) {
            this.templateId = Input.ofNullable(templateId);
            return this;
        }

        public ObjectTypeArgs build() {
            return new ObjectTypeArgs(allowProfileCreation, description, domainName, encryptionKey, expirationDays, fields, keys, objectTypeName, tags, templateId);
        }
    }
}