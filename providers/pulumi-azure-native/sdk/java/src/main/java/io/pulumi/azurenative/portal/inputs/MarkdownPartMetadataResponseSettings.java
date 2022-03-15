// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.inputs.MarkdownPartMetadataResponseContent;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Markdown part settings.
 * 
 */
public final class MarkdownPartMetadataResponseSettings extends io.pulumi.resources.InvokeArgs {

    public static final MarkdownPartMetadataResponseSettings Empty = new MarkdownPartMetadataResponseSettings();

    /**
     * The content of markdown part.
     * 
     */
    @Import(name="content")
      private final @Nullable MarkdownPartMetadataResponseContent content;

    public Optional<MarkdownPartMetadataResponseContent> getContent() {
        return this.content == null ? Optional.empty() : Optional.ofNullable(this.content);
    }

    public MarkdownPartMetadataResponseSettings(@Nullable MarkdownPartMetadataResponseContent content) {
        this.content = content;
    }

    private MarkdownPartMetadataResponseSettings() {
        this.content = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataResponseSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MarkdownPartMetadataResponseContent content;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataResponseSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder content(@Nullable MarkdownPartMetadataResponseContent content) {
            this.content = content;
            return this;
        }
        public MarkdownPartMetadataResponseSettings build() {
            return new MarkdownPartMetadataResponseSettings(content);
        }
    }
}
