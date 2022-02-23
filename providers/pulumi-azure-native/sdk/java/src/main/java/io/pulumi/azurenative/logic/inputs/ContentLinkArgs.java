// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The content link.
 * 
 */
public final class ContentLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentLinkArgs Empty = new ContentLinkArgs();

    /**
     * The content link URI.
     * 
     */
    @InputImport(name="uri")
        private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public ContentLinkArgs(@Nullable Input<String> uri) {
        this.uri = uri;
    }

    private ContentLinkArgs() {
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }
        public ContentLinkArgs build() {
            return new ContentLinkArgs(uri);
        }
    }
}
