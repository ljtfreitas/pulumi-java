// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.ContentLinkArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The assembly properties definition.
 * 
 */
public final class AssemblyPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssemblyPropertiesArgs Empty = new AssemblyPropertiesArgs();

    /**
     * The assembly culture.
     * 
     */
    @Import(name="assemblyCulture")
      private final @Nullable Output<String> assemblyCulture;

    public Output<String> getAssemblyCulture() {
        return this.assemblyCulture == null ? Output.empty() : this.assemblyCulture;
    }

    /**
     * The assembly name.
     * 
     */
    @Import(name="assemblyName", required=true)
      private final Output<String> assemblyName;

    public Output<String> getAssemblyName() {
        return this.assemblyName;
    }

    /**
     * The assembly public key token.
     * 
     */
    @Import(name="assemblyPublicKeyToken")
      private final @Nullable Output<String> assemblyPublicKeyToken;

    public Output<String> getAssemblyPublicKeyToken() {
        return this.assemblyPublicKeyToken == null ? Output.empty() : this.assemblyPublicKeyToken;
    }

    /**
     * The assembly version.
     * 
     */
    @Import(name="assemblyVersion")
      private final @Nullable Output<String> assemblyVersion;

    public Output<String> getAssemblyVersion() {
        return this.assemblyVersion == null ? Output.empty() : this.assemblyVersion;
    }

    /**
     * The artifact changed time.
     * 
     */
    @Import(name="changedTime")
      private final @Nullable Output<String> changedTime;

    public Output<String> getChangedTime() {
        return this.changedTime == null ? Output.empty() : this.changedTime;
    }

    @Import(name="content")
      private final @Nullable Output<Object> content;

    public Output<Object> getContent() {
        return this.content == null ? Output.empty() : this.content;
    }

    /**
     * The content link.
     * 
     */
    @Import(name="contentLink")
      private final @Nullable Output<ContentLinkArgs> contentLink;

    public Output<ContentLinkArgs> getContentLink() {
        return this.contentLink == null ? Output.empty() : this.contentLink;
    }

    /**
     * The content type.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Output.empty() : this.contentType;
    }

    /**
     * The artifact creation time.
     * 
     */
    @Import(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime == null ? Output.empty() : this.createdTime;
    }

    @Import(name="metadata")
      private final @Nullable Output<Object> metadata;

    public Output<Object> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    public AssemblyPropertiesArgs(
        @Nullable Output<String> assemblyCulture,
        Output<String> assemblyName,
        @Nullable Output<String> assemblyPublicKeyToken,
        @Nullable Output<String> assemblyVersion,
        @Nullable Output<String> changedTime,
        @Nullable Output<Object> content,
        @Nullable Output<ContentLinkArgs> contentLink,
        @Nullable Output<String> contentType,
        @Nullable Output<String> createdTime,
        @Nullable Output<Object> metadata) {
        this.assemblyCulture = assemblyCulture;
        this.assemblyName = Objects.requireNonNull(assemblyName, "expected parameter 'assemblyName' to be non-null");
        this.assemblyPublicKeyToken = assemblyPublicKeyToken;
        this.assemblyVersion = assemblyVersion;
        this.changedTime = changedTime;
        this.content = content;
        this.contentLink = contentLink;
        this.contentType = contentType;
        this.createdTime = createdTime;
        this.metadata = metadata;
    }

    private AssemblyPropertiesArgs() {
        this.assemblyCulture = Output.empty();
        this.assemblyName = Output.empty();
        this.assemblyPublicKeyToken = Output.empty();
        this.assemblyVersion = Output.empty();
        this.changedTime = Output.empty();
        this.content = Output.empty();
        this.contentLink = Output.empty();
        this.contentType = Output.empty();
        this.createdTime = Output.empty();
        this.metadata = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssemblyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> assemblyCulture;
        private Output<String> assemblyName;
        private @Nullable Output<String> assemblyPublicKeyToken;
        private @Nullable Output<String> assemblyVersion;
        private @Nullable Output<String> changedTime;
        private @Nullable Output<Object> content;
        private @Nullable Output<ContentLinkArgs> contentLink;
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> createdTime;
        private @Nullable Output<Object> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(AssemblyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assemblyCulture = defaults.assemblyCulture;
    	      this.assemblyName = defaults.assemblyName;
    	      this.assemblyPublicKeyToken = defaults.assemblyPublicKeyToken;
    	      this.assemblyVersion = defaults.assemblyVersion;
    	      this.changedTime = defaults.changedTime;
    	      this.content = defaults.content;
    	      this.contentLink = defaults.contentLink;
    	      this.contentType = defaults.contentType;
    	      this.createdTime = defaults.createdTime;
    	      this.metadata = defaults.metadata;
        }

        public Builder assemblyCulture(@Nullable Output<String> assemblyCulture) {
            this.assemblyCulture = assemblyCulture;
            return this;
        }

        public Builder assemblyCulture(@Nullable String assemblyCulture) {
            this.assemblyCulture = Output.ofNullable(assemblyCulture);
            return this;
        }

        public Builder assemblyName(Output<String> assemblyName) {
            this.assemblyName = Objects.requireNonNull(assemblyName);
            return this;
        }

        public Builder assemblyName(String assemblyName) {
            this.assemblyName = Output.of(Objects.requireNonNull(assemblyName));
            return this;
        }

        public Builder assemblyPublicKeyToken(@Nullable Output<String> assemblyPublicKeyToken) {
            this.assemblyPublicKeyToken = assemblyPublicKeyToken;
            return this;
        }

        public Builder assemblyPublicKeyToken(@Nullable String assemblyPublicKeyToken) {
            this.assemblyPublicKeyToken = Output.ofNullable(assemblyPublicKeyToken);
            return this;
        }

        public Builder assemblyVersion(@Nullable Output<String> assemblyVersion) {
            this.assemblyVersion = assemblyVersion;
            return this;
        }

        public Builder assemblyVersion(@Nullable String assemblyVersion) {
            this.assemblyVersion = Output.ofNullable(assemblyVersion);
            return this;
        }

        public Builder changedTime(@Nullable Output<String> changedTime) {
            this.changedTime = changedTime;
            return this;
        }

        public Builder changedTime(@Nullable String changedTime) {
            this.changedTime = Output.ofNullable(changedTime);
            return this;
        }

        public Builder content(@Nullable Output<Object> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable Object content) {
            this.content = Output.ofNullable(content);
            return this;
        }

        public Builder contentLink(@Nullable Output<ContentLinkArgs> contentLink) {
            this.contentLink = contentLink;
            return this;
        }

        public Builder contentLink(@Nullable ContentLinkArgs contentLink) {
            this.contentLink = Output.ofNullable(contentLink);
            return this;
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = Output.ofNullable(contentType);
            return this;
        }

        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Output.ofNullable(createdTime);
            return this;
        }

        public Builder metadata(@Nullable Output<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Object metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public AssemblyPropertiesArgs build() {
            return new AssemblyPropertiesArgs(assemblyCulture, assemblyName, assemblyPublicKeyToken, assemblyVersion, changedTime, content, contentLink, contentType, createdTime, metadata);
        }
    }
}
