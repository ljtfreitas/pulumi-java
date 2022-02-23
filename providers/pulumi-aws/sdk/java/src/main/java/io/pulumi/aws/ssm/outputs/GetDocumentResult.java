// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDocumentResult {
    /**
     * The ARN of the document.
     * 
     */
    private final String arn;
    /**
     * The contents of the document.
     * 
     */
    private final String content;
    private final @Nullable String documentFormat;
    /**
     * The type of the document.
     * 
     */
    private final String documentType;
    private final @Nullable String documentVersion;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;

    @OutputCustomType.Constructor({"arn","content","documentFormat","documentType","documentVersion","id","name"})
    private GetDocumentResult(
        String arn,
        String content,
        @Nullable String documentFormat,
        String documentType,
        @Nullable String documentVersion,
        String id,
        String name) {
        this.arn = Objects.requireNonNull(arn);
        this.content = Objects.requireNonNull(content);
        this.documentFormat = documentFormat;
        this.documentType = Objects.requireNonNull(documentType);
        this.documentVersion = documentVersion;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The ARN of the document.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The contents of the document.
     * 
     */
    public String getContent() {
        return this.content;
    }
    public Optional<String> getDocumentFormat() {
        return Optional.ofNullable(this.documentFormat);
    }
    /**
     * The type of the document.
     * 
     */
    public String getDocumentType() {
        return this.documentType;
    }
    public Optional<String> getDocumentVersion() {
        return Optional.ofNullable(this.documentVersion);
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDocumentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String content;
        private @Nullable String documentFormat;
        private String documentType;
        private @Nullable String documentVersion;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDocumentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.content = defaults.content;
    	      this.documentFormat = defaults.documentFormat;
    	      this.documentType = defaults.documentType;
    	      this.documentVersion = defaults.documentVersion;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setDocumentFormat(@Nullable String documentFormat) {
            this.documentFormat = documentFormat;
            return this;
        }

        public Builder setDocumentType(String documentType) {
            this.documentType = Objects.requireNonNull(documentType);
            return this;
        }

        public Builder setDocumentVersion(@Nullable String documentVersion) {
            this.documentVersion = documentVersion;
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
        public GetDocumentResult build() {
            return new GetDocumentResult(arn, content, documentFormat, documentType, documentVersion, id, name);
        }
    }
}