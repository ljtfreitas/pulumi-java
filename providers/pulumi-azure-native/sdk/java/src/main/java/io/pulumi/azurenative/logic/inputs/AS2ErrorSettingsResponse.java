// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The AS2 agreement error settings.
 * 
 */
public final class AS2ErrorSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AS2ErrorSettingsResponse Empty = new AS2ErrorSettingsResponse();

    /**
     * The value indicating whether to resend message If MDN is not received.
     * 
     */
    @InputImport(name="resendIfMDNNotReceived", required=true)
        private final Boolean resendIfMDNNotReceived;

    public Boolean getResendIfMDNNotReceived() {
        return this.resendIfMDNNotReceived;
    }

    /**
     * The value indicating whether to suspend duplicate message.
     * 
     */
    @InputImport(name="suspendDuplicateMessage", required=true)
        private final Boolean suspendDuplicateMessage;

    public Boolean getSuspendDuplicateMessage() {
        return this.suspendDuplicateMessage;
    }

    public AS2ErrorSettingsResponse(
        Boolean resendIfMDNNotReceived,
        Boolean suspendDuplicateMessage) {
        this.resendIfMDNNotReceived = Objects.requireNonNull(resendIfMDNNotReceived, "expected parameter 'resendIfMDNNotReceived' to be non-null");
        this.suspendDuplicateMessage = Objects.requireNonNull(suspendDuplicateMessage, "expected parameter 'suspendDuplicateMessage' to be non-null");
    }

    private AS2ErrorSettingsResponse() {
        this.resendIfMDNNotReceived = null;
        this.suspendDuplicateMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2ErrorSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean resendIfMDNNotReceived;
        private Boolean suspendDuplicateMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2ErrorSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resendIfMDNNotReceived = defaults.resendIfMDNNotReceived;
    	      this.suspendDuplicateMessage = defaults.suspendDuplicateMessage;
        }

        public Builder setResendIfMDNNotReceived(Boolean resendIfMDNNotReceived) {
            this.resendIfMDNNotReceived = Objects.requireNonNull(resendIfMDNNotReceived);
            return this;
        }

        public Builder setSuspendDuplicateMessage(Boolean suspendDuplicateMessage) {
            this.suspendDuplicateMessage = Objects.requireNonNull(suspendDuplicateMessage);
            return this;
        }
        public AS2ErrorSettingsResponse build() {
            return new AS2ErrorSettingsResponse(resendIfMDNNotReceived, suspendDuplicateMessage);
        }
    }
}
