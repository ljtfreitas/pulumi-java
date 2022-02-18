// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A piece of evidence supporting the compliance state set in the attestation.
 * 
 */
public final class AttestationEvidenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttestationEvidenceResponse Empty = new AttestationEvidenceResponse();

    /**
     * The description for this piece of evidence.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The URI location of the evidence.
     * 
     */
    @InputImport(name="sourceUri")
    private final @Nullable String sourceUri;

    public Optional<String> getSourceUri() {
        return this.sourceUri == null ? Optional.empty() : Optional.ofNullable(this.sourceUri);
    }

    public AttestationEvidenceResponse(
        @Nullable String description,
        @Nullable String sourceUri) {
        this.description = description;
        this.sourceUri = sourceUri;
    }

    private AttestationEvidenceResponse() {
        this.description = null;
        this.sourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationEvidenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String sourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationEvidenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.sourceUri = defaults.sourceUri;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setSourceUri(@Nullable String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }

        public AttestationEvidenceResponse build() {
            return new AttestationEvidenceResponse(description, sourceUri);
        }
    }
}
