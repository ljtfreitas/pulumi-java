// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Entity representing the reference to the deployment parameters.
 * 
 */
public final class ParametersLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParametersLinkArgs Empty = new ParametersLinkArgs();

    /**
     * If included, must match the ContentVersion in the template.
     * 
     */
    @InputImport(name="contentVersion")
    private final @Nullable Input<String> contentVersion;

    public Input<String> getContentVersion() {
        return this.contentVersion == null ? Input.empty() : this.contentVersion;
    }

    /**
     * The URI of the parameters file.
     * 
     */
    @InputImport(name="uri", required=true)
    private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public ParametersLinkArgs(
        @Nullable Input<String> contentVersion,
        Input<String> uri) {
        this.contentVersion = contentVersion;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private ParametersLinkArgs() {
        this.contentVersion = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParametersLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contentVersion;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ParametersLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentVersion = defaults.contentVersion;
    	      this.uri = defaults.uri;
        }

        public Builder setContentVersion(@Nullable Input<String> contentVersion) {
            this.contentVersion = contentVersion;
            return this;
        }

        public Builder setContentVersion(@Nullable String contentVersion) {
            this.contentVersion = Input.ofNullable(contentVersion);
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public ParametersLinkArgs build() {
            return new ParametersLinkArgs(contentVersion, uri);
        }
    }
}
