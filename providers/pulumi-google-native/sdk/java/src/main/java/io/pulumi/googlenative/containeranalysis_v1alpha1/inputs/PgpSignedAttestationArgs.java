// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.PgpSignedAttestationContentType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PgpSignedAttestationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PgpSignedAttestationArgs Empty = new PgpSignedAttestationArgs();

    @InputImport(name="contentType")
    private final @Nullable Input<PgpSignedAttestationContentType> contentType;

    public Input<PgpSignedAttestationContentType> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    @InputImport(name="pgpKeyId")
    private final @Nullable Input<String> pgpKeyId;

    public Input<String> getPgpKeyId() {
        return this.pgpKeyId == null ? Input.empty() : this.pgpKeyId;
    }

    @InputImport(name="signature")
    private final @Nullable Input<String> signature;

    public Input<String> getSignature() {
        return this.signature == null ? Input.empty() : this.signature;
    }

    public PgpSignedAttestationArgs(
        @Nullable Input<PgpSignedAttestationContentType> contentType,
        @Nullable Input<String> pgpKeyId,
        @Nullable Input<String> signature) {
        this.contentType = contentType;
        this.pgpKeyId = pgpKeyId;
        this.signature = signature;
    }

    private PgpSignedAttestationArgs() {
        this.contentType = Input.empty();
        this.pgpKeyId = Input.empty();
        this.signature = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PgpSignedAttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PgpSignedAttestationContentType> contentType;
        private @Nullable Input<String> pgpKeyId;
        private @Nullable Input<String> signature;

        public Builder() {
    	      // Empty
        }

        public Builder(PgpSignedAttestationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.pgpKeyId = defaults.pgpKeyId;
    	      this.signature = defaults.signature;
        }

        public Builder setContentType(@Nullable Input<PgpSignedAttestationContentType> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable PgpSignedAttestationContentType contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setPgpKeyId(@Nullable Input<String> pgpKeyId) {
            this.pgpKeyId = pgpKeyId;
            return this;
        }

        public Builder setPgpKeyId(@Nullable String pgpKeyId) {
            this.pgpKeyId = Input.ofNullable(pgpKeyId);
            return this;
        }

        public Builder setSignature(@Nullable Input<String> signature) {
            this.signature = signature;
            return this;
        }

        public Builder setSignature(@Nullable String signature) {
            this.signature = Input.ofNullable(signature);
            return this;
        }

        public PgpSignedAttestationArgs build() {
            return new PgpSignedAttestationArgs(contentType, pgpKeyId, signature);
        }
    }
}