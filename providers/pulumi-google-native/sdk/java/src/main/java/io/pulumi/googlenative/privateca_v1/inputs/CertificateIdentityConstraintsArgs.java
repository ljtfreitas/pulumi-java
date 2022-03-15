// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.privateca_v1.inputs.ExprArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes constraints on a Certificate's Subject and SubjectAltNames.
 * 
 */
public final class CertificateIdentityConstraintsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateIdentityConstraintsArgs Empty = new CertificateIdentityConstraintsArgs();

    /**
     * If this is true, the SubjectAltNames extension may be copied from a certificate request into the signed certificate. Otherwise, the requested SubjectAltNames will be discarded.
     * 
     */
    @Import(name="allowSubjectAltNamesPassthrough", required=true)
      private final Output<Boolean> allowSubjectAltNamesPassthrough;

    public Output<Boolean> getAllowSubjectAltNamesPassthrough() {
        return this.allowSubjectAltNamesPassthrough;
    }

    /**
     * If this is true, the Subject field may be copied from a certificate request into the signed certificate. Otherwise, the requested Subject will be discarded.
     * 
     */
    @Import(name="allowSubjectPassthrough", required=true)
      private final Output<Boolean> allowSubjectPassthrough;

    public Output<Boolean> getAllowSubjectPassthrough() {
        return this.allowSubjectPassthrough;
    }

    /**
     * Optional. A CEL expression that may be used to validate the resolved X.509 Subject and/or Subject Alternative Name before a certificate is signed. To see the full allowed syntax and some examples, see https://cloud.google.com/certificate-authority-service/docs/using-cel
     * 
     */
    @Import(name="celExpression")
      private final @Nullable Output<ExprArgs> celExpression;

    public Output<ExprArgs> getCelExpression() {
        return this.celExpression == null ? Output.empty() : this.celExpression;
    }

    public CertificateIdentityConstraintsArgs(
        Output<Boolean> allowSubjectAltNamesPassthrough,
        Output<Boolean> allowSubjectPassthrough,
        @Nullable Output<ExprArgs> celExpression) {
        this.allowSubjectAltNamesPassthrough = Objects.requireNonNull(allowSubjectAltNamesPassthrough, "expected parameter 'allowSubjectAltNamesPassthrough' to be non-null");
        this.allowSubjectPassthrough = Objects.requireNonNull(allowSubjectPassthrough, "expected parameter 'allowSubjectPassthrough' to be non-null");
        this.celExpression = celExpression;
    }

    private CertificateIdentityConstraintsArgs() {
        this.allowSubjectAltNamesPassthrough = Output.empty();
        this.allowSubjectPassthrough = Output.empty();
        this.celExpression = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateIdentityConstraintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> allowSubjectAltNamesPassthrough;
        private Output<Boolean> allowSubjectPassthrough;
        private @Nullable Output<ExprArgs> celExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateIdentityConstraintsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSubjectAltNamesPassthrough = defaults.allowSubjectAltNamesPassthrough;
    	      this.allowSubjectPassthrough = defaults.allowSubjectPassthrough;
    	      this.celExpression = defaults.celExpression;
        }

        public Builder allowSubjectAltNamesPassthrough(Output<Boolean> allowSubjectAltNamesPassthrough) {
            this.allowSubjectAltNamesPassthrough = Objects.requireNonNull(allowSubjectAltNamesPassthrough);
            return this;
        }

        public Builder allowSubjectAltNamesPassthrough(Boolean allowSubjectAltNamesPassthrough) {
            this.allowSubjectAltNamesPassthrough = Output.of(Objects.requireNonNull(allowSubjectAltNamesPassthrough));
            return this;
        }

        public Builder allowSubjectPassthrough(Output<Boolean> allowSubjectPassthrough) {
            this.allowSubjectPassthrough = Objects.requireNonNull(allowSubjectPassthrough);
            return this;
        }

        public Builder allowSubjectPassthrough(Boolean allowSubjectPassthrough) {
            this.allowSubjectPassthrough = Output.of(Objects.requireNonNull(allowSubjectPassthrough));
            return this;
        }

        public Builder celExpression(@Nullable Output<ExprArgs> celExpression) {
            this.celExpression = celExpression;
            return this;
        }

        public Builder celExpression(@Nullable ExprArgs celExpression) {
            this.celExpression = Output.ofNullable(celExpression);
            return this;
        }
        public CertificateIdentityConstraintsArgs build() {
            return new CertificateIdentityConstraintsArgs(allowSubjectAltNamesPassthrough, allowSubjectPassthrough, celExpression);
        }
    }
}
