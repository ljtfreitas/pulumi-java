// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SmsChannelState extends io.pulumi.resources.ResourceArgs {

    public static final SmsChannelState Empty = new SmsChannelState();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId")
      private final @Nullable Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId == null ? Output.empty() : this.applicationId;
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
     * Promotional messages per second that can be sent.
     * 
     */
    @Import(name="promotionalMessagesPerSecond")
      private final @Nullable Output<Integer> promotionalMessagesPerSecond;

    public Output<Integer> getPromotionalMessagesPerSecond() {
        return this.promotionalMessagesPerSecond == null ? Output.empty() : this.promotionalMessagesPerSecond;
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

    /**
     * Transactional messages per second that can be sent.
     * 
     */
    @Import(name="transactionalMessagesPerSecond")
      private final @Nullable Output<Integer> transactionalMessagesPerSecond;

    public Output<Integer> getTransactionalMessagesPerSecond() {
        return this.transactionalMessagesPerSecond == null ? Output.empty() : this.transactionalMessagesPerSecond;
    }

    public SmsChannelState(
        @Nullable Output<String> applicationId,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Integer> promotionalMessagesPerSecond,
        @Nullable Output<String> senderId,
        @Nullable Output<String> shortCode,
        @Nullable Output<Integer> transactionalMessagesPerSecond) {
        this.applicationId = applicationId;
        this.enabled = enabled;
        this.promotionalMessagesPerSecond = promotionalMessagesPerSecond;
        this.senderId = senderId;
        this.shortCode = shortCode;
        this.transactionalMessagesPerSecond = transactionalMessagesPerSecond;
    }

    private SmsChannelState() {
        this.applicationId = Output.empty();
        this.enabled = Output.empty();
        this.promotionalMessagesPerSecond = Output.empty();
        this.senderId = Output.empty();
        this.shortCode = Output.empty();
        this.transactionalMessagesPerSecond = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmsChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationId;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Integer> promotionalMessagesPerSecond;
        private @Nullable Output<String> senderId;
        private @Nullable Output<String> shortCode;
        private @Nullable Output<Integer> transactionalMessagesPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(SmsChannelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.enabled = defaults.enabled;
    	      this.promotionalMessagesPerSecond = defaults.promotionalMessagesPerSecond;
    	      this.senderId = defaults.senderId;
    	      this.shortCode = defaults.shortCode;
    	      this.transactionalMessagesPerSecond = defaults.transactionalMessagesPerSecond;
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Output.ofNullable(applicationId);
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

        public Builder promotionalMessagesPerSecond(@Nullable Output<Integer> promotionalMessagesPerSecond) {
            this.promotionalMessagesPerSecond = promotionalMessagesPerSecond;
            return this;
        }

        public Builder promotionalMessagesPerSecond(@Nullable Integer promotionalMessagesPerSecond) {
            this.promotionalMessagesPerSecond = Output.ofNullable(promotionalMessagesPerSecond);
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

        public Builder transactionalMessagesPerSecond(@Nullable Output<Integer> transactionalMessagesPerSecond) {
            this.transactionalMessagesPerSecond = transactionalMessagesPerSecond;
            return this;
        }

        public Builder transactionalMessagesPerSecond(@Nullable Integer transactionalMessagesPerSecond) {
            this.transactionalMessagesPerSecond = Output.ofNullable(transactionalMessagesPerSecond);
            return this;
        }
        public SmsChannelState build() {
            return new SmsChannelState(applicationId, enabled, promotionalMessagesPerSecond, senderId, shortCode, transactionalMessagesPerSecond);
        }
    }
}
