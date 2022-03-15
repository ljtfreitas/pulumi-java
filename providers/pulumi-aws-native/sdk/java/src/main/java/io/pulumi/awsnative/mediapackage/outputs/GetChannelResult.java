// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.outputs.ChannelHlsIngest;
import io.pulumi.awsnative.mediapackage.outputs.ChannelLogConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetChannelResult {
    /**
     * The Amazon Resource Name (ARN) assigned to the Channel.
     * 
     */
    private final @Nullable String arn;
    /**
     * A short text description of the Channel.
     * 
     */
    private final @Nullable String description;
    /**
     * The configuration parameters for egress access logging.
     * 
     */
    private final @Nullable ChannelLogConfiguration egressAccessLogs;
    /**
     * A short text description of the Channel.
     * 
     */
    private final @Nullable ChannelHlsIngest hlsIngest;
    /**
     * The configuration parameters for egress access logging.
     * 
     */
    private final @Nullable ChannelLogConfiguration ingressAccessLogs;

    @CustomType.Constructor
    private GetChannelResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("egressAccessLogs") @Nullable ChannelLogConfiguration egressAccessLogs,
        @CustomType.Parameter("hlsIngest") @Nullable ChannelHlsIngest hlsIngest,
        @CustomType.Parameter("ingressAccessLogs") @Nullable ChannelLogConfiguration ingressAccessLogs) {
        this.arn = arn;
        this.description = description;
        this.egressAccessLogs = egressAccessLogs;
        this.hlsIngest = hlsIngest;
        this.ingressAccessLogs = ingressAccessLogs;
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the Channel.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * A short text description of the Channel.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The configuration parameters for egress access logging.
     * 
    */
    public Optional<ChannelLogConfiguration> getEgressAccessLogs() {
        return Optional.ofNullable(this.egressAccessLogs);
    }
    /**
     * A short text description of the Channel.
     * 
    */
    public Optional<ChannelHlsIngest> getHlsIngest() {
        return Optional.ofNullable(this.hlsIngest);
    }
    /**
     * The configuration parameters for egress access logging.
     * 
    */
    public Optional<ChannelLogConfiguration> getIngressAccessLogs() {
        return Optional.ofNullable(this.ingressAccessLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable ChannelLogConfiguration egressAccessLogs;
        private @Nullable ChannelHlsIngest hlsIngest;
        private @Nullable ChannelLogConfiguration ingressAccessLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.egressAccessLogs = defaults.egressAccessLogs;
    	      this.hlsIngest = defaults.hlsIngest;
    	      this.ingressAccessLogs = defaults.ingressAccessLogs;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder egressAccessLogs(@Nullable ChannelLogConfiguration egressAccessLogs) {
            this.egressAccessLogs = egressAccessLogs;
            return this;
        }

        public Builder hlsIngest(@Nullable ChannelHlsIngest hlsIngest) {
            this.hlsIngest = hlsIngest;
            return this;
        }

        public Builder ingressAccessLogs(@Nullable ChannelLogConfiguration ingressAccessLogs) {
            this.ingressAccessLogs = ingressAccessLogs;
            return this;
        }
        public GetChannelResult build() {
            return new GetChannelResult(arn, description, egressAccessLogs, hlsIngest, ingressAccessLogs);
        }
    }
}
