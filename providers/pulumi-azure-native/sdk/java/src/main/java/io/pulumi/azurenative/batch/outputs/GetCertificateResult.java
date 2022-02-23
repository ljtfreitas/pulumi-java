// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.DeleteCertificateErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCertificateResult {
    /**
     * This is only returned when the certificate provisioningState is 'Failed'.
     * 
     */
    private final DeleteCertificateErrorResponse deleteCertificateError;
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
     */
    private final String etag;
    /**
     * The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    private final @Nullable String format;
    /**
     * The ID of the resource.
     * 
     */
    private final String id;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The previous provisioned state of the resource
     * 
     */
    private final String previousProvisioningState;
    private final String previousProvisioningStateTransitionTime;
    private final String provisioningState;
    private final String provisioningStateTransitionTime;
    /**
     * The public key of the certificate.
     * 
     */
    private final String publicData;
    /**
     * This must match the thumbprint from the name.
     * 
     */
    private final @Nullable String thumbprint;
    /**
     * This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     * 
     */
    private final @Nullable String thumbprintAlgorithm;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"deleteCertificateError","etag","format","id","name","previousProvisioningState","previousProvisioningStateTransitionTime","provisioningState","provisioningStateTransitionTime","publicData","thumbprint","thumbprintAlgorithm","type"})
    private GetCertificateResult(
        DeleteCertificateErrorResponse deleteCertificateError,
        String etag,
        @Nullable String format,
        String id,
        String name,
        String previousProvisioningState,
        String previousProvisioningStateTransitionTime,
        String provisioningState,
        String provisioningStateTransitionTime,
        String publicData,
        @Nullable String thumbprint,
        @Nullable String thumbprintAlgorithm,
        String type) {
        this.deleteCertificateError = Objects.requireNonNull(deleteCertificateError);
        this.etag = Objects.requireNonNull(etag);
        this.format = format;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.previousProvisioningState = Objects.requireNonNull(previousProvisioningState);
        this.previousProvisioningStateTransitionTime = Objects.requireNonNull(previousProvisioningStateTransitionTime);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.provisioningStateTransitionTime = Objects.requireNonNull(provisioningStateTransitionTime);
        this.publicData = Objects.requireNonNull(publicData);
        this.thumbprint = thumbprint;
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * This is only returned when the certificate provisioningState is 'Failed'.
     * 
     */
    public DeleteCertificateErrorResponse getDeleteCertificateError() {
        return this.deleteCertificateError;
    }
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * The ID of the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The previous provisioned state of the resource
     * 
     */
    public String getPreviousProvisioningState() {
        return this.previousProvisioningState;
    }
    public String getPreviousProvisioningStateTransitionTime() {
        return this.previousProvisioningStateTransitionTime;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getProvisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }
    /**
     * The public key of the certificate.
     * 
     */
    public String getPublicData() {
        return this.publicData;
    }
    /**
     * This must match the thumbprint from the name.
     * 
     */
    public Optional<String> getThumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }
    /**
     * This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     * 
     */
    public Optional<String> getThumbprintAlgorithm() {
        return Optional.ofNullable(this.thumbprintAlgorithm);
    }
    /**
     * The type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeleteCertificateErrorResponse deleteCertificateError;
        private String etag;
        private @Nullable String format;
        private String id;
        private String name;
        private String previousProvisioningState;
        private String previousProvisioningStateTransitionTime;
        private String provisioningState;
        private String provisioningStateTransitionTime;
        private String publicData;
        private @Nullable String thumbprint;
        private @Nullable String thumbprintAlgorithm;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteCertificateError = defaults.deleteCertificateError;
    	      this.etag = defaults.etag;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.previousProvisioningState = defaults.previousProvisioningState;
    	      this.previousProvisioningStateTransitionTime = defaults.previousProvisioningStateTransitionTime;
    	      this.provisioningState = defaults.provisioningState;
    	      this.provisioningStateTransitionTime = defaults.provisioningStateTransitionTime;
    	      this.publicData = defaults.publicData;
    	      this.thumbprint = defaults.thumbprint;
    	      this.thumbprintAlgorithm = defaults.thumbprintAlgorithm;
    	      this.type = defaults.type;
        }

        public Builder setDeleteCertificateError(DeleteCertificateErrorResponse deleteCertificateError) {
            this.deleteCertificateError = Objects.requireNonNull(deleteCertificateError);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPreviousProvisioningState(String previousProvisioningState) {
            this.previousProvisioningState = Objects.requireNonNull(previousProvisioningState);
            return this;
        }

        public Builder setPreviousProvisioningStateTransitionTime(String previousProvisioningStateTransitionTime) {
            this.previousProvisioningStateTransitionTime = Objects.requireNonNull(previousProvisioningStateTransitionTime);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setProvisioningStateTransitionTime(String provisioningStateTransitionTime) {
            this.provisioningStateTransitionTime = Objects.requireNonNull(provisioningStateTransitionTime);
            return this;
        }

        public Builder setPublicData(String publicData) {
            this.publicData = Objects.requireNonNull(publicData);
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder setThumbprintAlgorithm(@Nullable String thumbprintAlgorithm) {
            this.thumbprintAlgorithm = thumbprintAlgorithm;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCertificateResult build() {
            return new GetCertificateResult(deleteCertificateError, etag, format, id, name, previousProvisioningState, previousProvisioningStateTransitionTime, provisioningState, provisioningStateTransitionTime, publicData, thumbprint, thumbprintAlgorithm, type);
        }
    }
}
