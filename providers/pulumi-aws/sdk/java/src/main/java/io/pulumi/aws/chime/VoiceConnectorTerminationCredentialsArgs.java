// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VoiceConnectorTerminationCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorTerminationCredentialsArgs Empty = new VoiceConnectorTerminationCredentialsArgs();

    /**
     * List of termination SIP credentials.
     * 
     */
    @Import(name="credentials", required=true)
      private final Output<List<VoiceConnectorTerminationCredentialsCredentialArgs>> credentials;

    public Output<List<VoiceConnectorTerminationCredentialsCredentialArgs>> getCredentials() {
        return this.credentials;
    }

    /**
     * Amazon Chime Voice Connector ID.
     * 
     */
    @Import(name="voiceConnectorId", required=true)
      private final Output<String> voiceConnectorId;

    public Output<String> getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    public VoiceConnectorTerminationCredentialsArgs(
        Output<List<VoiceConnectorTerminationCredentialsCredentialArgs>> credentials,
        Output<String> voiceConnectorId) {
        this.credentials = Objects.requireNonNull(credentials, "expected parameter 'credentials' to be non-null");
        this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId, "expected parameter 'voiceConnectorId' to be non-null");
    }

    private VoiceConnectorTerminationCredentialsArgs() {
        this.credentials = Output.empty();
        this.voiceConnectorId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorTerminationCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<VoiceConnectorTerminationCredentialsCredentialArgs>> credentials;
        private Output<String> voiceConnectorId;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorTerminationCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.voiceConnectorId = defaults.voiceConnectorId;
        }

        public Builder credentials(Output<List<VoiceConnectorTerminationCredentialsCredentialArgs>> credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }

        public Builder credentials(List<VoiceConnectorTerminationCredentialsCredentialArgs> credentials) {
            this.credentials = Output.of(Objects.requireNonNull(credentials));
            return this;
        }

        public Builder voiceConnectorId(Output<String> voiceConnectorId) {
            this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId);
            return this;
        }

        public Builder voiceConnectorId(String voiceConnectorId) {
            this.voiceConnectorId = Output.of(Objects.requireNonNull(voiceConnectorId));
            return this;
        }
        public VoiceConnectorTerminationCredentialsArgs build() {
            return new VoiceConnectorTerminationCredentialsArgs(credentials, voiceConnectorId);
        }
    }
}
