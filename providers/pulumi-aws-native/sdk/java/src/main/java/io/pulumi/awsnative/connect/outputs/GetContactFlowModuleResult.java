// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.outputs;

import io.pulumi.awsnative.connect.enums.ContactFlowModuleState;
import io.pulumi.awsnative.connect.enums.ContactFlowModuleStatus;
import io.pulumi.awsnative.connect.outputs.ContactFlowModuleTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContactFlowModuleResult {
    /**
     * The identifier of the contact flow module (ARN).
     * 
     */
    private final @Nullable String contactFlowModuleArn;
    /**
     * The content of the contact flow module in JSON format.
     * 
     */
    private final @Nullable String content;
    /**
     * The description of the contact flow module.
     * 
     */
    private final @Nullable String description;
    /**
     * The identifier of the Amazon Connect instance (ARN).
     * 
     */
    private final @Nullable String instanceArn;
    /**
     * The name of the contact flow module.
     * 
     */
    private final @Nullable String name;
    /**
     * The state of the contact flow module.
     * 
     */
    private final @Nullable ContactFlowModuleState state;
    /**
     * The status of the contact flow module.
     * 
     */
    private final @Nullable ContactFlowModuleStatus status;
    /**
     * One or more tags.
     * 
     */
    private final @Nullable List<ContactFlowModuleTag> tags;

    @OutputCustomType.Constructor({"contactFlowModuleArn","content","description","instanceArn","name","state","status","tags"})
    private GetContactFlowModuleResult(
        @Nullable String contactFlowModuleArn,
        @Nullable String content,
        @Nullable String description,
        @Nullable String instanceArn,
        @Nullable String name,
        @Nullable ContactFlowModuleState state,
        @Nullable ContactFlowModuleStatus status,
        @Nullable List<ContactFlowModuleTag> tags) {
        this.contactFlowModuleArn = contactFlowModuleArn;
        this.content = content;
        this.description = description;
        this.instanceArn = instanceArn;
        this.name = name;
        this.state = state;
        this.status = status;
        this.tags = tags;
    }

    /**
     * The identifier of the contact flow module (ARN).
     * 
     */
    public Optional<String> getContactFlowModuleArn() {
        return Optional.ofNullable(this.contactFlowModuleArn);
    }
    /**
     * The content of the contact flow module in JSON format.
     * 
     */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The description of the contact flow module.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The identifier of the Amazon Connect instance (ARN).
     * 
     */
    public Optional<String> getInstanceArn() {
        return Optional.ofNullable(this.instanceArn);
    }
    /**
     * The name of the contact flow module.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The state of the contact flow module.
     * 
     */
    public Optional<ContactFlowModuleState> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The status of the contact flow module.
     * 
     */
    public Optional<ContactFlowModuleStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * One or more tags.
     * 
     */
    public List<ContactFlowModuleTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactFlowModuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contactFlowModuleArn;
        private @Nullable String content;
        private @Nullable String description;
        private @Nullable String instanceArn;
        private @Nullable String name;
        private @Nullable ContactFlowModuleState state;
        private @Nullable ContactFlowModuleStatus status;
        private @Nullable List<ContactFlowModuleTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactFlowModuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowModuleArn = defaults.contactFlowModuleArn;
    	      this.content = defaults.content;
    	      this.description = defaults.description;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder setContactFlowModuleArn(@Nullable String contactFlowModuleArn) {
            this.contactFlowModuleArn = contactFlowModuleArn;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setInstanceArn(@Nullable String instanceArn) {
            this.instanceArn = instanceArn;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setState(@Nullable ContactFlowModuleState state) {
            this.state = state;
            return this;
        }

        public Builder setStatus(@Nullable ContactFlowModuleStatus status) {
            this.status = status;
            return this;
        }

        public Builder setTags(@Nullable List<ContactFlowModuleTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetContactFlowModuleResult build() {
            return new GetContactFlowModuleResult(contactFlowModuleArn, content, description, instanceArn, name, state, status, tags);
        }
    }
}
