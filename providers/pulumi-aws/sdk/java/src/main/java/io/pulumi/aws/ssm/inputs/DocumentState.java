// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceGetArgs;
import io.pulumi.aws.ssm.inputs.DocumentParameterGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentState extends io.pulumi.resources.ResourceArgs {

    public static final DocumentState Empty = new DocumentState();

    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
     * 
     */
    @InputImport(name="attachmentsSources")
    private final @Nullable Input<List<DocumentAttachmentsSourceGetArgs>> attachmentsSources;

    public Input<List<DocumentAttachmentsSourceGetArgs>> getAttachmentsSources() {
        return this.attachmentsSources == null ? Input.empty() : this.attachmentsSources;
    }

    /**
     * The JSON or YAML content of the document.
     * 
     */
    @InputImport(name="content")
    private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * The date the document was created.
     * 
     */
    @InputImport(name="createdDate")
    private final @Nullable Input<String> createdDate;

    public Input<String> getCreatedDate() {
        return this.createdDate == null ? Input.empty() : this.createdDate;
    }

    /**
     * The default version of the document.
     * 
     */
    @InputImport(name="defaultVersion")
    private final @Nullable Input<String> defaultVersion;

    public Input<String> getDefaultVersion() {
        return this.defaultVersion == null ? Input.empty() : this.defaultVersion;
    }

    /**
     * The description of the document.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The format of the document. Valid document types include: `JSON` and `YAML`
     * 
     */
    @InputImport(name="documentFormat")
    private final @Nullable Input<String> documentFormat;

    public Input<String> getDocumentFormat() {
        return this.documentFormat == null ? Input.empty() : this.documentFormat;
    }

    /**
     * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
     * 
     */
    @InputImport(name="documentType")
    private final @Nullable Input<String> documentType;

    public Input<String> getDocumentType() {
        return this.documentType == null ? Input.empty() : this.documentType;
    }

    /**
     * The document version.
     * 
     */
    @InputImport(name="documentVersion")
    private final @Nullable Input<String> documentVersion;

    public Input<String> getDocumentVersion() {
        return this.documentVersion == null ? Input.empty() : this.documentVersion;
    }

    /**
     * The sha1 or sha256 of the document content
     * 
     */
    @InputImport(name="hash")
    private final @Nullable Input<String> hash;

    public Input<String> getHash() {
        return this.hash == null ? Input.empty() : this.hash;
    }

    /**
     * "Sha1" "Sha256". The hashing algorithm used when hashing the content.
     * 
     */
    @InputImport(name="hashType")
    private final @Nullable Input<String> hashType;

    public Input<String> getHashType() {
        return this.hashType == null ? Input.empty() : this.hashType;
    }

    /**
     * The latest version of the document.
     * 
     */
    @InputImport(name="latestVersion")
    private final @Nullable Input<String> latestVersion;

    public Input<String> getLatestVersion() {
        return this.latestVersion == null ? Input.empty() : this.latestVersion;
    }

    /**
     * The name of the document.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The AWS user account of the person who created the document.
     * 
     */
    @InputImport(name="owner")
    private final @Nullable Input<String> owner;

    public Input<String> getOwner() {
        return this.owner == null ? Input.empty() : this.owner;
    }

    /**
     * The parameters that are available to this document.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<List<DocumentParameterGetArgs>> parameters;

    public Input<List<DocumentParameterGetArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Additional Permissions to attach to the document. See Permissions below for details.
     * 
     */
    @InputImport(name="permissions")
    private final @Nullable Input<Map<String,String>> permissions;

    public Input<Map<String,String>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    /**
     * A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
     * 
     */
    @InputImport(name="platformTypes")
    private final @Nullable Input<List<String>> platformTypes;

    public Input<List<String>> getPlatformTypes() {
        return this.platformTypes == null ? Input.empty() : this.platformTypes;
    }

    /**
     * The schema version of the document.
     * 
     */
    @InputImport(name="schemaVersion")
    private final @Nullable Input<String> schemaVersion;

    public Input<String> getSchemaVersion() {
        return this.schemaVersion == null ? Input.empty() : this.schemaVersion;
    }

    /**
     * "Creating", "Active" or "Deleting". The current status of the document.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * 
     */
    @InputImport(name="targetType")
    private final @Nullable Input<String> targetType;

    public Input<String> getTargetType() {
        return this.targetType == null ? Input.empty() : this.targetType;
    }

    /**
     * A field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document and cannot be changed for an existing document version.
     * 
     */
    @InputImport(name="versionName")
    private final @Nullable Input<String> versionName;

    public Input<String> getVersionName() {
        return this.versionName == null ? Input.empty() : this.versionName;
    }

    public DocumentState(
        @Nullable Input<String> arn,
        @Nullable Input<List<DocumentAttachmentsSourceGetArgs>> attachmentsSources,
        @Nullable Input<String> content,
        @Nullable Input<String> createdDate,
        @Nullable Input<String> defaultVersion,
        @Nullable Input<String> description,
        @Nullable Input<String> documentFormat,
        @Nullable Input<String> documentType,
        @Nullable Input<String> documentVersion,
        @Nullable Input<String> hash,
        @Nullable Input<String> hashType,
        @Nullable Input<String> latestVersion,
        @Nullable Input<String> name,
        @Nullable Input<String> owner,
        @Nullable Input<List<DocumentParameterGetArgs>> parameters,
        @Nullable Input<Map<String,String>> permissions,
        @Nullable Input<List<String>> platformTypes,
        @Nullable Input<String> schemaVersion,
        @Nullable Input<String> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> targetType,
        @Nullable Input<String> versionName) {
        this.arn = arn;
        this.attachmentsSources = attachmentsSources;
        this.content = content;
        this.createdDate = createdDate;
        this.defaultVersion = defaultVersion;
        this.description = description;
        this.documentFormat = documentFormat;
        this.documentType = documentType;
        this.documentVersion = documentVersion;
        this.hash = hash;
        this.hashType = hashType;
        this.latestVersion = latestVersion;
        this.name = name;
        this.owner = owner;
        this.parameters = parameters;
        this.permissions = permissions;
        this.platformTypes = platformTypes;
        this.schemaVersion = schemaVersion;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.targetType = targetType;
        this.versionName = versionName;
    }

    private DocumentState() {
        this.arn = Input.empty();
        this.attachmentsSources = Input.empty();
        this.content = Input.empty();
        this.createdDate = Input.empty();
        this.defaultVersion = Input.empty();
        this.description = Input.empty();
        this.documentFormat = Input.empty();
        this.documentType = Input.empty();
        this.documentVersion = Input.empty();
        this.hash = Input.empty();
        this.hashType = Input.empty();
        this.latestVersion = Input.empty();
        this.name = Input.empty();
        this.owner = Input.empty();
        this.parameters = Input.empty();
        this.permissions = Input.empty();
        this.platformTypes = Input.empty();
        this.schemaVersion = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.targetType = Input.empty();
        this.versionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<DocumentAttachmentsSourceGetArgs>> attachmentsSources;
        private @Nullable Input<String> content;
        private @Nullable Input<String> createdDate;
        private @Nullable Input<String> defaultVersion;
        private @Nullable Input<String> description;
        private @Nullable Input<String> documentFormat;
        private @Nullable Input<String> documentType;
        private @Nullable Input<String> documentVersion;
        private @Nullable Input<String> hash;
        private @Nullable Input<String> hashType;
        private @Nullable Input<String> latestVersion;
        private @Nullable Input<String> name;
        private @Nullable Input<String> owner;
        private @Nullable Input<List<DocumentParameterGetArgs>> parameters;
        private @Nullable Input<Map<String,String>> permissions;
        private @Nullable Input<List<String>> platformTypes;
        private @Nullable Input<String> schemaVersion;
        private @Nullable Input<String> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> targetType;
        private @Nullable Input<String> versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.attachmentsSources = defaults.attachmentsSources;
    	      this.content = defaults.content;
    	      this.createdDate = defaults.createdDate;
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.description = defaults.description;
    	      this.documentFormat = defaults.documentFormat;
    	      this.documentType = defaults.documentType;
    	      this.documentVersion = defaults.documentVersion;
    	      this.hash = defaults.hash;
    	      this.hashType = defaults.hashType;
    	      this.latestVersion = defaults.latestVersion;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.parameters = defaults.parameters;
    	      this.permissions = defaults.permissions;
    	      this.platformTypes = defaults.platformTypes;
    	      this.schemaVersion = defaults.schemaVersion;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.targetType = defaults.targetType;
    	      this.versionName = defaults.versionName;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAttachmentsSources(@Nullable Input<List<DocumentAttachmentsSourceGetArgs>> attachmentsSources) {
            this.attachmentsSources = attachmentsSources;
            return this;
        }

        public Builder setAttachmentsSources(@Nullable List<DocumentAttachmentsSourceGetArgs> attachmentsSources) {
            this.attachmentsSources = Input.ofNullable(attachmentsSources);
            return this;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder setCreatedDate(@Nullable Input<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setCreatedDate(@Nullable String createdDate) {
            this.createdDate = Input.ofNullable(createdDate);
            return this;
        }

        public Builder setDefaultVersion(@Nullable Input<String> defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }

        public Builder setDefaultVersion(@Nullable String defaultVersion) {
            this.defaultVersion = Input.ofNullable(defaultVersion);
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

        public Builder setDocumentFormat(@Nullable Input<String> documentFormat) {
            this.documentFormat = documentFormat;
            return this;
        }

        public Builder setDocumentFormat(@Nullable String documentFormat) {
            this.documentFormat = Input.ofNullable(documentFormat);
            return this;
        }

        public Builder setDocumentType(@Nullable Input<String> documentType) {
            this.documentType = documentType;
            return this;
        }

        public Builder setDocumentType(@Nullable String documentType) {
            this.documentType = Input.ofNullable(documentType);
            return this;
        }

        public Builder setDocumentVersion(@Nullable Input<String> documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }

        public Builder setDocumentVersion(@Nullable String documentVersion) {
            this.documentVersion = Input.ofNullable(documentVersion);
            return this;
        }

        public Builder setHash(@Nullable Input<String> hash) {
            this.hash = hash;
            return this;
        }

        public Builder setHash(@Nullable String hash) {
            this.hash = Input.ofNullable(hash);
            return this;
        }

        public Builder setHashType(@Nullable Input<String> hashType) {
            this.hashType = hashType;
            return this;
        }

        public Builder setHashType(@Nullable String hashType) {
            this.hashType = Input.ofNullable(hashType);
            return this;
        }

        public Builder setLatestVersion(@Nullable Input<String> latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        public Builder setLatestVersion(@Nullable String latestVersion) {
            this.latestVersion = Input.ofNullable(latestVersion);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOwner(@Nullable Input<String> owner) {
            this.owner = owner;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = Input.ofNullable(owner);
            return this;
        }

        public Builder setParameters(@Nullable Input<List<DocumentParameterGetArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<DocumentParameterGetArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPermissions(@Nullable Input<Map<String,String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPermissions(@Nullable Map<String,String> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public Builder setPlatformTypes(@Nullable Input<List<String>> platformTypes) {
            this.platformTypes = platformTypes;
            return this;
        }

        public Builder setPlatformTypes(@Nullable List<String> platformTypes) {
            this.platformTypes = Input.ofNullable(platformTypes);
            return this;
        }

        public Builder setSchemaVersion(@Nullable Input<String> schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        public Builder setSchemaVersion(@Nullable String schemaVersion) {
            this.schemaVersion = Input.ofNullable(schemaVersion);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setTargetType(@Nullable Input<String> targetType) {
            this.targetType = targetType;
            return this;
        }

        public Builder setTargetType(@Nullable String targetType) {
            this.targetType = Input.ofNullable(targetType);
            return this;
        }

        public Builder setVersionName(@Nullable Input<String> versionName) {
            this.versionName = versionName;
            return this;
        }

        public Builder setVersionName(@Nullable String versionName) {
            this.versionName = Input.ofNullable(versionName);
            return this;
        }
        public DocumentState build() {
            return new DocumentState(arn, attachmentsSources, content, createdDate, defaultVersion, description, documentFormat, documentType, documentVersion, hash, hashType, latestVersion, name, owner, parameters, permissions, platformTypes, schemaVersion, status, tags, tagsAll, targetType, versionName);
        }
    }
}
