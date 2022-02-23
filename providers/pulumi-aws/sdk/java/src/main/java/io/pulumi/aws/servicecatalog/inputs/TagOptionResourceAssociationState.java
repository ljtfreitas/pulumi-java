// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagOptionResourceAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final TagOptionResourceAssociationState Empty = new TagOptionResourceAssociationState();

    /**
     * ARN of the resource.
     * 
     */
    @InputImport(name="resourceArn")
    private final @Nullable Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn == null ? Input.empty() : this.resourceArn;
    }

    /**
     * Creation time of the resource.
     * 
     */
    @InputImport(name="resourceCreatedTime")
    private final @Nullable Input<String> resourceCreatedTime;

    public Input<String> getResourceCreatedTime() {
        return this.resourceCreatedTime == null ? Input.empty() : this.resourceCreatedTime;
    }

    /**
     * Description of the resource.
     * 
     */
    @InputImport(name="resourceDescription")
    private final @Nullable Input<String> resourceDescription;

    public Input<String> getResourceDescription() {
        return this.resourceDescription == null ? Input.empty() : this.resourceDescription;
    }

    /**
     * Resource identifier.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * Description of the resource.
     * 
     */
    @InputImport(name="resourceName")
    private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * Tag Option identifier.
     * 
     */
    @InputImport(name="tagOptionId")
    private final @Nullable Input<String> tagOptionId;

    public Input<String> getTagOptionId() {
        return this.tagOptionId == null ? Input.empty() : this.tagOptionId;
    }

    public TagOptionResourceAssociationState(
        @Nullable Input<String> resourceArn,
        @Nullable Input<String> resourceCreatedTime,
        @Nullable Input<String> resourceDescription,
        @Nullable Input<String> resourceId,
        @Nullable Input<String> resourceName,
        @Nullable Input<String> tagOptionId) {
        this.resourceArn = resourceArn;
        this.resourceCreatedTime = resourceCreatedTime;
        this.resourceDescription = resourceDescription;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.tagOptionId = tagOptionId;
    }

    private TagOptionResourceAssociationState() {
        this.resourceArn = Input.empty();
        this.resourceCreatedTime = Input.empty();
        this.resourceDescription = Input.empty();
        this.resourceId = Input.empty();
        this.resourceName = Input.empty();
        this.tagOptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagOptionResourceAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceArn;
        private @Nullable Input<String> resourceCreatedTime;
        private @Nullable Input<String> resourceDescription;
        private @Nullable Input<String> resourceId;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<String> tagOptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(TagOptionResourceAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.resourceCreatedTime = defaults.resourceCreatedTime;
    	      this.resourceDescription = defaults.resourceDescription;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceName = defaults.resourceName;
    	      this.tagOptionId = defaults.tagOptionId;
        }

        public Builder setResourceArn(@Nullable Input<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder setResourceArn(@Nullable String resourceArn) {
            this.resourceArn = Input.ofNullable(resourceArn);
            return this;
        }

        public Builder setResourceCreatedTime(@Nullable Input<String> resourceCreatedTime) {
            this.resourceCreatedTime = resourceCreatedTime;
            return this;
        }

        public Builder setResourceCreatedTime(@Nullable String resourceCreatedTime) {
            this.resourceCreatedTime = Input.ofNullable(resourceCreatedTime);
            return this;
        }

        public Builder setResourceDescription(@Nullable Input<String> resourceDescription) {
            this.resourceDescription = resourceDescription;
            return this;
        }

        public Builder setResourceDescription(@Nullable String resourceDescription) {
            this.resourceDescription = Input.ofNullable(resourceDescription);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setTagOptionId(@Nullable Input<String> tagOptionId) {
            this.tagOptionId = tagOptionId;
            return this;
        }

        public Builder setTagOptionId(@Nullable String tagOptionId) {
            this.tagOptionId = Input.ofNullable(tagOptionId);
            return this;
        }
        public TagOptionResourceAssociationState build() {
            return new TagOptionResourceAssociationState(resourceArn, resourceCreatedTime, resourceDescription, resourceId, resourceName, tagOptionId);
        }
    }
}
