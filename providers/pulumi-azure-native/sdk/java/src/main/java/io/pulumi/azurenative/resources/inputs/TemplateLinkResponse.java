// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Entity representing the reference to the template.
 * 
 */
public final class TemplateLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final TemplateLinkResponse Empty = new TemplateLinkResponse();

    /**
     * If included, must match the ContentVersion in the template.
     * 
     */
    @InputImport(name="contentVersion")
        private final @Nullable String contentVersion;

    public Optional<String> getContentVersion() {
        return this.contentVersion == null ? Optional.empty() : Optional.ofNullable(this.contentVersion);
    }

    /**
     * The resource id of a Template Spec. Use either the id or uri property, but not both.
     * 
     */
    @InputImport(name="id")
        private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The query string (for example, a SAS token) to be used with the templateLink URI.
     * 
     */
    @InputImport(name="queryString")
        private final @Nullable String queryString;

    public Optional<String> getQueryString() {
        return this.queryString == null ? Optional.empty() : Optional.ofNullable(this.queryString);
    }

    /**
     * The relativePath property can be used to deploy a linked template at a location relative to the parent. If the parent template was linked with a TemplateSpec, this will reference an artifact in the TemplateSpec.  If the parent was linked with a URI, the child deployment will be a combination of the parent and relativePath URIs
     * 
     */
    @InputImport(name="relativePath")
        private final @Nullable String relativePath;

    public Optional<String> getRelativePath() {
        return this.relativePath == null ? Optional.empty() : Optional.ofNullable(this.relativePath);
    }

    /**
     * The URI of the template to deploy. Use either the uri or id property, but not both.
     * 
     */
    @InputImport(name="uri")
        private final @Nullable String uri;

    public Optional<String> getUri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    public TemplateLinkResponse(
        @Nullable String contentVersion,
        @Nullable String id,
        @Nullable String queryString,
        @Nullable String relativePath,
        @Nullable String uri) {
        this.contentVersion = contentVersion;
        this.id = id;
        this.queryString = queryString;
        this.relativePath = relativePath;
        this.uri = uri;
    }

    private TemplateLinkResponse() {
        this.contentVersion = null;
        this.id = null;
        this.queryString = null;
        this.relativePath = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentVersion;
        private @Nullable String id;
        private @Nullable String queryString;
        private @Nullable String relativePath;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentVersion = defaults.contentVersion;
    	      this.id = defaults.id;
    	      this.queryString = defaults.queryString;
    	      this.relativePath = defaults.relativePath;
    	      this.uri = defaults.uri;
        }

        public Builder setContentVersion(@Nullable String contentVersion) {
            this.contentVersion = contentVersion;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setQueryString(@Nullable String queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setRelativePath(@Nullable String relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public TemplateLinkResponse build() {
            return new TemplateLinkResponse(contentVersion, id, queryString, relativePath, uri);
        }
    }
}
