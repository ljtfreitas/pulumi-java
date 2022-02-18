// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A piece of evidence supporting the compliance state set in the attestation.
 * 
 */
public final class AttestationEvidenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestationEvidenceArgs Empty = new AttestationEvidenceArgs();

    /**
     * The description for this piece of evidence.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The URI location of the evidence.
     * 
     */
    @InputImport(name="sourceUri")
    private final @Nullable Input<String> sourceUri;

    public Input<String> getSourceUri() {
        return this.sourceUri == null ? Input.empty() : this.sourceUri;
    }

    public AttestationEvidenceArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> sourceUri) {
        this.description = description;
        this.sourceUri = sourceUri;
    }

    private AttestationEvidenceArgs() {
        this.description = Input.empty();
        this.sourceUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationEvidenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> sourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationEvidenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.sourceUri = defaults.sourceUri;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setSourceUri(@Nullable Input<String> sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }

        public Builder setSourceUri(@Nullable String sourceUri) {
            this.sourceUri = Input.ofNullable(sourceUri);
            return this;
        }

        public AttestationEvidenceArgs build() {
            return new AttestationEvidenceArgs(description, sourceUri);
        }
    }
}
