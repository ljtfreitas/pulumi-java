// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentArgs Empty = new DocumentArgs();

    /**
     * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
     * 
     */
    @InputImport(name="attachmentsSources")
    private final @Nullable Input<List<DocumentAttachmentsSourceArgs>> attachmentsSources;

    public Input<List<DocumentAttachmentsSourceArgs>> getAttachmentsSources() {
        return this.attachmentsSources == null ? Input.empty() : this.attachmentsSources;
    }

    /**
     * The JSON or YAML content of the document.
     * 
     */
    @InputImport(name="content", required=true)
    private final Input<String> content;

    public Input<String> getContent() {
        return this.content;
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
    @InputImport(name="documentType", required=true)
    private final Input<String> documentType;

    public Input<String> getDocumentType() {
        return this.documentType;
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
     * Additional Permissions to attach to the document. See Permissions below for details.
     * 
     */
    @InputImport(name="permissions")
    private final @Nullable Input<Map<String,String>> permissions;

    public Input<Map<String,String>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
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

    public DocumentArgs(
        @Nullable Input<List<DocumentAttachmentsSourceArgs>> attachmentsSources,
        Input<String> content,
        @Nullable Input<String> documentFormat,
        Input<String> documentType,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> permissions,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> targetType,
        @Nullable Input<String> versionName) {
        this.attachmentsSources = attachmentsSources;
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.documentFormat = documentFormat;
        this.documentType = Objects.requireNonNull(documentType, "expected parameter 'documentType' to be non-null");
        this.name = name;
        this.permissions = permissions;
        this.tags = tags;
        this.targetType = targetType;
        this.versionName = versionName;
    }

    private DocumentArgs() {
        this.attachmentsSources = Input.empty();
        this.content = Input.empty();
        this.documentFormat = Input.empty();
        this.documentType = Input.empty();
        this.name = Input.empty();
        this.permissions = Input.empty();
        this.tags = Input.empty();
        this.targetType = Input.empty();
        this.versionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DocumentAttachmentsSourceArgs>> attachmentsSources;
        private Input<String> content;
        private @Nullable Input<String> documentFormat;
        private Input<String> documentType;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> permissions;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> targetType;
        private @Nullable Input<String> versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentsSources = defaults.attachmentsSources;
    	      this.content = defaults.content;
    	      this.documentFormat = defaults.documentFormat;
    	      this.documentType = defaults.documentType;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.tags = defaults.tags;
    	      this.targetType = defaults.targetType;
    	      this.versionName = defaults.versionName;
        }

        public Builder setAttachmentsSources(@Nullable Input<List<DocumentAttachmentsSourceArgs>> attachmentsSources) {
            this.attachmentsSources = attachmentsSources;
            return this;
        }

        public Builder setAttachmentsSources(@Nullable List<DocumentAttachmentsSourceArgs> attachmentsSources) {
            this.attachmentsSources = Input.ofNullable(attachmentsSources);
            return this;
        }

        public Builder setContent(Input<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Input.of(Objects.requireNonNull(content));
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

        public Builder setDocumentType(Input<String> documentType) {
            this.documentType = Objects.requireNonNull(documentType);
            return this;
        }

        public Builder setDocumentType(String documentType) {
            this.documentType = Input.of(Objects.requireNonNull(documentType));
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

        public Builder setPermissions(@Nullable Input<Map<String,String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPermissions(@Nullable Map<String,String> permissions) {
            this.permissions = Input.ofNullable(permissions);
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
        public DocumentArgs build() {
            return new DocumentArgs(attachmentsSources, content, documentFormat, documentType, name, permissions, tags, targetType, versionName);
        }
    }
}
