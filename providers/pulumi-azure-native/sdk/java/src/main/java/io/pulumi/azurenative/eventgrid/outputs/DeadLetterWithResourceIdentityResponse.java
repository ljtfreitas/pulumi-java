// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.EventSubscriptionIdentityResponse;
import io.pulumi.azurenative.eventgrid.outputs.StorageBlobDeadLetterDestinationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeadLetterWithResourceIdentityResponse {
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    private final @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination;
    /**
     * The identity to use when dead-lettering events.
     * 
     */
    private final @Nullable EventSubscriptionIdentityResponse identity;

    @OutputCustomType.Constructor({"deadLetterDestination","identity"})
    private DeadLetterWithResourceIdentityResponse(
        @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination,
        @Nullable EventSubscriptionIdentityResponse identity) {
        this.deadLetterDestination = deadLetterDestination;
        this.identity = identity;
    }

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Optional<StorageBlobDeadLetterDestinationResponse> getDeadLetterDestination() {
        return Optional.ofNullable(this.deadLetterDestination);
    }
    /**
     * The identity to use when dead-lettering events.
     * 
     */
    public Optional<EventSubscriptionIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeadLetterWithResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination;
        private @Nullable EventSubscriptionIdentityResponse identity;

        public Builder() {
    	      // Empty
        }

        public Builder(DeadLetterWithResourceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterDestination = defaults.deadLetterDestination;
    	      this.identity = defaults.identity;
        }

        public Builder setDeadLetterDestination(@Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination) {
            this.deadLetterDestination = deadLetterDestination;
            return this;
        }

        public Builder setIdentity(@Nullable EventSubscriptionIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public DeadLetterWithResourceIdentityResponse build() {
            return new DeadLetterWithResourceIdentityResponse(deadLetterDestination, identity);
        }
    }
}
