// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VoiceConnectorState extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorState Empty = new VoiceConnectorState();

    /**
     * The AWS Region in which the Amazon Chime Voice Connector is created. Default value: `us-east-1`
     * 
     */
    @InputImport(name="awsRegion")
    private final @Nullable Input<String> awsRegion;

    public Input<String> getAwsRegion() {
        return this.awsRegion == null ? Input.empty() : this.awsRegion;
    }

    /**
     * The name of the Amazon Chime Voice Connector.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The outbound host name for the Amazon Chime Voice Connector.
     * 
     */
    @InputImport(name="outboundHostName")
    private final @Nullable Input<String> outboundHostName;

    public Input<String> getOutboundHostName() {
        return this.outboundHostName == null ? Input.empty() : this.outboundHostName;
    }

    /**
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * 
     */
    @InputImport(name="requireEncryption")
    private final @Nullable Input<Boolean> requireEncryption;

    public Input<Boolean> getRequireEncryption() {
        return this.requireEncryption == null ? Input.empty() : this.requireEncryption;
    }

    public VoiceConnectorState(
        @Nullable Input<String> awsRegion,
        @Nullable Input<String> name,
        @Nullable Input<String> outboundHostName,
        @Nullable Input<Boolean> requireEncryption) {
        this.awsRegion = awsRegion;
        this.name = name;
        this.outboundHostName = outboundHostName;
        this.requireEncryption = requireEncryption;
    }

    private VoiceConnectorState() {
        this.awsRegion = Input.empty();
        this.name = Input.empty();
        this.outboundHostName = Input.empty();
        this.requireEncryption = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> awsRegion;
        private @Nullable Input<String> name;
        private @Nullable Input<String> outboundHostName;
        private @Nullable Input<Boolean> requireEncryption;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsRegion = defaults.awsRegion;
    	      this.name = defaults.name;
    	      this.outboundHostName = defaults.outboundHostName;
    	      this.requireEncryption = defaults.requireEncryption;
        }

        public Builder setAwsRegion(@Nullable Input<String> awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }

        public Builder setAwsRegion(@Nullable String awsRegion) {
            this.awsRegion = Input.ofNullable(awsRegion);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOutboundHostName(@Nullable Input<String> outboundHostName) {
            this.outboundHostName = outboundHostName;
            return this;
        }

        public Builder setOutboundHostName(@Nullable String outboundHostName) {
            this.outboundHostName = Input.ofNullable(outboundHostName);
            return this;
        }

        public Builder setRequireEncryption(@Nullable Input<Boolean> requireEncryption) {
            this.requireEncryption = requireEncryption;
            return this;
        }

        public Builder setRequireEncryption(@Nullable Boolean requireEncryption) {
            this.requireEncryption = Input.ofNullable(requireEncryption);
            return this;
        }
        public VoiceConnectorState build() {
            return new VoiceConnectorState(awsRegion, name, outboundHostName, requireEncryption);
        }
    }
}
