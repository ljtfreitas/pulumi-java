// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.X12OneWayAgreementResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The X12 agreement content.
 * 
 */
public final class X12AgreementContentResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12AgreementContentResponse Empty = new X12AgreementContentResponse();

    /**
     * The X12 one-way receive agreement.
     * 
     */
    @InputImport(name="receiveAgreement", required=true)
        private final X12OneWayAgreementResponse receiveAgreement;

    public X12OneWayAgreementResponse getReceiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * The X12 one-way send agreement.
     * 
     */
    @InputImport(name="sendAgreement", required=true)
        private final X12OneWayAgreementResponse sendAgreement;

    public X12OneWayAgreementResponse getSendAgreement() {
        return this.sendAgreement;
    }

    public X12AgreementContentResponse(
        X12OneWayAgreementResponse receiveAgreement,
        X12OneWayAgreementResponse sendAgreement) {
        this.receiveAgreement = Objects.requireNonNull(receiveAgreement, "expected parameter 'receiveAgreement' to be non-null");
        this.sendAgreement = Objects.requireNonNull(sendAgreement, "expected parameter 'sendAgreement' to be non-null");
    }

    private X12AgreementContentResponse() {
        this.receiveAgreement = null;
        this.sendAgreement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12AgreementContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12OneWayAgreementResponse receiveAgreement;
        private X12OneWayAgreementResponse sendAgreement;

        public Builder() {
    	      // Empty
        }

        public Builder(X12AgreementContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiveAgreement = defaults.receiveAgreement;
    	      this.sendAgreement = defaults.sendAgreement;
        }

        public Builder setReceiveAgreement(X12OneWayAgreementResponse receiveAgreement) {
            this.receiveAgreement = Objects.requireNonNull(receiveAgreement);
            return this;
        }

        public Builder setSendAgreement(X12OneWayAgreementResponse sendAgreement) {
            this.sendAgreement = Objects.requireNonNull(sendAgreement);
            return this;
        }
        public X12AgreementContentResponse build() {
            return new X12AgreementContentResponse(receiveAgreement, sendAgreement);
        }
    }
}
