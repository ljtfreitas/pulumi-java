// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.BusinessIdentityArgs;
import io.pulumi.azurenative.logic.inputs.EdifactProtocolSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The Edifact one way agreement.
 * 
 */
public final class EdifactOneWayAgreementArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactOneWayAgreementArgs Empty = new EdifactOneWayAgreementArgs();

    /**
     * The EDIFACT protocol settings.
     * 
     */
    @Import(name="protocolSettings", required=true)
      private final Output<EdifactProtocolSettingsArgs> protocolSettings;

    public Output<EdifactProtocolSettingsArgs> getProtocolSettings() {
        return this.protocolSettings;
    }

    /**
     * The receiver business identity
     * 
     */
    @Import(name="receiverBusinessIdentity", required=true)
      private final Output<BusinessIdentityArgs> receiverBusinessIdentity;

    public Output<BusinessIdentityArgs> getReceiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }

    /**
     * The sender business identity
     * 
     */
    @Import(name="senderBusinessIdentity", required=true)
      private final Output<BusinessIdentityArgs> senderBusinessIdentity;

    public Output<BusinessIdentityArgs> getSenderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    public EdifactOneWayAgreementArgs(
        Output<EdifactProtocolSettingsArgs> protocolSettings,
        Output<BusinessIdentityArgs> receiverBusinessIdentity,
        Output<BusinessIdentityArgs> senderBusinessIdentity) {
        this.protocolSettings = Objects.requireNonNull(protocolSettings, "expected parameter 'protocolSettings' to be non-null");
        this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity, "expected parameter 'receiverBusinessIdentity' to be non-null");
        this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity, "expected parameter 'senderBusinessIdentity' to be non-null");
    }

    private EdifactOneWayAgreementArgs() {
        this.protocolSettings = Output.empty();
        this.receiverBusinessIdentity = Output.empty();
        this.senderBusinessIdentity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactOneWayAgreementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<EdifactProtocolSettingsArgs> protocolSettings;
        private Output<BusinessIdentityArgs> receiverBusinessIdentity;
        private Output<BusinessIdentityArgs> senderBusinessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactOneWayAgreementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.receiverBusinessIdentity = defaults.receiverBusinessIdentity;
    	      this.senderBusinessIdentity = defaults.senderBusinessIdentity;
        }

        public Builder protocolSettings(Output<EdifactProtocolSettingsArgs> protocolSettings) {
            this.protocolSettings = Objects.requireNonNull(protocolSettings);
            return this;
        }

        public Builder protocolSettings(EdifactProtocolSettingsArgs protocolSettings) {
            this.protocolSettings = Output.of(Objects.requireNonNull(protocolSettings));
            return this;
        }

        public Builder receiverBusinessIdentity(Output<BusinessIdentityArgs> receiverBusinessIdentity) {
            this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
            return this;
        }

        public Builder receiverBusinessIdentity(BusinessIdentityArgs receiverBusinessIdentity) {
            this.receiverBusinessIdentity = Output.of(Objects.requireNonNull(receiverBusinessIdentity));
            return this;
        }

        public Builder senderBusinessIdentity(Output<BusinessIdentityArgs> senderBusinessIdentity) {
            this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
            return this;
        }

        public Builder senderBusinessIdentity(BusinessIdentityArgs senderBusinessIdentity) {
            this.senderBusinessIdentity = Output.of(Objects.requireNonNull(senderBusinessIdentity));
            return this;
        }
        public EdifactOneWayAgreementArgs build() {
            return new EdifactOneWayAgreementArgs(protocolSettings, receiverBusinessIdentity, senderBusinessIdentity);
        }
    }
}
