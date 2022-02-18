// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Entity representing the reference to the deployment parameters.
 * 
 */
public final class ParametersLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ParametersLinkResponse Empty = new ParametersLinkResponse();

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
     * The URI of the parameters file.
     * 
     */
    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    public ParametersLinkResponse(
        @Nullable String contentVersion,
        String uri) {
        this.contentVersion = contentVersion;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private ParametersLinkResponse() {
        this.contentVersion = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParametersLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentVersion;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ParametersLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentVersion = defaults.contentVersion;
    	      this.uri = defaults.uri;
        }

        public Builder setContentVersion(@Nullable String contentVersion) {
            this.contentVersion = contentVersion;
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public ParametersLinkResponse build() {
            return new ParametersLinkResponse(contentVersion, uri);
        }
    }
}
