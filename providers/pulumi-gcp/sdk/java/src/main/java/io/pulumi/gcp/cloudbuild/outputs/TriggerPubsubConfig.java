// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerPubsubConfig {
    /**
     * Service account that will make the push request.
     * 
     */
    private final @Nullable String serviceAccountEmail;
    /**
     * - 
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    private final @Nullable String state;
    /**
     * - 
     * Output only. Name of the subscription.
     * 
     */
    private final @Nullable String subscription;
    /**
     * The name of the topic from which this subscription is receiving messages.
     * 
     */
    private final String topic;

    @CustomType.Constructor
    private TriggerPubsubConfig(
        @CustomType.Parameter("serviceAccountEmail") @Nullable String serviceAccountEmail,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("subscription") @Nullable String subscription,
        @CustomType.Parameter("topic") String topic) {
        this.serviceAccountEmail = serviceAccountEmail;
        this.state = state;
        this.subscription = subscription;
        this.topic = topic;
    }

    /**
     * Service account that will make the push request.
     * 
    */
    public Optional<String> getServiceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }
    /**
     * - 
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * - 
     * Output only. Name of the subscription.
     * 
    */
    public Optional<String> getSubscription() {
        return Optional.ofNullable(this.subscription);
    }
    /**
     * The name of the topic from which this subscription is receiving messages.
     * 
    */
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPubsubConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serviceAccountEmail;
        private @Nullable String state;
        private @Nullable String subscription;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPubsubConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.state = defaults.state;
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder subscription(@Nullable String subscription) {
            this.subscription = subscription;
            return this;
        }

        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public TriggerPubsubConfig build() {
            return new TriggerPubsubConfig(serviceAccountEmail, state, subscription, topic);
        }
    }
}
