// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed identity settings for upstream.
 * 
 */
public final class ManagedIdentitySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedIdentitySettingsResponse Empty = new ManagedIdentitySettingsResponse();

    /**
     * The Resource indicating the App ID URI of the target resource.
     * It also appears in the aud (audience) claim of the issued token.
     * 
     */
    @InputImport(name="resource")
    private final @Nullable String resource;

    public Optional<String> getResource() {
        return this.resource == null ? Optional.empty() : Optional.ofNullable(this.resource);
    }

    public ManagedIdentitySettingsResponse(@Nullable String resource) {
        this.resource = resource;
    }

    private ManagedIdentitySettingsResponse() {
        this.resource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentitySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentitySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }

        public ManagedIdentitySettingsResponse build() {
            return new ManagedIdentitySettingsResponse(resource);
        }
    }
}
