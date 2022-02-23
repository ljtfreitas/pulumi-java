// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations.inputs;

import io.pulumi.awsnative.appintegrations.inputs.EventIntegrationMetadata;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventIntegrationAssociation extends io.pulumi.resources.InvokeArgs {

    public static final EventIntegrationAssociation Empty = new EventIntegrationAssociation();

    /**
     * The metadata associated with the client.
     * 
     */
    @InputImport(name="clientAssociationMetadata")
        private final @Nullable List<EventIntegrationMetadata> clientAssociationMetadata;

    public List<EventIntegrationMetadata> getClientAssociationMetadata() {
        return this.clientAssociationMetadata == null ? List.of() : this.clientAssociationMetadata;
    }

    /**
     * The identifier for the client that is associated with the event integration.
     * 
     */
    @InputImport(name="clientId")
        private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The name of the Eventbridge rule.
     * 
     */
    @InputImport(name="eventBridgeRuleName")
        private final @Nullable String eventBridgeRuleName;

    public Optional<String> getEventBridgeRuleName() {
        return this.eventBridgeRuleName == null ? Optional.empty() : Optional.ofNullable(this.eventBridgeRuleName);
    }

    /**
     * The Amazon Resource Name (ARN) for the event integration association.
     * 
     */
    @InputImport(name="eventIntegrationAssociationArn")
        private final @Nullable String eventIntegrationAssociationArn;

    public Optional<String> getEventIntegrationAssociationArn() {
        return this.eventIntegrationAssociationArn == null ? Optional.empty() : Optional.ofNullable(this.eventIntegrationAssociationArn);
    }

    /**
     * The identifier for the event integration association.
     * 
     */
    @InputImport(name="eventIntegrationAssociationId")
        private final @Nullable String eventIntegrationAssociationId;

    public Optional<String> getEventIntegrationAssociationId() {
        return this.eventIntegrationAssociationId == null ? Optional.empty() : Optional.ofNullable(this.eventIntegrationAssociationId);
    }

    public EventIntegrationAssociation(
        @Nullable List<EventIntegrationMetadata> clientAssociationMetadata,
        @Nullable String clientId,
        @Nullable String eventBridgeRuleName,
        @Nullable String eventIntegrationAssociationArn,
        @Nullable String eventIntegrationAssociationId) {
        this.clientAssociationMetadata = clientAssociationMetadata;
        this.clientId = clientId;
        this.eventBridgeRuleName = eventBridgeRuleName;
        this.eventIntegrationAssociationArn = eventIntegrationAssociationArn;
        this.eventIntegrationAssociationId = eventIntegrationAssociationId;
    }

    private EventIntegrationAssociation() {
        this.clientAssociationMetadata = List.of();
        this.clientId = null;
        this.eventBridgeRuleName = null;
        this.eventIntegrationAssociationArn = null;
        this.eventIntegrationAssociationId = null;
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
