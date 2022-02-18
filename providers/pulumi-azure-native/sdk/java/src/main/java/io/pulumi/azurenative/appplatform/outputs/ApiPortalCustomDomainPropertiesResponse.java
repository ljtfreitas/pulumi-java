// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiPortalCustomDomainPropertiesResponse {
    /**
     * The thumbprint of bound certificate.
     * 
     */
    private final @Nullable String thumbprint;

    @OutputCustomType.Constructor({"thumbprint"})
    private ApiPortalCustomDomainPropertiesResponse(@Nullable String thumbprint) {
        this.thumbprint = thumbprint;
    }

    /**
     * The thumbprint of bound certificate.
     * 
     */
    public Optional<String> getThumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPortalCustomDomainPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPortalCustomDomainPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public ApiPortalCustomDomainPropertiesResponse build() {
            return new ApiPortalCustomDomainPropertiesResponse(thumbprint);
        }
    }
}
