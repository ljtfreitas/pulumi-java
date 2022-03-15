// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SmsChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final SmsChannelArgs Empty = new SmsChannelArgs();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId", required=true)
      private final Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId;
    }

    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Sender identifier of your messages.
     * 
     */
    @Import(name="senderId")
      private final @Nullable Output<String> senderId;

    public Output<String> getSenderId() {
        return this.senderId == null ? Output.empty() : this.senderId;
    }

    /**
     * The Short Code registered with the phone provider.
     * 
     */
    @Import(name="shortCode")
      private final @Nullable Output<String> shortCode;

    public Output<String> getShortCode() {
        return this.shortCode == null ? Output.empty() : this.shortCode;
    }

    public SmsChannelArgs(
        Output<String> applicationId,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> senderId,
        @Nullable Output<String> shortCode) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.enabled = enabled;
        this.senderId = senderId;
        this.shortCode = shortCode;
    }

    private SmsChannelArgs() {
        this.applicationId = Output.empty();
        this.enabled = Output.empty();
        this.senderId = Output.empty();
        this.shortCode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmsChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> applicationId;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> senderId;
        private @Nullable Output<String> shortCode;

        public Builder() {
    	      // Empty
        }

        public Builder(SmsChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.enabled = defaults.enabled;
    	      this.senderId = defaults.senderId;
    	      this.shortCode = defaults.shortCode;
        }

        public Builder applicationId(Output<String> applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder applicationId(String applicationId) {
            this.applicationId = Output.of(Objects.requireNonNull(applicationId));
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder senderId(@Nullable Output<String> senderId) {
            this.senderId = senderId;
            return this;
        }

        public Builder senderId(@Nullable String senderId) {
            this.senderId = Output.ofNullable(senderId);
            return this;
        }

        public Builder shortCode(@Nullable Output<String> shortCode) {
            this.shortCode = shortCode;
            return this;
        }

        public Builder shortCode(@Nullable String shortCode) {
            this.shortCode = Output.ofNullable(shortCode);
            return this;
        }
        public SmsChannelArgs build() {
            return new SmsChannelArgs(applicationId, enabled, senderId, shortCode);
        }
    }
}
