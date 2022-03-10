// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations.outputs;

import io.pulumi.awsnative.appintegrations.outputs.EventIntegrationMetadata;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventIntegrationAssociation {
    /**
     * The metadata associated with the client.
     * 
     */
    private final @Nullable List<EventIntegrationMetadata> clientAssociationMetadata;
    /**
     * The identifier for the client that is associated with the event integration.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The name of the Eventbridge rule.
     * 
     */
    private final @Nullable String eventBridgeRuleName;
    /**
     * The Amazon Resource Name (ARN) for the event integration association.
     * 
     */
    private final @Nullable String eventIntegrationAssociationArn;
    /**
     * The identifier for the event integration association.
     * 
     */
    private final @Nullable String eventIntegrationAssociationId;

    @OutputCustomType.Constructor
    private EventIntegrationAssociation(
        @OutputCustomType.Parameter("clientAssociationMetadata") @Nullable List<EventIntegrationMetadata> clientAssociationMetadata,
        @OutputCustomType.Parameter("clientId") @Nullable String clientId,
        @OutputCustomType.Parameter("eventBridgeRuleName") @Nullable String eventBridgeRuleName,
        @OutputCustomType.Parameter("eventIntegrationAssociationArn") @Nullable String eventIntegrationAssociationArn,
        @OutputCustomType.Parameter("eventIntegrationAssociationId") @Nullable String eventIntegrationAssociationId) {
        this.clientAssociationMetadata = clientAssociationMetadata;
        this.clientId = clientId;
        this.eventBridgeRuleName = eventBridgeRuleName;
        this.eventIntegrationAssociationArn = eventIntegrationAssociationArn;
        this.eventIntegrationAssociationId = eventIntegrationAssociationId;
    }

    /**
     * The metadata associated with the client.
     * 
    */
    public List<EventIntegrationMetadata> getClientAssociationMetadata() {
        return this.clientAssociationMetadata == null ? List.of() : this.clientAssociationMetadata;
    }
    /**
     * The identifier for the client that is associated with the event integration.
     * 
    */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The name of the Eventbridge rule.
     * 
    */
    public Optional<String> getEventBridgeRuleName() {
        return Optional.ofNullable(this.eventBridgeRuleName);
    }
    /**
     * The Amazon Resource Name (ARN) for the event integration association.
     * 
    */
    public Optional<String> getEventIntegrationAssociationArn() {
        return Optional.ofNullable(this.eventIntegrationAssociationArn);
    }
    /**
     * The identifier for the event integration association.
     * 
    */
    public Optional<String> getEventIntegrationAssociationId() {
        return Optional.ofNullable(this.eventIntegrationAssociationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventIntegrationAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EventIntegrationMetadata> clientAssociationMetadata;
        private @Nullable String clientId;
        private @Nullable String eventBridgeRuleName;
        private @Nullable String eventIntegrationAssociationArn;
        private @Nullable String eventIntegrationAssociationId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventIntegrationAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAssociationMetadata = defaults.clientAssociationMetadata;
    	      this.clientId = defaults.clientId;
    	      this.eventBridgeRuleName = defaults.eventBridgeRuleName;
    	      this.eventIntegrationAssociationArn = defaults.eventIntegrationAssociationArn;
    	      this.eventIntegrationAssociationId = defaults.eventIntegrationAssociationId;
        }

        public Builder setClientAssociationMetadata(@Nullable List<EventIntegrationMetadata> clientAssociationMetadata) {
            this.clientAssociationMetadata = clientAssociationMetadata;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setEventBridgeRuleName(@Nullable String eventBridgeRuleName) {
            this.eventBridgeRuleName = eventBridgeRuleName;
            return this;
        }

        public Builder setEventIntegrationAssociationArn(@Nullable String eventIntegrationAssociationArn) {
            this.eventIntegrationAssociationArn = eventIntegrationAssociationArn;
            return this;
        }

        public Builder setEventIntegrationAssociationId(@Nullable String eventIntegrationAssociationId) {
            this.eventIntegrationAssociationId = eventIntegrationAssociationId;
            return this;
        }
        public EventIntegrationAssociation build() {
            return new EventIntegrationAssociation(clientAssociationMetadata, clientId, eventBridgeRuleName, eventIntegrationAssociationArn, eventIntegrationAssociationId);
        }
    }
}
