// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.inputs.EventSubscriptionIdentityArgs;
import io.pulumi.azurenative.eventgrid.inputs.StorageBlobDeadLetterDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the deadletter destination with resource identity.
 * 
 */
public final class DeadLetterWithResourceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeadLetterWithResourceIdentityArgs Empty = new DeadLetterWithResourceIdentityArgs();

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @InputImport(name="deadLetterDestination")
        private final @Nullable Input<StorageBlobDeadLetterDestinationArgs> deadLetterDestination;

    public Input<StorageBlobDeadLetterDestinationArgs> getDeadLetterDestination() {
        return this.deadLetterDestination == null ? Input.empty() : this.deadLetterDestination;
    }

    /**
     * The identity to use when dead-lettering events.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<EventSubscriptionIdentityArgs> identity;

    public Input<EventSubscriptionIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    public DeadLetterWithResourceIdentityArgs(
        @Nullable Input<StorageBlobDeadLetterDestinationArgs> deadLetterDestination,
        @Nullable Input<EventSubscriptionIdentityArgs> identity) {
        this.deadLetterDestination = deadLetterDestination;
        this.identity = identity;
    }

    private DeadLetterWithResourceIdentityArgs() {
        this.deadLetterDestination = Input.empty();
        this.identity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeadLetterWithResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StorageBlobDeadLetterDestinationArgs> deadLetterDestination;
        private @Nullable Input<EventSubscriptionIdentityArgs> identity;

        public Builder() {
    	      // Empty
        }

        public Builder(DeadLetterWithResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterDestination = defaults.deadLetterDestination;
    	      this.identity = defaults.identity;
        }

        public Builder setDeadLetterDestination(@Nullable Input<StorageBlobDeadLetterDestinationArgs> deadLetterDestination) {
            this.deadLetterDestination = deadLetterDestination;
            return this;
        }

        public Builder setDeadLetterDestination(@Nullable StorageBlobDeadLetterDestinationArgs deadLetterDestination) {
            this.deadLetterDestination = Input.ofNullable(deadLetterDestination);
            return this;
        }

        public Builder setIdentity(@Nullable Input<EventSubscriptionIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable EventSubscriptionIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }
        public DeadLetterWithResourceIdentityArgs build() {
            return new DeadLetterWithResourceIdentityArgs(deadLetterDestination, identity);
        }
    }
}
