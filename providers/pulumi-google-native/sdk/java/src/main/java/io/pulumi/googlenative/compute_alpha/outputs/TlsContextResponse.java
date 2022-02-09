// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.TlsCertificateContextResponse;
import io.pulumi.googlenative.compute_alpha.outputs.TlsValidationContextResponse;
import java.util.Objects;

@OutputCustomType
public final class TlsContextResponse {
    private final TlsCertificateContextResponse certificateContext;
    private final TlsValidationContextResponse validationContext;

    @OutputCustomType.Constructor({"certificateContext","validationContext"})
    private TlsContextResponse(
        TlsCertificateContextResponse certificateContext,
        TlsValidationContextResponse validationContext) {
        this.certificateContext = Objects.requireNonNull(certificateContext);
        this.validationContext = Objects.requireNonNull(validationContext);
    }

    public TlsCertificateContextResponse getCertificateContext() {
        return this.certificateContext;
    }
    public TlsValidationContextResponse getValidationContext() {
        return this.validationContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsCertificateContextResponse certificateContext;
        private TlsValidationContextResponse validationContext;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateContext = defaults.certificateContext;
    	      this.validationContext = defaults.validationContext;
        }

        public Builder setCertificateContext(TlsCertificateContextResponse certificateContext) {
            this.certificateContext = Objects.requireNonNull(certificateContext);
            return this;
        }

        public Builder setValidationContext(TlsValidationContextResponse validationContext) {
            this.validationContext = Objects.requireNonNull(validationContext);
            return this;
        }

        public TlsContextResponse build() {
            return new TlsContextResponse(certificateContext, validationContext);
        }
    }
}