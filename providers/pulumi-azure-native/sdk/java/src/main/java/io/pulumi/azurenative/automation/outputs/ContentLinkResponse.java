// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.ContentHashResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentLinkResponse {
    /**
     * Gets or sets the hash.
     * 
     */
    private final @Nullable ContentHashResponse contentHash;
    /**
     * Gets or sets the uri of the runbook content.
     * 
     */
    private final @Nullable String uri;
    /**
     * Gets or sets the version of the content.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"contentHash","uri","version"})
    private ContentLinkResponse(
        @Nullable ContentHashResponse contentHash,
        @Nullable String uri,
        @Nullable String version) {
        this.contentHash = contentHash;
        this.uri = uri;
        this.version = version;
    }

    /**
     * Gets or sets the hash.
     * 
     */
    public Optional<ContentHashResponse> getContentHash() {
        return Optional.ofNullable(this.contentHash);
    }
    /**
     * Gets or sets the uri of the runbook content.
     * 
     */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }
    /**
     * Gets or sets the version of the content.
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContentHashResponse contentHash;
        private @Nullable String uri;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHash = defaults.contentHash;
    	      this.uri = defaults.uri;
    	      this.version = defaults.version;
        }

        public Builder setContentHash(@Nullable ContentHashResponse contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ContentLinkResponse build() {
            return new ContentLinkResponse(contentHash, uri, version);
        }
    }
}
