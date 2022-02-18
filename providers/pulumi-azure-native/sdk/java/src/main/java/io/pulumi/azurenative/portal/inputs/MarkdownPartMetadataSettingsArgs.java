// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.inputs.MarkdownPartMetadataContentArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Markdown part settings.
 * 
 */
public final class MarkdownPartMetadataSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MarkdownPartMetadataSettingsArgs Empty = new MarkdownPartMetadataSettingsArgs();

    /**
     * The content of markdown part.
     * 
     */
    @InputImport(name="content")
    private final @Nullable Input<MarkdownPartMetadataContentArgs> content;

    public Input<MarkdownPartMetadataContentArgs> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    public MarkdownPartMetadataSettingsArgs(@Nullable Input<MarkdownPartMetadataContentArgs> content) {
        this.content = content;
    }

    private MarkdownPartMetadataSettingsArgs() {
        this.content = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MarkdownPartMetadataContentArgs> content;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder setContent(@Nullable Input<MarkdownPartMetadataContentArgs> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable MarkdownPartMetadataContentArgs content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public MarkdownPartMetadataSettingsArgs build() {
            return new MarkdownPartMetadataSettingsArgs(content);
        }
    }
}
