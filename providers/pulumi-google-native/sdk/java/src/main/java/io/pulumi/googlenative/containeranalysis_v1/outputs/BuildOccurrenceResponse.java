// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.BuildProvenanceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.InTotoStatementResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BuildOccurrenceResponse {
    /**
     * In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence's envelope.
     * 
     */
    private final InTotoStatementResponse intotoStatement;
    /**
     * The actual provenance for the build.
     * 
     */
    private final BuildProvenanceResponse provenance;
    /**
     * Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    private final String provenanceBytes;

    @CustomType.Constructor
    private BuildOccurrenceResponse(
        @CustomType.Parameter("intotoStatement") InTotoStatementResponse intotoStatement,
        @CustomType.Parameter("provenance") BuildProvenanceResponse provenance,
        @CustomType.Parameter("provenanceBytes") String provenanceBytes) {
        this.intotoStatement = intotoStatement;
        this.provenance = provenance;
        this.provenanceBytes = provenanceBytes;
    }

    /**
     * In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence's envelope.
     * 
    */
    public InTotoStatementResponse getIntotoStatement() {
        return this.intotoStatement;
    }
    /**
     * The actual provenance for the build.
     * 
    */
    public BuildProvenanceResponse getProvenance() {
        return this.provenance;
    }
    /**
     * Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
    */
    public String getProvenanceBytes() {
        return this.provenanceBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InTotoStatementResponse intotoStatement;
        private BuildProvenanceResponse provenance;
        private String provenanceBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intotoStatement = defaults.intotoStatement;
    	      this.provenance = defaults.provenance;
    	      this.provenanceBytes = defaults.provenanceBytes;
        }

        public Builder intotoStatement(InTotoStatementResponse intotoStatement) {
            this.intotoStatement = Objects.requireNonNull(intotoStatement);
            return this;
        }

        public Builder provenance(BuildProvenanceResponse provenance) {
            this.provenance = Objects.requireNonNull(provenance);
            return this;
        }

        public Builder provenanceBytes(String provenanceBytes) {
            this.provenanceBytes = Objects.requireNonNull(provenanceBytes);
            return this;
        }
        public BuildOccurrenceResponse build() {
            return new BuildOccurrenceResponse(intotoStatement, provenance, provenanceBytes);
        }
    }
}
