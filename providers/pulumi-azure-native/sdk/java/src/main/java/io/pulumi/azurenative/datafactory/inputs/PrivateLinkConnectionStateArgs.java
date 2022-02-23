// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The state of a private link connection
 * 
 */
public final class PrivateLinkConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkConnectionStateArgs Empty = new PrivateLinkConnectionStateArgs();

    /**
     * ActionsRequired for a private link connection
     * 
     */
    @InputImport(name="actionsRequired")
        private final @Nullable Input<String> actionsRequired;

    public Input<String> getActionsRequired() {
        return this.actionsRequired == null ? Input.empty() : this.actionsRequired;
    }

    /**
     * Description of a private link connection
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Status of a private link connection
     * 
     */
    @InputImport(name="status")
        private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public PrivateLinkConnectionStateArgs(
        @Nullable Input<String> actionsRequired,
        @Nullable Input<String> description,
        @Nullable Input<String> status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateLinkConnectionStateArgs() {
        this.actionsRequired = Input.empty();
        this.description = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> actionsRequired;
        private @Nullable Input<String> description;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(@Nullable Input<String> actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }

        public Builder setActionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = Input.ofNullable(actionsRequired);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public PrivateLinkConnectionStateArgs build() {
            return new PrivateLinkConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
