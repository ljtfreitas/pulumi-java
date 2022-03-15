// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="actionsRequired")
      private final @Nullable Output<String> actionsRequired;

    public Output<String> getActionsRequired() {
        return this.actionsRequired == null ? Output.empty() : this.actionsRequired;
    }

    /**
     * Description of a private link connection
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Status of a private link connection
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public PrivateLinkConnectionStateArgs(
        @Nullable Output<String> actionsRequired,
        @Nullable Output<String> description,
        @Nullable Output<String> status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateLinkConnectionStateArgs() {
        this.actionsRequired = Output.empty();
        this.description = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionsRequired;
        private @Nullable Output<String> description;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(@Nullable Output<String> actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }

        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = Output.ofNullable(actionsRequired);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public PrivateLinkConnectionStateArgs build() {
            return new PrivateLinkConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
