// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1.inputs.EnvelopeResponse;
import io.pulumi.googlenative.containeranalysis_v1.inputs.InTotoStatementResponse;
import java.util.Objects;


/**
 * Deprecated. Prefer to use a regular Occurrence, and populate the Envelope at the top level of the Occurrence.
 * 
 */
public final class DSSEAttestationOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DSSEAttestationOccurrenceResponse Empty = new DSSEAttestationOccurrenceResponse();

    /**
     * If doing something security critical, make sure to verify the signatures in this metadata.
     * 
     */
    @Import(name="envelope", required=true)
      private final EnvelopeResponse envelope;

    public EnvelopeResponse getEnvelope() {
        return this.envelope;
    }

    @Import(name="statement", required=true)
      private final InTotoStatementResponse statement;

    public InTotoStatementResponse getStatement() {
        return this.statement;
    }

    public DSSEAttestationOccurrenceResponse(
        EnvelopeResponse envelope,
        InTotoStatementResponse statement) {
        this.envelope = Objects.requireNonNull(envelope, "expected parameter 'envelope' to be non-null");
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
    }

    private DSSEAttestationOccurrenceResponse() {
        this.envelope = null;
        this.statement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvelopeResponse envelope;
        private InTotoStatementResponse statement;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEAttestationOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envelope = defaults.envelope;
    	      this.statement = defaults.statement;
        }

        public Builder envelope(EnvelopeResponse envelope) {
            this.envelope = Objects.requireNonNull(envelope);
            return this;
        }

        public Builder statement(InTotoStatementResponse statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public DSSEAttestationOccurrenceResponse build() {
            return new DSSEAttestationOccurrenceResponse(envelope, statement);
        }
    }
}
