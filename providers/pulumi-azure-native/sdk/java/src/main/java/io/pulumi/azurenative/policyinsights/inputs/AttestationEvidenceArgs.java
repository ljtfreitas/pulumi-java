// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The URI location of the evidence.
     * 
     */
    @Import(name="sourceUri")
      private final @Nullable Output<String> sourceUri;

    public Output<String> getSourceUri() {
        return this.sourceUri == null ? Output.empty() : this.sourceUri;
    }

    public AttestationEvidenceArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> sourceUri) {
        this.description = description;
        this.sourceUri = sourceUri;
    }

    private AttestationEvidenceArgs() {
        this.description = Output.empty();
        this.sourceUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationEvidenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> sourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationEvidenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.sourceUri = defaults.sourceUri;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder sourceUri(@Nullable Output<String> sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }

        public Builder sourceUri(@Nullable String sourceUri) {
            this.sourceUri = Output.ofNullable(sourceUri);
            return this;
        }
        public AttestationEvidenceArgs build() {
            return new AttestationEvidenceArgs(description, sourceUri);
        }
    }
}
