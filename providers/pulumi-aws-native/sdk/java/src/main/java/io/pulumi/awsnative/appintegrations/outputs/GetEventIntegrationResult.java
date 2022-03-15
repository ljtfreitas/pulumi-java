// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations.outputs;

import io.pulumi.awsnative.appintegrations.outputs.EventIntegrationAssociation;
import io.pulumi.awsnative.appintegrations.outputs.EventIntegrationTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEventIntegrationResult {
    /**
     * The associations with the event integration.
     * 
     */
    private final @Nullable List<EventIntegrationAssociation> associations;
    /**
     * The event integration description.
     * 
     */
    private final @Nullable String description;
    /**
     * The Amazon Resource Name (ARN) of the event integration.
     * 
     */
    private final @Nullable String eventIntegrationArn;
    /**
     * The tags (keys and values) associated with the event integration.
     * 
     */
    private final @Nullable List<EventIntegrationTag> tags;

    @CustomType.Constructor
    private GetEventIntegrationResult(
        @CustomType.Parameter("associations") @Nullable List<EventIntegrationAssociation> associations,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("eventIntegrationArn") @Nullable String eventIntegrationArn,
        @CustomType.Parameter("tags") @Nullable List<EventIntegrationTag> tags) {
        this.associations = associations;
        this.description = description;
        this.eventIntegrationArn = eventIntegrationArn;
        this.tags = tags;
    }

    /**
     * The associations with the event integration.
     * 
    */
    public List<EventIntegrationAssociation> getAssociations() {
        return this.associations == null ? List.of() : this.associations;
    }
    /**
     * The event integration description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The Amazon Resource Name (ARN) of the event integration.
     * 
    */
    public Optional<String> getEventIntegrationArn() {
        return Optional.ofNullable(this.eventIntegrationArn);
    }
    /**
     * The tags (keys and values) associated with the event integration.
     * 
    */
    public List<EventIntegrationTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventIntegrationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EventIntegrationAssociation> associations;
        private @Nullable String description;
        private @Nullable String eventIntegrationArn;
        private @Nullable List<EventIntegrationTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventIntegrationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associations = defaults.associations;
    	      this.description = defaults.description;
    	      this.eventIntegrationArn = defaults.eventIntegrationArn;
    	      this.tags = defaults.tags;
        }

        public Builder associations(@Nullable List<EventIntegrationAssociation> associations) {
            this.associations = associations;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder eventIntegrationArn(@Nullable String eventIntegrationArn) {
            this.eventIntegrationArn = eventIntegrationArn;
            return this;
        }

        public Builder tags(@Nullable List<EventIntegrationTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetEventIntegrationResult build() {
            return new GetEventIntegrationResult(associations, description, eventIntegrationArn, tags);
        }
    }
}
