// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebServiceParameterResponse {
    /**
     * If the parameter value in 'value' field is encrypted, the thumbprint of the certificate should be put here.
     * 
     */
    private final @Nullable String certificateThumbprint;
    /**
     * The parameter value
     * 
     */
    private final @Nullable Object value;

    @OutputCustomType.Constructor({"certificateThumbprint","value"})
    private WebServiceParameterResponse(
        @Nullable String certificateThumbprint,
        @Nullable Object value) {
        this.certificateThumbprint = certificateThumbprint;
        this.value = value;
    }

    /**
     * If the parameter value in 'value' field is encrypted, the thumbprint of the certificate should be put here.
     * 
     */
    public Optional<String> getCertificateThumbprint() {
        return Optional.ofNullable(this.certificateThumbprint);
    }
    /**
     * The parameter value
     * 
     */
    public Optional<Object> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServiceParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateThumbprint;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServiceParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.value = defaults.value;
        }

        public Builder setCertificateThumbprint(@Nullable String certificateThumbprint) {
            this.certificateThumbprint = certificateThumbprint;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = value;
            return this;
        }

        public WebServiceParameterResponse build() {
            return new WebServiceParameterResponse(certificateThumbprint, value);
        }
    }
}
